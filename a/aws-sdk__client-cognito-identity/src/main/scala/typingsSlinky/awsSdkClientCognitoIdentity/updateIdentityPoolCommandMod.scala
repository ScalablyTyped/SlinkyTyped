package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.IdentityPool
import typingsSlinky.awsSdkSmithyClient.mod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateIdentityPoolCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/UpdateIdentityPoolCommand", "UpdateIdentityPoolCommand")
  @js.native
  class UpdateIdentityPoolCommand protected ()
    extends Command[
          UpdateIdentityPoolCommandInput, 
          UpdateIdentityPoolCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: UpdateIdentityPoolCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[UpdateIdentityPoolCommandInput, UpdateIdentityPoolCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[UpdateIdentityPoolCommandInput, UpdateIdentityPoolCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type UpdateIdentityPoolCommandInput = IdentityPool
  
  type UpdateIdentityPoolCommandOutput = IdentityPool with MetadataBearer
}
