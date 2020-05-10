package typingsSlinky.plottable

import typingsSlinky.plottable.plottableStrings.end
import typingsSlinky.plottable.plottableStrings.middle
import typingsSlinky.plottable.plottableStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMiddle extends js.Object {
  var end: typingsSlinky.plottable.plottableStrings.end = js.native
  var middle: typingsSlinky.plottable.plottableStrings.middle = js.native
  var start: typingsSlinky.plottable.plottableStrings.start = js.native
}

object AnonMiddle {
  @scala.inline
  def apply(end: end, middle: middle, start: start): AnonMiddle = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMiddle]
  }
  @scala.inline
  implicit class AnonMiddleOps[Self <: AnonMiddle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiddle(value: middle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: start): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

