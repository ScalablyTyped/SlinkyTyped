package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesCreateBackupInputMod.CreateBackupInput
import typingsSlinky.awsSdkClientDynamodbNode.typesCreateBackupOutputMod.CreateBackupOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/CreateBackupCommand", JSImport.Namespace)
@js.native
object createBackupCommandMod extends js.Object {
  @js.native
  class CreateBackupCommand protected () extends Command[
          InputTypesUnion, 
          CreateBackupInput, 
          OutputTypesUnion, 
          CreateBackupOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateBackupInput) = this()
    val middlewareStack: MiddlewareStack[CreateBackupInput, CreateBackupOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateBackupInput, CreateBackupOutput] = js.native
  }
  
}

