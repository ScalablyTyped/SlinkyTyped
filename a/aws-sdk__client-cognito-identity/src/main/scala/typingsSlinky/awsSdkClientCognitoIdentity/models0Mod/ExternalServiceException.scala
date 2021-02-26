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
trait ExternalServiceException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_ExternalServiceException: client = js.native
  
  /**
    * <p>The message returned by an ExternalServiceException</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_ExternalServiceException: typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ExternalServiceException = js.native
}
object ExternalServiceException {
  
  @scala.inline
  def apply(
    $fault: client,
    $metadata: ResponseMetadata,
    name: typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ExternalServiceException
  ): ExternalServiceException = {
    val __obj = js.Dynamic.literal($fault = $fault.asInstanceOf[js.Any], $metadata = $metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalServiceException]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ExternalServiceException.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: ExternalServiceException): js.Any = js.native
  
  @scala.inline
  implicit class ExternalServiceExceptionMutableBuilder[Self <: ExternalServiceException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$fault(value: client): Self = StObject.set(x, "$fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(
      value: typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ExternalServiceException
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
