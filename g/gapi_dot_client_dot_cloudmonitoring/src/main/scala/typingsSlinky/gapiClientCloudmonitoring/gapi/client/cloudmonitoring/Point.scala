package typingsSlinky.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point extends js.Object {
  /** The value of this data point. Either "true" or "false". */
  var boolValue: js.UndefOr[Boolean] = js.native
  /**
    * The value of this data point as a distribution. A distribution value can contain a list of buckets and/or an underflowBucket and an overflowBucket. The
    * values of these points can be used to create a histogram.
    */
  var distributionValue: js.UndefOr[PointDistribution] = js.native
  /** The value of this data point as a double-precision floating-point number. */
  var doubleValue: js.UndefOr[Double] = js.native
  /**
    * The interval [start, end] is the time period to which the point's value applies. For gauge metrics, whose values are instantaneous measurements, this
    * interval should be empty (start should equal end). For cumulative metrics (of which deltas and rates are special cases), the interval should be
    * non-empty. Both start and end are RFC 3339 strings.
    */
  var end: js.UndefOr[String] = js.native
  /** The value of this data point as a 64-bit integer. */
  var int64Value: js.UndefOr[String] = js.native
  /**
    * The interval [start, end] is the time period to which the point's value applies. For gauge metrics, whose values are instantaneous measurements, this
    * interval should be empty (start should equal end). For cumulative metrics (of which deltas and rates are special cases), the interval should be
    * non-empty. Both start and end are RFC 3339 strings.
    */
  var start: js.UndefOr[String] = js.native
  /** The value of this data point in string format. */
  var stringValue: js.UndefOr[String] = js.native
}

object Point {
  @scala.inline
  def apply(): Point = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Point]
  }
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoolValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDistributionValue(value: PointDistribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValue")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withInt64Value(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int64Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInt64Value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int64Value")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(js.undefined)
        ret
    }
  }
  
}

