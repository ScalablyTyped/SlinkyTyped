package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CAD extends js.Object {
  var AUD: js.Array[String]
  var BRL: js.Array[js.UndefOr[String]]
  var CAD: js.Array[String]
  var CNY: js.Array[js.UndefOr[String]]
  var EGP: js.Array[js.UndefOr[String]]
  var GBP: js.Array[String]
  var HKD: js.Array[String]
  var ILS: js.Array[js.UndefOr[String]]
  var JPY: js.Array[js.UndefOr[String]]
  var KRW: js.Array[js.UndefOr[String]]
  var LBP: js.Array[js.UndefOr[String]]
  var NZD: js.Array[String]
  var TOP: js.Array[js.UndefOr[String]]
  var TWD: js.Array[js.UndefOr[String]]
  var USD: js.Array[String]
  var VND: js.Array[js.UndefOr[String]]
  var XCD: js.Array[js.UndefOr[String]]
}

object CAD {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    BRL: js.Array[js.UndefOr[String]],
    CAD: js.Array[String],
    CNY: js.Array[js.UndefOr[String]],
    EGP: js.Array[js.UndefOr[String]],
    GBP: js.Array[String],
    HKD: js.Array[String],
    ILS: js.Array[js.UndefOr[String]],
    JPY: js.Array[js.UndefOr[String]],
    KRW: js.Array[js.UndefOr[String]],
    LBP: js.Array[js.UndefOr[String]],
    NZD: js.Array[String],
    TOP: js.Array[js.UndefOr[String]],
    TWD: js.Array[js.UndefOr[String]],
    USD: js.Array[String],
    VND: js.Array[js.UndefOr[String]],
    XCD: js.Array[js.UndefOr[String]]
  ): CAD = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BRL = BRL.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], EGP = EGP.asInstanceOf[js.Any], GBP = GBP.asInstanceOf[js.Any], HKD = HKD.asInstanceOf[js.Any], ILS = ILS.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], LBP = LBP.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VND = VND.asInstanceOf[js.Any], XCD = XCD.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAD]
  }
  @scala.inline
  implicit class CADOps[Self <: CAD] (val x: Self) extends AnyVal {
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
    def setAUD(value: js.Array[String]): Self = this.set("AUD", value.asInstanceOf[js.Any])
    @scala.inline
    def setBRL(value: js.Array[js.UndefOr[String]]): Self = this.set("BRL", value.asInstanceOf[js.Any])
    @scala.inline
    def setCAD(value: js.Array[String]): Self = this.set("CAD", value.asInstanceOf[js.Any])
    @scala.inline
    def setCNY(value: js.Array[js.UndefOr[String]]): Self = this.set("CNY", value.asInstanceOf[js.Any])
    @scala.inline
    def setEGP(value: js.Array[js.UndefOr[String]]): Self = this.set("EGP", value.asInstanceOf[js.Any])
    @scala.inline
    def setGBP(value: js.Array[String]): Self = this.set("GBP", value.asInstanceOf[js.Any])
    @scala.inline
    def setHKD(value: js.Array[String]): Self = this.set("HKD", value.asInstanceOf[js.Any])
    @scala.inline
    def setILS(value: js.Array[js.UndefOr[String]]): Self = this.set("ILS", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPY(value: js.Array[js.UndefOr[String]]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setKRW(value: js.Array[js.UndefOr[String]]): Self = this.set("KRW", value.asInstanceOf[js.Any])
    @scala.inline
    def setLBP(value: js.Array[js.UndefOr[String]]): Self = this.set("LBP", value.asInstanceOf[js.Any])
    @scala.inline
    def setNZD(value: js.Array[String]): Self = this.set("NZD", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOP(value: js.Array[js.UndefOr[String]]): Self = this.set("TOP", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWD(value: js.Array[js.UndefOr[String]]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
    @scala.inline
    def setVND(value: js.Array[js.UndefOr[String]]): Self = this.set("VND", value.asInstanceOf[js.Any])
    @scala.inline
    def setXCD(value: js.Array[js.UndefOr[String]]): Self = this.set("XCD", value.asInstanceOf[js.Any])
  }
  
}

