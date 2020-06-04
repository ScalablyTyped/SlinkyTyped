package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DKK extends js.Object {
  var AUD: js.Array[String]
  var DKK: js.Array[String]
  var ISK: js.Array[js.UndefOr[String]]
  var JPY: js.Array[String]
  var NOK: js.Array[js.UndefOr[String]]
  var RON: js.Array[js.UndefOr[String]]
  var SEK: js.Array[js.UndefOr[String]]
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object DKK {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    DKK: js.Array[String],
    ISK: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    NOK: js.Array[js.UndefOr[String]],
    RON: js.Array[js.UndefOr[String]],
    SEK: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): DKK = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], DKK = DKK.asInstanceOf[js.Any], ISK = ISK.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], NOK = NOK.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], SEK = SEK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[DKK]
  }
  @scala.inline
  implicit class DKKOps[Self <: DKK] (val x: Self) extends AnyVal {
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
    def setDKK(value: js.Array[String]): Self = this.set("DKK", value.asInstanceOf[js.Any])
    @scala.inline
    def setISK(value: js.Array[js.UndefOr[String]]): Self = this.set("ISK", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOK(value: js.Array[js.UndefOr[String]]): Self = this.set("NOK", value.asInstanceOf[js.Any])
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = this.set("RON", value.asInstanceOf[js.Any])
    @scala.inline
    def setSEK(value: js.Array[js.UndefOr[String]]): Self = this.set("SEK", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
  }
  
}

