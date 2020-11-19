package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateTableInputMod.CreateTableInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateTableOutputMod.CreateTableOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-browser/commands/CreateTableCommand", JSImport.Namespace)
@js.native
object createTableCommandMod extends js.Object {
  
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
    
    val middlewareStack: MiddlewareStack[CreateTableInput, CreateTableOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateTableInput, CreateTableOutput] = js.native
  }
}
