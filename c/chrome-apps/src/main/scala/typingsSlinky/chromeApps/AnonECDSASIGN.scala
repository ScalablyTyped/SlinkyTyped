package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.ecdsaSign
import typingsSlinky.chromeApps.chromeAppsStrings.rsaSign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonECDSASIGN extends js.Object {
  var ECDSA_SIGN: ecdsaSign = js.native
  var RSA_SIGN: rsaSign = js.native
}

object AnonECDSASIGN {
  @scala.inline
  def apply(ECDSA_SIGN: ecdsaSign, RSA_SIGN: rsaSign): AnonECDSASIGN = {
    val __obj = js.Dynamic.literal(ECDSA_SIGN = ECDSA_SIGN.asInstanceOf[js.Any], RSA_SIGN = RSA_SIGN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonECDSASIGN]
  }
  @scala.inline
  implicit class AnonECDSASIGNOps[Self <: AnonECDSASIGN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withECDSA_SIGN(value: ecdsaSign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECDSA_SIGN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRSA_SIGN(value: rsaSign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RSA_SIGN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

