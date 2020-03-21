package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesListBackupsInputMod.ListBackupsInput
import typingsSlinky.awsSdkClientDynamodbNode.typesListBackupsOutputMod.ListBackupsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/ListBackupsCommand", JSImport.Namespace)
@js.native
object listBackupsCommandMod extends js.Object {
  @js.native
  class ListBackupsCommand protected () extends Command[
          InputTypesUnion, 
          ListBackupsInput, 
          OutputTypesUnion, 
          ListBackupsOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListBackupsInput) = this()
    /* CompleteClass */
    override val input: ListBackupsInput = js.native
    val middlewareStack: MiddlewareStack[ListBackupsInput, ListBackupsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListBackupsInput, ListBackupsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListBackupsInput, ListBackupsOutput] = js.native
  }
  
}

