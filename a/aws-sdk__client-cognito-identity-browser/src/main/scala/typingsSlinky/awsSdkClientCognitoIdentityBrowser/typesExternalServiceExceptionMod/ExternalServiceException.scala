package typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesExternalServiceExceptionMod

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getCredentialsForIdentityExceptionsUnionMod.GetCredentialsForIdentityExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getIdExceptionsUnionMod.GetIdExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenExceptionsUnionMod.GetOpenIdTokenExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.unlinkIdentityExceptionsUnionMod.UnlinkIdentityExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalServiceException
  extends ServiceException[ExternalServiceExceptionDetails]
     with GetCredentialsForIdentityExceptionsUnion
     with GetIdExceptionsUnion
     with GetOpenIdTokenExceptionsUnion
     with UnlinkIdentityExceptionsUnion {
  
  @JSName("name")
  var name_ExternalServiceException: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ExternalServiceException = js.native
}
object ExternalServiceException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ExternalServiceExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ExternalServiceException
  ): ExternalServiceException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalServiceException]
  }
  
  @scala.inline
  implicit class ExternalServiceExceptionOps[Self <: ExternalServiceException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ExternalServiceException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
