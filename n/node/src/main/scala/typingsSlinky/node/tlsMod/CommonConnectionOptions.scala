package typingsSlinky.node.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonConnectionOptions extends js.Object {
  /**
    * An array of strings or a Buffer naming possible ALPN protocols.
    * (Protocols should be ordered by their priority.)
    */
  var ALPNProtocols: js.UndefOr[(js.Array[String | js.typedarray.Uint8Array]) | js.typedarray.Uint8Array] = js.native
  /**
    * SNICallback(servername, cb) <Function> A function that will be
    * called if the client supports SNI TLS extension. Two arguments
    * will be passed when called: servername and cb. SNICallback should
    * invoke cb(null, ctx), where ctx is a SecureContext instance.
    * (tls.createSecureContext(...) can be used to get a proper
    * SecureContext.) If SNICallback wasn't provided the default callback
    * with high-level API will be used (see below).
    */
  var SNICallback: js.UndefOr[
    js.Function2[
      /* servername */ String, 
      /* cb */ js.Function2[/* err */ js.Error | Null, /* ctx */ SecureContext, Unit], 
      Unit
    ]
  ] = js.native
  /**
    * When enabled, TLS packet trace information is written to `stderr`. This can be
    * used to debug TLS connection problems.
    * @default false
    */
  var enableTrace: js.UndefOr[Boolean] = js.native
  /**
    * If true the server will reject any connection which is not
    * authorized with the list of supplied CAs. This option only has an
    * effect if requestCert is true.
    * @default true
    */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  /**
    * If true the server will request a certificate from clients that
    * connect and attempt to verify that certificate. Defaults to
    * false.
    */
  var requestCert: js.UndefOr[Boolean] = js.native
  /**
    * An optional TLS context object from tls.createSecureContext()
    */
  var secureContext: js.UndefOr[SecureContext] = js.native
}

object CommonConnectionOptions {
  @scala.inline
  def apply(): CommonConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonConnectionOptions]
  }
  @scala.inline
  implicit class CommonConnectionOptionsOps[Self <: CommonConnectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withALPNProtocolsUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALPNProtocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withALPNProtocols(value: (js.Array[String | js.typedarray.Uint8Array]) | js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALPNProtocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutALPNProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALPNProtocols")(js.undefined)
        ret
    }
    @scala.inline
    def withSNICallback(
      value: (/* servername */ String, /* cb */ js.Function2[/* err */ js.Error | Null, /* ctx */ SecureContext, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNICallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSNICallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNICallback")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTrace")(js.undefined)
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
    @scala.inline
    def withSecureContext(value: SecureContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureContext")(js.undefined)
        ret
    }
  }
  
}

