package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesDeleteTableInputMod.DeleteTableInput
import typingsSlinky.awsSdkClientDynamodbNode.typesDeleteTableOutputMod.DeleteTableOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DeleteTableCommand", JSImport.Namespace)
@js.native
object deleteTableCommandMod extends js.Object {
  @js.native
  class DeleteTableCommand protected () extends Command[
          InputTypesUnion, 
          DeleteTableInput, 
          OutputTypesUnion, 
          DeleteTableOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteTableInput) = this()
    /* CompleteClass */
    override val input: DeleteTableInput = js.native
    val middlewareStack: MiddlewareStack[DeleteTableInput, DeleteTableOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DeleteTableInput, DeleteTableOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DeleteTableInput, DeleteTableOutput] = js.native
  }
  
}

