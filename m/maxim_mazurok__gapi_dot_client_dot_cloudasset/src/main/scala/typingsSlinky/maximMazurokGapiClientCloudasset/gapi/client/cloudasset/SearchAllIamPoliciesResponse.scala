package typingsSlinky.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchAllIamPoliciesResponse extends StObject {
  
  /** Set if there are more results than those appearing in this response; to get the next set of results, call this method again, using this value as the `page_token`. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** A list of IamPolicy that match the search query. Related information such as the associated resource is returned along with the policy. */
  var results: js.UndefOr[js.Array[IamPolicySearchResult]] = js.native
}
object SearchAllIamPoliciesResponse {
  
  @scala.inline
  def apply(): SearchAllIamPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAllIamPoliciesResponse]
  }
  
  @scala.inline
  implicit class SearchAllIamPoliciesResponseMutableBuilder[Self <: SearchAllIamPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[IamPolicySearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: IamPolicySearchResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
