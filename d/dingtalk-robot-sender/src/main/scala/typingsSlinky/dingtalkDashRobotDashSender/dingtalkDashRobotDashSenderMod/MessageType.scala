package typingsSlinky.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod

import typingsSlinky.dingtalkDashRobotDashSender.Anon_0
import typingsSlinky.dingtalkDashRobotDashSender.Anon_AtMobiles
import typingsSlinky.dingtalkDashRobotDashSender.Anon_AtMobilesIsAtAll
import typingsSlinky.dingtalkDashRobotDashSender.Anon_Content
import typingsSlinky.dingtalkDashRobotDashSender.Anon_MessageURL
import typingsSlinky.dingtalkDashRobotDashSender.Anon_MessageUrl
import typingsSlinky.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.actionCard
import typingsSlinky.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.feedCard
import typingsSlinky.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.link
import typingsSlinky.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.markdown
import typingsSlinky.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.Message.Text
  - typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.Message.Link
  - typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.Message.Markdown
  - typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.Message.ActionCard
  - typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.Message.FeedCardItem
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  def FeedCardItem(feedCard: Anon_MessageURL, msgtype: feedCard): MessageType = {
    val __obj = js.Dynamic.literal(feedCard = feedCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def ActionCard(actionCard: Anon_0, msgtype: actionCard): MessageType = {
    val __obj = js.Dynamic.literal(actionCard = actionCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Text(msgtype: text, text: Anon_Content, at: Anon_AtMobiles = null): MessageType = {
    val __obj = js.Dynamic.literal(msgtype = msgtype.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Markdown(markdown: Anon_AtMobilesIsAtAll, msgtype: markdown): MessageType = {
    val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Link(link: Anon_MessageUrl, msgtype: link): MessageType = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageType]
  }
}

