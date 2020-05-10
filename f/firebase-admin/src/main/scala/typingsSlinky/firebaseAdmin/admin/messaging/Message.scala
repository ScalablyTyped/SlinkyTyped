package typingsSlinky.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseAdmin.TokenMessage
  - typingsSlinky.firebaseAdmin.TopicMessage
  - typingsSlinky.firebaseAdmin.ConditionMessage
*/
trait Message extends js.Object

object Message {
  @scala.inline
  def TokenMessage(token: String): Message = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  def TopicMessage(topic: String): Message = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  def ConditionMessage(condition: String): Message = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

