package typingsSlinky.awsSdkClientCognitoIdentity.models0Mod

import typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typingsSlinky.awsSdkSmithyClient.exceptionMod.SmithyException
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidIdentityPoolConfigurationException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_InvalidIdentityPoolConfigurationException: client = js.native
  
  /**
    * <p>The message returned for an <code>InvalidIdentityPoolConfigurationException</code>
    *          </p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_InvalidIdentityPoolConfigurationException: typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InvalidIdentityPoolConfigurationException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "InvalidIdentityPoolConfigurationException")
@js.native
object InvalidIdentityPoolConfigurationException extends js.Object {
  
  def filterSensitiveLog(obj: InvalidIdentityPoolConfigurationException): js.Any = js.native
}
