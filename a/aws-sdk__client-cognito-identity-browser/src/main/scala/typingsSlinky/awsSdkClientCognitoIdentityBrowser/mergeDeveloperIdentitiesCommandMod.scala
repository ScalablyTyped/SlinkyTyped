package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesInputMod.MergeDeveloperIdentitiesInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesOutputMod.MergeDeveloperIdentitiesOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeDeveloperIdentitiesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/MergeDeveloperIdentitiesCommand", "MergeDeveloperIdentitiesCommand")
  @js.native
  class MergeDeveloperIdentitiesCommand protected () extends Command[
          InputTypesUnion, 
          MergeDeveloperIdentitiesInput, 
          OutputTypesUnion, 
          MergeDeveloperIdentitiesOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: MergeDeveloperIdentitiesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[MergeDeveloperIdentitiesInput, MergeDeveloperIdentitiesOutput] = js.native
  }
}
