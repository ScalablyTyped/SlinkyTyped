package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteBackupInputMod.DeleteBackupInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteBackupOutputMod.DeleteBackupOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DeleteBackupCommand", JSImport.Namespace)
@js.native
object deleteBackupCommandMod extends js.Object {
  
  @js.native
  class DeleteBackupCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBackupInput, 
          OutputTypesUnion, 
          DeleteBackupOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteBackupInput) = this()
    
    val middlewareStack: MiddlewareStack[DeleteBackupInput, DeleteBackupOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DeleteBackupInput, DeleteBackupOutput] = js.native
  }
}
