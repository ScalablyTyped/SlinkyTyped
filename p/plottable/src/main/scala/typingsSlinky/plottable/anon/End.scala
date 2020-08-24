package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.end
import typingsSlinky.plottable.plottableStrings.middle
import typingsSlinky.plottable.plottableStrings.outside
import typingsSlinky.plottable.plottableStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait End extends js.Object {
  var end: typingsSlinky.plottable.plottableStrings.end = js.native
  var middle: typingsSlinky.plottable.plottableStrings.middle = js.native
  var outside: typingsSlinky.plottable.plottableStrings.outside = js.native
  var start: typingsSlinky.plottable.plottableStrings.start = js.native
}

object End {
  @scala.inline
  def apply(end: end, middle: middle, outside: outside, start: start): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], outside = outside.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  @scala.inline
  implicit class EndOps[Self <: End] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnd(value: end): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiddle(value: middle): Self = this.set("middle", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutside(value: outside): Self = this.set("outside", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: start): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

