package typingsSlinky.reactBeautifulDnd.mod

import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.bottom
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.height
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.horizontal
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.left
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.right
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.top
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.width
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.x
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HorizontalAxis extends Axis {
  var crossAxisEnd: bottom = js.native
  var crossAxisLine: y = js.native
  var crossAxisSize: height = js.native
  var crossAxisStart: top = js.native
  var direction: horizontal = js.native
  var end: right = js.native
  var line: x = js.native
  var size: width = js.native
  var start: left = js.native
}

object HorizontalAxis {
  @scala.inline
  def apply(
    crossAxisEnd: bottom,
    crossAxisLine: y,
    crossAxisSize: height,
    crossAxisStart: top,
    direction: horizontal,
    end: right,
    line: x,
    size: width,
    start: left
  ): HorizontalAxis = {
    val __obj = js.Dynamic.literal(crossAxisEnd = crossAxisEnd.asInstanceOf[js.Any], crossAxisLine = crossAxisLine.asInstanceOf[js.Any], crossAxisSize = crossAxisSize.asInstanceOf[js.Any], crossAxisStart = crossAxisStart.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalAxis]
  }
  @scala.inline
  implicit class HorizontalAxisOps[Self <: HorizontalAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrossAxisEnd(value: bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossAxisEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrossAxisLine(value: y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossAxisLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrossAxisSize(value: height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossAxisSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrossAxisStart(value: top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossAxisStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: horizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.x): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: width): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

