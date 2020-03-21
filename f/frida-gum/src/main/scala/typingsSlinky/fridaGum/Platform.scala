package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.fridaGumStrings.windows
  - typingsSlinky.fridaGum.fridaGumStrings.darwin
  - typingsSlinky.fridaGum.fridaGumStrings.linux
  - typingsSlinky.fridaGum.fridaGumStrings.qnx
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def darwin: typingsSlinky.fridaGum.fridaGumStrings.darwin = this.cast("darwin")
  @scala.inline
  def linux: typingsSlinky.fridaGum.fridaGumStrings.linux = this.cast("linux")
  @scala.inline
  def qnx: typingsSlinky.fridaGum.fridaGumStrings.qnx = this.cast("qnx")
  @scala.inline
  def windows: typingsSlinky.fridaGum.fridaGumStrings.windows = this.cast("windows")
}

