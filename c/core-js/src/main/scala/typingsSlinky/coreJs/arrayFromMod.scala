package typingsSlinky.coreJs

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("core-js/library/fn/array/from", JSImport.Namespace)
@js.native
object arrayFromMod extends js.Object {
  
  def apply[T](arrayLike: ArrayLike[T]): Array[T] = js.native
  def apply[T](arrayLike: js.Iterable[T]): Array[T] = js.native
  def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = js.native
  def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): Array[U] = js.native
  def apply[T, U](arrayLike: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = js.native
  def apply[T, U](arrayLike: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): Array[U] = js.native
}
