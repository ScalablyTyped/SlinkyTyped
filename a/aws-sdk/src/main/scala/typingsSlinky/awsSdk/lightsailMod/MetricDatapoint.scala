package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricDatapoint extends js.Object {
  /**
    * The average.
    */
  var average: js.UndefOr[double] = js.native
  /**
    * The maximum.
    */
  var maximum: js.UndefOr[double] = js.native
  /**
    * The minimum.
    */
  var minimum: js.UndefOr[double] = js.native
  /**
    * The sample count.
    */
  var sampleCount: js.UndefOr[double] = js.native
  /**
    * The sum.
    */
  var sum: js.UndefOr[double] = js.native
  /**
    * The timestamp (e.g., 1479816991.349).
    */
  var timestamp: js.UndefOr[js.Date] = js.native
  /**
    * The unit. 
    */
  var unit: js.UndefOr[MetricUnit] = js.native
}

object MetricDatapoint {
  @scala.inline
  def apply(): MetricDatapoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDatapoint]
  }
  @scala.inline
  implicit class MetricDatapointOps[Self <: MetricDatapoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverage(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleCount(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSum(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: MetricUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

