package typingsSlinky.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.Message

import typingsSlinky.dingtalkDashRobotDashSender.Anon_AtMobiles
import typingsSlinky.dingtalkDashRobotDashSender.Anon_Content
import typingsSlinky.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.MessageType
import typingsSlinky.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends MessageType {
  var at: js.UndefOr[Anon_AtMobiles] = js.undefined
  var msgtype: text
  var text: Anon_Content
}

object Text {
  @scala.inline
  def apply(msgtype: text, text: Anon_Content, at: Anon_AtMobiles = null): Text = {
    val __obj = js.Dynamic.literal(msgtype = msgtype.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

