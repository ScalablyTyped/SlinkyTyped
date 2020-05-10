package typingsSlinky.apn.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderOptions extends js.Object {
  /**
    * An array of trusted certificates. Each element should contain either a filename to load, or a Buffer/String (in PEM format) to be used directly. If this is omitted several well known "root" CAs will be used. - You may need to use this as some environments don't include the CA used by Apple (entrust_2048).
    */
  var ca: js.UndefOr[js.Array[String | Buffer]] = js.native
  /**
    * The filename of the connection certificate to load from disk, or a Buffer/String containing the certificate data. (Defaults to: `cert.pem`)
    */
  var cert: js.UndefOr[String | Buffer] = js.native
  /**
    * The maximum number of connection failures that will be tolerated before `apn` will "terminate". (Defaults to: 3)
    */
  var connectionRetryLimit: js.UndefOr[Double] = js.native
  /**
    * The filename of the connection key to load from disk, or a Buffer/String containing the key data. (Defaults to: `key.pem`)
    */
  var key: js.UndefOr[String | Buffer] = js.native
  /**
    * The passphrase for the connection key, if required
    */
  var passphrase: js.UndefOr[String] = js.native
  /**
    * File path for private key, certificate and CA certs in PFX or PKCS12 format, or a Buffer containing the PFX data. If supplied will always be used instead of certificate and key above.
    */
  var pfx: js.UndefOr[String | Buffer] = js.native
  /**
    * Specifies which environment to connect to: Production (if true) or Sandbox - The hostname will be set automatically. (Defaults to NODE_ENV == "production", i.e. false unless the NODE_ENV environment variable is set accordingly)
    */
  var production: js.UndefOr[Boolean] = js.native
  /**
    * Reject Unauthorized property to be passed through to tls.connect() (Defaults to `true`)
    */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  /**
    * Configuration for Provider Authentication Tokens. (Defaults to: null i.e. fallback to Certificates)
    */
  var token: js.UndefOr[ProviderToken] = js.native
}

object ProviderOptions {
  @scala.inline
  def apply(): ProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderOptions]
  }
  @scala.inline
  implicit class ProviderOptionsOps[Self <: ProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCa(value: js.Array[String | Buffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(js.undefined)
        ret
    }
    @scala.inline
    def withCert(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionRetryLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionRetryLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassphrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(js.undefined)
        ret
    }
    @scala.inline
    def withPfx(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPfx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(js.undefined)
        ret
    }
    @scala.inline
    def withProduction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectUnauthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectUnauthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: ProviderToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

