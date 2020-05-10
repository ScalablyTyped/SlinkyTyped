package typingsSlinky.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCADFJD extends js.Object {
  var AUD: js.Array[String] = js.native
  var CAD: js.Array[String] = js.native
  var FJD: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var SBD: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var TWD: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
  var XPF: js.Array[scala.Nothing] = js.native
}

object AnonCADFJD {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    CAD: js.Array[String],
    FJD: js.Array[String],
    JPY: js.Array[String],
    SBD: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String],
    XPF: js.Array[scala.Nothing]
  ): AnonCADFJD = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], FJD = FJD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], SBD = SBD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XPF = XPF.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCADFJD]
  }
  @scala.inline
  implicit class AnonCADFJDOps[Self <: AnonCADFJD] (val x: Self) extends AnyVal {
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
    def withCAD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CAD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFJD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FJD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSBD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SBD")(value.asInstanceOf[js.Any])
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
    def withXPF(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XPF")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

