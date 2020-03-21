package typingsSlinky.croppie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.croppie.croppieStrings.square
  - typingsSlinky.croppie.croppieStrings.circle
*/
trait CropType extends js.Object

object CropType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def circle: typingsSlinky.croppie.croppieStrings.circle = this.cast("circle")
  @scala.inline
  def square: typingsSlinky.croppie.croppieStrings.square = this.cast("square")
}

