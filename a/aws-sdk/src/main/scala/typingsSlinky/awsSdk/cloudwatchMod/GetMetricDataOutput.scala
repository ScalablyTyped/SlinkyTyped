package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMetricDataOutput extends js.Object {
  /**
    * Contains a message about this GetMetricData operation, if the operation results in such a message. An example of a message that may be returned is Maximum number of allowed metrics exceeded. If there is a message, as much of the operation as possible is still executed. A message appears here only if it is related to the global GetMetricData operation. Any message about a specific metric returned by the operation appears in the MetricDataResult object returned for that metric.
    */
  var Messages: js.UndefOr[MetricDataResultMessages] = js.native
  /**
    * The metrics that are returned, including the metric name, namespace, and dimensions.
    */
  var MetricDataResults: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.MetricDataResults] = js.native
  /**
    * A token that marks the next batch of returned results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.NextToken] = js.native
}

object GetMetricDataOutput {
  @scala.inline
  def apply(): GetMetricDataOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricDataOutput]
  }
  @scala.inline
  implicit class GetMetricDataOutputOps[Self <: GetMetricDataOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: MetricDataResultMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Messages")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricDataResults(value: MetricDataResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricDataResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricDataResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricDataResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

