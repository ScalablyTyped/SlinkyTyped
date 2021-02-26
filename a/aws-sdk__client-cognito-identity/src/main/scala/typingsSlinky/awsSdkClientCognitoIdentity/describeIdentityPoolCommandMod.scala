package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.DescribeIdentityPoolInput
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

object describeIdentityPoolCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/DescribeIdentityPoolCommand", "DescribeIdentityPoolCommand")
  @js.native
  class DescribeIdentityPoolCommand protected ()
    extends Command[
          DescribeIdentityPoolCommandInput, 
          DescribeIdentityPoolCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: DescribeIdentityPoolCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[DescribeIdentityPoolCommandInput, DescribeIdentityPoolCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DescribeIdentityPoolCommandInput, DescribeIdentityPoolCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type DescribeIdentityPoolCommandInput = DescribeIdentityPoolInput
  
  type DescribeIdentityPoolCommandOutput = IdentityPool with MetadataBearer
}
