package typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod

import typingsSlinky.awsSdkSmithyClient.mod.Client
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/types/CognitoIdentityClient", "CognitoIdentityClient")
@js.native
class CognitoIdentityClient protected () extends Client[
      HttpHandlerOptions, 
      ServiceInputTypes, 
      ServiceOutputTypes, 
      CognitoIdentityClientResolvedConfig
    ] {
  def this(configuration: CognitoIdentityClientConfig) = this()
}
