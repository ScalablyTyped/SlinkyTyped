package typingsSlinky.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distServiceDialogflowDialogflowMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.actionsDashOnDashGoogle.distCommonMod.JsonObject
  import typingsSlinky.actionsDashOnDashGoogle.distFrameworkFrameworkMod.BuiltinFrameworkMetadata
  import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleRpcStatus
  import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentArgumentMod.Argument
  import typingsSlinky.actionsDashOnDashGoogle.distServiceDialogflowContextMod.Contexts
  import typingsSlinky.actionsDashOnDashGoogle.distServiceDialogflowContextMod.Parameters
  import typingsSlinky.actionsDashOnDashGoogle.distServiceDialogflowConvMod.DialogflowConversation

  type DialogflowIntentHandler[TConvData, TUserStorage, TContexts /* <: Contexts */, TConversation /* <: DialogflowConversation[TConvData, TUserStorage, TContexts] */, TParameters /* <: Parameters */, TArgument /* <: Argument */] = js.Function4[
    /* conv */ TConversation, 
    /* params */ TParameters, 
    /* argument */ TArgument, 
    /* status */ js.UndefOr[GoogleRpcStatus], 
    js.Promise[js.Any] | js.Any
  ]
  type DialogflowIntentHandlers = StringDictionary[js.UndefOr[js.Function | String]]
  type DialogflowMiddleware[TConversationPlugin /* <: DialogflowConversation[JsonObject, JsonObject, Contexts] */] = js.Function2[
    /* conv */ DialogflowConversation[JsonObject, JsonObject, Contexts], 
    /* framework */ BuiltinFrameworkMetadata, 
    ((DialogflowConversation[JsonObject, JsonObject, Contexts]) with TConversationPlugin) | Unit | (js.Promise[
      ((DialogflowConversation[JsonObject, JsonObject, Contexts]) with TConversationPlugin) | Unit
    ])
  ]
  type DialogflowVerificationHeaders = /**
    * A header key value pair to check against.
    * @public
    */
  StringDictionary[String]
}
