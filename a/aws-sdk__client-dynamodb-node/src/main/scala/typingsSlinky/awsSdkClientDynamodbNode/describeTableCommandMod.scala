package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesDescribeTableInputMod.DescribeTableInput
import typingsSlinky.awsSdkClientDynamodbNode.typesDescribeTableOutputMod.DescribeTableOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeTableCommand", JSImport.Namespace)
@js.native
object describeTableCommandMod extends js.Object {
  
  @js.native
  class DescribeTableCommand protected () extends Command[
          InputTypesUnion, 
          DescribeTableInput, 
          OutputTypesUnion, 
          DescribeTableOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DescribeTableInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeTableInput, DescribeTableOutput] = js.native
  }
}
