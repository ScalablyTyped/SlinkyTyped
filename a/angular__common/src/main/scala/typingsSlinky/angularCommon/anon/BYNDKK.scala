package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BYNDKK extends js.Object {
  var BYN: js.Array[js.UndefOr[String]]
  var DKK: js.Array[js.UndefOr[String]]
  var HRK: js.Array[js.UndefOr[String]]
  var ISK: js.Array[js.UndefOr[String]]
  var JPY: js.Array[String]
  var NOK: js.Array[js.UndefOr[String]]
  var PLN: js.Array[js.UndefOr[String]]
  var SEK: js.Array[js.UndefOr[String]]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[String]
  var ZAR: js.Array[String]
}

object BYNDKK {
  @scala.inline
  def apply(
    BYN: js.Array[js.UndefOr[String]],
    DKK: js.Array[js.UndefOr[String]],
    HRK: js.Array[js.UndefOr[String]],
    ISK: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    NOK: js.Array[js.UndefOr[String]],
    PLN: js.Array[js.UndefOr[String]],
    SEK: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String],
    ZAR: js.Array[String]
  ): BYNDKK = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], DKK = DKK.asInstanceOf[js.Any], HRK = HRK.asInstanceOf[js.Any], ISK = ISK.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], NOK = NOK.asInstanceOf[js.Any], PLN = PLN.asInstanceOf[js.Any], SEK = SEK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], ZAR = ZAR.asInstanceOf[js.Any])
    __obj.asInstanceOf[BYNDKK]
  }
  @scala.inline
  implicit class BYNDKKOps[Self <: BYNDKK] (val x: Self) extends AnyVal {
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
    def setBYN(value: js.Array[js.UndefOr[String]]): Self = this.set("BYN", value.asInstanceOf[js.Any])
    @scala.inline
    def setDKK(value: js.Array[js.UndefOr[String]]): Self = this.set("DKK", value.asInstanceOf[js.Any])
    @scala.inline
    def setHRK(value: js.Array[js.UndefOr[String]]): Self = this.set("HRK", value.asInstanceOf[js.Any])
    @scala.inline
    def setISK(value: js.Array[js.UndefOr[String]]): Self = this.set("ISK", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOK(value: js.Array[js.UndefOr[String]]): Self = this.set("NOK", value.asInstanceOf[js.Any])
    @scala.inline
    def setPLN(value: js.Array[js.UndefOr[String]]): Self = this.set("PLN", value.asInstanceOf[js.Any])
    @scala.inline
    def setSEK(value: js.Array[js.UndefOr[String]]): Self = this.set("SEK", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
    @scala.inline
    def setZAR(value: js.Array[String]): Self = this.set("ZAR", value.asInstanceOf[js.Any])
  }
  
}

