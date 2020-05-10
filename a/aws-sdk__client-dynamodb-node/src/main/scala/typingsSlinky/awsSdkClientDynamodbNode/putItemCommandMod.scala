package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesPutItemInputMod.PutItemInput
import typingsSlinky.awsSdkClientDynamodbNode.typesPutItemOutputMod.PutItemOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/PutItemCommand", JSImport.Namespace)
@js.native
object putItemCommandMod extends js.Object {
  @js.native
  class PutItemCommand protected () extends Command[
          InputTypesUnion, 
          PutItemInput, 
          OutputTypesUnion, 
          PutItemOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutItemInput) = this()
    val middlewareStack: MiddlewareStack[PutItemInput, PutItemOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[PutItemInput, PutItemOutput] = js.native
  }
  
}

