package typingsSlinky.mongodb.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.tlsMod.PeerCertificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSLOptions extends js.Object {
  /**
    * Default: true; Server identity checking during SSL
    */
  var checkServerIdentity: js.UndefOr[
    Boolean | (js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[js.Error]])
  ] = js.native
  /**
    * Passed directly through to tls.createSecureContext. See https://nodejs.org/dist/latest-v9.x/docs/api/tls.html#tls_tls_createsecurecontext_options for more info.
    */
  var ciphers: js.UndefOr[String] = js.native
  /**
    * Passed directly through to tls.createSecureContext. See https://nodejs.org/dist/latest-v9.x/docs/api/tls.html#tls_tls_createsecurecontext_options for more info.
    */
  var ecdhCurve: js.UndefOr[String] = js.native
  /**
    * If present, the connection pool will be initialized with minSize connections, and will never dip below minSize connections
    */
  var minSize: js.UndefOr[scala.Double] = js.native
  /**
    * Default:5; Number of connections for each server instance; set to 5 as default for legacy reasons.
    */
  var poolSize: js.UndefOr[scala.Double] = js.native
  /**
    * String containing the server name requested via TLS SNI.
    */
  var servername: js.UndefOr[String] = js.native
  /**
    * Use ssl connection (needs to have a mongod server with ssl support)
    */
  var ssl: js.UndefOr[Boolean] = js.native
  /**
    * Array of valid certificates either as Buffers or Strings
    */
  var sslCA: js.UndefOr[js.Array[Buffer | String]] = js.native
  /**
    * SSL Certificate revocation list binary buffer
    */
  var sslCRL: js.UndefOr[js.Array[Buffer | String]] = js.native
  /**
    * SSL Certificate binary buffer
    */
  var sslCert: js.UndefOr[Buffer | String] = js.native
  /**
    * SSL Key file binary buffer
    */
  var sslKey: js.UndefOr[Buffer | String] = js.native
  /**
    * SSL Certificate pass phrase
    */
  var sslPass: js.UndefOr[Buffer | String] = js.native
  /**
    * Default: true; Validate mongod server certificate against ca (mongod server >=2.4 with ssl support required)
    */
  var sslValidate: js.UndefOr[Boolean] = js.native
}

object SSLOptions {
  @scala.inline
  def apply(): SSLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSLOptions]
  }
  @scala.inline
  implicit class SSLOptionsOps[Self <: SSLOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckServerIdentityFunction2(value: (/* host */ String, /* cert */ PeerCertificate) => js.UndefOr[js.Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkServerIdentity")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCheckServerIdentity(
      value: Boolean | (js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[js.Error]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkServerIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckServerIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkServerIdentity")(js.undefined)
        ret
    }
    @scala.inline
    def withCiphers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCiphers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphers")(js.undefined)
        ret
    }
    @scala.inline
    def withEcdhCurve(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecdhCurve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcdhCurve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecdhCurve")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolSize(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolSize")(js.undefined)
        ret
    }
    @scala.inline
    def withServername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servername")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(js.undefined)
        ret
    }
    @scala.inline
    def withSslCA(value: js.Array[Buffer | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslCA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCA")(js.undefined)
        ret
    }
    @scala.inline
    def withSslCRL(value: js.Array[Buffer | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCRL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslCRL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCRL")(js.undefined)
        ret
    }
    @scala.inline
    def withSslCert(value: Buffer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCert")(js.undefined)
        ret
    }
    @scala.inline
    def withSslKey(value: Buffer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSslPass(value: Buffer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslPass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslPass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslPass")(js.undefined)
        ret
    }
    @scala.inline
    def withSslValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslValidate")(js.undefined)
        ret
    }
  }
  
}

