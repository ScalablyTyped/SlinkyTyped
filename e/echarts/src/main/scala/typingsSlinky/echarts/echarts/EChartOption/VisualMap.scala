package typingsSlinky.echarts.echarts.EChartOption

import typingsSlinky.echarts.echarts.VisualMap.Continuous
import typingsSlinky.echarts.echarts.VisualMap.Piecewise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.echarts.echarts.VisualMap.Continuous
  - typingsSlinky.echarts.echarts.VisualMap.Piecewise
*/
trait VisualMap extends js.Object

object VisualMap {
  @scala.inline
  implicit def apply(value: Continuous): VisualMap = value.asInstanceOf[VisualMap]
  @scala.inline
  implicit def apply(value: Piecewise): VisualMap = value.asInstanceOf[VisualMap]
}

