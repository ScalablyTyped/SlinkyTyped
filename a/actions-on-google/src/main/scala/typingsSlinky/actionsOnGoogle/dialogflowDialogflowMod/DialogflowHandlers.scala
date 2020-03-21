package typingsSlinky.actionsOnGoogle.dialogflowDialogflowMod

import typingsSlinky.actionsOnGoogle.contextMod.Contexts
import typingsSlinky.actionsOnGoogle.conversationConversationMod.ExceptionHandler
import typingsSlinky.actionsOnGoogle.dialogflowConvMod.DialogflowConversation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowHandlers[TConvData, TUserStorage, TContexts /* <: Contexts */, TConversation /* <: DialogflowConversation[TConvData, TUserStorage, TContexts] */] extends js.Object {
  @JSName("catcher")
  var catcher_Original: ExceptionHandler[TUserStorage, TConversation] = js.native
  var fallback: js.UndefOr[js.Function | String] = js.native
  var intents: DialogflowIntentHandlers = js.native
  def catcher(conv: TConversation, error: js.Error): js.Promise[_] | js.Any = js.native
}

