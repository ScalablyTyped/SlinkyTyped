package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.ListTagsForResourceInput
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.ListTagsForResourceResponse
import typingsSlinky.awsSdkSmithyClient.mod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listTagsForResourceCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/ListTagsForResourceCommand", "ListTagsForResourceCommand")
  @js.native
  class ListTagsForResourceCommand protected ()
    extends Command[
          ListTagsForResourceCommandInput, 
          ListTagsForResourceCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: ListTagsForResourceCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[ListTagsForResourceCommandInput, ListTagsForResourceCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListTagsForResourceCommandInput, ListTagsForResourceCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type ListTagsForResourceCommandInput = ListTagsForResourceInput
  
  type ListTagsForResourceCommandOutput = ListTagsForResourceResponse with MetadataBearer
}
