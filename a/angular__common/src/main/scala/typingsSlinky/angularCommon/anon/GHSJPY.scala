package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GHSJPY extends js.Object {
  var GHS: js.Array[String]
  var JPY: js.Array[String]
  var NGN: js.Array[String]
  var USD: js.Array[String]
}

object GHSJPY {
  @scala.inline
  def apply(GHS: js.Array[String], JPY: js.Array[String], NGN: js.Array[String], USD: js.Array[String]): GHSJPY = {
    val __obj = js.Dynamic.literal(GHS = GHS.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], NGN = NGN.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[GHSJPY]
  }
  @scala.inline
  implicit class GHSJPYOps[Self <: GHSJPY] (val x: Self) extends AnyVal {
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
    def setGHS(value: js.Array[String]): Self = this.set("GHS", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setNGN(value: js.Array[String]): Self = this.set("NGN", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

