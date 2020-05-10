package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentMetricSummary extends js.Object {
  /**
    * The average value of the metric.
    */
  var Avg: js.UndefOr[OptionalDouble] = js.native
  /**
    * The number of samples used to generate the metric.
    */
  var Count: js.UndefOr[OptionalInteger] = js.native
  /**
    * The most recent value of the metric.
    */
  var Last: js.UndefOr[OptionalDouble] = js.native
  /**
    * The maximum value of the metric.
    */
  var Max: js.UndefOr[OptionalDouble] = js.native
  /**
    * The name of the metric.
    */
  var MetricName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MetricName] = js.native
  /**
    * The minimum value of the metric.
    */
  var Min: js.UndefOr[OptionalDouble] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: js.UndefOr[TrialComponentSourceArn] = js.native
  /**
    * The standard deviation of the metric.
    */
  var StdDev: js.UndefOr[OptionalDouble] = js.native
  /**
    * When the metric was last updated.
    */
  var TimeStamp: js.UndefOr[js.Date] = js.native
}

object TrialComponentMetricSummary {
  @scala.inline
  def apply(): TrialComponentMetricSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponentMetricSummary]
  }
  @scala.inline
  implicit class TrialComponentMetricSummaryOps[Self <: TrialComponentMetricSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvg(value: OptionalDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Avg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Avg")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: OptionalInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(js.undefined)
        ret
    }
    @scala.inline
    def withLast(value: OptionalDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Last")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: OptionalDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Max")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricName(value: MetricName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricName")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: OptionalDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Min")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceArn(value: TrialComponentSourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStdDev(value: OptionalDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StdDev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdDev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StdDev")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeStamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeStamp")(js.undefined)
        ret
    }
  }
  
}

