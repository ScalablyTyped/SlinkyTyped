package typingsSlinky.cropperjs.Cropper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cropperjs.cropperjsStrings.crop
  - typingsSlinky.cropperjs.cropperjsStrings.move
  - typingsSlinky.cropperjs.cropperjsStrings.none
*/
trait DragMode extends js.Object

object DragMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def crop: typingsSlinky.cropperjs.cropperjsStrings.crop = this.cast("crop")
  @scala.inline
  def move: typingsSlinky.cropperjs.cropperjsStrings.move = this.cast("move")
  @scala.inline
  def none: typingsSlinky.cropperjs.cropperjsStrings.none = this.cast("none")
}

