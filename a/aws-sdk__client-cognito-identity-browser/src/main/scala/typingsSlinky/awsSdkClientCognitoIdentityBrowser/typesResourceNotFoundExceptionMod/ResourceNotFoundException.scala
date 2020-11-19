package typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesResourceNotFoundExceptionMod

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.deleteIdentityPoolExceptionsUnionMod.DeleteIdentityPoolExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.describeIdentityExceptionsUnionMod.DescribeIdentityExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.describeIdentityPoolExceptionsUnionMod.DescribeIdentityPoolExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getCredentialsForIdentityExceptionsUnionMod.GetCredentialsForIdentityExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getIdExceptionsUnionMod.GetIdExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getIdentityPoolRolesExceptionsUnionMod.GetIdentityPoolRolesExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenExceptionsUnionMod.GetOpenIdTokenExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenForDeveloperIdentityExceptionsUnionMod.GetOpenIdTokenForDeveloperIdentityExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.listIdentitiesExceptionsUnionMod.ListIdentitiesExceptionsUnion
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceNotFoundException
  extends ServiceException[ResourceNotFoundExceptionDetails]
     with DeleteIdentityPoolExceptionsUnion
     with DescribeIdentityExceptionsUnion
     with DescribeIdentityPoolExceptionsUnion
     with GetCredentialsForIdentityExceptionsUnion
     with GetIdExceptionsUnion
     with GetIdentityPoolRolesExceptionsUnion
     with GetOpenIdTokenExceptionsUnion
     with GetOpenIdTokenForDeveloperIdentityExceptionsUnion
     with ListIdentitiesExceptionsUnion
     with LookupDeveloperIdentityExceptionsUnion
     with MergeDeveloperIdentitiesExceptionsUnion
     with SetIdentityPoolRolesExceptionsUnion
     with UnlinkDeveloperIdentityExceptionsUnion
     with UnlinkIdentityExceptionsUnion
     with UpdateIdentityPoolExceptionsUnion {
  
  @JSName("name")
  var name_ResourceNotFoundException: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ResourceNotFoundException = js.native
}
object ResourceNotFoundException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ResourceNotFoundExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ResourceNotFoundException
  ): ResourceNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceNotFoundException]
  }
  
  @scala.inline
  implicit class ResourceNotFoundExceptionOps[Self <: ResourceNotFoundException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ResourceNotFoundException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
