package typingsSlinky.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timeseries extends js.Object {
  /** The data points of this time series. The points are listed in order of their end timestamp, from younger to older. */
  var points: js.UndefOr[js.Array[Point]] = js.native
  /** The descriptor of this time series. */
  var timeseriesDesc: js.UndefOr[TimeseriesDescriptor] = js.native
}

object Timeseries {
  @scala.inline
  def apply(): Timeseries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timeseries]
  }
  @scala.inline
  implicit class TimeseriesOps[Self <: Timeseries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPoints(value: js.Array[Point]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeseriesDesc(value: TimeseriesDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeseriesDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeseriesDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeseriesDesc")(js.undefined)
        ret
    }
  }
  
}

