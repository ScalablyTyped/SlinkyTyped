package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseMetricDataResult extends js.Object {
  /**
    * An object describing the result of your get relational database metric data request.
    */
  var metricData: js.UndefOr[MetricDatapointList] = js.native
  /**
    * The name of the metric.
    */
  var metricName: js.UndefOr[RelationalDatabaseMetricName] = js.native
}

object GetRelationalDatabaseMetricDataResult {
  @scala.inline
  def apply(): GetRelationalDatabaseMetricDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseMetricDataResult]
  }
  @scala.inline
  implicit class GetRelationalDatabaseMetricDataResultOps[Self <: GetRelationalDatabaseMetricDataResult] (val x: Self) extends AnyVal {
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
    def withMetricName(value: RelationalDatabaseMetricName): Self = {
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

