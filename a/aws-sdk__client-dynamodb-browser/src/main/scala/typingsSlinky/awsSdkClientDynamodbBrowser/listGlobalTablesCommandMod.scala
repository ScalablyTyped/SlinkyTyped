package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesListGlobalTablesInputMod.ListGlobalTablesInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesListGlobalTablesOutputMod.ListGlobalTablesOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listGlobalTablesCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/ListGlobalTablesCommand", "ListGlobalTablesCommand")
  @js.native
  class ListGlobalTablesCommand protected () extends Command[
          InputTypesUnion, 
          ListGlobalTablesInput, 
          OutputTypesUnion, 
          ListGlobalTablesOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: ListGlobalTablesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListGlobalTablesInput, ListGlobalTablesOutput] = js.native
  }
}
