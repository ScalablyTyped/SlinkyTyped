package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryInputMod.DescribeStreamSummaryInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryOutputMod.DescribeStreamSummaryOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DescribeStreamSummaryCommand", JSImport.Namespace)
@js.native
object describeStreamSummaryCommandMod extends js.Object {
  @js.native
  class DescribeStreamSummaryCommand protected () extends Command[
          InputTypesUnion, 
          DescribeStreamSummaryInput, 
          OutputTypesUnion, 
          DescribeStreamSummaryOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeStreamSummaryInput) = this()
    /* CompleteClass */
    override val input: DescribeStreamSummaryInput = js.native
    val middlewareStack: MiddlewareStack[DescribeStreamSummaryInput, DescribeStreamSummaryOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DescribeStreamSummaryInput, DescribeStreamSummaryOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DescribeStreamSummaryInput, DescribeStreamSummaryOutput] = js.native
  }
  
}

