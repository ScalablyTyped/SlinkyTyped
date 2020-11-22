package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.avg
import typingsSlinky.devextreme.devextremeStrings.count
import typingsSlinky.devextreme.devextremeStrings.custom
import typingsSlinky.devextreme.devextremeStrings.max
import typingsSlinky.devextreme.devextremeStrings.min
import typingsSlinky.devextreme.devextremeStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.ScatterSeries.aggregation]
  */
@js.native
trait dxChartSeriesTypesScatterSeriesAggregation extends dxChartSeriesTypesCommonSeriesAggregation {
  
  /**
    * [descr:dxChartSeriesTypes.ScatterSeries.aggregation.method]
    */
  @JSName("method")
  var method_dxChartSeriesTypesScatterSeriesAggregation: js.UndefOr[avg | count | max | min | sum | custom] = js.native
}
object dxChartSeriesTypesScatterSeriesAggregation {
  
  @scala.inline
  def apply(): dxChartSeriesTypesScatterSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesScatterSeriesAggregation]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesScatterSeriesAggregationOps[Self <: dxChartSeriesTypesScatterSeriesAggregation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMethod(value: avg | count | max | min | sum | custom): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
}
