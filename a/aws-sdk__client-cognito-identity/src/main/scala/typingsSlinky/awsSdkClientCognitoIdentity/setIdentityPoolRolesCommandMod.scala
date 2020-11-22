package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.SetIdentityPoolRolesInput
import typingsSlinky.awsSdkSmithyClient.commandMod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/types/commands/SetIdentityPoolRolesCommand", JSImport.Namespace)
@js.native
object setIdentityPoolRolesCommandMod extends js.Object {
  
  @js.native
  class SetIdentityPoolRolesCommand protected ()
    extends Command[
          SetIdentityPoolRolesCommandInput, 
          SetIdentityPoolRolesCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: SetIdentityPoolRolesCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[SetIdentityPoolRolesCommandInput, SetIdentityPoolRolesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[SetIdentityPoolRolesCommandInput, SetIdentityPoolRolesCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type SetIdentityPoolRolesCommandInput = SetIdentityPoolRolesInput
  
  type SetIdentityPoolRolesCommandOutput = MetadataBearer
}
