package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the mechanism to obtain the Certificate Authority certificate to
  * validate the client/server certificate.
  */
@js.native
trait SchemaTlsValidationContext extends js.Object {
  /**
    * The path to the file holding the CA certificate to validate the client or
    * server certificate.
    */
  var certificatePath: js.UndefOr[String] = js.native
  /**
    * Specifies the config to retrieve certificates through SDS. This field is
    * applicable only if tlsCertificateSource is set to USE_SDS.
    */
  var sdsConfig: js.UndefOr[SchemaSdsConfig] = js.native
  /**
    * Defines how TLS certificates are obtained.
    */
  var validationSource: js.UndefOr[String] = js.native
}

object SchemaTlsValidationContext {
  @scala.inline
  def apply(): SchemaTlsValidationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsValidationContext]
  }
  @scala.inline
  implicit class SchemaTlsValidationContextOps[Self <: SchemaTlsValidationContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificatePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificatePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePath")(js.undefined)
        ret
    }
    @scala.inline
    def withSdsConfig(value: SchemaSdsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdsConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationSource")(js.undefined)
        ret
    }
  }
  
}

