package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ALL extends js.Object {
  var ALL: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var MKD: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object ALL {
  @scala.inline
  def apply(
    ALL: js.Array[String],
    JPY: js.Array[String],
    MKD: js.Array[String],
    THB: js.Array[String],
    USD: js.Array[String]
  ): ALL = {
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], MKD = MKD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALL]
  }
  @scala.inline
  implicit class ALLOps[Self <: ALL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withALL(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMKD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MKD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTHB(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THB")(value.asInstanceOf[js.Any])
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

