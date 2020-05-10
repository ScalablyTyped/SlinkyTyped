package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlgCert extends js.Object {
  var alg: String = js.native
  var cert: String = js.native
}

object AnonAlgCert {
  @scala.inline
  def apply(alg: String, cert: String): AnonAlgCert = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlgCert]
  }
  @scala.inline
  implicit class AnonAlgCertOps[Self <: AnonAlgCert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

