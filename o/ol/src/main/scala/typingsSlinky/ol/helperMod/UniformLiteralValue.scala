package typingsSlinky.ol.helperMod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ImageData
import typingsSlinky.ol.olMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - js.Array[scala.Double]
  - typingsSlinky.std.HTMLCanvasElement
  - typingsSlinky.std.HTMLImageElement
  - typingsSlinky.std.ImageData
  - typingsSlinky.ol.olMod.Transform
*/
trait UniformLiteralValue extends UniformValue

object UniformLiteralValue {
  @scala.inline
  implicit def apply(value: js.Array[Double] | Transform): UniformLiteralValue = value.asInstanceOf[UniformLiteralValue]
  @scala.inline
  implicit def apply(value: Double): UniformLiteralValue = value.asInstanceOf[UniformLiteralValue]
  @scala.inline
  implicit def apply(value: HTMLCanvasElement): UniformLiteralValue = value.asInstanceOf[UniformLiteralValue]
  @scala.inline
  implicit def apply(value: HTMLImageElement): UniformLiteralValue = value.asInstanceOf[UniformLiteralValue]
  @scala.inline
  implicit def apply(value: ImageData): UniformLiteralValue = value.asInstanceOf[UniformLiteralValue]
}

