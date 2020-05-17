package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JPYKES extends js.Object {
  var JPY: js.Array[String] = js.native
  var KES: js.Array[String] = js.native
  var TZS: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object JPYKES {
  @scala.inline
  def apply(JPY: js.Array[String], KES: js.Array[String], TZS: js.Array[String], USD: js.Array[String]): JPYKES = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KES = KES.asInstanceOf[js.Any], TZS = TZS.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYKES]
  }
  @scala.inline
  implicit class JPYKESOps[Self <: JPYKES] (val x: Self) extends AnyVal {
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
    def withKES(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTZS(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TZS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUSD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USD")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

