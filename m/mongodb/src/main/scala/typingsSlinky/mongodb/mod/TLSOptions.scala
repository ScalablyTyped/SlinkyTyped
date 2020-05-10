package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TLSOptions extends js.Object {
  /**
    * Enable TLS connections
    * @default false
    */
  var tls: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether or not the driver should error when the server’s TLS certificate is invalid
    */
  var tlsAllowInvalidCertificates: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether or not the driver should error when there is a mismatch between the server’s hostname
    * and the hostname specified by the TLS certificate
    */
  var tlsAllowInvalidHostnames: js.UndefOr[Boolean] = js.native
  /**
    * path to file with either a single or bundle of certificate authorities
    * to be considered trusted when making a TLS connection
    */
  var tlsCAFile: js.UndefOr[String] = js.native
  /**
    * path to the client certificate file or the client private key file;
    * in the case that they both are needed, the files should be concatenated
    */
  var tlsCertificateKeyFile: js.UndefOr[String] = js.native
  /**
    * The password to decrypt the client private key to be used for TLS connections
    */
  var tlsCertificateKeyFilePassword: js.UndefOr[String] = js.native
  /**
    * Relax TLS constraints, disabling validation
    * @default false
    */
  var tlsInsecure: js.UndefOr[Boolean] = js.native
}

object TLSOptions {
  @scala.inline
  def apply(): TLSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TLSOptions]
  }
  @scala.inline
  implicit class TLSOptionsOps[Self <: TLSOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(js.undefined)
        ret
    }
    @scala.inline
    def withTlsAllowInvalidCertificates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsAllowInvalidCertificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsAllowInvalidCertificates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsAllowInvalidCertificates")(js.undefined)
        ret
    }
    @scala.inline
    def withTlsAllowInvalidHostnames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsAllowInvalidHostnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsAllowInvalidHostnames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsAllowInvalidHostnames")(js.undefined)
        ret
    }
    @scala.inline
    def withTlsCAFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsCAFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsCAFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsCAFile")(js.undefined)
        ret
    }
    @scala.inline
    def withTlsCertificateKeyFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsCertificateKeyFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsCertificateKeyFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsCertificateKeyFile")(js.undefined)
        ret
    }
    @scala.inline
    def withTlsCertificateKeyFilePassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsCertificateKeyFilePassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsCertificateKeyFilePassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsCertificateKeyFilePassword")(js.undefined)
        ret
    }
    @scala.inline
    def withTlsInsecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsInsecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsInsecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsInsecure")(js.undefined)
        ret
    }
  }
  
}

