package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateChannelResponse extends js.Object {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
}
object CreateChannelResponse {
  
  @scala.inline
  def apply(): CreateChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelResponse]
  }
  
  @scala.inline
  implicit class CreateChannelResponseOps[Self <: CreateChannelResponse] (val x: Self) extends AnyVal {
    
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
  }
}
