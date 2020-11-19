package typingsSlinky.coreJs

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("core-js/fn/array/sort", JSImport.Namespace)
@js.native
object sortMod extends js.Object {
  
  def apply[T](array: ArrayLike[T]): Array[T] = js.native
  def apply[T](array: ArrayLike[T], compareFn: js.Function2[/* a */ T, /* b */ T, Double]): Array[T] = js.native
}
