package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesListGlobalTablesInputMod.ListGlobalTablesInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesListGlobalTablesOutputMod.ListGlobalTablesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/ListGlobalTablesCommand", JSImport.Namespace)
@js.native
object listGlobalTablesCommandMod extends js.Object {
  @js.native
  class ListGlobalTablesCommand protected () extends Command[
          InputTypesUnion, 
          ListGlobalTablesInput, 
          OutputTypesUnion, 
          ListGlobalTablesOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListGlobalTablesInput) = this()
    /* CompleteClass */
    override val input: ListGlobalTablesInput = js.native
    val middlewareStack: MiddlewareStack[ListGlobalTablesInput, ListGlobalTablesOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListGlobalTablesInput, ListGlobalTablesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListGlobalTablesInput, ListGlobalTablesOutput] = js.native
  }
  
}

