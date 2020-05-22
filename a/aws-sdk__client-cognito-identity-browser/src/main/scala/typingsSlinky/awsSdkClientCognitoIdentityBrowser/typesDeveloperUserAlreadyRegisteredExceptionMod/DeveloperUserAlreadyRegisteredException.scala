package typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeveloperUserAlreadyRegisteredExceptionMod

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenForDeveloperIdentityExceptionsUnionMod.GetOpenIdTokenForDeveloperIdentityExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperUserAlreadyRegisteredException
  extends ServiceException[DeveloperUserAlreadyRegisteredExceptionDetails]
     with GetOpenIdTokenForDeveloperIdentityExceptionsUnion {
  @JSName("name")
  var name_DeveloperUserAlreadyRegisteredException: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.DeveloperUserAlreadyRegisteredException
}

object DeveloperUserAlreadyRegisteredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: DeveloperUserAlreadyRegisteredExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.DeveloperUserAlreadyRegisteredException,
    stack: String = null
  ): DeveloperUserAlreadyRegisteredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeveloperUserAlreadyRegisteredException]
  }
}

