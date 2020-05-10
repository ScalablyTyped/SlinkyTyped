package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTraceSummariesRequest extends js.Object {
  /**
    * The end of the time frame for which to retrieve traces.
    */
  var EndTime: js.Date = js.native
  /**
    * Specify a filter expression to retrieve trace summaries for services or requests that meet certain requirements.
    */
  var FilterExpression: js.UndefOr[typingsSlinky.awsSdk.xrayMod.FilterExpression] = js.native
  /**
    * Specify the pagination token returned by a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Set to true to get summaries for only a subset of available traces.
    */
  var Sampling: js.UndefOr[NullableBoolean] = js.native
  /**
    * A paramater to indicate whether to enable sampling on trace summaries. Input parameters are Name and Value.
    */
  var SamplingStrategy: js.UndefOr[typingsSlinky.awsSdk.xrayMod.SamplingStrategy] = js.native
  /**
    * The start of the time frame for which to retrieve traces.
    */
  var StartTime: js.Date = js.native
  /**
    * A parameter to indicate whether to query trace summaries by TraceId or Event time.
    */
  var TimeRangeType: js.UndefOr[typingsSlinky.awsSdk.xrayMod.TimeRangeType] = js.native
}

object GetTraceSummariesRequest {
  @scala.inline
  def apply(EndTime: js.Date, StartTime: js.Date): GetTraceSummariesRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTraceSummariesRequest]
  }
  @scala.inline
  implicit class GetTraceSummariesRequestOps[Self <: GetTraceSummariesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterExpression(value: FilterExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
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
    @scala.inline
    def withSampling(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sampling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sampling")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplingStrategy(value: SamplingStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeRangeType(value: TimeRangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeRangeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeRangeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeRangeType")(js.undefined)
        ret
    }
  }
  
}

