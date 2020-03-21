package typingsSlinky.fundamentalReact.formInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fundamentalReact.fundamentalReactStrings.normal
  - typingsSlinky.fundamentalReact.fundamentalReactStrings.valid
  - typingsSlinky.fundamentalReact.fundamentalReactStrings.invalid
  - typingsSlinky.fundamentalReact.fundamentalReactStrings.warning
*/
trait InputType extends js.Object

object InputType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def invalid: typingsSlinky.fundamentalReact.fundamentalReactStrings.invalid = this.cast("invalid")
  @scala.inline
  def normal: typingsSlinky.fundamentalReact.fundamentalReactStrings.normal = this.cast("normal")
  @scala.inline
  def valid: typingsSlinky.fundamentalReact.fundamentalReactStrings.valid = this.cast("valid")
  @scala.inline
  def warning: typingsSlinky.fundamentalReact.fundamentalReactStrings.warning = this.cast("warning")
}

