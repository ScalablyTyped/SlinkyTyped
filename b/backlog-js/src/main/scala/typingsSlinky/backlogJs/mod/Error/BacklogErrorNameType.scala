package typingsSlinky.backlogJs.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.backlogJs.backlogJsStrings.BacklogApiError
  - typingsSlinky.backlogJs.backlogJsStrings.BacklogAuthError
  - typingsSlinky.backlogJs.backlogJsStrings.UnexpectedError
*/
trait BacklogErrorNameType extends js.Object

object BacklogErrorNameType {
  @scala.inline
  def BacklogApiError: typingsSlinky.backlogJs.backlogJsStrings.BacklogApiError = this.cast("BacklogApiError")
  @scala.inline
  def BacklogAuthError: typingsSlinky.backlogJs.backlogJsStrings.BacklogAuthError = this.cast("BacklogAuthError")
  @scala.inline
  def UnexpectedError: typingsSlinky.backlogJs.backlogJsStrings.UnexpectedError = this.cast("UnexpectedError")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

