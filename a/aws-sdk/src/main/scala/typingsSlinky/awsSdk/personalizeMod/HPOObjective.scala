package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HPOObjective extends js.Object {
  /**
    * The name of the metric.
    */
  var metricName: js.UndefOr[MetricName] = js.native
  /**
    * A regular expression for finding the metric in the training job logs.
    */
  var metricRegex: js.UndefOr[MetricRegex] = js.native
  /**
    * The type of the metric. Valid values are Maximize and Minimize.
    */
  var `type`: js.UndefOr[HPOObjectiveType] = js.native
}

object HPOObjective {
  @scala.inline
  def apply(): HPOObjective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HPOObjective]
  }
  @scala.inline
  implicit class HPOObjectiveOps[Self <: HPOObjective] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricName(value: MetricName): Self = {
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
    @scala.inline
    def withMetricRegex(value: MetricRegex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricRegex")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: HPOObjectiveType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

