package typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInvalidIdentityPoolConfigurationExceptionMod

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getCredentialsForIdentityExceptionsUnionMod.GetCredentialsForIdentityExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidIdentityPoolConfigurationException
  extends ServiceException[InvalidIdentityPoolConfigurationExceptionDetails]
     with GetCredentialsForIdentityExceptionsUnion {
  
  @JSName("name")
  var name_InvalidIdentityPoolConfigurationException: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.InvalidIdentityPoolConfigurationException = js.native
}
object InvalidIdentityPoolConfigurationException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidIdentityPoolConfigurationExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.InvalidIdentityPoolConfigurationException
  ): InvalidIdentityPoolConfigurationException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidIdentityPoolConfigurationException]
  }
  
  @scala.inline
  implicit class InvalidIdentityPoolConfigurationExceptionOps[Self <: InvalidIdentityPoolConfigurationException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(
      value: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.InvalidIdentityPoolConfigurationException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
