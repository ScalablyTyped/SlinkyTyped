package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserPoolDomainRequest extends js.Object {
  
  /**
    * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application. Provide this parameter only if you want to use a custom domain for your user pool. Otherwise, you can exclude this parameter and use the Amazon Cognito hosted domain instead. For more information about the hosted domain and custom domains, see Configuring a User Pool Domain.
    */
  var CustomDomainConfig: js.UndefOr[CustomDomainConfigType] = js.native
  
  /**
    * The domain string.
    */
  var Domain: DomainType = js.native
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}
object CreateUserPoolDomainRequest {
  
  @scala.inline
  def apply(Domain: DomainType, UserPoolId: UserPoolIdType): CreateUserPoolDomainRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserPoolDomainRequest]
  }
  
  @scala.inline
  implicit class CreateUserPoolDomainRequestOps[Self <: CreateUserPoolDomainRequest] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: DomainType): Self = this.set("Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDomainConfig(value: CustomDomainConfigType): Self = this.set("CustomDomainConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDomainConfig: Self = this.set("CustomDomainConfig", js.undefined)
  }
}
