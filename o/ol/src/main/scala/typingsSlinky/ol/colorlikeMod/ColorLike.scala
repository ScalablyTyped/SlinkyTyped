package typingsSlinky.ol.colorlikeMod

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.CanvasPattern
  - typingsSlinky.std.CanvasGradient
*/
trait ColorLike extends js.Object

object ColorLike {
  @scala.inline
  implicit def apply(value: CanvasGradient): ColorLike = value.asInstanceOf[ColorLike]
  @scala.inline
  implicit def apply(value: CanvasPattern): ColorLike = value.asInstanceOf[ColorLike]
  @scala.inline
  implicit def apply(value: String): ColorLike = value.asInstanceOf[ColorLike]
}

