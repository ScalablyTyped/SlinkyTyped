package typingsSlinky.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceProviderOptions extends js.Object {
  var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.native
  var alt_certs: js.UndefOr[js.Array[String]] = js.native
  var alt_private_keys: js.UndefOr[js.Array[String]] = js.native
  var assert_endpoint: String = js.native
  var auth_context: js.UndefOr[AuthnContextClassRef] = js.native
  var certificate: String = js.native
  var entity_id: String = js.native
  var force_authn: js.UndefOr[Boolean] = js.native
  var nameid_format: js.UndefOr[String] = js.native
  var private_key: String = js.native
  var sign_get_request: js.UndefOr[Boolean] = js.native
}

object ServiceProviderOptions {
  @scala.inline
  def apply(assert_endpoint: String, certificate: String, entity_id: String, private_key: String): ServiceProviderOptions = {
    val __obj = js.Dynamic.literal(assert_endpoint = assert_endpoint.asInstanceOf[js.Any], certificate = certificate.asInstanceOf[js.Any], entity_id = entity_id.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceProviderOptions]
  }
  @scala.inline
  implicit class ServiceProviderOptionsOps[Self <: ServiceProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssert_endpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert_endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntity_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivate_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_unencrypted_assertion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_unencrypted_assertion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_unencrypted_assertion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_unencrypted_assertion")(js.undefined)
        ret
    }
    @scala.inline
    def withAlt_certs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt_certs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt_certs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt_certs")(js.undefined)
        ret
    }
    @scala.inline
    def withAlt_private_keys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt_private_keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt_private_keys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt_private_keys")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth_context(value: AuthnContextClassRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth_context: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_context")(js.undefined)
        ret
    }
    @scala.inline
    def withForce_authn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_authn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce_authn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_authn")(js.undefined)
        ret
    }
    @scala.inline
    def withNameid_format(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameid_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameid_format: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameid_format")(js.undefined)
        ret
    }
    @scala.inline
    def withSign_get_request(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign_get_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSign_get_request: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign_get_request")(js.undefined)
        ret
    }
  }
  
}

