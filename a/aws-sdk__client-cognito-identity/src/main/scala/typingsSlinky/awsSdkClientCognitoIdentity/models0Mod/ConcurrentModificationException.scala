package typingsSlinky.awsSdkClientCognitoIdentity.models0Mod

import typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typingsSlinky.awsSdkSmithyClient.exceptionMod.SmithyException
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConcurrentModificationException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_ConcurrentModificationException: client = js.native
  
  /**
    * <p>The message returned by a ConcurrentModificationException.</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_ConcurrentModificationException: typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ConcurrentModificationException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ConcurrentModificationException")
@js.native
object ConcurrentModificationException extends js.Object {
  
  def filterSensitiveLog(obj: ConcurrentModificationException): js.Any = js.native
}
