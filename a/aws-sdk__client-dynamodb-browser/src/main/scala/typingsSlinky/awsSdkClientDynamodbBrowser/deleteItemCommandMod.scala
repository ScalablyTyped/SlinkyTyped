package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteItemInputMod.DeleteItemInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteItemOutputMod.DeleteItemOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DeleteItemCommand", JSImport.Namespace)
@js.native
object deleteItemCommandMod extends js.Object {
  
  @js.native
  class DeleteItemCommand protected () extends Command[
          InputTypesUnion, 
          DeleteItemInput, 
          OutputTypesUnion, 
          DeleteItemOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteItemInput) = this()
    
    val middlewareStack: MiddlewareStack[DeleteItemInput, DeleteItemOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DeleteItemInput, DeleteItemOutput] = js.native
  }
}
