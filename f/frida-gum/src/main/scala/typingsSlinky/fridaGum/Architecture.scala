package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.fridaGumStrings.ia32
  - typingsSlinky.fridaGum.fridaGumStrings.x64
  - typingsSlinky.fridaGum.fridaGumStrings.arm
  - typingsSlinky.fridaGum.fridaGumStrings.arm64
  - typingsSlinky.fridaGum.fridaGumStrings.mips
*/
trait Architecture extends js.Object

object Architecture {
  @scala.inline
  def arm: typingsSlinky.fridaGum.fridaGumStrings.arm = this.cast("arm")
  @scala.inline
  def arm64: typingsSlinky.fridaGum.fridaGumStrings.arm64 = this.cast("arm64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ia32: typingsSlinky.fridaGum.fridaGumStrings.ia32 = this.cast("ia32")
  @scala.inline
  def mips: typingsSlinky.fridaGum.fridaGumStrings.mips = this.cast("mips")
  @scala.inline
  def x64: typingsSlinky.fridaGum.fridaGumStrings.x64 = this.cast("x64")
}

