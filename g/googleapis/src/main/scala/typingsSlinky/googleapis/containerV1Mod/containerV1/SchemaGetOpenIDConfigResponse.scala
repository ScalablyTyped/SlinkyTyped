package typingsSlinky.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GetOpenIDConfigResponse is an OIDC discovery document for the cluster. See
  * the OpenID Connect Discovery 1.0 specification for details.
  */
@js.native
trait SchemaGetOpenIDConfigResponse extends js.Object {
  /**
    * NOLINT
    */
  var claims_supported: js.UndefOr[js.Array[String]] = js.native
  /**
    * NOLINT
    */
  var grant_types: js.UndefOr[js.Array[String]] = js.native
  /**
    * NOLINT
    */
  var id_token_signing_alg_values_supported: js.UndefOr[js.Array[String]] = js.native
  /**
    * NOLINT
    */
  var issuer: js.UndefOr[String] = js.native
  /**
    * NOLINT
    */
  var jwks_uri: js.UndefOr[String] = js.native
  /**
    * NOLINT
    */
  var response_types_supported: js.UndefOr[js.Array[String]] = js.native
  /**
    * NOLINT
    */
  var subject_types_supported: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGetOpenIDConfigResponse {
  @scala.inline
  def apply(): SchemaGetOpenIDConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOpenIDConfigResponse]
  }
  @scala.inline
  implicit class SchemaGetOpenIDConfigResponseOps[Self <: SchemaGetOpenIDConfigResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClaims_supported(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claims_supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaims_supported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claims_supported")(js.undefined)
        ret
    }
    @scala.inline
    def withGrant_types(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grant_types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrant_types: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grant_types")(js.undefined)
        ret
    }
    @scala.inline
    def withId_token_signing_alg_values_supported(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id_token_signing_alg_values_supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId_token_signing_alg_values_supported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id_token_signing_alg_values_supported")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withJwks_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwks_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJwks_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwks_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse_types_supported(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_types_supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse_types_supported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_types_supported")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject_types_supported(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject_types_supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject_types_supported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject_types_supported")(js.undefined)
        ret
    }
  }
  
}

