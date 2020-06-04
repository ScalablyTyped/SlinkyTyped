package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BYN extends js.Object {
  var BYN: js.Array[scala.Nothing]
  var DKK: js.Array[scala.Nothing]
  var HRK: js.Array[scala.Nothing]
  var ISK: js.Array[scala.Nothing]
  var NOK: js.Array[scala.Nothing]
  var PLN: js.Array[scala.Nothing]
  var RUR: js.Array[scala.Nothing]
  var SEK: js.Array[scala.Nothing]
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object BYN {
  @scala.inline
  def apply(
    BYN: js.Array[scala.Nothing],
    DKK: js.Array[scala.Nothing],
    HRK: js.Array[scala.Nothing],
    ISK: js.Array[scala.Nothing],
    NOK: js.Array[scala.Nothing],
    PLN: js.Array[scala.Nothing],
    RUR: js.Array[scala.Nothing],
    SEK: js.Array[scala.Nothing],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): BYN = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], DKK = DKK.asInstanceOf[js.Any], HRK = HRK.asInstanceOf[js.Any], ISK = ISK.asInstanceOf[js.Any], NOK = NOK.asInstanceOf[js.Any], PLN = PLN.asInstanceOf[js.Any], RUR = RUR.asInstanceOf[js.Any], SEK = SEK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BYN]
  }
  @scala.inline
  implicit class BYNOps[Self <: BYN] (val x: Self) extends AnyVal {
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
    def setBYN(value: js.Array[scala.Nothing]): Self = this.set("BYN", value.asInstanceOf[js.Any])
    @scala.inline
    def setDKK(value: js.Array[scala.Nothing]): Self = this.set("DKK", value.asInstanceOf[js.Any])
    @scala.inline
    def setHRK(value: js.Array[scala.Nothing]): Self = this.set("HRK", value.asInstanceOf[js.Any])
    @scala.inline
    def setISK(value: js.Array[scala.Nothing]): Self = this.set("ISK", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOK(value: js.Array[scala.Nothing]): Self = this.set("NOK", value.asInstanceOf[js.Any])
    @scala.inline
    def setPLN(value: js.Array[scala.Nothing]): Self = this.set("PLN", value.asInstanceOf[js.Any])
    @scala.inline
    def setRUR(value: js.Array[scala.Nothing]): Self = this.set("RUR", value.asInstanceOf[js.Any])
    @scala.inline
    def setSEK(value: js.Array[scala.Nothing]): Self = this.set("SEK", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
  }
  
}

