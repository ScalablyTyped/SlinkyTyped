package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteCampaignInputMod.DeleteCampaignInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteCampaignOutputMod.DeleteCampaignOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteCampaignCommand", JSImport.Namespace)
@js.native
object deleteCampaignCommandMod extends js.Object {
  @js.native
  class DeleteCampaignCommand protected () extends Command[
          InputTypesUnion, 
          DeleteCampaignInput, 
          OutputTypesUnion, 
          DeleteCampaignOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteCampaignInput) = this()
    /* CompleteClass */
    override val input: DeleteCampaignInput = js.native
    val middlewareStack: MiddlewareStack[DeleteCampaignInput, DeleteCampaignOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteCampaignInput, DeleteCampaignOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteCampaignInput, DeleteCampaignOutput] = js.native
  }
  
}

