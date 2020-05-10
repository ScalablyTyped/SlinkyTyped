package typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesCognitoIdentityProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoIdentityProvider extends js.Object {
  /**
    * <p>The client ID for the Amazon Cognito Identity User Pool.</p>
    */
  var ClientId: js.UndefOr[String] = js.native
  /**
    * <p>The provider name for an Amazon Cognito Identity User Pool. For example, <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.</p>
    */
  var ProviderName: js.UndefOr[String] = js.native
  /**
    * <p>TRUE if server-side token validation is enabled for the identity provider’s token.</p>
    */
  var ServerSideTokenCheck: js.UndefOr[Boolean] = js.native
}

object CognitoIdentityProvider {
  @scala.inline
  def apply(): CognitoIdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CognitoIdentityProvider]
  }
  @scala.inline
  implicit class CognitoIdentityProviderOps[Self <: CognitoIdentityProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderName")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSideTokenCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerSideTokenCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideTokenCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerSideTokenCheck")(js.undefined)
        ret
    }
  }
  
}

