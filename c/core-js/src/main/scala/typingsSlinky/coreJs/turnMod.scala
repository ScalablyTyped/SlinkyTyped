package typingsSlinky.coreJs

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("core-js/fn/array/turn", JSImport.Namespace)
@js.native
object turnMod extends js.Object {
  
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[/* memo */ Array[T], /* value */ T, /* index */ Double, /* array */ Array[T], Unit]
  ): Array[T] = js.native
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[/* memo */ Array[T], /* value */ T, /* index */ Double, /* array */ Array[T], Unit],
    memo: Array[T]
  ): Array[T] = js.native
  def apply[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ Double, /* array */ Array[T], Unit],
    memo: U
  ): U = js.native
}
