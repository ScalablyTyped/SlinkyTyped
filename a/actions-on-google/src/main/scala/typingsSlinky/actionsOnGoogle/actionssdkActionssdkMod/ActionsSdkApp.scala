package typingsSlinky.actionsOnGoogle.actionssdkActionssdkMod

import typingsSlinky.actionsOnGoogle.argumentArgumentMod.Argument
import typingsSlinky.actionsOnGoogle.convMod.ActionsSdkConversation
import typingsSlinky.actionsOnGoogle.conversationConversationMod.ConversationApp
import typingsSlinky.actionsOnGoogle.conversationConversationMod.ExceptionHandler
import typingsSlinky.actionsOnGoogle.conversationConversationMod.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsSdkApp[TConvData, TUserStorage, TConversation /* <: ActionsSdkConversation[TConvData, TUserStorage] */] extends ConversationApp[TConvData, TUserStorage] {
  
  /** @hidden */
  var _handlers: ActionsSdkHandlers[TConvData, TUserStorage, TConversation] = js.native
  
  /** @hidden */
  var _middlewares: js.Array[ActionsSdkMiddleware[ActionsSdkConversation[js.Object, js.Object]]] = js.native
  
  /** @public */
  def `catch`(catcher: ExceptionHandler[TUserStorage, TConversation]): this.type = js.native
  
  def fallback(handler: String): this.type = js.native
  /** @public */
  def fallback(handler: ActionsSdkIntentHandler[TConvData, TUserStorage, TConversation, Argument]): this.type = js.native
  
  def intent[TArgument /* <: Argument */](intent: String, handler: String): this.type = js.native
  /**
    * Sets the IntentHandler to be executed when the fulfillment is called
    * with a given Actions SDK intent.
    *
    * @param intent The Actions SDK intent to match.
    *     When given an array, sets the IntentHandler for any intent in the array.
    * @param handler The IntentHandler to be executed when the intent is matched.
    *     When given a string instead of a function, the intent fulfillment will be redirected
    *     to the IntentHandler of the redirected intent.
    * @public
    */
  def intent[TArgument /* <: Argument */](
    intent: String,
    handler: ActionsSdkIntentHandler[TConvData, TUserStorage, TConversation, TArgument]
  ): this.type = js.native
  def intent[TArgument /* <: Argument */](intent: js.Array[String], handler: String): this.type = js.native
  def intent[TArgument /* <: Argument */](
    intent: js.Array[Intent | String],
    handler: ActionsSdkIntentHandler[TConvData, TUserStorage, TConversation, TArgument]
  ): this.type = js.native
  def intent[TArgument /* <: Argument */](intent: js.Array[Intent], handler: Intent): this.type = js.native
  /**
    * Sets the IntentHandler to be executed when the fulfillment is called
    * with a given Actions SDK intent.
    *
    * @param intent The Actions SDK intent to match.
    *     When given an array, sets the IntentHandler for any intent in the array.
    * @param handler The IntentHandler to be executed when the intent is matched.
    *     When given a string instead of a function, the intent fulfillment will be redirected
    *     to the IntentHandler of the redirected intent.
    * @public
    */
  def intent[TArgument /* <: Argument */](
    intent: Intent,
    handler: ActionsSdkIntentHandler[TConvData, TUserStorage, TConversation, TArgument]
  ): this.type = js.native
  def intent[TArgument /* <: Argument */](intent: Intent, handler: Intent): this.type = js.native
  
  /** @public */
  def middleware[TConversationPlugin /* <: ActionsSdkConversation[js.Object, js.Object] */](middleware: ActionsSdkMiddleware[TConversationPlugin]): this.type = js.native
  
  /** @public */
  var verification: js.UndefOr[ActionsSdkVerification | String] = js.native
}
