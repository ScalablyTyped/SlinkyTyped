package typingsSlinky.awsSdk.piMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricKeyDataPoints extends js.Object {
  /**
    * An array of timestamp-value pairs, representing measurements over a period of time.
    */
  var DataPoints: js.UndefOr[DataPointsList] = js.native
  /**
    * The dimension(s) to which the data points apply.
    */
  var Key: js.UndefOr[ResponseResourceMetricKey] = js.native
}

object MetricKeyDataPoints {
  @scala.inline
  def apply(): MetricKeyDataPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricKeyDataPoints]
  }
  @scala.inline
  implicit class MetricKeyDataPointsOps[Self <: MetricKeyDataPoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataPoints(value: DataPointsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: ResponseResourceMetricKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(js.undefined)
        ret
    }
  }
  
}

