package typingsSlinky.reactChartjs2.components

import typingsSlinky.chartJs.mod.ChartData
import typingsSlinky.reactChartjs2.mod.ChartComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Scatter {
  @JSImport("react-chartjs-2", "Scatter")
  @js.native
  object component extends js.Object
  
  def withProps(p: ChartComponentProps): SharedBuilder_ChartComponentProps_1244641512[typingsSlinky.reactChartjs2.mod.Scatter] = new SharedBuilder_ChartComponentProps_1244641512[typingsSlinky.reactChartjs2.mod.Scatter](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: typingsSlinky.reactChartjs2.mod.ChartData[ChartData]): SharedBuilder_ChartComponentProps_1244641512[typingsSlinky.reactChartjs2.mod.Scatter] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_ChartComponentProps_1244641512[typingsSlinky.reactChartjs2.mod.Scatter](js.Array(this.component, __props.asInstanceOf[ChartComponentProps]))
  }
}

