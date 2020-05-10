package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The TLS settings for the client or server.
  */
@js.native
trait SchemaTlsContext extends js.Object {
  /**
    * Defines the mechanism to obtain the client or server certificate.
    */
  var certificateContext: js.UndefOr[SchemaTlsCertificateContext] = js.native
  /**
    * Defines the mechanism to obtain the Certificate Authority certificate to
    * validate the client/server certificate. If omitted, the proxy will not
    * validate the server or client certificate.
    */
  var validationContext: js.UndefOr[SchemaTlsValidationContext] = js.native
}

object SchemaTlsContext {
  @scala.inline
  def apply(): SchemaTlsContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsContext]
  }
  @scala.inline
  implicit class SchemaTlsContextOps[Self <: SchemaTlsContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateContext(value: SchemaTlsCertificateContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateContext")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationContext(value: SchemaTlsValidationContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationContext")(js.undefined)
        ret
    }
  }
  
}

