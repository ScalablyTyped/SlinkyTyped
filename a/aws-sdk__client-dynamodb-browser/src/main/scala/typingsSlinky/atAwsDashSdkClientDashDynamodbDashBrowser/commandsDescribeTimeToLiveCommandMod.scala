package typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser

import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeTimeToLiveOutputMod.DescribeTimeToLiveOutput
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeTimeToLiveCommand", JSImport.Namespace)
@js.native
object commandsDescribeTimeToLiveCommandMod extends js.Object {
  @js.native
  class DescribeTimeToLiveCommand protected () extends Command[
          InputTypesUnion, 
          DescribeTimeToLiveInput, 
          OutputTypesUnion, 
          DescribeTimeToLiveOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeTimeToLiveInput) = this()
    /* CompleteClass */
    override val input: DescribeTimeToLiveInput = js.native
    val middlewareStack: MiddlewareStack[DescribeTimeToLiveInput, DescribeTimeToLiveOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeTimeToLiveInput, DescribeTimeToLiveOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeTimeToLiveInput, DescribeTimeToLiveOutput] = js.native
  }
  
}

