package typingsSlinky.dingtalkRobotSender.mod.Message

import typingsSlinky.dingtalkRobotSender.anon.IsAtAll
import typingsSlinky.dingtalkRobotSender.dingtalkRobotSenderStrings.markdown
import typingsSlinky.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Markdown extends MessageType {
  
  var markdown: IsAtAll = js.native
  
  var msgtype: markdown = js.native
}
object Markdown {
  
  @scala.inline
  def apply(markdown: IsAtAll, msgtype: markdown): Markdown = {
    val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Markdown]
  }
  
  @scala.inline
  implicit class MarkdownOps[Self <: Markdown] (val x: Self) extends AnyVal {
    
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
    def setMarkdown(value: IsAtAll): Self = this.set("markdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgtype(value: markdown): Self = this.set("msgtype", value.asInstanceOf[js.Any])
  }
}
