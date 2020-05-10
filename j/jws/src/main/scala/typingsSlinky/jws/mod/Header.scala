package typingsSlinky.jws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Header extends CertificateProperties {
  var alg: Algorithm = js.native
  var crit: js.UndefOr[js.Array[String]] = js.native
  var cty: js.UndefOr[String] = js.native
  var jwk: js.UndefOr[JWK] = js.native
  var typ: js.UndefOr[String] = js.native
}

object Header {
  @scala.inline
  def apply(alg: Algorithm): Header = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  @scala.inline
  implicit class HeaderOps[Self <: Header] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlg(value: Algorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrit(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crit")(js.undefined)
        ret
    }
    @scala.inline
    def withCty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cty")(js.undefined)
        ret
    }
    @scala.inline
    def withJwk(value: JWK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJwk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwk")(js.undefined)
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
  }
  
}

