package typingsSlinky.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelsResponse extends StObject {
  
  /**
    * A list of ChannelSummary objects.
    */
  var channelSummaries: js.UndefOr[ChannelSummaries] = js.native
  
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListChannelsResponse {
  
  @scala.inline
  def apply(): ListChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelsResponse]
  }
  
  @scala.inline
  implicit class ListChannelsResponseMutableBuilder[Self <: ListChannelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelSummaries(value: ChannelSummaries): Self = StObject.set(x, "channelSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelSummariesUndefined: Self = StObject.set(x, "channelSummaries", js.undefined)
    
    @scala.inline
    def setChannelSummariesVarargs(value: ChannelSummary*): Self = StObject.set(x, "channelSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
