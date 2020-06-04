package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ERNETB extends js.Object {
  var ERN: js.Array[String]
  var ETB: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object ERNETB {
  @scala.inline
  def apply(ERN: js.Array[String], ETB: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): ERNETB = {
    val __obj = js.Dynamic.literal(ERN = ERN.asInstanceOf[js.Any], ETB = ETB.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ERNETB]
  }
  @scala.inline
  implicit class ERNETBOps[Self <: ERNETB] (val x: Self) extends AnyVal {
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
    def setERN(value: js.Array[String]): Self = this.set("ERN", value.asInstanceOf[js.Any])
    @scala.inline
    def setETB(value: js.Array[String]): Self = this.set("ETB", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

