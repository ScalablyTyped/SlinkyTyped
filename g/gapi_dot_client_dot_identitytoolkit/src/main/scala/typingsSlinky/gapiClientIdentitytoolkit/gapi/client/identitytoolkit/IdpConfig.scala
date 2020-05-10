package typingsSlinky.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdpConfig extends js.Object {
  /** OAuth2 client ID. */
  var clientId: js.UndefOr[String] = js.native
  /** Whether this IDP is enabled. */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Percent of users who will be prompted/redirected federated login for this IDP. */
  var experimentPercent: js.UndefOr[Double] = js.native
  /** OAuth2 provider. */
  var provider: js.UndefOr[String] = js.native
  /** OAuth2 client secret. */
  var secret: js.UndefOr[String] = js.native
  /** Whitelisted client IDs for audience check. */
  var whitelistedAudiences: js.UndefOr[js.Array[String]] = js.native
}

object IdpConfig {
  @scala.inline
  def apply(): IdpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdpConfig]
  }
  @scala.inline
  implicit class IdpConfigOps[Self <: IdpConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimentPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelistedAudiences(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelistedAudiences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelistedAudiences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelistedAudiences")(js.undefined)
        ret
    }
  }
  
}

