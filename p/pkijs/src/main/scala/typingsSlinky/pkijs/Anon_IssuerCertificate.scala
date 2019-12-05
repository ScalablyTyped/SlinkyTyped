package typingsSlinky.pkijs

import typingsSlinky.pkijs.srcCertificateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IssuerCertificate extends js.Object {
  var issuerCertificate: js.UndefOr[default] = js.undefined
  var publicKeyInfo: js.UndefOr[typingsSlinky.pkijs.srcPublicKeyInfoMod.default] = js.undefined
}

object Anon_IssuerCertificate {
  @scala.inline
  def apply(
    issuerCertificate: default = null,
    publicKeyInfo: typingsSlinky.pkijs.srcPublicKeyInfoMod.default = null
  ): Anon_IssuerCertificate = {
    val __obj = js.Dynamic.literal()
    if (issuerCertificate != null) __obj.updateDynamic("issuerCertificate")(issuerCertificate.asInstanceOf[js.Any])
    if (publicKeyInfo != null) __obj.updateDynamic("publicKeyInfo")(publicKeyInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IssuerCertificate]
  }
}

