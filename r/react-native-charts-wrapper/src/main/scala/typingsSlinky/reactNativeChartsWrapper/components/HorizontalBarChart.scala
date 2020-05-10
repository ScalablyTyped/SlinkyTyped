package typingsSlinky.reactNativeChartsWrapper.components

import typingsSlinky.reactNativeChartsWrapper.mod.BarChartProps
import typingsSlinky.reactNativeChartsWrapper.mod.BarData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HorizontalBarChart {
  @JSImport("react-native-charts-wrapper", "HorizontalBarChart")
  @js.native
  object component extends js.Object
  
  def withProps(p: BarChartProps): SharedBuilder_BarChartProps_1050945866[typingsSlinky.reactNativeChartsWrapper.mod.HorizontalBarChart] = new SharedBuilder_BarChartProps_1050945866[typingsSlinky.reactNativeChartsWrapper.mod.HorizontalBarChart](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: BarData): SharedBuilder_BarChartProps_1050945866[typingsSlinky.reactNativeChartsWrapper.mod.HorizontalBarChart] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_BarChartProps_1050945866[typingsSlinky.reactNativeChartsWrapper.mod.HorizontalBarChart](js.Array(this.component, __props.asInstanceOf[BarChartProps]))
  }
}

