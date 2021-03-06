package typingsSlinky.reactNativeChartsWrapper.components

import typingsSlinky.reactNativeChartsWrapper.mod.BarChartProps
import typingsSlinky.reactNativeChartsWrapper.mod.BarData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BarChart {
  
  @scala.inline
  def apply(data: BarData): SharedBuilder_BarChartProps_1050945866[typingsSlinky.reactNativeChartsWrapper.mod.BarChart] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_BarChartProps_1050945866[typingsSlinky.reactNativeChartsWrapper.mod.BarChart](js.Array(this.component, __props.asInstanceOf[BarChartProps]))
  }
  
  @JSImport("react-native-charts-wrapper", "BarChart")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: BarChartProps): SharedBuilder_BarChartProps_1050945866[typingsSlinky.reactNativeChartsWrapper.mod.BarChart] = new SharedBuilder_BarChartProps_1050945866[typingsSlinky.reactNativeChartsWrapper.mod.BarChart](js.Array(this.component, p.asInstanceOf[js.Any]))
}
