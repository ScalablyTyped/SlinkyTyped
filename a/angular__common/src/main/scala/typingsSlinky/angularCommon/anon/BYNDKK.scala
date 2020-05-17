package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BYNDKK extends js.Object {
  var BYN: js.Array[js.UndefOr[String]] = js.native
  var DKK: js.Array[js.UndefOr[String]] = js.native
  var HRK: js.Array[js.UndefOr[String]] = js.native
  var ISK: js.Array[js.UndefOr[String]] = js.native
  var JPY: js.Array[String] = js.native
  var NOK: js.Array[js.UndefOr[String]] = js.native
  var PLN: js.Array[js.UndefOr[String]] = js.native
  var SEK: js.Array[js.UndefOr[String]] = js.native
  var THB: js.Array[String] = js.native
  var TWD: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
  var ZAR: js.Array[String] = js.native
}

object BYNDKK {
  @scala.inline
  def apply(
    BYN: js.Array[js.UndefOr[String]],
    DKK: js.Array[js.UndefOr[String]],
    HRK: js.Array[js.UndefOr[String]],
    ISK: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    NOK: js.Array[js.UndefOr[String]],
    PLN: js.Array[js.UndefOr[String]],
    SEK: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String],
    ZAR: js.Array[String]
  ): BYNDKK = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], DKK = DKK.asInstanceOf[js.Any], HRK = HRK.asInstanceOf[js.Any], ISK = ISK.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], NOK = NOK.asInstanceOf[js.Any], PLN = PLN.asInstanceOf[js.Any], SEK = SEK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], ZAR = ZAR.asInstanceOf[js.Any])
    __obj.asInstanceOf[BYNDKK]
  }
  @scala.inline
  implicit class BYNDKKOps[Self <: BYNDKK] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBYN(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BYN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDKK(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DKK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHRK(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HRK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withISK(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOK(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPLN(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PLN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSEK(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SEK")(value.asInstanceOf[js.Any])
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
    def withZAR(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZAR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

