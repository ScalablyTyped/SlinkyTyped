package typingsSlinky.reactSimpleCodeEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionEnd extends js.Object {
  var selectionEnd: Double = js.native
  var selectionStart: Double = js.native
  var timestamp: Double = js.native
  var value: String = js.native
}

object SelectionEnd {
  @scala.inline
  def apply(selectionEnd: Double, selectionStart: Double, timestamp: Double, value: String): SelectionEnd = {
    val __obj = js.Dynamic.literal(selectionEnd = selectionEnd.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionEnd]
  }
  @scala.inline
  implicit class SelectionEndOps[Self <: SelectionEnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectionEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

