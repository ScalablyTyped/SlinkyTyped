package typingsSlinky.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRepositoriesResult extends StObject {
  
  /**
    *  If there are additional results, this is the token for the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    *  The returned list of  RepositorySummary  objects. 
    */
  var repositories: js.UndefOr[RepositorySummaryList] = js.native
}
object ListRepositoriesResult {
  
  @scala.inline
  def apply(): ListRepositoriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesResult]
  }
  
  @scala.inline
  implicit class ListRepositoriesResultMutableBuilder[Self <: ListRepositoriesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRepositories(value: RepositorySummaryList): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    @scala.inline
    def setRepositoriesVarargs(value: RepositorySummary*): Self = StObject.set(x, "repositories", js.Array(value :_*))
  }
}
