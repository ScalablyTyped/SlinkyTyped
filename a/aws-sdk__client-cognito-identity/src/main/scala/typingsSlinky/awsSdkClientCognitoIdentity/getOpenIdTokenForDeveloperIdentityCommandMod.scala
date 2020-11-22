package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.GetOpenIdTokenForDeveloperIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.GetOpenIdTokenForDeveloperIdentityResponse
import typingsSlinky.awsSdkSmithyClient.commandMod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/types/commands/GetOpenIdTokenForDeveloperIdentityCommand", JSImport.Namespace)
@js.native
object getOpenIdTokenForDeveloperIdentityCommandMod extends js.Object {
  
  @js.native
  class GetOpenIdTokenForDeveloperIdentityCommand protected ()
    extends Command[
          GetOpenIdTokenForDeveloperIdentityCommandInput, 
          GetOpenIdTokenForDeveloperIdentityCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: GetOpenIdTokenForDeveloperIdentityCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[
        GetOpenIdTokenForDeveloperIdentityCommandInput, 
        GetOpenIdTokenForDeveloperIdentityCommandOutput
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[
        GetOpenIdTokenForDeveloperIdentityCommandInput, 
        GetOpenIdTokenForDeveloperIdentityCommandOutput
      ] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type GetOpenIdTokenForDeveloperIdentityCommandInput = GetOpenIdTokenForDeveloperIdentityInput
  
  type GetOpenIdTokenForDeveloperIdentityCommandOutput = GetOpenIdTokenForDeveloperIdentityResponse with MetadataBearer
}
