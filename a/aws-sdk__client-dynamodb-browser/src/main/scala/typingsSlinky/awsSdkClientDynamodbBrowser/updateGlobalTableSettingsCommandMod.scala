package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsOutputMod.UpdateGlobalTableSettingsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/UpdateGlobalTableSettingsCommand", JSImport.Namespace)
@js.native
object updateGlobalTableSettingsCommandMod extends js.Object {
  @js.native
  class UpdateGlobalTableSettingsCommand protected () extends Command[
          InputTypesUnion, 
          UpdateGlobalTableSettingsInput, 
          OutputTypesUnion, 
          UpdateGlobalTableSettingsOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateGlobalTableSettingsInput) = this()
    /* CompleteClass */
    override val input: UpdateGlobalTableSettingsInput = js.native
    val middlewareStack: MiddlewareStack[
        UpdateGlobalTableSettingsInput, 
        UpdateGlobalTableSettingsOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateGlobalTableSettingsInput, UpdateGlobalTableSettingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateGlobalTableSettingsInput, UpdateGlobalTableSettingsOutput] = js.native
  }
  
}

