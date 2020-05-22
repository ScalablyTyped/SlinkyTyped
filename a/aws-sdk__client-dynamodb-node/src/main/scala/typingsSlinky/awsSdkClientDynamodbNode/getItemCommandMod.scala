package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesGetItemInputMod.GetItemInput
import typingsSlinky.awsSdkClientDynamodbNode.typesGetItemOutputMod.GetItemOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/GetItemCommand", JSImport.Namespace)
@js.native
object getItemCommandMod extends js.Object {
  @js.native
  class GetItemCommand protected () extends Command[
          InputTypesUnion, 
          GetItemInput, 
          OutputTypesUnion, 
          GetItemOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetItemInput) = this()
    /* CompleteClass */
    override val input: GetItemInput = js.native
    val middlewareStack: MiddlewareStack[GetItemInput, GetItemOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[GetItemInput, GetItemOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[GetItemInput, GetItemOutput] = js.native
  }
  
}

