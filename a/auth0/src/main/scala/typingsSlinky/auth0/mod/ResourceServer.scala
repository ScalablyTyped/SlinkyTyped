package typingsSlinky.auth0.mod

import typingsSlinky.auth0.anon.Description
import typingsSlinky.auth0.auth0Strings.HS256
import typingsSlinky.auth0.auth0Strings.RS256
import typingsSlinky.auth0.auth0Strings.access_token
import typingsSlinky.auth0.auth0Strings.access_token_authz
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceServer extends js.Object {
  /**
    * Allows issuance of refresh tokens for this entity.
    */
  var allow_offline_access: js.UndefOr[Boolean] = js.native
  /**
    * Enables the enforcement of the authorization policies.
    */
  var enforce_policies: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the resource server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The identifier of the resource server.
    */
  var identifier: js.UndefOr[String] = js.native
  /**
    * A friendly name for the resource server.
    */
  var name: js.UndefOr[String] = js.native
  var scopes: js.UndefOr[js.Array[Description]] = js.native
  /**
    * The algorithm used to sign tokens.
    */
  var signing_alg: js.UndefOr[HS256 | RS256] = js.native
  /**
    * The secret used to sign tokens when using symmetric algorithms.
    */
  var signing_secret: js.UndefOr[String] = js.native
  /**
    * Flag this entity as capable of skipping consent.
    */
  var skip_consent_for_verifiable_first_party_clients: js.UndefOr[Boolean] = js.native
  /**
    * The dialect for the access token.
    */
  var token_dialect: js.UndefOr[access_token | access_token_authz] = js.native
  /**
    * The amount of time (in seconds) that the token will be valid after being issued.
    */
  var token_lifetime: js.UndefOr[Double] = js.native
  /**
    * The amount of time (in seconds) that the token will be valid after being issued from browser based flows. Value cannot be larger than token_lifetime..
    */
  var token_lifetime_for_web: js.UndefOr[Double] = js.native
}

object ResourceServer {
  @scala.inline
  def apply(): ResourceServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceServer]
  }
  @scala.inline
  implicit class ResourceServerOps[Self <: ResourceServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_offline_access(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_offline_access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_offline_access: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_offline_access")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforce_policies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce_policies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforce_policies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce_policies")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[Description]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
    @scala.inline
    def withSigning_alg(value: HS256 | RS256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signing_alg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigning_alg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signing_alg")(js.undefined)
        ret
    }
    @scala.inline
    def withSigning_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signing_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigning_secret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signing_secret")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip_consent_for_verifiable_first_party_clients(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_consent_for_verifiable_first_party_clients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip_consent_for_verifiable_first_party_clients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_consent_for_verifiable_first_party_clients")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_dialect(value: access_token | access_token_authz): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_dialect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_dialect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_dialect")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_lifetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_lifetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_lifetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_lifetime")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_lifetime_for_web(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_lifetime_for_web")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_lifetime_for_web: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_lifetime_for_web")(js.undefined)
        ret
    }
  }
  
}

