package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BTN extends js.Object {
  var AUD: js.Array[String] = js.native
  var BTN: js.Array[String] = js.native
  var ILS: js.Array[js.UndefOr[String]] = js.native
  var JPY: js.Array[String] = js.native
  var KRW: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
  var XAF: js.Array[scala.Nothing] = js.native
}

object BTN {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    BTN: js.Array[String],
    ILS: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    KRW: js.Array[String],
    THB: js.Array[String],
    USD: js.Array[String],
    XAF: js.Array[scala.Nothing]
  ): BTN = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BTN = BTN.asInstanceOf[js.Any], ILS = ILS.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XAF = XAF.asInstanceOf[js.Any])
    __obj.asInstanceOf[BTN]
  }
  @scala.inline
  implicit class BTNOps[Self <: BTN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAUD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBTN(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BTN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withILS(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ILS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKRW(value: js.Array[String]): Self = {
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
    def withUSD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXAF(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XAF")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

