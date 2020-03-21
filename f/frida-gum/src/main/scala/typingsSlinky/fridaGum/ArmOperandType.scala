package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.fridaGumStrings.reg
  - typingsSlinky.fridaGum.fridaGumStrings.imm
  - typingsSlinky.fridaGum.fridaGumStrings.mem
  - typingsSlinky.fridaGum.fridaGumStrings.fp
  - typingsSlinky.fridaGum.fridaGumStrings.cimm
  - typingsSlinky.fridaGum.fridaGumStrings.pimm
  - typingsSlinky.fridaGum.fridaGumStrings.setend
  - typingsSlinky.fridaGum.fridaGumStrings.sysreg
*/
trait ArmOperandType extends js.Object

object ArmOperandType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cimm: typingsSlinky.fridaGum.fridaGumStrings.cimm = this.cast("cimm")
  @scala.inline
  def fp: typingsSlinky.fridaGum.fridaGumStrings.fp = this.cast("fp")
  @scala.inline
  def imm: typingsSlinky.fridaGum.fridaGumStrings.imm = this.cast("imm")
  @scala.inline
  def mem: typingsSlinky.fridaGum.fridaGumStrings.mem = this.cast("mem")
  @scala.inline
  def pimm: typingsSlinky.fridaGum.fridaGumStrings.pimm = this.cast("pimm")
  @scala.inline
  def reg: typingsSlinky.fridaGum.fridaGumStrings.reg = this.cast("reg")
  @scala.inline
  def setend: typingsSlinky.fridaGum.fridaGumStrings.setend = this.cast("setend")
  @scala.inline
  def sysreg: typingsSlinky.fridaGum.fridaGumStrings.sysreg = this.cast("sysreg")
}

