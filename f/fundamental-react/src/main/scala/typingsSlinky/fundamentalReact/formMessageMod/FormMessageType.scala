package typingsSlinky.fundamentalReact.formMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fundamentalReact.fundamentalReactStrings.error
  - typingsSlinky.fundamentalReact.fundamentalReactStrings.warning
  - typingsSlinky.fundamentalReact.fundamentalReactStrings.help
*/
trait FormMessageType extends js.Object

object FormMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.fundamentalReact.fundamentalReactStrings.error = this.cast("error")
  @scala.inline
  def help: typingsSlinky.fundamentalReact.fundamentalReactStrings.help = this.cast("help")
  @scala.inline
  def warning: typingsSlinky.fundamentalReact.fundamentalReactStrings.warning = this.cast("warning")
}

