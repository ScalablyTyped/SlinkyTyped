package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AFN extends js.Object {
  var AFN: js.Array[String] = js.native
  var CAD: js.Array[String] = js.native
  var CNY: js.Array[String] = js.native
  var HKD: js.Array[String] = js.native
  var IRR: js.Array[String] = js.native
  var MXN: js.Array[String] = js.native
  var NZD: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var XCD: js.Array[String] = js.native
}

object AFN {
  @scala.inline
  def apply(
    AFN: js.Array[String],
    CAD: js.Array[String],
    CNY: js.Array[String],
    HKD: js.Array[String],
    IRR: js.Array[String],
    MXN: js.Array[String],
    NZD: js.Array[String],
    THB: js.Array[String],
    XCD: js.Array[String]
  ): AFN = {
    val __obj = js.Dynamic.literal(AFN = AFN.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], HKD = HKD.asInstanceOf[js.Any], IRR = IRR.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], XCD = XCD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AFN]
  }
  @scala.inline
  implicit class AFNOps[Self <: AFN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAFN(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AFN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCAD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CAD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCNY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CNY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHKD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HKD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIRR(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IRR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMXN(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MXN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNZD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NZD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTHB(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXCD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XCD")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

