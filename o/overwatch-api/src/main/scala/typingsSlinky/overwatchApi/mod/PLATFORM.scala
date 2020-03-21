package typingsSlinky.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.overwatchApi.overwatchApiStrings.pc
  - typingsSlinky.overwatchApi.overwatchApiStrings.xbl
  - typingsSlinky.overwatchApi.overwatchApiStrings.psn
*/
trait PLATFORM extends js.Object

object PLATFORM {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pc: typingsSlinky.overwatchApi.overwatchApiStrings.pc = this.cast("pc")
  @scala.inline
  def psn: typingsSlinky.overwatchApi.overwatchApiStrings.psn = this.cast("psn")
  @scala.inline
  def xbl: typingsSlinky.overwatchApi.overwatchApiStrings.xbl = this.cast("xbl")
}

