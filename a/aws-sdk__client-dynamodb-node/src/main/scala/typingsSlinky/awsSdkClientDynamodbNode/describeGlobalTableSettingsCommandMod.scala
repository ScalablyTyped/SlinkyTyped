package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput
import typingsSlinky.awsSdkClientDynamodbNode.typesDescribeGlobalTableSettingsOutputMod.DescribeGlobalTableSettingsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeGlobalTableSettingsCommand", JSImport.Namespace)
@js.native
object describeGlobalTableSettingsCommandMod extends js.Object {
  @js.native
  class DescribeGlobalTableSettingsCommand protected () extends Command[
          InputTypesUnion, 
          DescribeGlobalTableSettingsInput, 
          OutputTypesUnion, 
          DescribeGlobalTableSettingsOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: DescribeGlobalTableSettingsInput) = this()
    /* CompleteClass */
    override val input: DescribeGlobalTableSettingsInput = js.native
    val middlewareStack: MiddlewareStack[DescribeGlobalTableSettingsInput, DescribeGlobalTableSettingsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeGlobalTableSettingsInput, DescribeGlobalTableSettingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeGlobalTableSettingsInput, DescribeGlobalTableSettingsOutput] = js.native
  }
  
}

