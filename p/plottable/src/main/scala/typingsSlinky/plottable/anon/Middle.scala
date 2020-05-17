package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.end
import typingsSlinky.plottable.plottableStrings.middle
import typingsSlinky.plottable.plottableStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Middle extends js.Object {
  var end: typingsSlinky.plottable.plottableStrings.end = js.native
  var middle: typingsSlinky.plottable.plottableStrings.middle = js.native
  var start: typingsSlinky.plottable.plottableStrings.start = js.native
}

object Middle {
  @scala.inline
  def apply(end: end, middle: middle, start: start): Middle = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Middle]
  }
  @scala.inline
  implicit class MiddleOps[Self <: Middle] (val x: Self) extends AnyVal {
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

