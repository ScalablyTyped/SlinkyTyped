package typingsSlinky.jose.mod

import typingsSlinky.jose.joseStrings.EC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWKECKey
  extends ProduceKeyInput
     with KeyParameters
     with JSONWebKey {
  var crv: ECCurve = js.native
  var d: js.UndefOr[String] = js.native
  var kty: EC = js.native
  var x: String = js.native
  var y: String = js.native
}

object JWKECKey {
  @scala.inline
  def apply(crv: ECCurve, kty: EC, x: String, y: String): JWKECKey = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWKECKey]
  }
  @scala.inline
  implicit class JWKECKeyOps[Self <: JWKECKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrv(value: ECCurve): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKty(value: EC): Self = {
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
    def withY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
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

