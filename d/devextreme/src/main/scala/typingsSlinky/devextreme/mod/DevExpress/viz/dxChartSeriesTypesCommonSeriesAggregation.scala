package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.avg
import typingsSlinky.devextreme.devextremeStrings.count
import typingsSlinky.devextreme.devextremeStrings.custom
import typingsSlinky.devextreme.devextremeStrings.max
import typingsSlinky.devextreme.devextremeStrings.min
import typingsSlinky.devextreme.devextremeStrings.ohlc
import typingsSlinky.devextreme.devextremeStrings.range
import typingsSlinky.devextreme.devextremeStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.CommonSeries.aggregation]
  */
@js.native
trait dxChartSeriesTypesCommonSeriesAggregation extends js.Object {
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.aggregation.calculate]
    */
  var calculate: js.UndefOr[
    js.Function2[
      /* aggregationInfo */ chartPointAggregationInfoObject, 
      /* series */ chartSeriesObject, 
      _ | js.Array[_]
    ]
  ] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.aggregation.enabled]
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.aggregation.method]
    */
  var method: js.UndefOr[avg | count | max | min | ohlc | range | sum | custom] = js.native
}
object dxChartSeriesTypesCommonSeriesAggregation {
  
  @scala.inline
  def apply(): dxChartSeriesTypesCommonSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesAggregation]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesCommonSeriesAggregationOps[Self <: dxChartSeriesTypesCommonSeriesAggregation] (val x: Self) extends AnyVal {
    
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
    def setCalculate(
      value: (/* aggregationInfo */ chartPointAggregationInfoObject, /* series */ chartSeriesObject) => _ | js.Array[_]
    ): Self = this.set("calculate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCalculate: Self = this.set("calculate", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setMethod(value: avg | count | max | min | ohlc | range | sum | custom): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
}
