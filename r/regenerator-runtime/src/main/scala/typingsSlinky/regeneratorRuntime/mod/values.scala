package typingsSlinky.regeneratorRuntime.mod

import typingsSlinky.regeneratorRuntime.anon.Iterator
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("regenerator-runtime", "values")
@js.native
object values extends js.Object {
  
  def apply[T](iterableOrArrayLike: ArrayLike[T]): js.Iterator[T] = js.native
  def apply[T](iterableOrArrayLike: js.Iterable[T]): js.Iterator[T] = js.native
  def apply[I /* <: js.Iterator[_] */](iterable: Iterator[I]): I = js.native
}
