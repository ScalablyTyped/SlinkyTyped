package typingsSlinky.pulumiAws.inputMod.acmpca

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthorityRevocationConfiguration extends js.Object {
  /**
    * Nested argument containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority. Defined below.
    */
  var crlConfiguration: js.UndefOr[Input[CertificateAuthorityRevocationConfigurationCrlConfiguration]] = js.native
}

object CertificateAuthorityRevocationConfiguration {
  @scala.inline
  def apply(): CertificateAuthorityRevocationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthorityRevocationConfiguration]
  }
  @scala.inline
  implicit class CertificateAuthorityRevocationConfigurationOps[Self <: CertificateAuthorityRevocationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrlConfiguration(value: Input[CertificateAuthorityRevocationConfigurationCrlConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crlConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrlConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crlConfiguration")(js.undefined)
        ret
    }
  }
  
}

