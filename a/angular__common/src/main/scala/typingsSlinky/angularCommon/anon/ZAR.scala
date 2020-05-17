package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZAR extends js.Object {
  var JPY: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
  var ZAR: js.Array[String] = js.native
}

object ZAR {
  @scala.inline
  def apply(JPY: js.Array[String], USD: js.Array[String], ZAR: js.Array[String]): ZAR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], ZAR = ZAR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZAR]
  }
  @scala.inline
  implicit class ZAROps[Self <: ZAR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUSD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZAR(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZAR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

