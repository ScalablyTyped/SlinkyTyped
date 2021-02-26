package typingsSlinky.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssignmentsForHITResponse extends StObject {
  
  /**
    *  The collection of Assignment data structures returned by this call.
    */
  var Assignments: js.UndefOr[AssignmentList] = js.native
  
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    *  The number of assignments on the page in the filtered results list, equivalent to the number of assignments returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.native
}
object ListAssignmentsForHITResponse {
  
  @scala.inline
  def apply(): ListAssignmentsForHITResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssignmentsForHITResponse]
  }
  
  @scala.inline
  implicit class ListAssignmentsForHITResponseMutableBuilder[Self <: ListAssignmentsForHITResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignments(value: AssignmentList): Self = StObject.set(x, "Assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentsUndefined: Self = StObject.set(x, "Assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsVarargs(value: Assignment*): Self = StObject.set(x, "Assignments", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setNumResults(value: Integer): Self = StObject.set(x, "NumResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumResultsUndefined: Self = StObject.set(x, "NumResults", js.undefined)
  }
}
