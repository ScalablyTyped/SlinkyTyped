package typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode

import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateGlobalTableOutputMod.UpdateGlobalTableOutput
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateGlobalTableCommand", JSImport.Namespace)
@js.native
object commandsUpdateGlobalTableCommandMod extends js.Object {
  @js.native
  class UpdateGlobalTableCommand protected () extends Command[
          InputTypesUnion, 
          UpdateGlobalTableInput, 
          OutputTypesUnion, 
          UpdateGlobalTableOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateGlobalTableInput) = this()
    /* CompleteClass */
    override val input: UpdateGlobalTableInput = js.native
    val middlewareStack: MiddlewareStack[UpdateGlobalTableInput, UpdateGlobalTableOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateGlobalTableInput, UpdateGlobalTableOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateGlobalTableInput, UpdateGlobalTableOutput] = js.native
  }
  
}

