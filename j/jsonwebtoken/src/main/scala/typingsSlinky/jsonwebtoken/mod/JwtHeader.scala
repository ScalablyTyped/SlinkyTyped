package typingsSlinky.jsonwebtoken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JwtHeader extends js.Object {
  var alg: String = js.native
  var jku: js.UndefOr[String] = js.native
  var kid: js.UndefOr[String] = js.native
  var typ: js.UndefOr[String] = js.native
  var x5t: js.UndefOr[String] = js.native
  var x5u: js.UndefOr[String] = js.native
}

object JwtHeader {
  @scala.inline
  def apply(alg: String): JwtHeader = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtHeader]
  }
  @scala.inline
  implicit class JwtHeaderOps[Self <: JwtHeader] (val x: Self) extends AnyVal {
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
    def withJku(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jku")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJku: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jku")(js.undefined)
        ret
    }
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
    def withTyp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTyp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typ")(js.undefined)
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

