package typingsSlinky.downscale.mod

import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.File
  - typingsSlinky.std.HTMLImageElement
  - typingsSlinky.std.HTMLVideoElement
  - java.lang.String
*/
trait ImageSource extends js.Object

object ImageSource {
  @scala.inline
  implicit def apply(value: File): ImageSource = value.asInstanceOf[ImageSource]
  @scala.inline
  implicit def apply(value: HTMLImageElement): ImageSource = value.asInstanceOf[ImageSource]
  @scala.inline
  implicit def apply(value: HTMLVideoElement): ImageSource = value.asInstanceOf[ImageSource]
  @scala.inline
  implicit def apply(value: String): ImageSource = value.asInstanceOf[ImageSource]
}

