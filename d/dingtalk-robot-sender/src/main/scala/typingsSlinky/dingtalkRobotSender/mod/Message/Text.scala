package typingsSlinky.dingtalkRobotSender.mod.Message

import typingsSlinky.dingtalkRobotSender.anon.AtMobiles
import typingsSlinky.dingtalkRobotSender.anon.Content
import typingsSlinky.dingtalkRobotSender.dingtalkRobotSenderStrings.text
import typingsSlinky.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends MessageType {
  var at: js.UndefOr[AtMobiles] = js.undefined
  var msgtype: text
  var text: Content
}

object Text {
  @scala.inline
  def apply(msgtype: text, text: Content, at: AtMobiles = null): Text = {
    val __obj = js.Dynamic.literal(msgtype = msgtype.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

