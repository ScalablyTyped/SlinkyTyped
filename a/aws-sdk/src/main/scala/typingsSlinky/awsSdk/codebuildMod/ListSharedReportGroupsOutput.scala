package typingsSlinky.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSharedReportGroupsOutput extends StObject {
  
  /**
    *  During a previous call, the maximum number of items that can be returned is the value specified in maxResults. If there more items in the list, then a unique string called a nextToken is returned. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned. 
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    *  The list of ARNs for the report groups shared with the current AWS account or user. 
    */
  var reportGroups: js.UndefOr[ReportGroupArns] = js.native
}
object ListSharedReportGroupsOutput {
  
  @scala.inline
  def apply(): ListSharedReportGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSharedReportGroupsOutput]
  }
  
  @scala.inline
  implicit class ListSharedReportGroupsOutputMutableBuilder[Self <: ListSharedReportGroupsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setReportGroups(value: ReportGroupArns): Self = StObject.set(x, "reportGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportGroupsUndefined: Self = StObject.set(x, "reportGroups", js.undefined)
    
    @scala.inline
    def setReportGroupsVarargs(value: NonEmptyString*): Self = StObject.set(x, "reportGroups", js.Array(value :_*))
  }
}
