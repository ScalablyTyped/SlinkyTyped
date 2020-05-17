package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExactRangeOverflow extends js.Object {
  var exact: js.UndefOr[String] = js.native
  var rangeOverflow: js.UndefOr[String] = js.native
  var rangeUnderflow: js.UndefOr[String] = js.native
}

object ExactRangeOverflow {
  @scala.inline
  def apply(): ExactRangeOverflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExactRangeOverflow]
  }
  @scala.inline
  implicit class ExactRangeOverflowOps[Self <: ExactRangeOverflow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExact(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(js.undefined)
        ret
    }
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

