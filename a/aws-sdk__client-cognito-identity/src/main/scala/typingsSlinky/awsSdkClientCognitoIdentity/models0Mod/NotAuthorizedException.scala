package typingsSlinky.awsSdkClientCognitoIdentity.models0Mod

import typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typingsSlinky.awsSdkSmithyClient.exceptionMod.SmithyException
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotAuthorizedException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_NotAuthorizedException: client = js.native
  
  /**
    * <p>The message returned by a NotAuthorizedException</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_NotAuthorizedException: typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.NotAuthorizedException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "NotAuthorizedException")
@js.native
object NotAuthorizedException extends js.Object {
  
  def filterSensitiveLog(obj: NotAuthorizedException): js.Any = js.native
}
