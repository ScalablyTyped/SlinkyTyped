package typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode

import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesBatchWriteItemInputMod.BatchWriteItemInput
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesBatchWriteItemOutputMod.BatchWriteItemOutput
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/BatchWriteItemCommand", JSImport.Namespace)
@js.native
object commandsBatchWriteItemCommandMod extends js.Object {
  @js.native
  class BatchWriteItemCommand protected () extends Command[
          InputTypesUnion, 
          BatchWriteItemInput, 
          OutputTypesUnion, 
          BatchWriteItemOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: BatchWriteItemInput) = this()
    /* CompleteClass */
    override val input: BatchWriteItemInput = js.native
    val middlewareStack: MiddlewareStack[BatchWriteItemInput, BatchWriteItemOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[BatchWriteItemInput, BatchWriteItemOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[BatchWriteItemInput, BatchWriteItemOutput] = js.native
  }
  
}

