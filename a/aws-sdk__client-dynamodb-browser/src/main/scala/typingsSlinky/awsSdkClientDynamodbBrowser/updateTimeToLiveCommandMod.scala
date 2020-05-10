package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveOutputMod.UpdateTimeToLiveOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/UpdateTimeToLiveCommand", JSImport.Namespace)
@js.native
object updateTimeToLiveCommandMod extends js.Object {
  @js.native
  class UpdateTimeToLiveCommand protected () extends Command[
          InputTypesUnion, 
          UpdateTimeToLiveInput, 
          OutputTypesUnion, 
          UpdateTimeToLiveOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateTimeToLiveInput) = this()
    val middlewareStack: MiddlewareStack[UpdateTimeToLiveInput, UpdateTimeToLiveOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateTimeToLiveInput, UpdateTimeToLiveOutput] = js.native
  }
  
}

