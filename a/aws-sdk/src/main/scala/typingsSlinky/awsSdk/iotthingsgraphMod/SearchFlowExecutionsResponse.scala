package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFlowExecutionsResponse extends js.Object {
  
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * An array of objects that contain summary information about each workflow execution in the result set.
    */
  var summaries: js.UndefOr[FlowExecutionSummaries] = js.native
}
object SearchFlowExecutionsResponse {
  
  @scala.inline
  def apply(): SearchFlowExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFlowExecutionsResponse]
  }
  
  @scala.inline
  implicit class SearchFlowExecutionsResponseOps[Self <: SearchFlowExecutionsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setSummariesVarargs(value: FlowExecutionSummary*): Self = this.set("summaries", js.Array(value :_*))
    
    @scala.inline
    def setSummaries(value: FlowExecutionSummaries): Self = this.set("summaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaries: Self = this.set("summaries", js.undefined)
  }
}
