package typingsSlinky.node.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.utilMod.CustomPromisifySymbol[TCustom]
  - typingsSlinky.node.utilMod.CustomPromisifyLegacy[TCustom]
*/
trait CustomPromisify[TCustom /* <: js.Function */] extends js.Object

object CustomPromisify {
  @scala.inline
  implicit def apply[TCustom](value: CustomPromisifyLegacy[TCustom]): CustomPromisify[TCustom] = value.asInstanceOf[CustomPromisify[TCustom]]
  @scala.inline
  implicit def apply[TCustom](value: CustomPromisifySymbol[TCustom]): CustomPromisify[TCustom] = value.asInstanceOf[CustomPromisify[TCustom]]
}

