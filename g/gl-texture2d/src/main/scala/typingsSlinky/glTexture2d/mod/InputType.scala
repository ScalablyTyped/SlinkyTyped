package typingsSlinky.glTexture2d.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.ImageData
  - typingsSlinky.std.HTMLCanvasElement
  - typingsSlinky.std.HTMLImageElement
  - typingsSlinky.std.HTMLVideoElement
*/
trait InputType extends js.Object

object InputType {
  @scala.inline
  implicit def apply(value: HTMLCanvasElement): InputType = value.asInstanceOf[InputType]
  @scala.inline
  implicit def apply(value: HTMLImageElement): InputType = value.asInstanceOf[InputType]
  @scala.inline
  implicit def apply(value: HTMLVideoElement): InputType = value.asInstanceOf[InputType]
  @scala.inline
  implicit def apply(value: ImageData): InputType = value.asInstanceOf[InputType]
}

