package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelsModeratedByAppInstanceUserResponse extends StObject {
  
  /**
    * The moderated channels in the request.
    */
  var Channels: js.UndefOr[ChannelModeratedByAppInstanceUserSummaryList] = js.native
  
  /**
    * The token returned from previous API requests until the number of channels moderated by the user is reached.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.chimeMod.NextToken] = js.native
}
object ListChannelsModeratedByAppInstanceUserResponse {
  
  @scala.inline
  def apply(): ListChannelsModeratedByAppInstanceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelsModeratedByAppInstanceUserResponse]
  }
  
  @scala.inline
  implicit class ListChannelsModeratedByAppInstanceUserResponseMutableBuilder[Self <: ListChannelsModeratedByAppInstanceUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: ChannelModeratedByAppInstanceUserSummaryList): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: ChannelModeratedByAppInstanceUserSummary*): Self = StObject.set(x, "Channels", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
