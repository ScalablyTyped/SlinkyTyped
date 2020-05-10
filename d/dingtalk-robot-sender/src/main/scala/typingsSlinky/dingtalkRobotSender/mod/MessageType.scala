package typingsSlinky.dingtalkRobotSender.mod

import typingsSlinky.dingtalkRobotSender.AnonBtnOrientation
import typingsSlinky.dingtalkRobotSender.AnonContent
import typingsSlinky.dingtalkRobotSender.AnonIsAtAll
import typingsSlinky.dingtalkRobotSender.AnonMessageURL_
import typingsSlinky.dingtalkRobotSender.AnonMessageUrl
import typingsSlinky.dingtalkRobotSender.dingtalkRobotSenderStrings.actionCard
import typingsSlinky.dingtalkRobotSender.dingtalkRobotSenderStrings.feedCard
import typingsSlinky.dingtalkRobotSender.dingtalkRobotSenderStrings.link
import typingsSlinky.dingtalkRobotSender.dingtalkRobotSenderStrings.markdown
import typingsSlinky.dingtalkRobotSender.dingtalkRobotSenderStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dingtalkRobotSender.mod.Message.Text
  - typingsSlinky.dingtalkRobotSender.mod.Message.Link
  - typingsSlinky.dingtalkRobotSender.mod.Message.Markdown
  - typingsSlinky.dingtalkRobotSender.mod.Message.ActionCard
  - typingsSlinky.dingtalkRobotSender.mod.Message.FeedCardItem
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  def Link(link: AnonMessageUrl, msgtype: link): MessageType = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def FeedCardItem(feedCard: AnonMessageURL_, msgtype: feedCard): MessageType = {
    val __obj = js.Dynamic.literal(feedCard = feedCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Text(msgtype: text, text: AnonContent): MessageType = {
    val __obj = js.Dynamic.literal(msgtype = msgtype.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Markdown(markdown: AnonIsAtAll, msgtype: markdown): MessageType = {
    val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def ActionCard(actionCard: AnonBtnOrientation, msgtype: actionCard): MessageType = {
    val __obj = js.Dynamic.literal(actionCard = actionCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
}

