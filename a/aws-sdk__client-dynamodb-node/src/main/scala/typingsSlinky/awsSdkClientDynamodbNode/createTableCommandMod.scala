package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesCreateTableInputMod.CreateTableInput
import typingsSlinky.awsSdkClientDynamodbNode.typesCreateTableOutputMod.CreateTableOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/CreateTableCommand", JSImport.Namespace)
@js.native
object createTableCommandMod extends js.Object {
  @js.native
  class CreateTableCommand protected () extends Command[
          InputTypesUnion, 
          CreateTableInput, 
          OutputTypesUnion, 
          CreateTableOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateTableInput) = this()
    /* CompleteClass */
    override val input: CreateTableInput = js.native
    val middlewareStack: MiddlewareStack[CreateTableInput, CreateTableOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateTableInput, CreateTableOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateTableInput, CreateTableOutput] = js.native
  }
  
}

