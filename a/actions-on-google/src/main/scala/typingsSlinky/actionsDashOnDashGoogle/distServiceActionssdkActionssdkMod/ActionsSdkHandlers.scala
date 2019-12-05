package typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkActionssdkMod

import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConvMod.ActionsSdkConversation
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentArgumentMod.Argument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod.ExceptionHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsSdkHandlers[TConvData, TUserStorage, TConversation /* <: ActionsSdkConversation[TConvData, TUserStorage] */] extends js.Object {
  @JSName("catcher")
  var catcher_Original: ExceptionHandler[TUserStorage, TConversation] = js.native
  var fallback: js.UndefOr[
    (ActionsSdkIntentHandler[js.Object, js.Object, ActionsSdkConversation[js.Object, js.Object], Argument]) | String
  ] = js.native
  var intents: ActionSdkIntentHandlers = js.native
  def catcher(conv: TConversation, error: js.Error): js.Promise[_] | js.Any = js.native
}

