package typingsSlinky.dingtalkRobotSender.mod

import typingsSlinky.dingtalkRobotSender.anon.BtnOrientation
import typingsSlinky.dingtalkRobotSender.anon.Content
import typingsSlinky.dingtalkRobotSender.anon.IsAtAll
import typingsSlinky.dingtalkRobotSender.anon.MessageURL_
import typingsSlinky.dingtalkRobotSender.anon.MessageUrl
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
  def Link(link: MessageUrl, msgtype: link): MessageType = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def FeedCardItem(feedCard: MessageURL_, msgtype: feedCard): MessageType = {
    val __obj = js.Dynamic.literal(feedCard = feedCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Text(msgtype: text, text: Content): MessageType = {
    val __obj = js.Dynamic.literal(msgtype = msgtype.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Markdown(markdown: IsAtAll, msgtype: markdown): MessageType = {
    val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def ActionCard(actionCard: BtnOrientation, msgtype: actionCard): MessageType = {
    val __obj = js.Dynamic.literal(actionCard = actionCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
}

