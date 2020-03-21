package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesPutRecordsInputMod.PutRecordsInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesPutRecordsOutputMod.PutRecordsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/PutRecordsCommand", JSImport.Namespace)
@js.native
object putRecordsCommandMod extends js.Object {
  @js.native
  class PutRecordsCommand protected () extends Command[
          InputTypesUnion, 
          PutRecordsInput, 
          OutputTypesUnion, 
          PutRecordsOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutRecordsInput) = this()
    /* CompleteClass */
    override val input: PutRecordsInput = js.native
    val middlewareStack: MiddlewareStack[PutRecordsInput, PutRecordsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[PutRecordsInput, PutRecordsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[PutRecordsInput, PutRecordsOutput] = js.native
  }
  
}

