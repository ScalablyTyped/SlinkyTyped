package typingsSlinky.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCodeReviewsRequest extends StObject {
  
  /**
    *  The maximum number of results that are returned per call. The default is 100. 
    */
  var MaxResults: js.UndefOr[ListCodeReviewsMaxResults] = js.native
  
  /**
    *  If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.NextToken] = js.native
  
  /**
    *  List of provider types for filtering that needs to be applied before displaying the result. For example, providerTypes=[GitHub] lists code reviews from GitHub. 
    */
  var ProviderTypes: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.ProviderTypes] = js.native
  
  /**
    *  List of repository names for filtering that needs to be applied before displaying the result. 
    */
  var RepositoryNames: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.RepositoryNames] = js.native
  
  /**
    *  List of states for filtering that needs to be applied before displaying the result. For example, states=[Pending] lists code reviews in the Pending state.  The valid code review states are:    Completed: The code review is complete.     Pending: The code review started and has not completed or failed.     Failed: The code review failed.     Deleting: The code review is being deleted.   
    */
  var States: js.UndefOr[JobStates] = js.native
  
  /**
    *  The type of code reviews to list in the response. 
    */
  var Type: typingsSlinky.awsSdk.codegurureviewerMod.Type = js.native
}
object ListCodeReviewsRequest {
  
  @scala.inline
  def apply(Type: Type): ListCodeReviewsRequest = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCodeReviewsRequest]
  }
  
  @scala.inline
  implicit class ListCodeReviewsRequestMutableBuilder[Self <: ListCodeReviewsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ListCodeReviewsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProviderTypes(value: ProviderTypes): Self = StObject.set(x, "ProviderTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderTypesUndefined: Self = StObject.set(x, "ProviderTypes", js.undefined)
    
    @scala.inline
    def setProviderTypesVarargs(value: ProviderType*): Self = StObject.set(x, "ProviderTypes", js.Array(value :_*))
    
    @scala.inline
    def setRepositoryNames(value: RepositoryNames): Self = StObject.set(x, "RepositoryNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNamesUndefined: Self = StObject.set(x, "RepositoryNames", js.undefined)
    
    @scala.inline
    def setRepositoryNamesVarargs(value: Name*): Self = StObject.set(x, "RepositoryNames", js.Array(value :_*))
    
    @scala.inline
    def setStates(value: JobStates): Self = StObject.set(x, "States", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "States", js.undefined)
    
    @scala.inline
    def setStatesVarargs(value: JobState*): Self = StObject.set(x, "States", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
