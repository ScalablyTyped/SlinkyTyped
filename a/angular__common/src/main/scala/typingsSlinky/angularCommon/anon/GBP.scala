package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GBP extends js.Object {
  var AUD: js.Array[js.UndefOr[String]]
  var BAM: js.Array[String]
  var BRL: js.Array[js.UndefOr[String]]
  var CAD: js.Array[js.UndefOr[String]]
  var CNY: js.Array[js.UndefOr[String]]
  var GBP: js.Array[js.UndefOr[String]]
  var HKD: js.Array[js.UndefOr[String]]
  var HRK: js.Array[String]
  var ILS: js.Array[js.UndefOr[String]]
  var MXN: js.Array[js.UndefOr[String]]
  var NZD: js.Array[js.UndefOr[String]]
  var RSD: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[js.UndefOr[String]]
  var XCD: js.Array[js.UndefOr[String]]
  var XPF: js.Array[scala.Nothing]
}

object GBP {
  @scala.inline
  def apply(
    AUD: js.Array[js.UndefOr[String]],
    BAM: js.Array[String],
    BRL: js.Array[js.UndefOr[String]],
    CAD: js.Array[js.UndefOr[String]],
    CNY: js.Array[js.UndefOr[String]],
    GBP: js.Array[js.UndefOr[String]],
    HKD: js.Array[js.UndefOr[String]],
    HRK: js.Array[String],
    ILS: js.Array[js.UndefOr[String]],
    MXN: js.Array[js.UndefOr[String]],
    NZD: js.Array[js.UndefOr[String]],
    RSD: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[js.UndefOr[String]],
    XCD: js.Array[js.UndefOr[String]],
    XPF: js.Array[scala.Nothing]
  ): GBP = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BAM = BAM.asInstanceOf[js.Any], BRL = BRL.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], GBP = GBP.asInstanceOf[js.Any], HKD = HKD.asInstanceOf[js.Any], HRK = HRK.asInstanceOf[js.Any], ILS = ILS.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], RSD = RSD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XCD = XCD.asInstanceOf[js.Any], XPF = XPF.asInstanceOf[js.Any])
    __obj.asInstanceOf[GBP]
  }
  @scala.inline
  implicit class GBPOps[Self <: GBP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAUD(value: js.Array[js.UndefOr[String]]): Self = this.set("AUD", value.asInstanceOf[js.Any])
    @scala.inline
    def setBAM(value: js.Array[String]): Self = this.set("BAM", value.asInstanceOf[js.Any])
    @scala.inline
    def setBRL(value: js.Array[js.UndefOr[String]]): Self = this.set("BRL", value.asInstanceOf[js.Any])
    @scala.inline
    def setCAD(value: js.Array[js.UndefOr[String]]): Self = this.set("CAD", value.asInstanceOf[js.Any])
    @scala.inline
    def setCNY(value: js.Array[js.UndefOr[String]]): Self = this.set("CNY", value.asInstanceOf[js.Any])
    @scala.inline
    def setGBP(value: js.Array[js.UndefOr[String]]): Self = this.set("GBP", value.asInstanceOf[js.Any])
    @scala.inline
    def setHKD(value: js.Array[js.UndefOr[String]]): Self = this.set("HKD", value.asInstanceOf[js.Any])
    @scala.inline
    def setHRK(value: js.Array[String]): Self = this.set("HRK", value.asInstanceOf[js.Any])
    @scala.inline
    def setILS(value: js.Array[js.UndefOr[String]]): Self = this.set("ILS", value.asInstanceOf[js.Any])
    @scala.inline
    def setMXN(value: js.Array[js.UndefOr[String]]): Self = this.set("MXN", value.asInstanceOf[js.Any])
    @scala.inline
    def setNZD(value: js.Array[js.UndefOr[String]]): Self = this.set("NZD", value.asInstanceOf[js.Any])
    @scala.inline
    def setRSD(value: js.Array[String]): Self = this.set("RSD", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSD(value: js.Array[js.UndefOr[String]]): Self = this.set("USD", value.asInstanceOf[js.Any])
    @scala.inline
    def setXCD(value: js.Array[js.UndefOr[String]]): Self = this.set("XCD", value.asInstanceOf[js.Any])
    @scala.inline
    def setXPF(value: js.Array[scala.Nothing]): Self = this.set("XPF", value.asInstanceOf[js.Any])
  }
  
}

