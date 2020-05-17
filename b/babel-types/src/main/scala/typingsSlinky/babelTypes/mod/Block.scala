package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.BlockStatement_
  - typingsSlinky.babelTypes.mod.Program_
*/
trait Block extends js.Object

object Block {
  @scala.inline
  implicit def apply(value: BlockStatement_): Block = value.asInstanceOf[Block]
  @scala.inline
  implicit def apply(value: Program_): Block = value.asInstanceOf[Block]
}

