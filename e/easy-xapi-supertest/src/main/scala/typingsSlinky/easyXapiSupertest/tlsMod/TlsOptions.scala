package typingsSlinky.easyXapiSupertest.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TlsOptions extends js.Object {
  var NPNProtocols: js.UndefOr[js.Any] = js.native
    //array or Buffer;
  var SNICallback: js.UndefOr[js.Function1[/* servername */ String, _]] = js.native
  var ca: js.UndefOr[js.Any] = js.native
  var cert: js.UndefOr[js.Any] = js.native
     //string or string array
  var ciphers: js.UndefOr[String] = js.native
      //string or buffer
  var crl: js.UndefOr[js.Any] = js.native
  var honorCipherOrder: js.UndefOr[js.Any] = js.native
     //string or buffer
  var key: js.UndefOr[js.Any] = js.native
     //string or buffer
  var passphrase: js.UndefOr[String] = js.native
  var pfx: js.UndefOr[js.Any] = js.native
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  var requestCert: js.UndefOr[Boolean] = js.native
}

object TlsOptions {
  @scala.inline
  def apply(): TlsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsOptions]
  }
  @scala.inline
  implicit class TlsOptionsOps[Self <: TlsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNPNProtocols(value: js.Any): Self = {
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
    def withSNICallback(value: /* servername */ String => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNICallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSNICallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNICallback")(js.undefined)
        ret
    }
    @scala.inline
    def withCa(value: js.Any): Self = {
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
    def withCert(value: js.Any): Self = {
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
    def withCrl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crl")(js.undefined)
        ret
    }
    @scala.inline
    def withHonorCipherOrder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorCipherOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHonorCipherOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorCipherOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: js.Any): Self = {
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
    def withPfx(value: js.Any): Self = {
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
    def withRequestCert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCert")(js.undefined)
        ret
    }
  }
  
}

