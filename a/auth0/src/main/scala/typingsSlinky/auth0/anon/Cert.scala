package typingsSlinky.auth0.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cert extends js.Object {
  var cert: js.UndefOr[String] = js.native
  var pub: js.UndefOr[String] = js.native
  var subject: js.UndefOr[String] = js.native
}

object Cert {
  @scala.inline
  def apply(): Cert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cert]
  }
  @scala.inline
  implicit class CertOps[Self <: Cert] (val x: Self) extends AnyVal {
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
    def withoutCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(js.undefined)
        ret
    }
    @scala.inline
    def withPub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pub")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
  }
  
}

