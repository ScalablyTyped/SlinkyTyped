package typingsSlinky.awsSdk.codestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConnectionsInput extends StObject {
  
  /**
    * Filters the list of connections to those associated with a specified host.
    */
  var HostArnFilter: js.UndefOr[HostArn] = js.native
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.codestarconnectionsMod.MaxResults] = js.native
  
  /**
    * The token that was returned from the previous ListConnections call, which can be used to return the next set of connections in the list.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.codestarconnectionsMod.NextToken] = js.native
  
  /**
    * Filters the list of connections to those associated with a specified provider, such as Bitbucket.
    */
  var ProviderTypeFilter: js.UndefOr[ProviderType] = js.native
}
object ListConnectionsInput {
  
  @scala.inline
  def apply(): ListConnectionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectionsInput]
  }
  
  @scala.inline
  implicit class ListConnectionsInputMutableBuilder[Self <: ListConnectionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostArnFilter(value: HostArn): Self = StObject.set(x, "HostArnFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostArnFilterUndefined: Self = StObject.set(x, "HostArnFilter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProviderTypeFilter(value: ProviderType): Self = StObject.set(x, "ProviderTypeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderTypeFilterUndefined: Self = StObject.set(x, "ProviderTypeFilter", js.undefined)
  }
}
