package typingsSlinky.reactChartjs2.components

import typingsSlinky.chartJs.mod.ChartData
import typingsSlinky.reactChartjs2.mod.ChartComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Doughnut {
  
  @scala.inline
  def apply(data: typingsSlinky.reactChartjs2.mod.ChartData[ChartData]): SharedBuilder_ChartComponentProps_1244641512[typingsSlinky.reactChartjs2.mod.Doughnut] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_ChartComponentProps_1244641512[typingsSlinky.reactChartjs2.mod.Doughnut](js.Array(this.component, __props.asInstanceOf[ChartComponentProps]))
  }
  
  @JSImport("react-chartjs-2", "Doughnut")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ChartComponentProps): SharedBuilder_ChartComponentProps_1244641512[typingsSlinky.reactChartjs2.mod.Doughnut] = new SharedBuilder_ChartComponentProps_1244641512[typingsSlinky.reactChartjs2.mod.Doughnut](js.Array(this.component, p.asInstanceOf[js.Any]))
}
