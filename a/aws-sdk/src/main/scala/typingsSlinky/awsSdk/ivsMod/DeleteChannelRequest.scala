package typingsSlinky.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteChannelRequest extends js.Object {
  
  /**
    * ARN of the channel to be deleted.
    */
  var arn: ChannelArn = js.native
}
object DeleteChannelRequest {
  
  @scala.inline
  def apply(arn: ChannelArn): DeleteChannelRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelRequest]
  }
  
  @scala.inline
  implicit class DeleteChannelRequestOps[Self <: DeleteChannelRequest] (val x: Self) extends AnyVal {
    
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
    def setArn(value: ChannelArn): Self = this.set("arn", value.asInstanceOf[js.Any])
  }
}
