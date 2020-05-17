package typingsSlinky.dingtalkRobotSender.mod

import typingsSlinky.dingtalkRobotSender.mod.Message.ActionCard
import typingsSlinky.dingtalkRobotSender.mod.Message.FeedCardItem
import typingsSlinky.dingtalkRobotSender.mod.Message.Link
import typingsSlinky.dingtalkRobotSender.mod.Message.Markdown
import typingsSlinky.dingtalkRobotSender.mod.Message.Text
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
  implicit def apply(value: ActionCard): MessageType = value.asInstanceOf[MessageType]
  @scala.inline
  implicit def apply(value: FeedCardItem): MessageType = value.asInstanceOf[MessageType]
  @scala.inline
  implicit def apply(value: Link): MessageType = value.asInstanceOf[MessageType]
  @scala.inline
  implicit def apply(value: Markdown): MessageType = value.asInstanceOf[MessageType]
  @scala.inline
  implicit def apply(value: Text): MessageType = value.asInstanceOf[MessageType]
}

