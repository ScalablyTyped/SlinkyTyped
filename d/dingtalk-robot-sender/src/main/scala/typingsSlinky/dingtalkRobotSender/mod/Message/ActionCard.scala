package typingsSlinky.dingtalkRobotSender.mod.Message

import typingsSlinky.dingtalkRobotSender.anon.BtnOrientation
import typingsSlinky.dingtalkRobotSender.dingtalkRobotSenderStrings.actionCard
import typingsSlinky.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionCard extends MessageType {
  var actionCard: BtnOrientation = js.native
  var msgtype: actionCard = js.native
}

object ActionCard {
  @scala.inline
  def apply(actionCard: BtnOrientation, msgtype: actionCard): ActionCard = {
    val __obj = js.Dynamic.literal(actionCard = actionCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCard]
  }
  @scala.inline
  implicit class ActionCardOps[Self <: ActionCard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionCard(value: BtnOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsgtype(value: actionCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgtype")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

