package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateItemInputMod.UpdateItemInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateItemOutputMod.UpdateItemOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-browser/commands/UpdateItemCommand", JSImport.Namespace)
@js.native
object updateItemCommandMod extends js.Object {
  
  @js.native
  class UpdateItemCommand protected () extends Command[
          InputTypesUnion, 
          UpdateItemInput, 
          OutputTypesUnion, 
          UpdateItemOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateItemInput) = this()
    
    val middlewareStack: MiddlewareStack[UpdateItemInput, UpdateItemOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateItemInput, UpdateItemOutput] = js.native
  }
}
