package typingsSlinky.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.Message

import typingsSlinky.dingtalkDashRobotDashSender.Anon_0
import typingsSlinky.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.MessageType
import typingsSlinky.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.actionCard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCard extends MessageType {
  var actionCard: Anon_0
  var msgtype: actionCard
}

object ActionCard {
  @scala.inline
  def apply(actionCard: Anon_0, msgtype: actionCard): ActionCard = {
    val __obj = js.Dynamic.literal(actionCard = actionCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionCard]
  }
}

