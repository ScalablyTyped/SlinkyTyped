package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JPYNOK extends js.Object {
  var DKK: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var NOK: js.Array[String] = js.native
  var SEK: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object JPYNOK {
  @scala.inline
  def apply(
    DKK: js.Array[String],
    JPY: js.Array[String],
    NOK: js.Array[String],
    SEK: js.Array[String],
    THB: js.Array[String],
    USD: js.Array[String]
  ): JPYNOK = {
    val __obj = js.Dynamic.literal(DKK = DKK.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], NOK = NOK.asInstanceOf[js.Any], SEK = SEK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYNOK]
  }
  @scala.inline
  implicit class JPYNOKOps[Self <: JPYNOK] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDKK(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DKK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOK(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSEK(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SEK")(value.asInstanceOf[js.Any])
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

