package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobExecutionsForThingResponse extends js.Object {
  
  /**
    * A list of job execution summaries.
    */
  var executionSummaries: js.UndefOr[JobExecutionSummaryForThingList] = js.native
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListJobExecutionsForThingResponse {
  
  @scala.inline
  def apply(): ListJobExecutionsForThingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobExecutionsForThingResponse]
  }
  
  @scala.inline
  implicit class ListJobExecutionsForThingResponseOps[Self <: ListJobExecutionsForThingResponse] (val x: Self) extends AnyVal {
    
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
    def setExecutionSummariesVarargs(value: JobExecutionSummaryForThing*): Self = this.set("executionSummaries", js.Array(value :_*))
    
    @scala.inline
    def setExecutionSummaries(value: JobExecutionSummaryForThingList): Self = this.set("executionSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionSummaries: Self = this.set("executionSummaries", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
