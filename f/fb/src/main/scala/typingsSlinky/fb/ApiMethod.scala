package typingsSlinky.fb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fb.fbStrings.get
  - typings.fb.fbStrings.post
  - typings.fb.fbStrings.delete
*/
trait ApiMethod extends js.Object

object ApiMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsSlinky.fb.fbStrings.delete = this.cast("delete")
  @scala.inline
  def get: typingsSlinky.fb.fbStrings.get = this.cast("get")
  @scala.inline
  def post: typingsSlinky.fb.fbStrings.post = this.cast("post")
}

