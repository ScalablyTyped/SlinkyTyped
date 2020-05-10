package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextInputSelectionChangeEventData extends TargetedEvent {
  var selection: AnonEnd = js.native
}

object TextInputSelectionChangeEventData {
  @scala.inline
  def apply(selection: AnonEnd, target: Double): TextInputSelectionChangeEventData = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputSelectionChangeEventData]
  }
  @scala.inline
  implicit class TextInputSelectionChangeEventDataOps[Self <: TextInputSelectionChangeEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelection(value: AnonEnd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

