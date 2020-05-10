package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationData extends js.Object {
  /**
    * A base64-encoded string that contains authorization data for the specified Amazon ECR registry. When the string is decoded, it is presented in the format user:password for private registry authentication using docker login.
    */
  var authorizationToken: js.UndefOr[Base64] = js.native
  /**
    * The Unix time in seconds and milliseconds when the authorization token expires. Authorization tokens are valid for 12 hours.
    */
  var expiresAt: js.UndefOr[js.Date] = js.native
  /**
    * The registry URL to use for this authorization token in a docker login command. The Amazon ECR registry URL format is https://aws_account_id.dkr.ecr.region.amazonaws.com. For example, https://012345678910.dkr.ecr.us-east-1.amazonaws.com.. 
    */
  var proxyEndpoint: js.UndefOr[ProxyEndpoint] = js.native
}

object AuthorizationData {
  @scala.inline
  def apply(): AuthorizationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationData]
  }
  @scala.inline
  implicit class AuthorizationDataOps[Self <: AuthorizationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationToken(value: Base64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiresAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresAt")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyEndpoint(value: ProxyEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyEndpoint")(js.undefined)
        ret
    }
  }
  
}

