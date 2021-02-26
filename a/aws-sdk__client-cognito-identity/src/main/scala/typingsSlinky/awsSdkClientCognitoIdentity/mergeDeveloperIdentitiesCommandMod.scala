package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.MergeDeveloperIdentitiesInput
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.MergeDeveloperIdentitiesResponse
import typingsSlinky.awsSdkSmithyClient.mod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeDeveloperIdentitiesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/MergeDeveloperIdentitiesCommand", "MergeDeveloperIdentitiesCommand")
  @js.native
  class MergeDeveloperIdentitiesCommand protected ()
    extends Command[
          MergeDeveloperIdentitiesCommandInput, 
          MergeDeveloperIdentitiesCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: MergeDeveloperIdentitiesCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[MergeDeveloperIdentitiesCommandInput, MergeDeveloperIdentitiesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[MergeDeveloperIdentitiesCommandInput, MergeDeveloperIdentitiesCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type MergeDeveloperIdentitiesCommandInput = MergeDeveloperIdentitiesInput
  
  type MergeDeveloperIdentitiesCommandOutput = MergeDeveloperIdentitiesResponse with MetadataBearer
}
