package typingsSlinky.reactMdAlert.useMessageQueueMod

import typingsSlinky.reactMdAlert.messageQueueContextMod.DuplicateBehavior
import typingsSlinky.reactMdAlert.messageQueueContextMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactMdAlert.useMessageQueueMod.AddMessageAction[M]
  - typingsSlinky.reactMdAlert.useMessageQueueMod.PopMessageAction
  - typingsSlinky.reactMdAlert.useMessageQueueMod.ResetQueueAction
*/
trait MessageActions[M /* <: Message */] extends js.Object

object MessageActions {
  @scala.inline
  def AddMessageAction[/* <: typingsSlinky.reactMdAlert.messageQueueContextMod.Message */ M](duplicates: DuplicateBehavior, message: M, `type`: /* "ADD_MESSAGE" */ String): MessageActions[M] = {
    val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageActions[M]]
  }
  @scala.inline
  def PopMessageAction[/* <: typingsSlinky.reactMdAlert.messageQueueContextMod.Message */ M](`type`: /* "POP_MESSAGE" */ String): MessageActions[M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageActions[M]]
  }
  @scala.inline
  def ResetQueueAction[/* <: typingsSlinky.reactMdAlert.messageQueueContextMod.Message */ M](`type`: /* "RESET_QUEUE" */ String): MessageActions[M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageActions[M]]
  }
}

