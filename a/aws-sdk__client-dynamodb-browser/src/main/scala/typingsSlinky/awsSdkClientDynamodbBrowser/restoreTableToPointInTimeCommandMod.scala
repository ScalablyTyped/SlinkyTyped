package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesRestoreTableToPointInTimeOutputMod.RestoreTableToPointInTimeOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/RestoreTableToPointInTimeCommand", JSImport.Namespace)
@js.native
object restoreTableToPointInTimeCommandMod extends js.Object {
  @js.native
  class RestoreTableToPointInTimeCommand protected () extends Command[
          InputTypesUnion, 
          RestoreTableToPointInTimeInput, 
          OutputTypesUnion, 
          RestoreTableToPointInTimeOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: RestoreTableToPointInTimeInput) = this()
    val middlewareStack: MiddlewareStack[RestoreTableToPointInTimeInput, RestoreTableToPointInTimeOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[RestoreTableToPointInTimeInput, RestoreTableToPointInTimeOutput] = js.native
  }
  
}

