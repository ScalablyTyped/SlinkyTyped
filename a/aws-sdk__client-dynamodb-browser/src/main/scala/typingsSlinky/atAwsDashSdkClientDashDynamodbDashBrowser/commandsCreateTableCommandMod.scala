package typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser

import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesCreateTableInputMod.CreateTableInput
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesCreateTableOutputMod.CreateTableOutput
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/CreateTableCommand", JSImport.Namespace)
@js.native
object commandsCreateTableCommandMod extends js.Object {
  @js.native
  class CreateTableCommand protected () extends Command[
          InputTypesUnion, 
          CreateTableInput, 
          OutputTypesUnion, 
          CreateTableOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateTableInput) = this()
    /* CompleteClass */
    override val input: CreateTableInput = js.native
    val middlewareStack: MiddlewareStack[CreateTableInput, CreateTableOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateTableInput, CreateTableOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateTableInput, CreateTableOutput] = js.native
  }
  
}

