package typingsSlinky.actionsDashOnDashGoogle

import typingsSlinky.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod.DialogflowV1Context
import typingsSlinky.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod.GoogleCloudDialogflowV2Context
import typingsSlinky.actionsDashOnDashGoogle.distServiceDialogflowContextMod.Contexts
import typingsSlinky.actionsDashOnDashGoogle.distServiceDialogflowConvMod.DialogflowConversationOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceDialogflowDialogflowMod.Dialogflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/dialogflow", JSImport.Namespace)
@js.native
object distServiceDialogflowMod extends js.Object {
  @js.native
  /** @hidden */
  class ContextValues[TContexts /* <: Contexts */] ()
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceDialogflowContextMod.ContextValues[TContexts] {
    def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context]) = this()
    def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context], _session: String) = this()
  }
  
  @js.native
  /** @public */
  class DialogflowConversation[TConvData, TUserStorage, TContexts /* <: Contexts */] ()
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceDialogflowConvMod.DialogflowConversation[TConvData, TUserStorage, TContexts] {
    def this(options: DialogflowConversationOptions[TConvData, TUserStorage]) = this()
  }
  
  val dialogflow: Dialogflow = js.native
}

