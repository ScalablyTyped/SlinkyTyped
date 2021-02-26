package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.ListIdentitiesInput
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.ListIdentitiesResponse
import typingsSlinky.awsSdkSmithyClient.mod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listIdentitiesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/ListIdentitiesCommand", "ListIdentitiesCommand")
  @js.native
  class ListIdentitiesCommand protected ()
    extends Command[
          ListIdentitiesCommandInput, 
          ListIdentitiesCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: ListIdentitiesCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[ListIdentitiesCommandInput, ListIdentitiesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListIdentitiesCommandInput, ListIdentitiesCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type ListIdentitiesCommandInput = ListIdentitiesInput
  
  type ListIdentitiesCommandOutput = ListIdentitiesResponse with MetadataBearer
}
