package typingsSlinky.awsSdk.ssooidcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterClientResponse extends js.Object {
  /**
    * The endpoint where the client can request authorization.
    */
  var authorizationEndpoint: js.UndefOr[URI] = js.native
  /**
    * The unique identifier string for each client. This client uses this identifier to get authenticated by the service in subsequent calls.
    */
  var clientId: js.UndefOr[ClientId] = js.native
  /**
    * Indicates the time at which the clientId and clientSecret were issued.
    */
  var clientIdIssuedAt: js.UndefOr[LongTimeStampType] = js.native
  /**
    * A secret string generated for the client. The client will use this string to get authenticated by the service in subsequent calls.
    */
  var clientSecret: js.UndefOr[ClientSecret] = js.native
  /**
    * Indicates the time at which the clientId and clientSecret will become invalid.
    */
  var clientSecretExpiresAt: js.UndefOr[LongTimeStampType] = js.native
  /**
    * The endpoint where the client can get an access token.
    */
  var tokenEndpoint: js.UndefOr[URI] = js.native
}

object RegisterClientResponse {
  @scala.inline
  def apply(): RegisterClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterClientResponse]
  }
  @scala.inline
  implicit class RegisterClientResponseOps[Self <: RegisterClientResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationEndpoint(value: URI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: ClientId): Self = {
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
    def withClientIdIssuedAt(value: LongTimeStampType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientIdIssuedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientIdIssuedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientIdIssuedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withClientSecret(value: ClientSecret): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withClientSecretExpiresAt(value: LongTimeStampType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecretExpiresAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientSecretExpiresAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecretExpiresAt")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenEndpoint(value: URI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenEndpoint")(js.undefined)
        ret
    }
  }
  
}

