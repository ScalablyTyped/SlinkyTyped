package typingsSlinky.activexWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Items object contains a collection of Item objects. See the Items property on the Device or Item object for details on accessing the Items object. */
// tslint:disable-next-line interface-name
@js.native
trait Items extends js.Object {
  
  /** Returns the specified item in the collection by position */
  def apply(Index: Double): Item = js.native
  
  /** Adds a new Item with the specified Name and Flags. The Flags value is created by using the OR operation with members of the WiaItemFlags enumeration. */
  def Add(Name: String, Flags: Double): Unit = js.native
  
  /** Returns the number of members in the collection */
  val Count: Double = js.native
  
  /** Returns the specified item in the collection by position */
  def Item(Index: Double): typingsSlinky.activexWia.WIA.Item = js.native
  
  /** Removes the designated Item */
  def Remove(Index: Double): Unit = js.native
}
