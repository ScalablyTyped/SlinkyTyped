package typingsSlinky.awsSdkClientCognitoIdentity.models0Mod

import typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typingsSlinky.awsSdkSmithyClient.exceptionMod.SmithyException
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceConflictException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_ResourceConflictException: client = js.native
  
  /**
    * <p>The message returned by a ResourceConflictException.</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_ResourceConflictException: typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ResourceConflictException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ResourceConflictException")
@js.native
object ResourceConflictException extends js.Object {
  
  def filterSensitiveLog(obj: ResourceConflictException): js.Any = js.native
}
