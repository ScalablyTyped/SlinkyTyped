package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TRY extends js.Object {
  var AUD: js.Array[String] = js.native
  var RON: js.Array[js.UndefOr[String]] = js.native
  var THB: js.Array[String] = js.native
  var TRY: js.Array[String] = js.native
  var TWD: js.Array[String] = js.native
}

object TRY {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TRY: js.Array[String],
    TWD: js.Array[String]
  ): TRY = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TRY = TRY.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[TRY]
  }
  @scala.inline
  implicit class TRYOps[Self <: TRY] (val x: Self) extends AnyVal {
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
    def withRON(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTHB(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTWD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TWD")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

