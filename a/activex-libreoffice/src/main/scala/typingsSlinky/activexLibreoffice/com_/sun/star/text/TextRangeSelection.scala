package typingsSlinky.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextRangeSelection extends js.Object {
  var End: TextPosition = js.native
  var Start: TextPosition = js.native
}

object TextRangeSelection {
  @scala.inline
  def apply(End: TextPosition, Start: TextPosition): TextRangeSelection = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRangeSelection]
  }
  @scala.inline
  implicit class TextRangeSelectionOps[Self <: TextRangeSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: TextPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: TextPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

