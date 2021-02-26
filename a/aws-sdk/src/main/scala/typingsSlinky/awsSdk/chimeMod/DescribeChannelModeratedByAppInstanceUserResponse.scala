package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChannelModeratedByAppInstanceUserResponse extends StObject {
  
  /**
    * The moderated channel.
    */
  var Channel: js.UndefOr[ChannelModeratedByAppInstanceUserSummary] = js.native
}
object DescribeChannelModeratedByAppInstanceUserResponse {
  
  @scala.inline
  def apply(): DescribeChannelModeratedByAppInstanceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChannelModeratedByAppInstanceUserResponse]
  }
  
  @scala.inline
  implicit class DescribeChannelModeratedByAppInstanceUserResponseMutableBuilder[Self <: DescribeChannelModeratedByAppInstanceUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: ChannelModeratedByAppInstanceUserSummary): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "Channel", js.undefined)
  }
}
