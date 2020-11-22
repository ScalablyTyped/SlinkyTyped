package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.GetIdentityPoolRolesInput
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.GetIdentityPoolRolesResponse
import typingsSlinky.awsSdkSmithyClient.commandMod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/types/commands/GetIdentityPoolRolesCommand", JSImport.Namespace)
@js.native
object getIdentityPoolRolesCommandMod extends js.Object {
  
  @js.native
  class GetIdentityPoolRolesCommand protected ()
    extends Command[
          GetIdentityPoolRolesCommandInput, 
          GetIdentityPoolRolesCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: GetIdentityPoolRolesCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[GetIdentityPoolRolesCommandInput, GetIdentityPoolRolesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetIdentityPoolRolesCommandInput, GetIdentityPoolRolesCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type GetIdentityPoolRolesCommandInput = GetIdentityPoolRolesInput
  
  type GetIdentityPoolRolesCommandOutput = GetIdentityPoolRolesResponse with MetadataBearer
}
