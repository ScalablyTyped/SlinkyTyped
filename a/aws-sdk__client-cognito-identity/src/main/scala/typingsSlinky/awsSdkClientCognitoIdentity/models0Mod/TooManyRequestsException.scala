package typingsSlinky.awsSdkClientCognitoIdentity.models0Mod

import typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typingsSlinky.awsSdkSmithyClient.exceptionMod.SmithyException
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooManyRequestsException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_TooManyRequestsException: client = js.native
  
  /**
    * <p>Message returned by a TooManyRequestsException</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_TooManyRequestsException: typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.TooManyRequestsException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "TooManyRequestsException")
@js.native
object TooManyRequestsException extends js.Object {
  
  def filterSensitiveLog(obj: TooManyRequestsException): js.Any = js.native
}
