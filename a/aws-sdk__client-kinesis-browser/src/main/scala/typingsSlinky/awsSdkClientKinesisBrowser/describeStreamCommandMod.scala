package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamInputMod.DescribeStreamInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamOutputMod.DescribeStreamOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DescribeStreamCommand", JSImport.Namespace)
@js.native
object describeStreamCommandMod extends js.Object {
  @js.native
  class DescribeStreamCommand protected () extends Command[
          InputTypesUnion, 
          DescribeStreamInput, 
          OutputTypesUnion, 
          DescribeStreamOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeStreamInput) = this()
    /* CompleteClass */
    override val input: DescribeStreamInput = js.native
    val middlewareStack: MiddlewareStack[DescribeStreamInput, DescribeStreamOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DescribeStreamInput, DescribeStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DescribeStreamInput, DescribeStreamOutput] = js.native
  }
  
}

