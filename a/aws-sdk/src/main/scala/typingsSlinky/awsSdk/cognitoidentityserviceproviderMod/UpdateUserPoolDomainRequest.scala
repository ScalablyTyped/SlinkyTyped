package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserPoolDomainRequest extends js.Object {
  /**
    * The configuration for a custom domain that hosts the sign-up and sign-in pages for your application. Use this object to specify an SSL certificate that is managed by ACM.
    */
  var CustomDomainConfig: CustomDomainConfigType = js.native
  /**
    * The domain name for the custom domain that hosts the sign-up and sign-in pages for your application. For example: auth.example.com.  This string can include only lowercase letters, numbers, and hyphens. Do not use a hyphen for the first or last character. Use periods to separate subdomain names.
    */
  var Domain: DomainType = js.native
  /**
    * The ID of the user pool that is associated with the custom domain that you are updating the certificate for.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object UpdateUserPoolDomainRequest {
  @scala.inline
  def apply(CustomDomainConfig: CustomDomainConfigType, Domain: DomainType, UserPoolId: UserPoolIdType): UpdateUserPoolDomainRequest = {
    val __obj = js.Dynamic.literal(CustomDomainConfig = CustomDomainConfig.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserPoolDomainRequest]
  }
  @scala.inline
  implicit class UpdateUserPoolDomainRequestOps[Self <: UpdateUserPoolDomainRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomDomainConfig(value: CustomDomainConfigType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomDomainConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: DomainType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

