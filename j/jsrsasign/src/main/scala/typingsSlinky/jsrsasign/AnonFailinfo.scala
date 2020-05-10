package typingsSlinky.jsrsasign

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFailinfo extends js.Object {
  var failinfo: js.UndefOr[NameParam | IntegerParam] = js.native
  var statstr: js.UndefOr[ArrayParam[String]] = js.native
  var status: NameParam = js.native
}

object AnonFailinfo {
  @scala.inline
  def apply(status: NameParam): AnonFailinfo = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFailinfo]
  }
  @scala.inline
  implicit class AnonFailinfoOps[Self <: AnonFailinfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: NameParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailinfo(value: NameParam | IntegerParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failinfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailinfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failinfo")(js.undefined)
        ret
    }
    @scala.inline
    def withStatstr(value: ArrayParam[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statstr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatstr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statstr")(js.undefined)
        ret
    }
  }
  
}

