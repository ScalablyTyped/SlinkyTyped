package typingsSlinky.jwkToPem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECPrivate extends JWK {
  var crv: String = js.native
  var d: String = js.native
  var kty: typingsSlinky.jwkToPem.jwkToPemStrings.EC = js.native
  var x: js.UndefOr[String] = js.native
  var y: js.UndefOr[String] = js.native
}

object ECPrivate {
  @scala.inline
  def apply(crv: String, d: String, kty: typingsSlinky.jwkToPem.jwkToPemStrings.EC): ECPrivate = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECPrivate]
  }
  @scala.inline
  implicit class ECPrivateOps[Self <: ECPrivate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKty(value: typingsSlinky.jwkToPem.jwkToPemStrings.EC): Self = {
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
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

