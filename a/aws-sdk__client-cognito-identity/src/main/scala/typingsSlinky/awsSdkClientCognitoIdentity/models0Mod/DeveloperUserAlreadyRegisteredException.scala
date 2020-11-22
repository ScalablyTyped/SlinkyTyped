package typingsSlinky.awsSdkClientCognitoIdentity.models0Mod

import typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typingsSlinky.awsSdkSmithyClient.exceptionMod.SmithyException
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeveloperUserAlreadyRegisteredException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_DeveloperUserAlreadyRegisteredException: client = js.native
  
  /**
    * <p>This developer user identifier is already registered with Cognito.</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_DeveloperUserAlreadyRegisteredException: typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.DeveloperUserAlreadyRegisteredException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "DeveloperUserAlreadyRegisteredException")
@js.native
object DeveloperUserAlreadyRegisteredException extends js.Object {
  
  def filterSensitiveLog(obj: DeveloperUserAlreadyRegisteredException): js.Any = js.native
}
