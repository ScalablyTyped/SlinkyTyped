package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The CreateTimeSeries request.
  */
@js.native
trait SchemaCreateTimeSeriesRequest extends js.Object {
  /**
    * The new data to be added to a list of time series. Adds at most one data
    * point to each of several time series. The new data point must be more
    * recent than any other point in its time series. Each TimeSeries value
    * must fully specify a unique time series by supplying all label values for
    * the metric and the monitored resource.The maximum number of TimeSeries
    * objects per Create request is 200.
    */
  var timeSeries: js.UndefOr[js.Array[SchemaTimeSeries]] = js.native
}

object SchemaCreateTimeSeriesRequest {
  @scala.inline
  def apply(): SchemaCreateTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateTimeSeriesRequest]
  }
  @scala.inline
  implicit class SchemaCreateTimeSeriesRequestOps[Self <: SchemaCreateTimeSeriesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeSeries(value: js.Array[SchemaTimeSeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSeries")(js.undefined)
        ret
    }
  }
  
}

