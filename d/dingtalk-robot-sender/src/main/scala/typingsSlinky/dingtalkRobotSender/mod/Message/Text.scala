package typingsSlinky.dingtalkRobotSender.mod.Message

import typingsSlinky.dingtalkRobotSender.AnonAtMobiles
import typingsSlinky.dingtalkRobotSender.AnonContent
import typingsSlinky.dingtalkRobotSender.dingtalkRobotSenderStrings.text
import typingsSlinky.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends MessageType {
  var at: js.UndefOr[AnonAtMobiles] = js.undefined
  var msgtype: text
  var text: AnonContent
}

object Text {
  @scala.inline
  def apply(msgtype: text, text: AnonContent, at: AnonAtMobiles = null): Text = {
    val __obj = js.Dynamic.literal(msgtype = msgtype.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

