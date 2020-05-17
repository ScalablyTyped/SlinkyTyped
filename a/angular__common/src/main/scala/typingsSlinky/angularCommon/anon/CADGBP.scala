package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CADGBP extends js.Object {
  var AUD: js.Array[js.UndefOr[String]] = js.native
  var BRL: js.Array[js.UndefOr[String]] = js.native
  var CAD: js.Array[js.UndefOr[String]] = js.native
  var GBP: js.Array[js.UndefOr[String]] = js.native
  var MXN: js.Array[js.UndefOr[String]] = js.native
  var NZD: js.Array[js.UndefOr[String]] = js.native
  var TWD: js.Array[js.UndefOr[String]] = js.native
  var XCD: js.Array[js.UndefOr[String]] = js.native
}

object CADGBP {
  @scala.inline
  def apply(
    AUD: js.Array[js.UndefOr[String]],
    BRL: js.Array[js.UndefOr[String]],
    CAD: js.Array[js.UndefOr[String]],
    GBP: js.Array[js.UndefOr[String]],
    MXN: js.Array[js.UndefOr[String]],
    NZD: js.Array[js.UndefOr[String]],
    TWD: js.Array[js.UndefOr[String]],
    XCD: js.Array[js.UndefOr[String]]
  ): CADGBP = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BRL = BRL.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], GBP = GBP.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], XCD = XCD.asInstanceOf[js.Any])
    __obj.asInstanceOf[CADGBP]
  }
  @scala.inline
  implicit class CADGBPOps[Self <: CADGBP] (val x: Self) extends AnyVal {
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
    def withGBP(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GBP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMXN(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MXN")(value.asInstanceOf[js.Any])
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
    def withXCD(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XCD")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

