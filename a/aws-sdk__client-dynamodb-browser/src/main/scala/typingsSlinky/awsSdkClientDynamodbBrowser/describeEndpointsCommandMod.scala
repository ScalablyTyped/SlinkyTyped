package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeEndpointsInputMod.DescribeEndpointsInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeEndpointsOutputMod.DescribeEndpointsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeEndpointsCommand", JSImport.Namespace)
@js.native
object describeEndpointsCommandMod extends js.Object {
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
    val middlewareStack: MiddlewareStack[DescribeEndpointsInput, DescribeEndpointsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeEndpointsInput, DescribeEndpointsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeEndpointsInput, DescribeEndpointsOutput] = js.native
  }
  
}

