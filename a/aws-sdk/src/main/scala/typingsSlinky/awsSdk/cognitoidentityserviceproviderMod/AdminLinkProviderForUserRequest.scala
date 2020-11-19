package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminLinkProviderForUserRequest extends js.Object {
  
  /**
    * The existing user in the user pool to be linked to the external identity provider user account. Can be a native (Username + Password) Cognito User Pools user or a federated user (for example, a SAML or Facebook user). If the user doesn't exist, an exception is thrown. This is the user that is returned when the new user (with the linked identity provider attribute) signs in. For a native username + password user, the ProviderAttributeValue for the DestinationUser should be the username in the user pool. For a federated user, it should be the provider-specific user_id. The ProviderAttributeName of the DestinationUser is ignored. The ProviderName should be set to Cognito for users in Cognito user pools.
    */
  var DestinationUser: ProviderUserIdentifierType = js.native
  
  /**
    * An external identity provider account for a user who does not currently exist yet in the user pool. This user must be a federated user (for example, a SAML or Facebook user), not another native user. If the SourceUser is a federated social identity provider user (Facebook, Google, or Login with Amazon), you must set the ProviderAttributeName to Cognito_Subject. For social identity providers, the ProviderName will be Facebook, Google, or LoginWithAmazon, and Cognito will automatically parse the Facebook, Google, and Login with Amazon tokens for id, sub, and user_id, respectively. The ProviderAttributeValue for the user must be the same value as the id, sub, or user_id value found in the social identity provider token.  For SAML, the ProviderAttributeName can be any value that matches a claim in the SAML assertion. If you wish to link SAML users based on the subject of the SAML assertion, you should map the subject to a claim through the SAML identity provider and submit that claim name as the ProviderAttributeName. If you set ProviderAttributeName to Cognito_Subject, Cognito will automatically parse the default unique identifier found in the subject from the SAML token.
    */
  var SourceUser: ProviderUserIdentifierType = js.native
  
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: StringType = js.native
}
object AdminLinkProviderForUserRequest {
  
  @scala.inline
  def apply(
    DestinationUser: ProviderUserIdentifierType,
    SourceUser: ProviderUserIdentifierType,
    UserPoolId: StringType
  ): AdminLinkProviderForUserRequest = {
    val __obj = js.Dynamic.literal(DestinationUser = DestinationUser.asInstanceOf[js.Any], SourceUser = SourceUser.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminLinkProviderForUserRequest]
  }
  
  @scala.inline
  implicit class AdminLinkProviderForUserRequestOps[Self <: AdminLinkProviderForUserRequest] (val x: Self) extends AnyVal {
    
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
    def setDestinationUser(value: ProviderUserIdentifierType): Self = this.set("DestinationUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUser(value: ProviderUserIdentifierType): Self = this.set("SourceUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: StringType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
  }
}
