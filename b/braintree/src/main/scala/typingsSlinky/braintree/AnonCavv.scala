package typingsSlinky.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCavv extends js.Object {
  var cavv: js.UndefOr[String] = js.native
  var eciFlag: String = js.native
  var threeDSecureVision: js.UndefOr[String] = js.native
  var xid: js.UndefOr[String] = js.native
}

object AnonCavv {
  @scala.inline
  def apply(eciFlag: String): AnonCavv = {
    val __obj = js.Dynamic.literal(eciFlag = eciFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCavv]
  }
  @scala.inline
  implicit class AnonCavvOps[Self <: AnonCavv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEciFlag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eciFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCavv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cavv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCavv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cavv")(js.undefined)
        ret
    }
    @scala.inline
    def withThreeDSecureVision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threeDSecureVision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreeDSecureVision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threeDSecureVision")(js.undefined)
        ret
    }
    @scala.inline
    def withXid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xid")(js.undefined)
        ret
    }
  }
  
}

