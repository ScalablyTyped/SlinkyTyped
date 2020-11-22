package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.ListIdentityPoolsInput
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.ListIdentityPoolsResponse
import typingsSlinky.awsSdkSmithyClient.commandMod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/types/commands/ListIdentityPoolsCommand", JSImport.Namespace)
@js.native
object listIdentityPoolsCommandMod extends js.Object {
  
  @js.native
  class ListIdentityPoolsCommand protected ()
    extends Command[
          ListIdentityPoolsCommandInput, 
          ListIdentityPoolsCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: ListIdentityPoolsCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[ListIdentityPoolsCommandInput, ListIdentityPoolsCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListIdentityPoolsCommandInput, ListIdentityPoolsCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type ListIdentityPoolsCommandInput = ListIdentityPoolsInput
  
  type ListIdentityPoolsCommandOutput = ListIdentityPoolsResponse with MetadataBearer
}
