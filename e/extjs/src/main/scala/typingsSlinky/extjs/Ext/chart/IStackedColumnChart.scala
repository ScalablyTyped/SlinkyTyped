package typingsSlinky.extjs.Ext.chart

import typingsSlinky.extjs.Ext.chart.series.IBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStackedColumnChart extends IBar {
  
  /** [Config Option] (String) */
  @JSName("axis")
  var axis_IStackedColumnChart: js.UndefOr[String] = js.native
}
object IStackedColumnChart {
  
  @scala.inline
  def apply(): IStackedColumnChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackedColumnChart]
  }
  
  @scala.inline
  implicit class IStackedColumnChartMutableBuilder[Self <: IStackedColumnChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
  }
}
