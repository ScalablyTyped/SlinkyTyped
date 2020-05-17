package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AUDCNY extends js.Object {
  var AUD: js.Array[js.UndefOr[String]] = js.native
  var CNY: js.Array[js.UndefOr[String]] = js.native
  var GEL: js.Array[String] = js.native
  var HKD: js.Array[js.UndefOr[String]] = js.native
  var ILS: js.Array[js.UndefOr[String]] = js.native
  var INR: js.Array[js.UndefOr[String]] = js.native
  var JPY: js.Array[js.UndefOr[String]] = js.native
  var KRW: js.Array[js.UndefOr[String]] = js.native
  var NZD: js.Array[js.UndefOr[String]] = js.native
  var TWD: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
  var VND: js.Array[js.UndefOr[String]] = js.native
}

object AUDCNY {
  @scala.inline
  def apply(
    AUD: js.Array[js.UndefOr[String]],
    CNY: js.Array[js.UndefOr[String]],
    GEL: js.Array[String],
    HKD: js.Array[js.UndefOr[String]],
    ILS: js.Array[js.UndefOr[String]],
    INR: js.Array[js.UndefOr[String]],
    JPY: js.Array[js.UndefOr[String]],
    KRW: js.Array[js.UndefOr[String]],
    NZD: js.Array[js.UndefOr[String]],
    TWD: js.Array[String],
    USD: js.Array[String],
    VND: js.Array[js.UndefOr[String]]
  ): AUDCNY = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], GEL = GEL.asInstanceOf[js.Any], HKD = HKD.asInstanceOf[js.Any], ILS = ILS.asInstanceOf[js.Any], INR = INR.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VND = VND.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDCNY]
  }
  @scala.inline
  implicit class AUDCNYOps[Self <: AUDCNY] (val x: Self) extends AnyVal {
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
    def withGEL(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GEL")(value.asInstanceOf[js.Any])
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
    def withNZD(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NZD")(value.asInstanceOf[js.Any])
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
    def withVND(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VND")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

