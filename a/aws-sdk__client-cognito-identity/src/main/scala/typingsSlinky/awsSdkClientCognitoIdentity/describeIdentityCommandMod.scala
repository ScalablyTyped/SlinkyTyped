package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.DescribeIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentity.models0Mod.IdentityDescription
import typingsSlinky.awsSdkSmithyClient.mod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/DescribeIdentityCommand", "DescribeIdentityCommand")
  @js.native
  class DescribeIdentityCommand protected ()
    extends Command[
          DescribeIdentityCommandInput, 
          DescribeIdentityCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: DescribeIdentityCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[DescribeIdentityCommandInput, DescribeIdentityCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DescribeIdentityCommandInput, DescribeIdentityCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type DescribeIdentityCommandInput = DescribeIdentityInput
  
  type DescribeIdentityCommandOutput = IdentityDescription with MetadataBearer
}
