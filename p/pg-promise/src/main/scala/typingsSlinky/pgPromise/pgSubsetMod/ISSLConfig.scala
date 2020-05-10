package typingsSlinky.pgPromise.pgSubsetMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.tlsMod.PeerCertificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// SSL configuration;
// For property types and documentation see:
// http://nodejs.org/api/tls.html#tls_tls_connect_options_callback
@js.native
trait ISSLConfig extends js.Object {
  var NPNProtocols: js.UndefOr[
    (js.Array[Buffer | String | js.typedarray.Uint8Array]) | Buffer | js.typedarray.Uint8Array
  ] = js.native
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  var checkServerIdentity: js.UndefOr[
    js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[js.Error]]
  ] = js.native
  var key: js.UndefOr[String | Buffer | (js.Array[Buffer | js.Object])] = js.native
  var passphrase: js.UndefOr[String] = js.native
  var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | js.Object])] = js.native
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  var secureOptions: js.UndefOr[Double] = js.native
}

object ISSLConfig {
  @scala.inline
  def apply(): ISSLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISSLConfig]
  }
  @scala.inline
  implicit class ISSLConfigOps[Self <: ISSLConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNPNProtocolsUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NPNProtocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNPNProtocols(value: (js.Array[Buffer | String | js.typedarray.Uint8Array]) | Buffer | js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NPNProtocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNPNProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NPNProtocols")(js.undefined)
        ret
    }
    @scala.inline
    def withCa(value: String | Buffer | (js.Array[String | Buffer])): Self = {
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
    def withCert(value: String | Buffer | (js.Array[String | Buffer])): Self = {
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
    def withCheckServerIdentity(value: (/* host */ String, /* cert */ PeerCertificate) => js.UndefOr[js.Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkServerIdentity")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCheckServerIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkServerIdentity")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String | Buffer | (js.Array[Buffer | js.Object])): Self = {
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
    def withPfx(value: String | Buffer | (js.Array[String | Buffer | js.Object])): Self = {
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
    def withSecureOptions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureOptions")(js.undefined)
        ret
    }
  }
  
}

