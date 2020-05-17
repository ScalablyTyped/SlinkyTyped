package typingsSlinky.echarts.echarts.EChartOption.Tooltip.Position

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.echarts.echarts.EChartOption.Tooltip.Position.Str
  - typingsSlinky.echarts.echarts.EChartOption.Tooltip.Position.Obj
  - js.Array[scala.Double | java.lang.String]
  - typingsSlinky.echarts.echarts.EChartOption.Tooltip.Position.Fn
*/
trait Type extends js.Object

object Type {
  @scala.inline
  implicit def apply(value: js.Array[Double | String]): Type = value.asInstanceOf[Type]
  @scala.inline
  implicit def apply(value: Fn): Type = value.asInstanceOf[Type]
  @scala.inline
  implicit def apply(value: Obj): Type = value.asInstanceOf[Type]
  @scala.inline
  implicit def apply(value: Str): Type = value.asInstanceOf[Type]
}

