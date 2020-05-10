package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateBasedAuthConfiguration extends Entity {
  // Collection of certificate authorities which creates a trusted certificate chain.
  var certificateAuthorities: js.UndefOr[js.Array[CertificateAuthority]] = js.native
}

object CertificateBasedAuthConfiguration {
  @scala.inline
  def apply(): CertificateBasedAuthConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateBasedAuthConfiguration]
  }
  @scala.inline
  implicit class CertificateBasedAuthConfigurationOps[Self <: CertificateBasedAuthConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateAuthorities(value: js.Array[CertificateAuthority]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateAuthorities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateAuthorities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateAuthorities")(js.undefined)
        ret
    }
  }
  
}

