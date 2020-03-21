package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesCreateImportJobInputMod.CreateImportJobInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesCreateImportJobOutputMod.CreateImportJobOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateImportJobCommand", JSImport.Namespace)
@js.native
object createImportJobCommandMod extends js.Object {
  @js.native
  class CreateImportJobCommand protected () extends Command[
          InputTypesUnion, 
          CreateImportJobInput, 
          OutputTypesUnion, 
          CreateImportJobOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateImportJobInput) = this()
    /* CompleteClass */
    override val input: CreateImportJobInput = js.native
    val middlewareStack: MiddlewareStack[CreateImportJobInput, CreateImportJobOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateImportJobInput, CreateImportJobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateImportJobInput, CreateImportJobOutput] = js.native
  }
  
}

