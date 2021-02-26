package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.GetOpenIdTokenInput
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.GetOpenIdTokenResponse
import typingsSlinky.awsSdkSmithyClient.mod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOpenIdTokenCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/GetOpenIdTokenCommand", "GetOpenIdTokenCommand")
  @js.native
  class GetOpenIdTokenCommand protected ()
    extends Command[
          GetOpenIdTokenCommandInput, 
          GetOpenIdTokenCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: GetOpenIdTokenCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[GetOpenIdTokenCommandInput, GetOpenIdTokenCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetOpenIdTokenCommandInput, GetOpenIdTokenCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type GetOpenIdTokenCommandInput = GetOpenIdTokenInput
  
  type GetOpenIdTokenCommandOutput = GetOpenIdTokenResponse with MetadataBearer
}
