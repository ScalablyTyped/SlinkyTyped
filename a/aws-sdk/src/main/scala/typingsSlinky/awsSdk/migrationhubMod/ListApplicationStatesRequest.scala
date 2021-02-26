package typingsSlinky.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListApplicationStatesRequest extends StObject {
  
  /**
    * The configurationIds from the Application Discovery Service that uniquely identifies your applications.
    */
  var ApplicationIds: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.ApplicationIds] = js.native
  
  /**
    * Maximum number of results to be returned per page.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.MaxResults] = js.native
  
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListApplicationStatesRequest {
  
  @scala.inline
  def apply(): ListApplicationStatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationStatesRequest]
  }
  
  @scala.inline
  implicit class ListApplicationStatesRequestMutableBuilder[Self <: ListApplicationStatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationIds(value: ApplicationIds): Self = StObject.set(x, "ApplicationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdsUndefined: Self = StObject.set(x, "ApplicationIds", js.undefined)
    
    @scala.inline
    def setApplicationIdsVarargs(value: ApplicationId*): Self = StObject.set(x, "ApplicationIds", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
