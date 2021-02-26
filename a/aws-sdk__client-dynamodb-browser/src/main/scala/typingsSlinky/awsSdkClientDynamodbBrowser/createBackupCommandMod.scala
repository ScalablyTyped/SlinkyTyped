package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateBackupInputMod.CreateBackupInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateBackupOutputMod.CreateBackupOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createBackupCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/CreateBackupCommand", "CreateBackupCommand")
  @js.native
  class CreateBackupCommand protected () extends Command[
          InputTypesUnion, 
          CreateBackupInput, 
          OutputTypesUnion, 
          CreateBackupOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: CreateBackupInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateBackupInput, CreateBackupOutput] = js.native
  }
}
