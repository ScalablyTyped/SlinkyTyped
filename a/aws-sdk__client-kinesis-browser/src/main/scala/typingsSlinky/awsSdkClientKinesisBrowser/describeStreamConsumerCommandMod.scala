package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerInputMod.DescribeStreamConsumerInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerOutputMod.DescribeStreamConsumerOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeStreamConsumerCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/DescribeStreamConsumerCommand", "DescribeStreamConsumerCommand")
  @js.native
  class DescribeStreamConsumerCommand protected () extends Command[
          InputTypesUnion, 
          DescribeStreamConsumerInput, 
          OutputTypesUnion, 
          DescribeStreamConsumerOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: DescribeStreamConsumerInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[DescribeStreamConsumerInput, DescribeStreamConsumerOutput] = js.native
  }
}
