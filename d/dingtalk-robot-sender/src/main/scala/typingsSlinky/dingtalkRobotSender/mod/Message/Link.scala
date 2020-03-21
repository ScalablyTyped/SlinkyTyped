package typingsSlinky.dingtalkRobotSender.mod.Message

import typingsSlinky.dingtalkRobotSender.AnonMessageUrl
import typingsSlinky.dingtalkRobotSender.dingtalkRobotSenderStrings.link
import typingsSlinky.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends MessageType {
  var link: AnonMessageUrl
  var msgtype: link
}

object Link {
  @scala.inline
  def apply(link: AnonMessageUrl, msgtype: link): Link = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Link]
  }
}

