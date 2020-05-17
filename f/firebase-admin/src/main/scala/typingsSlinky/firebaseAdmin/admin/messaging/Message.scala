package typingsSlinky.firebaseAdmin.admin.messaging

import typingsSlinky.firebaseAdmin.ConditionMessage
import typingsSlinky.firebaseAdmin.TokenMessage
import typingsSlinky.firebaseAdmin.TopicMessage
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
  implicit def apply(value: ConditionMessage): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: TokenMessage): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: TopicMessage): Message = value.asInstanceOf[Message]
}

