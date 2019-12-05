package typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode

import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesRestoreTableFromBackupOutputMod.RestoreTableFromBackupOutput
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/RestoreTableFromBackupCommand", JSImport.Namespace)
@js.native
object commandsRestoreTableFromBackupCommandMod extends js.Object {
  @js.native
  class RestoreTableFromBackupCommand protected () extends Command[
          InputTypesUnion, 
          RestoreTableFromBackupInput, 
          OutputTypesUnion, 
          RestoreTableFromBackupOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: RestoreTableFromBackupInput) = this()
    /* CompleteClass */
    override val input: RestoreTableFromBackupInput = js.native
    val middlewareStack: MiddlewareStack[RestoreTableFromBackupInput, RestoreTableFromBackupOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[RestoreTableFromBackupInput, RestoreTableFromBackupOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[RestoreTableFromBackupInput, RestoreTableFromBackupOutput] = js.native
  }
  
}

