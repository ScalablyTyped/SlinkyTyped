package typingsSlinky.pulumiAws.logMetricFilterMod

import typingsSlinky.pulumiAws.inputMod.cloudwatch.LogMetricFilterMetricTransformation
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogMetricFilterState extends js.Object {
  /**
    * The name of the log group to associate the metric filter with.
    */
  val logGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * A block defining collection of information
    * needed to define how metric data gets emitted. See below.
    */
  val metricTransformation: js.UndefOr[Input[LogMetricFilterMetricTransformation]] = js.native
  /**
    * A name for the metric filter.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
    * for extracting metric data out of ingested log events.
    */
  val pattern: js.UndefOr[Input[String]] = js.native
}

object LogMetricFilterState {
  @scala.inline
  def apply(): LogMetricFilterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogMetricFilterState]
  }
  @scala.inline
  implicit class LogMetricFilterStateOps[Self <: LogMetricFilterState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricTransformation(value: Input[LogMetricFilterMetricTransformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricTransformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricTransformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricTransformation")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
  }
  
}

