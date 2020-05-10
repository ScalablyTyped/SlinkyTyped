package typingsSlinky.jsrsasign

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCertsubj extends GeneralNameParam {
  var certsubj: String = js.native
}

object AnonCertsubj {
  @scala.inline
  def apply(certsubj: String): AnonCertsubj = {
    val __obj = js.Dynamic.literal(certsubj = certsubj.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCertsubj]
  }
  @scala.inline
  implicit class AnonCertsubjOps[Self <: AnonCertsubj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertsubj(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certsubj")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

