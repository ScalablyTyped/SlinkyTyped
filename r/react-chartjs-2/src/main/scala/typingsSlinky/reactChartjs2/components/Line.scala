package typingsSlinky.reactChartjs2.components

import typingsSlinky.chartJs.mod.ChartData
import typingsSlinky.reactChartjs2.mod.LinearComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Line {
  @JSImport("react-chartjs-2", "Line")
  @js.native
  object component extends js.Object
  
  def withProps(p: LinearComponentProps): SharedBuilder_LinearComponentProps1592093091[typingsSlinky.reactChartjs2.mod.Line] = new SharedBuilder_LinearComponentProps1592093091[typingsSlinky.reactChartjs2.mod.Line](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: typingsSlinky.reactChartjs2.mod.ChartData[ChartData]): SharedBuilder_LinearComponentProps1592093091[typingsSlinky.reactChartjs2.mod.Line] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_LinearComponentProps1592093091[typingsSlinky.reactChartjs2.mod.Line](js.Array(this.component, __props.asInstanceOf[LinearComponentProps]))
  }
}

