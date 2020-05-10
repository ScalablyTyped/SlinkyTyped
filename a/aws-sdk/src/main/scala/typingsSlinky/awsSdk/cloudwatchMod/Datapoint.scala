package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datapoint extends js.Object {
  /**
    * The average of the metric values that correspond to the data point.
    */
  var Average: js.UndefOr[DatapointValue] = js.native
  /**
    * The percentile statistic for the data point.
    */
  var ExtendedStatistics: js.UndefOr[DatapointValueMap] = js.native
  /**
    * The maximum metric value for the data point.
    */
  var Maximum: js.UndefOr[DatapointValue] = js.native
  /**
    * The minimum metric value for the data point.
    */
  var Minimum: js.UndefOr[DatapointValue] = js.native
  /**
    * The number of metric values that contributed to the aggregate value of this data point.
    */
  var SampleCount: js.UndefOr[DatapointValue] = js.native
  /**
    * The sum of the metric values for the data point.
    */
  var Sum: js.UndefOr[DatapointValue] = js.native
  /**
    * The time stamp used for the data point.
    */
  var Timestamp: js.UndefOr[js.Date] = js.native
  /**
    * The standard unit for the data point.
    */
  var Unit: js.UndefOr[StandardUnit] = js.native
}

object Datapoint {
  @scala.inline
  def apply(): Datapoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datapoint]
  }
  @scala.inline
  implicit class DatapointOps[Self <: Datapoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverage(value: DatapointValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Average")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Average")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedStatistics(value: DatapointValueMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedStatistics")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum(value: DatapointValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maximum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum(value: DatapointValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Minimum")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleCount(value: DatapointValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSum(value: DatapointValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sum")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: StandardUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unit")(js.undefined)
        ret
    }
  }
  
}

