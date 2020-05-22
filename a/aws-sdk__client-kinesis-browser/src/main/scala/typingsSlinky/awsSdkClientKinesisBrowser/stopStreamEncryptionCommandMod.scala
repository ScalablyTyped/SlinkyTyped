package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesStopStreamEncryptionInputMod.StopStreamEncryptionInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesStopStreamEncryptionOutputMod.StopStreamEncryptionOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/StopStreamEncryptionCommand", JSImport.Namespace)
@js.native
object stopStreamEncryptionCommandMod extends js.Object {
  @js.native
  class StopStreamEncryptionCommand protected () extends Command[
          InputTypesUnion, 
          StopStreamEncryptionInput, 
          OutputTypesUnion, 
          StopStreamEncryptionOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: StopStreamEncryptionInput) = this()
    /* CompleteClass */
    override val input: StopStreamEncryptionInput = js.native
    val middlewareStack: MiddlewareStack[StopStreamEncryptionInput, StopStreamEncryptionOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[StopStreamEncryptionInput, StopStreamEncryptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[StopStreamEncryptionInput, StopStreamEncryptionOutput] = js.native
  }
  
}

