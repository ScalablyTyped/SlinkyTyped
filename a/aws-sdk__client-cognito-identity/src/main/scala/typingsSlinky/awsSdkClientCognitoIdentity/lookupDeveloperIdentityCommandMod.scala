package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.LookupDeveloperIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.LookupDeveloperIdentityResponse
import typingsSlinky.awsSdkSmithyClient.mod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lookupDeveloperIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/LookupDeveloperIdentityCommand", "LookupDeveloperIdentityCommand")
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
