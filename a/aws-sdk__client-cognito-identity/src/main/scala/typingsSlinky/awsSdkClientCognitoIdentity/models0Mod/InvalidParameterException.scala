package typingsSlinky.awsSdkClientCognitoIdentity.models0Mod

import typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typingsSlinky.awsSdkSmithyClient.exceptionMod.SmithyException
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidParameterException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_InvalidParameterException: client = js.native
  
  /**
    * <p>The message returned by an InvalidParameterException.</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_InvalidParameterException: typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InvalidParameterException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "InvalidParameterException")
@js.native
object InvalidParameterException extends js.Object {
  
  def filterSensitiveLog(obj: InvalidParameterException): js.Any = js.native
}
