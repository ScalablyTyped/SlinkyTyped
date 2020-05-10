package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesListTablesInputMod.ListTablesInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesListTablesOutputMod.ListTablesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/ListTablesCommand", JSImport.Namespace)
@js.native
object listTablesCommandMod extends js.Object {
  @js.native
  class ListTablesCommand protected () extends Command[
          InputTypesUnion, 
          ListTablesInput, 
          OutputTypesUnion, 
          ListTablesOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListTablesInput) = this()
    val middlewareStack: MiddlewareStack[ListTablesInput, ListTablesOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListTablesInput, ListTablesOutput] = js.native
  }
  
}

