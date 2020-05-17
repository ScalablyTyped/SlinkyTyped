package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PLN extends js.Object {
  var AUD: js.Array[js.UndefOr[String]] = js.native
  var PLN: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
}

object PLN {
  @scala.inline
  def apply(AUD: js.Array[js.UndefOr[String]], PLN: js.Array[String], THB: js.Array[String]): PLN = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], PLN = PLN.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any])
    __obj.asInstanceOf[PLN]
  }
  @scala.inline
  implicit class PLNOps[Self <: PLN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAUD(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPLN(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PLN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTHB(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THB")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

