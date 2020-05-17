package typingsSlinky.echarts.echarts.EChartOption

import typingsSlinky.echarts.anon.Image
import typingsSlinky.echarts.anon.Type
import typingsSlinky.echarts.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Color type for itemStyle / areaStyle etc.
  * [Color](https://echarts.apache.org/zh/option.html#series-line.areaStyle)
  * + Linear gradient. First four parameters are x0, y0, x2, and y2, each ranged from 0 to 1, standing for percentage in the bounding box. If global is `true`, then the first four parameters are in absolute pixel positions.
  * + Radial gradient. First three parameters are x and y positions of center, and radius, similar to linear gradient.
  * + Fill with texture
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.echarts.anon.Type
  - typingsSlinky.echarts.anon.X
  - typingsSlinky.echarts.anon.Image
*/
trait Color extends js.Object

object Color {
  @scala.inline
  implicit def apply(value: Image): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: String): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: Type): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: X): Color = value.asInstanceOf[Color]
}

