package typingsSlinky.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertString extends js.Object {
  var cert: String = js.native
}

object CertString {
  @scala.inline
  def apply(cert: String): CertString = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertString]
  }
  @scala.inline
  implicit class CertStringOps[Self <: CertString] (val x: Self) extends AnyVal {
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

