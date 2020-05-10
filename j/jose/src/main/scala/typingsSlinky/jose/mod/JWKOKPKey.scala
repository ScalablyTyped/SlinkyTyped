package typingsSlinky.jose.mod

import typingsSlinky.jose.joseStrings.OKP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWKOKPKey
  extends KeyParameters
     with JSONWebKey
     with _ProduceKeyInput {
  var crv: OKPCurve = js.native
  var d: js.UndefOr[String] = js.native
  var kty: OKP = js.native
  var x: String = js.native
}

object JWKOKPKey {
  @scala.inline
  def apply(crv: OKPCurve, kty: OKP, x: String): JWKOKPKey = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWKOKPKey]
  }
  @scala.inline
  implicit class JWKOKPKeyOps[Self <: JWKOKPKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrv(value: OKPCurve): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKty(value: OKP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(js.undefined)
        ret
    }
  }
  
}

