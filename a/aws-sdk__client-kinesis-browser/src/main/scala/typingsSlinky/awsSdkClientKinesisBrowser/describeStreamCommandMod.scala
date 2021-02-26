package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamInputMod.DescribeStreamInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamOutputMod.DescribeStreamOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeStreamCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/DescribeStreamCommand", "DescribeStreamCommand")
  @js.native
  class DescribeStreamCommand protected () extends Command[
          InputTypesUnion, 
          DescribeStreamInput, 
          OutputTypesUnion, 
          DescribeStreamOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: DescribeStreamInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[DescribeStreamInput, DescribeStreamOutput] = js.native
  }
}
