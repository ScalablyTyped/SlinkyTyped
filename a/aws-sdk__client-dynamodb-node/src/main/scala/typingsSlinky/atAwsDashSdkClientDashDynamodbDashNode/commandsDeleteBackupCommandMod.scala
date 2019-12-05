package typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode

import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesDeleteBackupInputMod.DeleteBackupInput
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesDeleteBackupOutputMod.DeleteBackupOutput
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DeleteBackupCommand", JSImport.Namespace)
@js.native
object commandsDeleteBackupCommandMod extends js.Object {
  @js.native
  class DeleteBackupCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBackupInput, 
          OutputTypesUnion, 
          DeleteBackupOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteBackupInput) = this()
    /* CompleteClass */
    override val input: DeleteBackupInput = js.native
    val middlewareStack: MiddlewareStack[DeleteBackupInput, DeleteBackupOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DeleteBackupInput, DeleteBackupOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DeleteBackupInput, DeleteBackupOutput] = js.native
  }
  
}

