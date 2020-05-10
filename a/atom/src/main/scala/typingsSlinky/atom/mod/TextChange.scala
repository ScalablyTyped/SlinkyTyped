package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextChange extends js.Object {
  var newExtent: Point = js.native
  var newRange: Range = js.native
  var newText: String = js.native
  var oldExtent: Point = js.native
  var oldRange: Range = js.native
  var oldText: String = js.native
  var start: Point = js.native
}

object TextChange {
  @scala.inline
  def apply(
    newExtent: Point,
    newRange: Range,
    newText: String,
    oldExtent: Point,
    oldRange: Range,
    oldText: String,
    start: Point
  ): TextChange = {
    val __obj = js.Dynamic.literal(newExtent = newExtent.asInstanceOf[js.Any], newRange = newRange.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldExtent = oldExtent.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any], oldText = oldText.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextChange]
  }
  @scala.inline
  implicit class TextChangeOps[Self <: TextChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewExtent(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldExtent(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

