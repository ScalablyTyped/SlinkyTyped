package typingsSlinky.dropzone.mod.global

import typingsSlinky.dropzone.mod.Dropzone
import typingsSlinky.dropzone.mod.DropzoneOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def dropzone(options: DropzoneOptions): Dropzone
}

object JQuery {
  @scala.inline
  def apply(dropzone: DropzoneOptions => Dropzone): JQuery = {
    val __obj = js.Dynamic.literal(dropzone = js.Any.fromFunction1(dropzone))
    __obj.asInstanceOf[JQuery]
  }
}

