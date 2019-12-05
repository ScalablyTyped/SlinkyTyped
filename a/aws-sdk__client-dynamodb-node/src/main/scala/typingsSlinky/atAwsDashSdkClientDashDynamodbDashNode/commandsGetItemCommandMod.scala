package typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode

import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesGetItemInputMod.GetItemInput
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesGetItemOutputMod.GetItemOutput
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/GetItemCommand", JSImport.Namespace)
@js.native
object commandsGetItemCommandMod extends js.Object {
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
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[GetItemInput, GetItemOutput] = js.native
  }
  
}

