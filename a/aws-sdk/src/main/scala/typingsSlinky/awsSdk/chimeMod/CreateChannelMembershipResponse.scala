package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateChannelMembershipResponse extends js.Object {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The ARN and metadata of the member being added.
    */
  var Member: js.UndefOr[Identity] = js.native
}
object CreateChannelMembershipResponse {
  
  @scala.inline
  def apply(): CreateChannelMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelMembershipResponse]
  }
  
  @scala.inline
  implicit class CreateChannelMembershipResponseOps[Self <: CreateChannelMembershipResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = this.set("ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelArn: Self = this.set("ChannelArn", js.undefined)
    
    @scala.inline
    def setMember(value: Identity): Self = this.set("Member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMember: Self = this.set("Member", js.undefined)
  }
}
