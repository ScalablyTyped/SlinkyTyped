package typingsSlinky.dingtalkRobotSender.mod.Message

import typingsSlinky.dingtalkRobotSender.anon.MessageUrl
import typingsSlinky.dingtalkRobotSender.dingtalkRobotSenderStrings.link
import typingsSlinky.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Link extends MessageType {
  
  var link: MessageUrl = js.native
  
  var msgtype: link = js.native
}
object Link {
  
  @scala.inline
  def apply(link: MessageUrl, msgtype: link): Link = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit class LinkOps[Self <: Link] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLink(value: MessageUrl): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgtype(value: link): Self = this.set("msgtype", value.asInstanceOf[js.Any])
  }
}
