package typingsSlinky.pkijs

import typingsSlinky.pkijs.certificateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIssuerCertificate extends js.Object {
  var issuerCertificate: js.UndefOr[default] = js.native
  var publicKeyInfo: js.UndefOr[typingsSlinky.pkijs.publicKeyInfoMod.default] = js.native
}

object AnonIssuerCertificate {
  @scala.inline
  def apply(): AnonIssuerCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIssuerCertificate]
  }
  @scala.inline
  implicit class AnonIssuerCertificateOps[Self <: AnonIssuerCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssuerCertificate(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuerCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKeyInfo(value: typingsSlinky.pkijs.publicKeyInfoMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKeyInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyInfo")(js.undefined)
        ret
    }
  }
  
}

