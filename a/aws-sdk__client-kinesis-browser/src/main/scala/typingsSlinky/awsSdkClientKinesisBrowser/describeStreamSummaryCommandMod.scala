package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryInputMod.DescribeStreamSummaryInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryOutputMod.DescribeStreamSummaryOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeStreamSummaryCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/DescribeStreamSummaryCommand", "DescribeStreamSummaryCommand")
  @js.native
  class DescribeStreamSummaryCommand protected () extends Command[
          InputTypesUnion, 
          DescribeStreamSummaryInput, 
          OutputTypesUnion, 
          DescribeStreamSummaryOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: DescribeStreamSummaryInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[DescribeStreamSummaryInput, DescribeStreamSummaryOutput] = js.native
  }
}
