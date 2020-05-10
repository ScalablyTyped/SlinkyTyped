package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenIDConnectConfig extends js.Object {
  /**
    * The number of milliseconds a token is valid after being authenticated.
    */
  var authTTL: js.UndefOr[Long] = js.native
  /**
    * The client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * The number of milliseconds a token is valid after being issued to a user.
    */
  var iatTTL: js.UndefOr[Long] = js.native
  /**
    * The issuer for the OpenID Connect configuration. The issuer returned by discovery must exactly match the value of iss in the ID token.
    */
  var issuer: String = js.native
}

object OpenIDConnectConfig {
  @scala.inline
  def apply(issuer: String): OpenIDConnectConfig = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenIDConnectConfig]
  }
  @scala.inline
  implicit class OpenIDConnectConfigOps[Self <: OpenIDConnectConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthTTL(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authTTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthTTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authTTL")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withIatTTL(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iatTTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIatTTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iatTTL")(js.undefined)
        ret
    }
  }
  
}

