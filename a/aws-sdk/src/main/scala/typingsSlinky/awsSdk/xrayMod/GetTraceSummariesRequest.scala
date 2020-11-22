package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * A parameter to indicate whether to enable sampling on trace summaries. Input parameters are Name and Value.
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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndTime(value: js.Date): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: js.Date): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterExpression(value: FilterExpression): Self = this.set("FilterExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterExpression: Self = this.set("FilterExpression", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSampling(value: NullableBoolean): Self = this.set("Sampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampling: Self = this.set("Sampling", js.undefined)
    
    @scala.inline
    def setSamplingStrategy(value: SamplingStrategy): Self = this.set("SamplingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingStrategy: Self = this.set("SamplingStrategy", js.undefined)
    
    @scala.inline
    def setTimeRangeType(value: TimeRangeType): Self = this.set("TimeRangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeRangeType: Self = this.set("TimeRangeType", js.undefined)
  }
}
