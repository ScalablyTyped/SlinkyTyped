package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalAuthenticationProvider extends js.Object {
  /**
    * The authentication type: API key, AWS IAM, OIDC, or Amazon Cognito user pools.
    */
  var authenticationType: js.UndefOr[AuthenticationType] = js.native
  /**
    * The OpenID Connect configuration.
    */
  var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.native
  /**
    * The Amazon Cognito user pool configuration.
    */
  var userPoolConfig: js.UndefOr[CognitoUserPoolConfig] = js.native
}

object AdditionalAuthenticationProvider {
  @scala.inline
  def apply(): AdditionalAuthenticationProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalAuthenticationProvider]
  }
  @scala.inline
  implicit class AdditionalAuthenticationProviderOps[Self <: AdditionalAuthenticationProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationType(value: AuthenticationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationType")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenIDConnectConfig(value: OpenIDConnectConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openIDConnectConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenIDConnectConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openIDConnectConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPoolConfig(value: CognitoUserPoolConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolConfig")(js.undefined)
        ret
    }
  }
  
}

