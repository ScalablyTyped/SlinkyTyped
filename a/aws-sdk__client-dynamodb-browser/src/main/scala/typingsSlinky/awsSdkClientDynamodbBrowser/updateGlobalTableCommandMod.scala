package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableOutputMod.UpdateGlobalTableOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-browser/commands/UpdateGlobalTableCommand", JSImport.Namespace)
@js.native
object updateGlobalTableCommandMod extends js.Object {
  
  @js.native
  class UpdateGlobalTableCommand protected () extends Command[
          InputTypesUnion, 
          UpdateGlobalTableInput, 
          OutputTypesUnion, 
          UpdateGlobalTableOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: UpdateGlobalTableInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateGlobalTableInput, UpdateGlobalTableOutput] = js.native
  }
}
