package typingsSlinky.reactChartjs2.components

import typingsSlinky.chartJs.mod.ChartData
import typingsSlinky.reactChartjs2.mod.ChartComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HorizontalBar {
  
  @JSImport("react-chartjs-2", "HorizontalBar")
  @js.native
  object component extends js.Object
  
  def withProps(p: ChartComponentProps): SharedBuilder_ChartComponentProps_1244641512[typingsSlinky.reactChartjs2.mod.HorizontalBar] = new SharedBuilder_ChartComponentProps_1244641512[typingsSlinky.reactChartjs2.mod.HorizontalBar](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(data: typingsSlinky.reactChartjs2.mod.ChartData[ChartData]): SharedBuilder_ChartComponentProps_1244641512[typingsSlinky.reactChartjs2.mod.HorizontalBar] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_ChartComponentProps_1244641512[typingsSlinky.reactChartjs2.mod.HorizontalBar](js.Array(this.component, __props.asInstanceOf[ChartComponentProps]))
  }
}
