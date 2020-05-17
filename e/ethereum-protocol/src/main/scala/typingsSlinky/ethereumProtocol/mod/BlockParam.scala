package typingsSlinky.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ethereumProtocol.mod.BlockParamLiteral
  - scala.Double
*/
trait BlockParam extends js.Object

object BlockParam {
  @scala.inline
  implicit def apply(value: BlockParamLiteral): BlockParam = value.asInstanceOf[BlockParam]
  @scala.inline
  implicit def apply(value: Double): BlockParam = value.asInstanceOf[BlockParam]
}

