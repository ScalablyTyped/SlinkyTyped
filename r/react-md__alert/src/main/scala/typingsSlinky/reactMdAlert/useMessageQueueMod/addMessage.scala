package typingsSlinky.reactMdAlert.useMessageQueueMod

import typingsSlinky.reactMdAlert.messageQueueContextMod.DuplicateBehavior
import typingsSlinky.reactMdAlert.messageQueueContextMod.Message
import typingsSlinky.reactMdAlert.messageQueueContextMod.ToastMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/alert/types/useMessageQueue", "addMessage")
@js.native
object addMessage extends js.Object {
  def apply[M /* <: Message */](message: M, duplicates: DuplicateBehavior): AddMessageAction[ToastMessage] = js.native
}

