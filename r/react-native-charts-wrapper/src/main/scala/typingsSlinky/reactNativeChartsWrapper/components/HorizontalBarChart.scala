package typingsSlinky.reactNativeChartsWrapper.components

import typingsSlinky.reactNativeChartsWrapper.mod.BarChartProps
import typingsSlinky.reactNativeChartsWrapper.mod.BarData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HorizontalBarChart {
  
  @scala.inline
  def apply(data: BarData): SharedBuilder_BarChartProps_1050945866[typingsSlinky.reactNativeChartsWrapper.mod.HorizontalBarChart] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_BarChartProps_1050945866[typingsSlinky.reactNativeChartsWrapper.mod.HorizontalBarChart](js.Array(this.component, __props.asInstanceOf[BarChartProps]))
  }
  
  @JSImport("react-native-charts-wrapper", "HorizontalBarChart")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: BarChartProps): SharedBuilder_BarChartProps_1050945866[typingsSlinky.reactNativeChartsWrapper.mod.HorizontalBarChart] = new SharedBuilder_BarChartProps_1050945866[typingsSlinky.reactNativeChartsWrapper.mod.HorizontalBarChart](js.Array(this.component, p.asInstanceOf[js.Any]))
}
