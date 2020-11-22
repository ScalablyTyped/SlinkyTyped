package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateGlobalTableInputMod.CreateGlobalTableInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateGlobalTableOutputMod.CreateGlobalTableOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-browser/commands/CreateGlobalTableCommand", JSImport.Namespace)
@js.native
object createGlobalTableCommandMod extends js.Object {
  
  @js.native
  class CreateGlobalTableCommand protected () extends Command[
          InputTypesUnion, 
          CreateGlobalTableInput, 
          OutputTypesUnion, 
          CreateGlobalTableOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: CreateGlobalTableInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateGlobalTableInput, CreateGlobalTableOutput] = js.native
  }
}
