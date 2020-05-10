package typingsSlinky.chessJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxwidth extends js.Object {
  /** the maximum width of a line */
  var max_width: js.UndefOr[Double] = js.native
  /** Specific newline character */
  var newline_char: js.UndefOr[String] = js.native
}

object AnonMaxwidth {
  @scala.inline
  def apply(): AnonMaxwidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxwidth]
  }
  @scala.inline
  implicit class AnonMaxwidthOps[Self <: AnonMaxwidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_width")(js.undefined)
        ret
    }
    @scala.inline
    def withNewline_char(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline_char")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewline_char: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline_char")(js.undefined)
        ret
    }
  }
  
}

