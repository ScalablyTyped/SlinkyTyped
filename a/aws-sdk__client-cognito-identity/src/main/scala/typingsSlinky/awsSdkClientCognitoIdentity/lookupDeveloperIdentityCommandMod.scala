package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.LookupDeveloperIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.LookupDeveloperIdentityResponse
import typingsSlinky.awsSdkSmithyClient.commandMod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/types/commands/LookupDeveloperIdentityCommand", JSImport.Namespace)
@js.native
object lookupDeveloperIdentityCommandMod extends js.Object {
  
  @js.native
  class LookupDeveloperIdentityCommand protected ()
    extends Command[
          LookupDeveloperIdentityCommandInput, 
          LookupDeveloperIdentityCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: LookupDeveloperIdentityCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[LookupDeveloperIdentityCommandInput, LookupDeveloperIdentityCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[LookupDeveloperIdentityCommandInput, LookupDeveloperIdentityCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type LookupDeveloperIdentityCommandInput = LookupDeveloperIdentityInput
  
  type LookupDeveloperIdentityCommandOutput = LookupDeveloperIdentityResponse with MetadataBearer
}
