package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesDescribeTableInputMod.DescribeTableInput
import typingsSlinky.awsSdkClientDynamodbNode.typesDescribeTableOutputMod.DescribeTableOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeTableCommand", JSImport.Namespace)
@js.native
object describeTableCommandMod extends js.Object {
  @js.native
  class DescribeTableCommand protected () extends Command[
          InputTypesUnion, 
          DescribeTableInput, 
          OutputTypesUnion, 
          DescribeTableOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: DescribeTableInput) = this()
    /* CompleteClass */
    override val input: DescribeTableInput = js.native
    val middlewareStack: MiddlewareStack[DescribeTableInput, DescribeTableOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeTableInput, DescribeTableOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeTableInput, DescribeTableOutput] = js.native
  }
  
}

