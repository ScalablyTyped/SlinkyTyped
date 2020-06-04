package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NOK extends js.Object {
  var BRL: js.Array[js.UndefOr[String]]
  var BYN: js.Array[js.UndefOr[String]]
  var EGP: js.Array[js.UndefOr[String]]
  var HKD: js.Array[js.UndefOr[String]]
  var JPY: js.Array[js.UndefOr[String]]
  var KRW: js.Array[js.UndefOr[String]]
  var MXN: js.Array[js.UndefOr[String]]
  var NOK: js.Array[js.UndefOr[String]]
  var THB: js.Array[String]
  var TWD: js.Array[js.UndefOr[String]]
  var USD: js.Array[js.UndefOr[String]]
}

object NOK {
  @scala.inline
  def apply(
    BRL: js.Array[js.UndefOr[String]],
    BYN: js.Array[js.UndefOr[String]],
    EGP: js.Array[js.UndefOr[String]],
    HKD: js.Array[js.UndefOr[String]],
    JPY: js.Array[js.UndefOr[String]],
    KRW: js.Array[js.UndefOr[String]],
    MXN: js.Array[js.UndefOr[String]],
    NOK: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[js.UndefOr[String]],
    USD: js.Array[js.UndefOr[String]]
  ): NOK = {
    val __obj = js.Dynamic.literal(BRL = BRL.asInstanceOf[js.Any], BYN = BYN.asInstanceOf[js.Any], EGP = EGP.asInstanceOf[js.Any], HKD = HKD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], NOK = NOK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[NOK]
  }
  @scala.inline
  implicit class NOKOps[Self <: NOK] (val x: Self) extends AnyVal {
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
    def setBRL(value: js.Array[js.UndefOr[String]]): Self = this.set("BRL", value.asInstanceOf[js.Any])
    @scala.inline
    def setBYN(value: js.Array[js.UndefOr[String]]): Self = this.set("BYN", value.asInstanceOf[js.Any])
    @scala.inline
    def setEGP(value: js.Array[js.UndefOr[String]]): Self = this.set("EGP", value.asInstanceOf[js.Any])
    @scala.inline
    def setHKD(value: js.Array[js.UndefOr[String]]): Self = this.set("HKD", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPY(value: js.Array[js.UndefOr[String]]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setKRW(value: js.Array[js.UndefOr[String]]): Self = this.set("KRW", value.asInstanceOf[js.Any])
    @scala.inline
    def setMXN(value: js.Array[js.UndefOr[String]]): Self = this.set("MXN", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOK(value: js.Array[js.UndefOr[String]]): Self = this.set("NOK", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWD(value: js.Array[js.UndefOr[String]]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSD(value: js.Array[js.UndefOr[String]]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

