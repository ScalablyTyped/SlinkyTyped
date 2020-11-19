package typingsSlinky.realm.Realm

import typingsSlinky.realm.Realm.Sync.Subscription
import typingsSlinky.realm.Realm.Sync.SubscriptionOptions
import typingsSlinky.std.ReadonlyArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Collection
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Collection.html }
  */
@js.native
trait Collection[T] extends ReadonlyArray[T] {
  
  /**
    * @param  {(collection:any,changes:any)=>void} callback
    * @returns void
    */
  def addListener(callback: CollectionChangeCallback[T]): Unit = js.native
  
  def avg(): Double = js.native
  def avg(property: String): Double = js.native
  
  def description(): String = js.native
  
  /**
    * @param  {string} query
    * @param  {any[]} ...arg
    * @returns Results
    */
  def filtered(query: String, arg: js.Any*): Results[T] = js.native
  
  /**
    * @returns boolean
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * @returns boolean
    */
  def isValid(): Boolean = js.native
  
  def max(): Double | js.Date | Null = js.native
  def max(property: String): Double | js.Date | Null = js.native
  
  def min(): Double | js.Date | Null = js.native
  def min(property: String): Double | js.Date | Null = js.native
  
  val optional: Boolean = js.native
  
  /**
    * @returns void
    */
  def removeAllListeners(): Unit = js.native
  
  /**
    * @param  {()=>void} callback this is the callback to remove
    * @returns void
    */
  def removeListener(callback: CollectionChangeCallback[T]): Unit = js.native
  
  /**
    * @returns Results
    */
  def snapshot(): Results[T] = js.native
  
  def sorted(): Results[T] = js.native
  def sorted(descriptor: String): Results[T] = js.native
  def sorted(descriptor: String, reverse: Boolean): Results[T] = js.native
  def sorted(descriptor: js.Array[SortDescriptor]): Results[T] = js.native
  def sorted(reverse: Boolean): Results[T] = js.native
  
  /**
    * @returns Results<T>
    */
  def subscribe(): Subscription = js.native
  def subscribe(options: SubscriptionOptions): Subscription = js.native
  def subscribe(subscriptionName: String): Subscription = js.native
  
  def sum(): Double | Null = js.native
  def sum(property: String): Double | Null = js.native
  
  val `type`: PropertyType = js.native
}
