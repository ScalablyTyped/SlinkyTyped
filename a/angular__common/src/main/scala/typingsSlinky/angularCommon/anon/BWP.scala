package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BWP extends js.Object {
  var BDT: js.Array[js.UndefOr[String]] = js.native
  var BWP: js.Array[scala.Nothing] = js.native
  var HKD: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var KRW: js.Array[js.UndefOr[String]] = js.native
  var THB: js.Array[String] = js.native
  var TWD: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
  var ZAR: js.Array[scala.Nothing] = js.native
  var ZMW: js.Array[scala.Nothing] = js.native
}

object BWP {
  @scala.inline
  def apply(
    BDT: js.Array[js.UndefOr[String]],
    BWP: js.Array[scala.Nothing],
    HKD: js.Array[String],
    JPY: js.Array[String],
    KRW: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String],
    ZAR: js.Array[scala.Nothing],
    ZMW: js.Array[scala.Nothing]
  ): BWP = {
    val __obj = js.Dynamic.literal(BDT = BDT.asInstanceOf[js.Any], BWP = BWP.asInstanceOf[js.Any], HKD = HKD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], ZAR = ZAR.asInstanceOf[js.Any], ZMW = ZMW.asInstanceOf[js.Any])
    __obj.asInstanceOf[BWP]
  }
  @scala.inline
  implicit class BWPOps[Self <: BWP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBDT(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BDT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBWP(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BWP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHKD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HKD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKRW(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KRW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTHB(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTWD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TWD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUSD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZAR(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZAR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZMW(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZMW")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

