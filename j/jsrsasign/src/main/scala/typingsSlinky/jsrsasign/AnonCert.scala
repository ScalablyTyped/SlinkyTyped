package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCert extends js.Object {
  var cert: String = js.native
  var hasis: Boolean = js.native
}

object AnonCert {
  @scala.inline
  def apply(cert: String, hasis: Boolean): AnonCert = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], hasis = hasis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCert]
  }
  @scala.inline
  implicit class AnonCertOps[Self <: AnonCert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

