package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.fridaGumStrings.byte
  - typingsSlinky.fridaGum.fridaGumStrings.dword
  - typingsSlinky.fridaGum.fridaGumStrings.qword
*/
trait X86PointerTarget extends js.Object

object X86PointerTarget {
  @scala.inline
  def byte: typingsSlinky.fridaGum.fridaGumStrings.byte = this.cast("byte")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dword: typingsSlinky.fridaGum.fridaGumStrings.dword = this.cast("dword")
  @scala.inline
  def qword: typingsSlinky.fridaGum.fridaGumStrings.qword = this.cast("qword")
}

