package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BWP extends js.Object {
  var BDT: js.Array[js.UndefOr[String]]
  var BWP: js.Array[scala.Nothing]
  var HKD: js.Array[String]
  var JPY: js.Array[String]
  var KRW: js.Array[js.UndefOr[String]]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[String]
  var ZAR: js.Array[scala.Nothing]
  var ZMW: js.Array[scala.Nothing]
}

object BWP {
  @scala.inline
  def apply(
    BDT: js.Array[js.UndefOr[String]],
    BWP: js.Array[scala.Nothing],
    HKD: js.Array[String],
    JPY: js.Array[String],
    KRW: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String],
    ZAR: js.Array[scala.Nothing],
    ZMW: js.Array[scala.Nothing]
  ): BWP = {
    val __obj = js.Dynamic.literal(BDT = BDT.asInstanceOf[js.Any], BWP = BWP.asInstanceOf[js.Any], HKD = HKD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], ZAR = ZAR.asInstanceOf[js.Any], ZMW = ZMW.asInstanceOf[js.Any])
    __obj.asInstanceOf[BWP]
  }
  @scala.inline
  implicit class BWPOps[Self <: BWP] (val x: Self) extends AnyVal {
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
    def setBDT(value: js.Array[js.UndefOr[String]]): Self = this.set("BDT", value.asInstanceOf[js.Any])
    @scala.inline
    def setBWP(value: js.Array[scala.Nothing]): Self = this.set("BWP", value.asInstanceOf[js.Any])
    @scala.inline
    def setHKD(value: js.Array[String]): Self = this.set("HKD", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setKRW(value: js.Array[js.UndefOr[String]]): Self = this.set("KRW", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
    @scala.inline
    def setZAR(value: js.Array[scala.Nothing]): Self = this.set("ZAR", value.asInstanceOf[js.Any])
    @scala.inline
    def setZMW(value: js.Array[scala.Nothing]): Self = this.set("ZMW", value.asInstanceOf[js.Any])
  }
  
}

