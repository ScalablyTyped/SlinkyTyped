package typingsSlinky.ckeditorCkeditor5Utils.mod

import typingsSlinky.ckeditorCkeditor5Utils.anon.IdProperty
import typingsSlinky.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ckeditor/ckeditor5-utils", "Collection")
@js.native
class Collection[T] ()
  extends Iterable[T]
     with Emitter {
  def this(options: IdProperty[T]) = this()
  
  def add(item: T): this.type = js.native
  def add(item: T, index: Double): this.type = js.native
  
  def bindTo[S](externalCollection: Collection[S]): CollectionBindTo[S, T] = js.native
  
  def clear(): Unit = js.native
  
  def filter(callbackfn: js.Function2[/* item */ T, /* index */ Double, Boolean]): js.Array[T] = js.native
  def filter(callbackfn: js.Function2[/* item */ T, /* index */ Double, Boolean], thisArg: js.Any): js.Array[T] = js.native
  
  def find(predicate: js.Function2[/* item */ T, /* index */ Double, Boolean]): js.UndefOr[T] = js.native
  def find(predicate: js.Function2[/* item */ T, /* index */ Double, Boolean], thisArg: js.Any): js.UndefOr[T] = js.native
  
  var first: T | Null = js.native
  
  def get(idOrIndex: String): T | Null = js.native
  def get(idOrIndex: Double): T | Null = js.native
  
  def getIndex(idOrItem: T): Double = js.native
  def getIndex(idOrItem: String): Double = js.native
  
  var last: T | Null = js.native
  
  var length: Double = js.native
  
  def map[U](callbackfn: js.Function2[/* item */ T, /* index */ Double, U]): js.Array[U] = js.native
  def map[U](callbackfn: js.Function2[/* item */ T, /* index */ Double, U], thisArg: js.Any): js.Array[U] = js.native
  
  def remove(subject: T): T = js.native
  def remove(subject: String): T = js.native
  def remove(subject: Double): T = js.native
}
