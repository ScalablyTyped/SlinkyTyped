package typingsSlinky.lodash.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashIsArrayLikeObject extends LodashConvertible {
  
  // tslint:disable-next-line:ban-types (type guard doesn't seem to work correctly without the Function type)
  def apply(): /* is never */ Boolean = js.native
  def apply(value: String): /* is never */ Boolean = js.native
  def apply(value: js.Function): /* is never */ Boolean = js.native
  def apply(value: js.Function1[/* repeated */ js.Any, _]): /* is never */ Boolean = js.native
  def apply(value: Boolean): /* is never */ Boolean = js.native
  def apply(value: Double): /* is never */ Boolean = js.native
  def apply[T /* <: js.Object */](value: T): Boolean = js.native
}
