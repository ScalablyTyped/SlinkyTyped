package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.GetCredentialsForIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.GetCredentialsForIdentityResponse
import typingsSlinky.awsSdkSmithyClient.mod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCredentialsForIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/GetCredentialsForIdentityCommand", "GetCredentialsForIdentityCommand")
  @js.native
  class GetCredentialsForIdentityCommand protected ()
    extends Command[
          GetCredentialsForIdentityCommandInput, 
          GetCredentialsForIdentityCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: GetCredentialsForIdentityCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[GetCredentialsForIdentityCommandInput, GetCredentialsForIdentityCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetCredentialsForIdentityCommandInput, GetCredentialsForIdentityCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type GetCredentialsForIdentityCommandInput = GetCredentialsForIdentityInput
  
  type GetCredentialsForIdentityCommandOutput = GetCredentialsForIdentityResponse with MetadataBearer
}
