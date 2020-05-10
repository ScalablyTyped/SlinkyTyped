package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmimeInfo extends js.Object {
  var encryptedKeyPassword: js.UndefOr[String] = js.native
  var expiration: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var isDefault: js.UndefOr[Boolean] = js.native
  var issuerCn: js.UndefOr[String] = js.native
  var pem: js.UndefOr[String] = js.native
  var pkcs12: js.UndefOr[String] = js.native
}

object SmimeInfo {
  @scala.inline
  def apply(): SmimeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmimeInfo]
  }
  @scala.inline
  implicit class SmimeInfoOps[Self <: SmimeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptedKeyPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedKeyPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptedKeyPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedKeyPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(js.undefined)
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
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuerCn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerCn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuerCn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerCn")(js.undefined)
        ret
    }
    @scala.inline
    def withPem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pem")(js.undefined)
        ret
    }
    @scala.inline
    def withPkcs12(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkcs12")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPkcs12: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkcs12")(js.undefined)
        ret
    }
  }
  
}

