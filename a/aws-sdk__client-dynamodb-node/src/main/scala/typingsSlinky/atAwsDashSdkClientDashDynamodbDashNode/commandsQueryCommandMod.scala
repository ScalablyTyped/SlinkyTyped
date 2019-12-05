package typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode

import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesQueryInputMod.QueryInput
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesQueryOutputMod.QueryOutput
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/QueryCommand", JSImport.Namespace)
@js.native
object commandsQueryCommandMod extends js.Object {
  @js.native
  class QueryCommand protected () extends Command[
          InputTypesUnion, 
          QueryInput, 
          OutputTypesUnion, 
          QueryOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: QueryInput) = this()
    /* CompleteClass */
    override val input: QueryInput = js.native
    val middlewareStack: MiddlewareStack[QueryInput, QueryOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[QueryInput, QueryOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[QueryInput, QueryOutput] = js.native
  }
  
}

