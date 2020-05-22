package typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesTooManyRequestsExceptionMod

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.createIdentityPoolExceptionsUnionMod.CreateIdentityPoolExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.deleteIdentitiesExceptionsUnionMod.DeleteIdentitiesExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.deleteIdentityPoolExceptionsUnionMod.DeleteIdentityPoolExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.describeIdentityExceptionsUnionMod.DescribeIdentityExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.describeIdentityPoolExceptionsUnionMod.DescribeIdentityPoolExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getCredentialsForIdentityExceptionsUnionMod.GetCredentialsForIdentityExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getIdExceptionsUnionMod.GetIdExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getIdentityPoolRolesExceptionsUnionMod.GetIdentityPoolRolesExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenExceptionsUnionMod.GetOpenIdTokenExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenForDeveloperIdentityExceptionsUnionMod.GetOpenIdTokenForDeveloperIdentityExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.listIdentitiesExceptionsUnionMod.ListIdentitiesExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.listIdentityPoolsExceptionsUnionMod.ListIdentityPoolsExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.lookupDeveloperIdentityExceptionsUnionMod.LookupDeveloperIdentityExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.mergeDeveloperIdentitiesExceptionsUnionMod.MergeDeveloperIdentitiesExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.setIdentityPoolRolesExceptionsUnionMod.SetIdentityPoolRolesExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.unlinkDeveloperIdentityExceptionsUnionMod.UnlinkDeveloperIdentityExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.unlinkIdentityExceptionsUnionMod.UnlinkIdentityExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.updateIdentityPoolExceptionsUnionMod.UpdateIdentityPoolExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooManyRequestsException
  extends ServiceException[TooManyRequestsExceptionDetails]
     with CreateIdentityPoolExceptionsUnion
     with DeleteIdentitiesExceptionsUnion
     with DeleteIdentityPoolExceptionsUnion
     with DescribeIdentityExceptionsUnion
     with DescribeIdentityPoolExceptionsUnion
     with GetCredentialsForIdentityExceptionsUnion
     with GetIdExceptionsUnion
     with GetIdentityPoolRolesExceptionsUnion
     with GetOpenIdTokenExceptionsUnion
     with GetOpenIdTokenForDeveloperIdentityExceptionsUnion
     with ListIdentitiesExceptionsUnion
     with ListIdentityPoolsExceptionsUnion
     with LookupDeveloperIdentityExceptionsUnion
     with MergeDeveloperIdentitiesExceptionsUnion
     with SetIdentityPoolRolesExceptionsUnion
     with UnlinkDeveloperIdentityExceptionsUnion
     with UnlinkIdentityExceptionsUnion
     with UpdateIdentityPoolExceptionsUnion {
  @JSName("name")
  var name_TooManyRequestsException: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.TooManyRequestsException
}

object TooManyRequestsException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TooManyRequestsExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.TooManyRequestsException,
    stack: String = null
  ): TooManyRequestsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooManyRequestsException]
  }
}

