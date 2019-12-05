package typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode

import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeEndpointsInputMod.DescribeEndpointsInput
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeEndpointsOutputMod.DescribeEndpointsOutput
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeEndpointsCommand", JSImport.Namespace)
@js.native
object commandsDescribeEndpointsCommandMod extends js.Object {
  @js.native
  class DescribeEndpointsCommand protected () extends Command[
          InputTypesUnion, 
          DescribeEndpointsInput, 
          OutputTypesUnion, 
          DescribeEndpointsOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: DescribeEndpointsInput) = this()
    /* CompleteClass */
    override val input: DescribeEndpointsInput = js.native
    val middlewareStack: MiddlewareStack[DescribeEndpointsInput, DescribeEndpointsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeEndpointsInput, DescribeEndpointsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeEndpointsInput, DescribeEndpointsOutput] = js.native
  }
  
}

