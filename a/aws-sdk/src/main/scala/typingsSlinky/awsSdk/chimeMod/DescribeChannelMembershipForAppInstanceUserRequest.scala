package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChannelMembershipForAppInstanceUserRequest extends StObject {
  
  /**
    * The ARN of the user in a channel.
    */
  var AppInstanceUserArn: ChimeArn = js.native
  
  /**
    * The ARN of the channel to which the user belongs.
    */
  var ChannelArn: ChimeArn = js.native
}
object DescribeChannelMembershipForAppInstanceUserRequest {
  
  @scala.inline
  def apply(AppInstanceUserArn: ChimeArn, ChannelArn: ChimeArn): DescribeChannelMembershipForAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any], ChannelArn = ChannelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelMembershipForAppInstanceUserRequest]
  }
  
  @scala.inline
  implicit class DescribeChannelMembershipForAppInstanceUserRequestMutableBuilder[Self <: DescribeChannelMembershipForAppInstanceUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
  }
}
