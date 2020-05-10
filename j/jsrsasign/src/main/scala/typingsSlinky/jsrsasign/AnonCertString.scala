package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCertString extends js.Object {
  var cert: String = js.native
}

object AnonCertString {
  @scala.inline
  def apply(cert: String): AnonCertString = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCertString]
  }
  @scala.inline
  implicit class AnonCertStringOps[Self <: AnonCertString] (val x: Self) extends AnyVal {
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
  }
  
}

