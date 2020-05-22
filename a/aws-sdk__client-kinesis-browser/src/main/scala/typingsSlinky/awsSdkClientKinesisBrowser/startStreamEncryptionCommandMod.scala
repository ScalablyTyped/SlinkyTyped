package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesStartStreamEncryptionInputMod.StartStreamEncryptionInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesStartStreamEncryptionOutputMod.StartStreamEncryptionOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/StartStreamEncryptionCommand", JSImport.Namespace)
@js.native
object startStreamEncryptionCommandMod extends js.Object {
  @js.native
  class StartStreamEncryptionCommand protected () extends Command[
          InputTypesUnion, 
          StartStreamEncryptionInput, 
          OutputTypesUnion, 
          StartStreamEncryptionOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: StartStreamEncryptionInput) = this()
    /* CompleteClass */
    override val input: StartStreamEncryptionInput = js.native
    val middlewareStack: MiddlewareStack[StartStreamEncryptionInput, StartStreamEncryptionOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[StartStreamEncryptionInput, StartStreamEncryptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[StartStreamEncryptionInput, StartStreamEncryptionOutput] = js.native
  }
  
}

