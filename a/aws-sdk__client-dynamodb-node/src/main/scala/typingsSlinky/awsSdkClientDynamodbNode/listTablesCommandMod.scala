package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesListTablesInputMod.ListTablesInput
import typingsSlinky.awsSdkClientDynamodbNode.typesListTablesOutputMod.ListTablesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/ListTablesCommand", JSImport.Namespace)
@js.native
object listTablesCommandMod extends js.Object {
  @js.native
  class ListTablesCommand protected () extends Command[
          InputTypesUnion, 
          ListTablesInput, 
          OutputTypesUnion, 
          ListTablesOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListTablesInput) = this()
    /* CompleteClass */
    override val input: ListTablesInput = js.native
    val middlewareStack: MiddlewareStack[ListTablesInput, ListTablesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListTablesInput, ListTablesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListTablesInput, ListTablesOutput] = js.native
  }
  
}

