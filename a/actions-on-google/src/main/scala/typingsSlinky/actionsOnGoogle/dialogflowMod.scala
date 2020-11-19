package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.apiV2Mod.GoogleCloudDialogflowV2Context
import typingsSlinky.actionsOnGoogle.contextMod.Contexts
import typingsSlinky.actionsOnGoogle.dialogflowConvMod.DialogflowConversationOptions
import typingsSlinky.actionsOnGoogle.dialogflowDialogflowMod.Dialogflow_
import typingsSlinky.actionsOnGoogle.v1Mod.DialogflowV1Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/dialogflow", JSImport.Namespace)
@js.native
object dialogflowMod extends js.Object {
  
  val dialogflow: Dialogflow_ = js.native
  
  @js.native
  /** @hidden */
  class ContextValues[TContexts /* <: Contexts */] ()
    extends typingsSlinky.actionsOnGoogle.contextMod.ContextValues[TContexts] {
    def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context]) = this()
    def this(outputContexts: js.UndefOr[scala.Nothing], _session: String) = this()
    def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context], _session: String) = this()
  }
  
  @js.native
  /** @public */
  class DialogflowConversation[TConvData, TUserStorage, TContexts /* <: Contexts */] ()
    extends typingsSlinky.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[TConvData, TUserStorage, TContexts] {
    def this(options: DialogflowConversationOptions[TConvData, TUserStorage]) = this()
  }
}
