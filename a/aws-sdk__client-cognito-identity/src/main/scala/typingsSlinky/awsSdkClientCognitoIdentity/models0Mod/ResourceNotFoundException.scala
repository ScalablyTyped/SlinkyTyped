package typingsSlinky.awsSdkClientCognitoIdentity.models0Mod

import typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typingsSlinky.awsSdkSmithyClient.exceptionMod.SmithyException
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceNotFoundException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_ResourceNotFoundException: client = js.native
  
  /**
    * <p>The message returned by a ResourceNotFoundException.</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_ResourceNotFoundException: typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ResourceNotFoundException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ResourceNotFoundException")
@js.native
object ResourceNotFoundException extends js.Object {
  
  def filterSensitiveLog(obj: ResourceNotFoundException): js.Any = js.native
}
