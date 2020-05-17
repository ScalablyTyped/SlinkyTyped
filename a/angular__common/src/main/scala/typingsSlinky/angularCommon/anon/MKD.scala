package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MKD extends js.Object {
  var AUD: js.Array[js.UndefOr[String]] = js.native
  var CNY: js.Array[js.UndefOr[String]] = js.native
  var GBP: js.Array[js.UndefOr[String]] = js.native
  var HKD: js.Array[js.UndefOr[String]] = js.native
  var ILS: js.Array[js.UndefOr[String]] = js.native
  var INR: js.Array[js.UndefOr[String]] = js.native
  var JPY: js.Array[js.UndefOr[String]] = js.native
  var KRW: js.Array[js.UndefOr[String]] = js.native
  var MKD: js.Array[String] = js.native
  var NZD: js.Array[js.UndefOr[String]] = js.native
  var TWD: js.Array[js.UndefOr[String]] = js.native
  var USD: js.Array[String] = js.native
  var VND: js.Array[js.UndefOr[String]] = js.native
}

object MKD {
  @scala.inline
  def apply(
    AUD: js.Array[js.UndefOr[String]],
    CNY: js.Array[js.UndefOr[String]],
    GBP: js.Array[js.UndefOr[String]],
    HKD: js.Array[js.UndefOr[String]],
    ILS: js.Array[js.UndefOr[String]],
    INR: js.Array[js.UndefOr[String]],
    JPY: js.Array[js.UndefOr[String]],
    KRW: js.Array[js.UndefOr[String]],
    MKD: js.Array[String],
    NZD: js.Array[js.UndefOr[String]],
    TWD: js.Array[js.UndefOr[String]],
    USD: js.Array[String],
    VND: js.Array[js.UndefOr[String]]
  ): MKD = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], GBP = GBP.asInstanceOf[js.Any], HKD = HKD.asInstanceOf[js.Any], ILS = ILS.asInstanceOf[js.Any], INR = INR.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], MKD = MKD.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VND = VND.asInstanceOf[js.Any])
    __obj.asInstanceOf[MKD]
  }
  @scala.inline
  implicit class MKDOps[Self <: MKD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAUD(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCNY(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CNY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGBP(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GBP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHKD(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HKD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withILS(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ILS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINR(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJPY(value: js.Array[js.UndefOr[String]]): Self = {
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
    def withMKD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MKD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNZD(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NZD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTWD(value: js.Array[js.UndefOr[String]]): Self = {
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
    def withVND(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VND")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

