package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRangeOverflow extends js.Object {
  var rangeOverflow: js.UndefOr[String] = js.native
  var rangeUnderflow: js.UndefOr[String] = js.native
}

object AnonRangeOverflow {
  @scala.inline
  def apply(): AnonRangeOverflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRangeOverflow]
  }
  @scala.inline
  implicit class AnonRangeOverflowOps[Self <: AnonRangeOverflow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRangeOverflow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeUnderflow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeUnderflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeUnderflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeUnderflow")(js.undefined)
        ret
    }
  }
  
}

