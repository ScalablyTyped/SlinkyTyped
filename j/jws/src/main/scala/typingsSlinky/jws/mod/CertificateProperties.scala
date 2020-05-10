package typingsSlinky.jws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateProperties extends PrivateProperties {
  var kid: js.UndefOr[String] = js.native
  var x5c: js.UndefOr[js.Array[String]] = js.native
  var x5t: js.UndefOr[String] = js.native
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.native
  var x5u: js.UndefOr[String] = js.native
}

object CertificateProperties {
  @scala.inline
  def apply(): CertificateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateProperties]
  }
  @scala.inline
  implicit class CertificatePropertiesOps[Self <: CertificateProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kid")(js.undefined)
        ret
    }
    @scala.inline
    def withX5c(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX5c: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5c")(js.undefined)
        ret
    }
    @scala.inline
    def withX5t(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX5t: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5t")(js.undefined)
        ret
    }
    @scala.inline
    def withX5tNumbersignS256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5t#S256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX5tNumbersignS256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5t#S256")(js.undefined)
        ret
    }
    @scala.inline
    def withX5u(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5u")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX5u: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5u")(js.undefined)
        ret
    }
  }
  
}

