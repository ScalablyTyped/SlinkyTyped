package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.DeleteIdentitiesInput
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.DeleteIdentitiesResponse
import typingsSlinky.awsSdkSmithyClient.mod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteIdentitiesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/DeleteIdentitiesCommand", "DeleteIdentitiesCommand")
  @js.native
  class DeleteIdentitiesCommand protected ()
    extends Command[
          DeleteIdentitiesCommandInput, 
          DeleteIdentitiesCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: DeleteIdentitiesCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[DeleteIdentitiesCommandInput, DeleteIdentitiesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DeleteIdentitiesCommandInput, DeleteIdentitiesCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type DeleteIdentitiesCommandInput = DeleteIdentitiesInput
  
  type DeleteIdentitiesCommandOutput = DeleteIdentitiesResponse with MetadataBearer
}
