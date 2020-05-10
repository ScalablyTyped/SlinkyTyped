package typingsSlinky.jsrsasign

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCritical extends js.Object {
  var critical: js.UndefOr[Boolean] = js.native
  var issuer: StringParam = js.native
  var kid: HexParam = js.native
  var sn: HexParam = js.native
}

object AnonCritical {
  @scala.inline
  def apply(issuer: StringParam, kid: HexParam, sn: HexParam): AnonCritical = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any], sn = sn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCritical]
  }
  @scala.inline
  implicit class AnonCriticalOps[Self <: AnonCritical] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssuer(value: StringParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKid(value: HexParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSn(value: HexParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCritical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("critical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCritical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("critical")(js.undefined)
        ret
    }
  }
  
}

