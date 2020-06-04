package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSK extends js.Object {
  var AUD: js.Array[String]
  var CSK: js.Array[String]
  var CZK: js.Array[String]
  var ILS: js.Array[js.UndefOr[String]]
  var INR: js.Array[js.UndefOr[String]]
  var JPY: js.Array[String]
  var RON: js.Array[js.UndefOr[String]]
  var TWD: js.Array[String]
  var USD: js.Array[String]
  var VND: js.Array[js.UndefOr[String]]
  var XEU: js.Array[String]
}

object CSK {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    CSK: js.Array[String],
    CZK: js.Array[String],
    ILS: js.Array[js.UndefOr[String]],
    INR: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    TWD: js.Array[String],
    USD: js.Array[String],
    VND: js.Array[js.UndefOr[String]],
    XEU: js.Array[String]
  ): CSK = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], CSK = CSK.asInstanceOf[js.Any], CZK = CZK.asInstanceOf[js.Any], ILS = ILS.asInstanceOf[js.Any], INR = INR.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VND = VND.asInstanceOf[js.Any], XEU = XEU.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSK]
  }
  @scala.inline
  implicit class CSKOps[Self <: CSK] (val x: Self) extends AnyVal {
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
    def setCSK(value: js.Array[String]): Self = this.set("CSK", value.asInstanceOf[js.Any])
    @scala.inline
    def setCZK(value: js.Array[String]): Self = this.set("CZK", value.asInstanceOf[js.Any])
    @scala.inline
    def setILS(value: js.Array[js.UndefOr[String]]): Self = this.set("ILS", value.asInstanceOf[js.Any])
    @scala.inline
    def setINR(value: js.Array[js.UndefOr[String]]): Self = this.set("INR", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = this.set("RON", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
    @scala.inline
    def setVND(value: js.Array[js.UndefOr[String]]): Self = this.set("VND", value.asInstanceOf[js.Any])
    @scala.inline
    def setXEU(value: js.Array[String]): Self = this.set("XEU", value.asInstanceOf[js.Any])
  }
  
}

