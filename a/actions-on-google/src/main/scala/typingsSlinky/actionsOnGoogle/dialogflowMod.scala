package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.apiV2Mod.GoogleCloudDialogflowV2Context
import typingsSlinky.actionsOnGoogle.contextMod.Contexts
import typingsSlinky.actionsOnGoogle.dialogflowConvMod.DialogflowConversationOptions
import typingsSlinky.actionsOnGoogle.dialogflowDialogflowMod.Dialogflow_
import typingsSlinky.actionsOnGoogle.v1Mod.DialogflowV1Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogflowMod {
  
  @JSImport("actions-on-google/dist/service/dialogflow", "ContextValues")
  @js.native
  /** @hidden */
  class ContextValues[TContexts /* <: Contexts */] ()
    extends typingsSlinky.actionsOnGoogle.contextMod.ContextValues[TContexts] {
    def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context]) = this()
    def this(outputContexts: js.UndefOr[scala.Nothing], _session: String) = this()
    def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context], _session: String) = this()
  }
  
  @JSImport("actions-on-google/dist/service/dialogflow", "DialogflowConversation")
  @js.native
  /** @public */
  class DialogflowConversation[TConvData, TUserStorage, TContexts /* <: Contexts */] ()
    extends typingsSlinky.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[TConvData, TUserStorage, TContexts] {
    def this(options: DialogflowConversationOptions[TConvData, TUserStorage]) = this()
  }
  
  @JSImport("actions-on-google/dist/service/dialogflow", "dialogflow")
  @js.native
  val dialogflow: Dialogflow_ = js.native
}
