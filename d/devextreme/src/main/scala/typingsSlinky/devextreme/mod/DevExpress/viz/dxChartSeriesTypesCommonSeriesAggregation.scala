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
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.CommonSeries.aggregation */
trait dxChartSeriesTypesCommonSeriesAggregation extends js.Object {
  /** @name dxChartSeriesTypes.CommonSeries.aggregation.calculate */
  var calculate: js.UndefOr[
    js.Function2[
      /* aggregationInfo */ chartPointAggregationInfoObject, 
      /* series */ chartSeriesObject, 
      _ | js.Array[_]
    ]
  ] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.aggregation.enabled */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.aggregation.method */
  var method: js.UndefOr[avg | count | max | min | ohlc | range | sum | custom] = js.undefined
}

object dxChartSeriesTypesCommonSeriesAggregation {
  @scala.inline
  def apply(
    calculate: (/* aggregationInfo */ chartPointAggregationInfoObject, /* series */ chartSeriesObject) => _ | js.Array[_] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    method: avg | count | max | min | ohlc | range | sum | custom = null
  ): dxChartSeriesTypesCommonSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    if (calculate != null) __obj.updateDynamic("calculate")(js.Any.fromFunction2(calculate))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesAggregation]
  }
}

