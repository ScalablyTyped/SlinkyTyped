package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ESP extends js.Object {
  var AUD: js.Array[String]
  var BRL: js.Array[js.UndefOr[String]]
  var CAD: js.Array[js.UndefOr[String]]
  var CNY: js.Array[String]
  var ESP: js.Array[String]
  var JPY: js.Array[String]
  var MXN: js.Array[js.UndefOr[String]]
  var THB: js.Array[String]
  var USD: js.Array[js.UndefOr[String]]
  var VEF: js.Array[scala.Nothing]
  var XCD: js.Array[js.UndefOr[String]]
}

object ESP {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    BRL: js.Array[js.UndefOr[String]],
    CAD: js.Array[js.UndefOr[String]],
    CNY: js.Array[String],
    ESP: js.Array[String],
    JPY: js.Array[String],
    MXN: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    USD: js.Array[js.UndefOr[String]],
    VEF: js.Array[scala.Nothing],
    XCD: js.Array[js.UndefOr[String]]
  ): ESP = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BRL = BRL.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], ESP = ESP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VEF = VEF.asInstanceOf[js.Any], XCD = XCD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESP]
  }
  @scala.inline
  implicit class ESPOps[Self <: ESP] (val x: Self) extends AnyVal {
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
    def setAUDVarargs(value: String*): Self = this.set("AUD", js.Array(value :_*))
    @scala.inline
    def setAUD(value: js.Array[String]): Self = this.set("AUD", value.asInstanceOf[js.Any])
    @scala.inline
    def setBRLVarargs(value: js.UndefOr[String]*): Self = this.set("BRL", js.Array(value :_*))
    @scala.inline
    def setBRL(value: js.Array[js.UndefOr[String]]): Self = this.set("BRL", value.asInstanceOf[js.Any])
    @scala.inline
    def setCADVarargs(value: js.UndefOr[String]*): Self = this.set("CAD", js.Array(value :_*))
    @scala.inline
    def setCAD(value: js.Array[js.UndefOr[String]]): Self = this.set("CAD", value.asInstanceOf[js.Any])
    @scala.inline
    def setCNYVarargs(value: String*): Self = this.set("CNY", js.Array(value :_*))
    @scala.inline
    def setCNY(value: js.Array[String]): Self = this.set("CNY", value.asInstanceOf[js.Any])
    @scala.inline
    def setESPVarargs(value: String*): Self = this.set("ESP", js.Array(value :_*))
    @scala.inline
    def setESP(value: js.Array[String]): Self = this.set("ESP", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setMXNVarargs(value: js.UndefOr[String]*): Self = this.set("MXN", js.Array(value :_*))
    @scala.inline
    def setMXN(value: js.Array[js.UndefOr[String]]): Self = this.set("MXN", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: js.UndefOr[String]*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[js.UndefOr[String]]): Self = this.set("USD", value.asInstanceOf[js.Any])
    @scala.inline
    def setVEFVarargs(value: scala.Nothing*): Self = this.set("VEF", js.Array(value :_*))
    @scala.inline
    def setVEF(value: js.Array[scala.Nothing]): Self = this.set("VEF", value.asInstanceOf[js.Any])
    @scala.inline
    def setXCDVarargs(value: js.UndefOr[String]*): Self = this.set("XCD", js.Array(value :_*))
    @scala.inline
    def setXCD(value: js.Array[js.UndefOr[String]]): Self = this.set("XCD", value.asInstanceOf[js.Any])
  }
  
}

