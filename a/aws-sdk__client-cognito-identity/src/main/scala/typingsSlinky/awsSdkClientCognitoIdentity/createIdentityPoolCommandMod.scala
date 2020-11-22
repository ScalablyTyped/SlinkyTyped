package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.CreateIdentityPoolInput
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.IdentityPool
import typingsSlinky.awsSdkSmithyClient.commandMod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/types/commands/CreateIdentityPoolCommand", JSImport.Namespace)
@js.native
object createIdentityPoolCommandMod extends js.Object {
  
  @js.native
  class CreateIdentityPoolCommand protected ()
    extends Command[
          CreateIdentityPoolCommandInput, 
          CreateIdentityPoolCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: CreateIdentityPoolCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[CreateIdentityPoolCommandInput, CreateIdentityPoolCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[CreateIdentityPoolCommandInput, CreateIdentityPoolCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type CreateIdentityPoolCommandInput = CreateIdentityPoolInput
  
  type CreateIdentityPoolCommandOutput = IdentityPool with MetadataBearer
}
