package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An S/MIME email config.
  */
@js.native
trait SchemaSmimeInfo extends js.Object {
  /**
    * Encrypted key password, when key is encrypted.
    */
  var encryptedKeyPassword: js.UndefOr[String] = js.native
  /**
    * When the certificate expires (in milliseconds since epoch).
    */
  var expiration: js.UndefOr[String] = js.native
  /**
    * The immutable ID for the SmimeInfo.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether this SmimeInfo is the default one for this user&#39;s send-as
    * address.
    */
  var isDefault: js.UndefOr[Boolean] = js.native
  /**
    * The S/MIME certificate issuer&#39;s common name.
    */
  var issuerCn: js.UndefOr[String] = js.native
  /**
    * PEM formatted X509 concatenated certificate string (standard base64
    * encoding). Format used for returning key, which includes public key as
    * well as certificate chain (not private key).
    */
  var pem: js.UndefOr[String] = js.native
  /**
    * PKCS#12 format containing a single private/public key pair and
    * certificate chain. This format is only accepted from client for creating
    * a new SmimeInfo and is never returned, because the private key is not
    * intended to be exported. PKCS#12 may be encrypted, in which case
    * encryptedKeyPassword should be set appropriately.
    */
  var pkcs12: js.UndefOr[String] = js.native
}

object SchemaSmimeInfo {
  @scala.inline
  def apply(): SchemaSmimeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSmimeInfo]
  }
  @scala.inline
  implicit class SchemaSmimeInfoOps[Self <: SchemaSmimeInfo] (val x: Self) extends AnyVal {
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

