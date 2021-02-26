package typingsSlinky.reactChartjs2.components

import typingsSlinky.chartJs.mod.ChartData
import typingsSlinky.reactChartjs2.mod.LinearComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Bar {
  
  @scala.inline
  def apply(data: typingsSlinky.reactChartjs2.mod.ChartData[ChartData]): SharedBuilder_LinearComponentProps1592093091[typingsSlinky.reactChartjs2.mod.Bar] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_LinearComponentProps1592093091[typingsSlinky.reactChartjs2.mod.Bar](js.Array(this.component, __props.asInstanceOf[LinearComponentProps]))
  }
  
  @JSImport("react-chartjs-2", "Bar")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LinearComponentProps): SharedBuilder_LinearComponentProps1592093091[typingsSlinky.reactChartjs2.mod.Bar] = new SharedBuilder_LinearComponentProps1592093091[typingsSlinky.reactChartjs2.mod.Bar](js.Array(this.component, p.asInstanceOf[js.Any]))
}
