package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateBackupInputMod.CreateBackupInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateBackupOutputMod.CreateBackupOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/CreateBackupCommand", JSImport.Namespace)
@js.native
object createBackupCommandMod extends js.Object {
  @js.native
  class CreateBackupCommand protected () extends Command[
          InputTypesUnion, 
          CreateBackupInput, 
          OutputTypesUnion, 
          CreateBackupOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateBackupInput) = this()
    val middlewareStack: MiddlewareStack[CreateBackupInput, CreateBackupOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateBackupInput, CreateBackupOutput] = js.native
  }
  
}

