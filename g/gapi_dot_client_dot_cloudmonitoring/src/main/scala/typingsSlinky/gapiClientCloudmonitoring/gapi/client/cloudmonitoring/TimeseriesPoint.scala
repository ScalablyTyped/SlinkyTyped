package typingsSlinky.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeseriesPoint extends js.Object {
  /** The data point in this time series snapshot. */
  var point: js.UndefOr[Point] = js.native
  /** The descriptor of this time series. */
  var timeseriesDesc: js.UndefOr[TimeseriesDescriptor] = js.native
}

object TimeseriesPoint {
  @scala.inline
  def apply(): TimeseriesPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeseriesPoint]
  }
  @scala.inline
  implicit class TimeseriesPointOps[Self <: TimeseriesPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(js.undefined)
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

