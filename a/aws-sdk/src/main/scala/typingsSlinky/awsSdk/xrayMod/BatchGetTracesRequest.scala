package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetTracesRequest extends js.Object {
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Specify the trace IDs of requests for which to retrieve segments.
    */
  var TraceIds: TraceIdList = js.native
}
object BatchGetTracesRequest {
  
  @scala.inline
  def apply(TraceIds: TraceIdList): BatchGetTracesRequest = {
    val __obj = js.Dynamic.literal(TraceIds = TraceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetTracesRequest]
  }
  
  @scala.inline
  implicit class BatchGetTracesRequestOps[Self <: BatchGetTracesRequest] (val x: Self) extends AnyVal {
    
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
    def setTraceIdsVarargs(value: TraceId*): Self = this.set("TraceIds", js.Array(value :_*))
    
    @scala.inline
    def setTraceIds(value: TraceIdList): Self = this.set("TraceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
