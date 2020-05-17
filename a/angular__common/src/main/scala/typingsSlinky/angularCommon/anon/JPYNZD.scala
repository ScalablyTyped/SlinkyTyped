package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JPYNZD extends js.Object {
  var AUD: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var NZD: js.Array[String] = js.native
  var TOP: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
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
    def withAUD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNZD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NZD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOP(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOP")(value.asInstanceOf[js.Any])
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

