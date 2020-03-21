package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesPutRecordInputMod.PutRecordInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesPutRecordOutputMod.PutRecordOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/PutRecordCommand", JSImport.Namespace)
@js.native
object putRecordCommandMod extends js.Object {
  @js.native
  class PutRecordCommand protected () extends Command[
          InputTypesUnion, 
          PutRecordInput, 
          OutputTypesUnion, 
          PutRecordOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutRecordInput) = this()
    /* CompleteClass */
    override val input: PutRecordInput = js.native
    val middlewareStack: MiddlewareStack[PutRecordInput, PutRecordOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[PutRecordInput, PutRecordOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[PutRecordInput, PutRecordOutput] = js.native
  }
  
}

