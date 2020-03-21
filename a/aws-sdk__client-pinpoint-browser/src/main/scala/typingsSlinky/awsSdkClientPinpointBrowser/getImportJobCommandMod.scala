package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobInputMod.GetImportJobInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobOutputMod.GetImportJobOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetImportJobCommand", JSImport.Namespace)
@js.native
object getImportJobCommandMod extends js.Object {
  @js.native
  class GetImportJobCommand protected () extends Command[
          InputTypesUnion, 
          GetImportJobInput, 
          OutputTypesUnion, 
          GetImportJobOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetImportJobInput) = this()
    /* CompleteClass */
    override val input: GetImportJobInput = js.native
    val middlewareStack: MiddlewareStack[GetImportJobInput, GetImportJobOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetImportJobInput, GetImportJobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetImportJobInput, GetImportJobOutput] = js.native
  }
  
}

