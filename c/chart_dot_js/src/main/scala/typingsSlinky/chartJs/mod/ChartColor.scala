package typingsSlinky.chartJs.mod

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.CanvasGradient
  - typingsSlinky.std.CanvasPattern
  - js.Array[java.lang.String]
*/
trait ChartColor extends js.Object

object ChartColor {
  @scala.inline
  implicit def apply(value: js.Array[String]): ChartColor = value.asInstanceOf[ChartColor]
  @scala.inline
  implicit def apply(value: CanvasGradient): ChartColor = value.asInstanceOf[ChartColor]
  @scala.inline
  implicit def apply(value: CanvasPattern): ChartColor = value.asInstanceOf[ChartColor]
  @scala.inline
  implicit def apply(value: String): ChartColor = value.asInstanceOf[ChartColor]
}

