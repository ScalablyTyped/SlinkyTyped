package typingsSlinky.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProblemsResponse extends StObject {
  
  /**
    * The token used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The list of problems. 
    */
  var ProblemList: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ProblemList] = js.native
}
object ListProblemsResponse {
  
  @scala.inline
  def apply(): ListProblemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProblemsResponse]
  }
  
  @scala.inline
  implicit class ListProblemsResponseMutableBuilder[Self <: ListProblemsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProblemList(value: ProblemList): Self = StObject.set(x, "ProblemList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProblemListUndefined: Self = StObject.set(x, "ProblemList", js.undefined)
    
    @scala.inline
    def setProblemListVarargs(value: Problem*): Self = StObject.set(x, "ProblemList", js.Array(value :_*))
  }
}
