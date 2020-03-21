package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.fridaGumStrings.reg
  - typingsSlinky.fridaGum.fridaGumStrings.imm
  - typingsSlinky.fridaGum.fridaGumStrings.mem
*/
trait X86OperandType extends js.Object

object X86OperandType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imm: typingsSlinky.fridaGum.fridaGumStrings.imm = this.cast("imm")
  @scala.inline
  def mem: typingsSlinky.fridaGum.fridaGumStrings.mem = this.cast("mem")
  @scala.inline
  def reg: typingsSlinky.fridaGum.fridaGumStrings.reg = this.cast("reg")
}

