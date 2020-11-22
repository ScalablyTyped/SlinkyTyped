package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesRestoreTableFromBackupOutputMod.RestoreTableFromBackupOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-browser/commands/RestoreTableFromBackupCommand", JSImport.Namespace)
@js.native
object restoreTableFromBackupCommandMod extends js.Object {
  
  @js.native
  class RestoreTableFromBackupCommand protected () extends Command[
          InputTypesUnion, 
          RestoreTableFromBackupInput, 
          OutputTypesUnion, 
          RestoreTableFromBackupOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: RestoreTableFromBackupInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[RestoreTableFromBackupInput, RestoreTableFromBackupOutput] = js.native
  }
}
