package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILRJPY extends js.Object {
  var AUD: js.Array[String]
  var ILR: js.Array[String]
  var JPY: js.Array[String]
  var KRW: js.Array[String]
  var SGD: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[String]
}

object ILRJPY {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    ILR: js.Array[String],
    JPY: js.Array[String],
    KRW: js.Array[String],
    SGD: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): ILRJPY = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], ILR = ILR.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], SGD = SGD.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILRJPY]
  }
  @scala.inline
  implicit class ILRJPYOps[Self <: ILRJPY] (val x: Self) extends AnyVal {
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
    def setILR(value: js.Array[String]): Self = this.set("ILR", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setKRW(value: js.Array[String]): Self = this.set("KRW", value.asInstanceOf[js.Any])
    @scala.inline
    def setSGD(value: js.Array[String]): Self = this.set("SGD", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

