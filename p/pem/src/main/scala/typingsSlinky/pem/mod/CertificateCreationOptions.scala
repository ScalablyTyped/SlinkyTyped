package typingsSlinky.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateCreationOptions extends CSRCreationOptions {
  /**
    * extension config file - with '-extensions v3_req'
    */
  var config: js.UndefOr[String] = js.native
  /**
    * CSR for the certificate, if not defined a new one is generated from the provided parameters
    */
  var csr: js.UndefOr[String] = js.native
  /**
    * Certificate expire time in days, defaults to 365
    */
  var days: js.UndefOr[Double] = js.native
  /**
    * extension config file - without '-extensions v3_req'
    */
  var extFile: js.UndefOr[String] = js.native
  /**
    * If set to true and serviceKey is not defined, use clientKey for signing
    */
  var selfSigned: js.UndefOr[Boolean] = js.native
  var serial: js.UndefOr[js.Any] = js.native
  var serviceCertificate: js.UndefOr[js.Any] = js.native
  /**
    * Private key for signing the certificate, if not defined a new one is generated
    */
  var serviceKey: js.UndefOr[String] = js.native
  /**
    * Password of the service key
    */
  var serviceKeyPassword: js.UndefOr[String] = js.native
}

object CertificateCreationOptions {
  @scala.inline
  def apply(): CertificateCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateCreationOptions]
  }
  @scala.inline
  implicit class CertificateCreationOptionsOps[Self <: CertificateCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withCsr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csr")(js.undefined)
        ret
    }
    @scala.inline
    def withDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(js.undefined)
        ret
    }
    @scala.inline
    def withExtFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extFile")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfSigned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfSigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfSigned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfSigned")(js.undefined)
        ret
    }
    @scala.inline
    def withSerial(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceCertificate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceKey")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceKeyPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceKeyPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceKeyPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceKeyPassword")(js.undefined)
        ret
    }
  }
  
}

