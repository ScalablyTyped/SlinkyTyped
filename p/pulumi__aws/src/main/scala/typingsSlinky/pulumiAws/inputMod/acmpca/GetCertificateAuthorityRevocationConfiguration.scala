package typingsSlinky.pulumiAws.inputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateAuthorityRevocationConfiguration extends js.Object {
  var crlConfigurations: js.UndefOr[js.Array[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]] = js.native
}

object GetCertificateAuthorityRevocationConfiguration {
  @scala.inline
  def apply(): GetCertificateAuthorityRevocationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificateAuthorityRevocationConfiguration]
  }
  @scala.inline
  implicit class GetCertificateAuthorityRevocationConfigurationOps[Self <: GetCertificateAuthorityRevocationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrlConfigurations(value: js.Array[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crlConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrlConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crlConfigurations")(js.undefined)
        ret
    }
  }
  
}

