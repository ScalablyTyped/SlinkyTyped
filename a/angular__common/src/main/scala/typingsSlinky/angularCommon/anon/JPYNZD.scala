package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JPYNZD extends js.Object {
  var AUD: js.Array[String]
  var JPY: js.Array[String]
  var NZD: js.Array[String]
  var TOP: js.Array[String]
  var USD: js.Array[String]
}

object JPYNZD {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    JPY: js.Array[String],
    NZD: js.Array[String],
    TOP: js.Array[String],
    USD: js.Array[String]
  ): JPYNZD = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYNZD]
  }
  @scala.inline
  implicit class JPYNZDOps[Self <: JPYNZD] (val x: Self) extends AnyVal {
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
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setNZD(value: js.Array[String]): Self = this.set("NZD", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOP(value: js.Array[String]): Self = this.set("TOP", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

