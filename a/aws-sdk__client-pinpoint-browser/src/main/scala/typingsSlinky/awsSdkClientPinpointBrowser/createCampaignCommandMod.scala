package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesCreateCampaignInputMod.CreateCampaignInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesCreateCampaignOutputMod.CreateCampaignOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateCampaignCommand", JSImport.Namespace)
@js.native
object createCampaignCommandMod extends js.Object {
  @js.native
  class CreateCampaignCommand protected () extends Command[
          InputTypesUnion, 
          CreateCampaignInput, 
          OutputTypesUnion, 
          CreateCampaignOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateCampaignInput) = this()
    val middlewareStack: MiddlewareStack[CreateCampaignInput, CreateCampaignOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateCampaignInput, CreateCampaignOutput] = js.native
  }
  
}

