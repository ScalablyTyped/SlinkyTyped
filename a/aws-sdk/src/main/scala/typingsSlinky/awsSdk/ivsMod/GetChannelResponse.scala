package typingsSlinky.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetChannelResponse extends js.Object {
  
  var channel: js.UndefOr[Channel] = js.native
}
object GetChannelResponse {
  
  @scala.inline
  def apply(): GetChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChannelResponse]
  }
  
  @scala.inline
  implicit class GetChannelResponseOps[Self <: GetChannelResponse] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
  }
}
