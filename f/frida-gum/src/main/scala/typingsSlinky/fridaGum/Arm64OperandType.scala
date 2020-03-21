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
  - typingsSlinky.fridaGum.fridaGumStrings.`reg-mrs`
  - typingsSlinky.fridaGum.fridaGumStrings.`reg-msr`
  - typingsSlinky.fridaGum.fridaGumStrings.pstate
  - typingsSlinky.fridaGum.fridaGumStrings.sys
  - typingsSlinky.fridaGum.fridaGumStrings.prefetch
  - typingsSlinky.fridaGum.fridaGumStrings.barrier
*/
trait Arm64OperandType extends js.Object

object Arm64OperandType {
  @scala.inline
  def barrier: typingsSlinky.fridaGum.fridaGumStrings.barrier = this.cast("barrier")
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
  def prefetch: typingsSlinky.fridaGum.fridaGumStrings.prefetch = this.cast("prefetch")
  @scala.inline
  def pstate: typingsSlinky.fridaGum.fridaGumStrings.pstate = this.cast("pstate")
  @scala.inline
  def reg: typingsSlinky.fridaGum.fridaGumStrings.reg = this.cast("reg")
  @scala.inline
  def `reg-mrs`: typingsSlinky.fridaGum.fridaGumStrings.`reg-mrs` = this.cast("reg-mrs")
  @scala.inline
  def `reg-msr`: typingsSlinky.fridaGum.fridaGumStrings.`reg-msr` = this.cast("reg-msr")
  @scala.inline
  def sys: typingsSlinky.fridaGum.fridaGumStrings.sys = this.cast("sys")
}

