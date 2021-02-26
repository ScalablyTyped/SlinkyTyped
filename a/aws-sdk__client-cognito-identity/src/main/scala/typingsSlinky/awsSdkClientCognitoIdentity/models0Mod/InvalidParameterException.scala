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
object InvalidParameterException {
  
  @scala.inline
  def apply(
    $fault: client,
    $metadata: ResponseMetadata,
    name: typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InvalidParameterException
  ): InvalidParameterException = {
    val __obj = js.Dynamic.literal($fault = $fault.asInstanceOf[js.Any], $metadata = $metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidParameterException]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "InvalidParameterException.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: InvalidParameterException): js.Any = js.native
  
  @scala.inline
  implicit class InvalidParameterExceptionMutableBuilder[Self <: InvalidParameterException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$fault(value: client): Self = StObject.set(x, "$fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(
      value: typingsSlinky.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InvalidParameterException
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
