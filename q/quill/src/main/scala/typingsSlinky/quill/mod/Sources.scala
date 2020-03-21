package typingsSlinky.quill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.quill.quillStrings.api
  - typingsSlinky.quill.quillStrings.user
  - typingsSlinky.quill.quillStrings.silent
*/
trait Sources extends js.Object

object Sources {
  @scala.inline
  def api: typingsSlinky.quill.quillStrings.api = this.cast("api")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def silent: typingsSlinky.quill.quillStrings.silent = this.cast("silent")
  @scala.inline
  def user: typingsSlinky.quill.quillStrings.user = this.cast("user")
}

