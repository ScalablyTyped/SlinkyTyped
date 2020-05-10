package typingsSlinky.dingtalkRobotSender.mod.Message

import typingsSlinky.dingtalkRobotSender.AnonAtMobiles
import typingsSlinky.dingtalkRobotSender.AnonContent
import typingsSlinky.dingtalkRobotSender.dingtalkRobotSenderStrings.text
import typingsSlinky.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text extends MessageType {
  var at: js.UndefOr[AnonAtMobiles] = js.native
  var msgtype: text = js.native
  var text: AnonContent = js.native
}

object Text {
  @scala.inline
  def apply(msgtype: text, text: AnonContent): Text = {
    val __obj = js.Dynamic.literal(msgtype = msgtype.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  @scala.inline
  implicit class TextOps[Self <: Text] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMsgtype(value: text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: AnonContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAt(value: AnonAtMobiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(js.undefined)
        ret
    }
  }
  
}

