package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput
import typingsSlinky.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsOutputMod.UpdateGlobalTableSettingsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateGlobalTableSettingsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateGlobalTableSettingsCommand", "UpdateGlobalTableSettingsCommand")
  @js.native
  class UpdateGlobalTableSettingsCommand protected () extends Command[
          InputTypesUnion, 
          UpdateGlobalTableSettingsInput, 
          OutputTypesUnion, 
          UpdateGlobalTableSettingsOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: UpdateGlobalTableSettingsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateGlobalTableSettingsInput, UpdateGlobalTableSettingsOutput] = js.native
  }
}
