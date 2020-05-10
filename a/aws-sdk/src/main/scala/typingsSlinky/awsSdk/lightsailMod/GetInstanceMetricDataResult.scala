package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceMetricDataResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the results of your get instance metric data request.
    */
  var metricData: js.UndefOr[MetricDatapointList] = js.native
  /**
    * The metric name to return data for.
    */
  var metricName: js.UndefOr[InstanceMetricName] = js.native
}

object GetInstanceMetricDataResult {
  @scala.inline
  def apply(): GetInstanceMetricDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceMetricDataResult]
  }
  @scala.inline
  implicit class GetInstanceMetricDataResultOps[Self <: GetInstanceMetricDataResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricData(value: MetricDatapointList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricData")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricName(value: InstanceMetricName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(js.undefined)
        ret
    }
  }
  
}

