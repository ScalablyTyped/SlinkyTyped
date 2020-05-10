package typingsSlinky.cliTable3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<cli-table3.cli-table3.CharName, string> */
@js.native
trait RecordCharNamestring extends js.Object {
  var bottom: String = js.native
  var `bottom-left`: String = js.native
  var `bottom-mid`: String = js.native
  var `bottom-right`: String = js.native
  var left: String = js.native
  var `left-mid`: String = js.native
  var mid: String = js.native
  var `mid-mid`: String = js.native
  var middle: String = js.native
  var right: String = js.native
  var `right-mid`: String = js.native
  var top: String = js.native
  var `top-left`: String = js.native
  var `top-mid`: String = js.native
  var `top-right`: String = js.native
}

object RecordCharNamestring {
  @scala.inline
  def apply(
    bottom: String,
    `bottom-left`: String,
    `bottom-mid`: String,
    `bottom-right`: String,
    left: String,
    `left-mid`: String,
    mid: String,
    `mid-mid`: String,
    middle: String,
    right: String,
    `right-mid`: String,
    top: String,
    `top-left`: String,
    `top-mid`: String,
    `top-right`: String
  ): RecordCharNamestring = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], mid = mid.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("bottom-left")(`bottom-left`.asInstanceOf[js.Any])
    __obj.updateDynamic("bottom-mid")(`bottom-mid`.asInstanceOf[js.Any])
    __obj.updateDynamic("bottom-right")(`bottom-right`.asInstanceOf[js.Any])
    __obj.updateDynamic("left-mid")(`left-mid`.asInstanceOf[js.Any])
    __obj.updateDynamic("mid-mid")(`mid-mid`.asInstanceOf[js.Any])
    __obj.updateDynamic("right-mid")(`right-mid`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-left")(`top-left`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-mid")(`top-mid`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-right")(`top-right`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordCharNamestring]
  }
  @scala.inline
  implicit class RecordCharNamestringOps[Self <: RecordCharNamestring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBottom-left`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBottom-mid`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom-mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBottom-right`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLeft-mid`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left-mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMid-mid`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiddle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withRight-mid`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right-mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTop-left`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTop-mid`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top-mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTop-right`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top-right")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

