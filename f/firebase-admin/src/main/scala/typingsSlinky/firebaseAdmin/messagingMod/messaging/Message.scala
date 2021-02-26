package typingsSlinky.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseAdmin.messagingMod.messaging.TokenMessage
  - typingsSlinky.firebaseAdmin.messagingMod.messaging.TopicMessage
  - typingsSlinky.firebaseAdmin.messagingMod.messaging.ConditionMessage
*/
trait Message extends StObject
object Message {
  
  @scala.inline
  def ConditionMessage(condition: String): typingsSlinky.firebaseAdmin.messagingMod.messaging.ConditionMessage = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.firebaseAdmin.messagingMod.messaging.ConditionMessage]
  }
  
  @scala.inline
  def TokenMessage(token: String): typingsSlinky.firebaseAdmin.messagingMod.messaging.TokenMessage = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.firebaseAdmin.messagingMod.messaging.TokenMessage]
  }
  
  @scala.inline
  def TopicMessage(topic: String): typingsSlinky.firebaseAdmin.messagingMod.messaging.TopicMessage = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.firebaseAdmin.messagingMod.messaging.TopicMessage]
  }
}
