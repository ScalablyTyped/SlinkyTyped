package typingsSlinky.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFRF extends js.Object {
  var AUD: js.Array[String] = js.native
  var BRL: js.Array[js.UndefOr[String]] = js.native
  var CAD: js.Array[js.UndefOr[String]] = js.native
  var CNY: js.Array[String] = js.native
  var ESP: js.Array[String] = js.native
  var FRF: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var MXN: js.Array[js.UndefOr[String]] = js.native
  var THB: js.Array[String] = js.native
  var USD: js.Array[js.UndefOr[String]] = js.native
  var VEF: js.Array[scala.Nothing] = js.native
  var XCD: js.Array[js.UndefOr[String]] = js.native
}

object AnonFRF {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    BRL: js.Array[js.UndefOr[String]],
    CAD: js.Array[js.UndefOr[String]],
    CNY: js.Array[String],
    ESP: js.Array[String],
    FRF: js.Array[String],
    JPY: js.Array[String],
    MXN: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    USD: js.Array[js.UndefOr[String]],
    VEF: js.Array[scala.Nothing],
    XCD: js.Array[js.UndefOr[String]]
  ): AnonFRF = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BRL = BRL.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], ESP = ESP.asInstanceOf[js.Any], FRF = FRF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VEF = VEF.asInstanceOf[js.Any], XCD = XCD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFRF]
  }
  @scala.inline
  implicit class AnonFRFOps[Self <: AnonFRF] (val x: Self) extends AnyVal {
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
    def withBRL(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BRL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCAD(value: js.Array[js.UndefOr[String]]): Self = {
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
    def withESP(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ESP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRF(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMXN(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MXN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTHB(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUSD(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVEF(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VEF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXCD(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XCD")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

