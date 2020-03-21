package typingsSlinky.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.codemirror.codemirrorStrings.textarea
  - typingsSlinky.codemirror.codemirrorStrings.contenteditable
*/
trait InputStyle extends js.Object

object InputStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def contenteditable: typingsSlinky.codemirror.codemirrorStrings.contenteditable = this.cast("contenteditable")
  @scala.inline
  def textarea: typingsSlinky.codemirror.codemirrorStrings.textarea = this.cast("textarea")
}

