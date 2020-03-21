package typingsSlinky.inputmask.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inputmask.inputmaskStrings.verbatim
  - typingsSlinky.inputmask.inputmaskStrings.none
  - typingsSlinky.inputmask.inputmaskStrings.text
  - typingsSlinky.inputmask.inputmaskStrings.decimal
  - typingsSlinky.inputmask.inputmaskStrings.numeric
  - typingsSlinky.inputmask.inputmaskStrings.tel
  - typingsSlinky.inputmask.inputmaskStrings.search
  - typingsSlinky.inputmask.inputmaskStrings.email
  - typingsSlinky.inputmask.inputmaskStrings.url
*/
trait InputMode extends js.Object

object InputMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def decimal: typingsSlinky.inputmask.inputmaskStrings.decimal = this.cast("decimal")
  @scala.inline
  def email: typingsSlinky.inputmask.inputmaskStrings.email = this.cast("email")
  @scala.inline
  def none: typingsSlinky.inputmask.inputmaskStrings.none = this.cast("none")
  @scala.inline
  def numeric: typingsSlinky.inputmask.inputmaskStrings.numeric = this.cast("numeric")
  @scala.inline
  def search: typingsSlinky.inputmask.inputmaskStrings.search = this.cast("search")
  @scala.inline
  def tel: typingsSlinky.inputmask.inputmaskStrings.tel = this.cast("tel")
  @scala.inline
  def text: typingsSlinky.inputmask.inputmaskStrings.text = this.cast("text")
  @scala.inline
  def url: typingsSlinky.inputmask.inputmaskStrings.url = this.cast("url")
  @scala.inline
  def verbatim: typingsSlinky.inputmask.inputmaskStrings.verbatim = this.cast("verbatim")
}

