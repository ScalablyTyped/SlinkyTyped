package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesPutItemInputMod.PutItemInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesPutItemOutputMod.PutItemOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-browser/commands/PutItemCommand", JSImport.Namespace)
@js.native
object putItemCommandMod extends js.Object {
  
  @js.native
  class PutItemCommand protected () extends Command[
          InputTypesUnion, 
          PutItemInput, 
          OutputTypesUnion, 
          PutItemOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutItemInput) = this()
    
    val middlewareStack: MiddlewareStack[PutItemInput, PutItemOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[PutItemInput, PutItemOutput] = js.native
  }
}
