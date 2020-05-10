package typingsSlinky.autocannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Histogram extends js.Object {
  /** The average (mean) value. */
  var average: Double = js.native
  /** The highest value for this statistic. */
  var max: Double = js.native
  /** The average (mean) value */
  var mean: Double = js.native
  /** The lowest value for this statistic. */
  var min: Double = js.native
  /** The 0.001st percentile value for this statistic. */
  var p0_001: Double = js.native
  /** The 0.01st percentile value for this statistic. */
  var p0_01: Double = js.native
  /** The 0.1st percentile value for this statistic. */
  var p0_1: Double = js.native
  /** The 1st percentile value for this statistic. */
  var p1: Double = js.native
  /** The 10th percentile value for this statistic. */
  var p10: Double = js.native
  /** The 25th percentile value for this statistic. */
  var p25: Double = js.native
  /** The 2.5th percentile value for this statistic. */
  var p2_5: Double = js.native
  /** The 50th percentile value for this statistic. */
  var p50: Double = js.native
  /** The 75th percentile value for this statistic. */
  var p75: Double = js.native
  /** The 90th percentile value for this statistic. */
  var p90: Double = js.native
  /** The 97.5th percentile value for this statistic. */
  var p97_5: Double = js.native
  /** The 99th percentile value for this statistic. */
  var p99: Double = js.native
  /** The 99.9th percentile value for this statistic. */
  var p99_9: Double = js.native
  /** The 99.99th percentile value for this statistic. */
  var p99_99: Double = js.native
  /** The 99.999th percentile value for this statistic. */
  var p99_999: Double = js.native
  /** The standard deviation. */
  var stddev: Double = js.native
  var total: Double = js.native
}

object Histogram {
  @scala.inline
  def apply(
    average: Double,
    max: Double,
    mean: Double,
    min: Double,
    p0_001: Double,
    p0_01: Double,
    p0_1: Double,
    p1: Double,
    p10: Double,
    p25: Double,
    p2_5: Double,
    p50: Double,
    p75: Double,
    p90: Double,
    p97_5: Double,
    p99: Double,
    p99_9: Double,
    p99_99: Double,
    p99_999: Double,
    stddev: Double,
    total: Double
  ): Histogram = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], p0_001 = p0_001.asInstanceOf[js.Any], p0_01 = p0_01.asInstanceOf[js.Any], p0_1 = p0_1.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p10 = p10.asInstanceOf[js.Any], p25 = p25.asInstanceOf[js.Any], p2_5 = p2_5.asInstanceOf[js.Any], p50 = p50.asInstanceOf[js.Any], p75 = p75.asInstanceOf[js.Any], p90 = p90.asInstanceOf[js.Any], p97_5 = p97_5.asInstanceOf[js.Any], p99 = p99.asInstanceOf[js.Any], p99_9 = p99_9.asInstanceOf[js.Any], p99_99 = p99_99.asInstanceOf[js.Any], p99_999 = p99_999.asInstanceOf[js.Any], stddev = stddev.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Histogram]
  }
  @scala.inline
  implicit class HistogramOps[Self <: Histogram] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMean(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP0_001(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p0_001")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP0_01(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p0_01")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP0_1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p0_1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP10(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP25(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p25")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP2_5(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p2_5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP50(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p50")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP75(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p75")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP90(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p90")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP97_5(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p97_5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP99(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p99")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP99_9(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p99_9")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP99_99(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p99_99")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP99_999(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p99_999")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStddev(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stddev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

