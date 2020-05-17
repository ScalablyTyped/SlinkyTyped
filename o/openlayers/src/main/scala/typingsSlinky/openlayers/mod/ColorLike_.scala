package typingsSlinky.openlayers.mod

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
trait ColorLike_ extends js.Object

object ColorLike_ {
  @scala.inline
  implicit def apply(value: CanvasGradient): ColorLike_ = value.asInstanceOf[ColorLike_]
  @scala.inline
  implicit def apply(value: CanvasPattern): ColorLike_ = value.asInstanceOf[ColorLike_]
  @scala.inline
  implicit def apply(value: String): ColorLike_ = value.asInstanceOf[ColorLike_]
}

