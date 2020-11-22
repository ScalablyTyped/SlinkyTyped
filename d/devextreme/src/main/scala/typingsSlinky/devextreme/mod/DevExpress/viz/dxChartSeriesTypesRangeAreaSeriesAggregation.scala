package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.custom
import typingsSlinky.devextreme.devextremeStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.RangeAreaSeries.aggregation]
  */
@js.native
trait dxChartSeriesTypesRangeAreaSeriesAggregation extends dxChartSeriesTypesCommonSeriesAggregation {
  
  /**
    * [descr:dxChartSeriesTypes.RangeAreaSeries.aggregation.method]
    */
  @JSName("method")
  var method_dxChartSeriesTypesRangeAreaSeriesAggregation: js.UndefOr[range | custom] = js.native
}
object dxChartSeriesTypesRangeAreaSeriesAggregation {
  
  @scala.inline
  def apply(): dxChartSeriesTypesRangeAreaSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesRangeAreaSeriesAggregation]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesRangeAreaSeriesAggregationOps[Self <: dxChartSeriesTypesRangeAreaSeriesAggregation] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: range | custom): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
}
