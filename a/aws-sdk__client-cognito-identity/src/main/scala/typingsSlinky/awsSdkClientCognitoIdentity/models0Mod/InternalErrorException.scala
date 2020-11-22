package typingsSlinky.awsSdkClientCognitoIdentity.models0Mod

import typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.server
import typingsSlinky.awsSdkSmithyClient.exceptionMod.SmithyException
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalErrorException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_InternalErrorException: server = js.native
  
  /**
    * <p>The message returned by an InternalErrorException.</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_InternalErrorException: typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InternalErrorException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "InternalErrorException")
@js.native
object InternalErrorException extends js.Object {
  
  def filterSensitiveLog(obj: InternalErrorException): js.Any = js.native
}
