package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesInputMod.DeleteIdentitiesInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesOutputMod.DeleteIdentitiesOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteIdentitiesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/DeleteIdentitiesCommand", "DeleteIdentitiesCommand")
  @js.native
  class DeleteIdentitiesCommand protected () extends Command[
          InputTypesUnion, 
          DeleteIdentitiesInput, 
          OutputTypesUnion, 
          DeleteIdentitiesOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: DeleteIdentitiesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DeleteIdentitiesInput, DeleteIdentitiesOutput] = js.native
  }
}
