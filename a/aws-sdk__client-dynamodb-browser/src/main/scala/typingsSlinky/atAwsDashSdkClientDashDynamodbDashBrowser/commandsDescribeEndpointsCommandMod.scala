package typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser

import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeEndpointsInputMod.DescribeEndpointsInput
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeEndpointsOutputMod.DescribeEndpointsOutput
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeEndpointsCommand", JSImport.Namespace)
@js.native
object commandsDescribeEndpointsCommandMod extends js.Object {
  @js.native
  class DescribeEndpointsCommand protected () extends Command[
          InputTypesUnion, 
          DescribeEndpointsInput, 
          OutputTypesUnion, 
          DescribeEndpointsOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeEndpointsInput) = this()
    /* CompleteClass */
    override val input: DescribeEndpointsInput = js.native
    val middlewareStack: MiddlewareStack[DescribeEndpointsInput, DescribeEndpointsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeEndpointsInput, DescribeEndpointsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeEndpointsInput, DescribeEndpointsOutput] = js.native
  }
  
}

