package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesListTagsOfResourceInputMod.ListTagsOfResourceInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesListTagsOfResourceOutputMod.ListTagsOfResourceOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-browser/commands/ListTagsOfResourceCommand", JSImport.Namespace)
@js.native
object listTagsOfResourceCommandMod extends js.Object {
  
  @js.native
  class ListTagsOfResourceCommand protected () extends Command[
          InputTypesUnion, 
          ListTagsOfResourceInput, 
          OutputTypesUnion, 
          ListTagsOfResourceOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListTagsOfResourceInput) = this()
    
    val middlewareStack: MiddlewareStack[ListTagsOfResourceInput, ListTagsOfResourceOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListTagsOfResourceInput, ListTagsOfResourceOutput] = js.native
  }
}
