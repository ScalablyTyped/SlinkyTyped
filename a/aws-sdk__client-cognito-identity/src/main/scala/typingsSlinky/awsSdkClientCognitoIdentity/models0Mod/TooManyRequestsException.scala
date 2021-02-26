package typingsSlinky.awsSdkClientCognitoIdentity.models0Mod

import typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typingsSlinky.awsSdkSmithyClient.exceptionMod.SmithyException
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
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
object TooManyRequestsException {
  
  @scala.inline
  def apply(
    $fault: client,
    $metadata: ResponseMetadata,
    name: typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.TooManyRequestsException
  ): TooManyRequestsException = {
    val __obj = js.Dynamic.literal($fault = $fault.asInstanceOf[js.Any], $metadata = $metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooManyRequestsException]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "TooManyRequestsException.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: TooManyRequestsException): js.Any = js.native
  
  @scala.inline
  implicit class TooManyRequestsExceptionMutableBuilder[Self <: TooManyRequestsException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$fault(value: client): Self = StObject.set(x, "$fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(
      value: typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.TooManyRequestsException
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
