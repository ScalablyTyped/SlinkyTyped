package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.UnlinkDeveloperIdentityInput
import typingsSlinky.awsSdkSmithyClient.mod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unlinkDeveloperIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/UnlinkDeveloperIdentityCommand", "UnlinkDeveloperIdentityCommand")
  @js.native
  class UnlinkDeveloperIdentityCommand protected ()
    extends Command[
          UnlinkDeveloperIdentityCommandInput, 
          UnlinkDeveloperIdentityCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: UnlinkDeveloperIdentityCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[UnlinkDeveloperIdentityCommandInput, UnlinkDeveloperIdentityCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[UnlinkDeveloperIdentityCommandInput, UnlinkDeveloperIdentityCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type UnlinkDeveloperIdentityCommandInput = UnlinkDeveloperIdentityInput
  
  type UnlinkDeveloperIdentityCommandOutput = MetadataBearer
}
