package typingsSlinky.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLinesabove extends js.Object {
  var lines_above: js.UndefOr[Double] = js.native
  var lines_below: js.UndefOr[Double] = js.native
}

object AnonLinesabove {
  @scala.inline
  def apply(): AnonLinesabove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLinesabove]
  }
  @scala.inline
  implicit class AnonLinesaboveOps[Self <: AnonLinesabove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLines_above(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines_above")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLines_above: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines_above")(js.undefined)
        ret
    }
    @scala.inline
    def withLines_below(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines_below")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLines_below: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines_below")(js.undefined)
        ret
    }
  }
  
}

