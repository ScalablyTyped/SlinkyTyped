package typingsSlinky.reachMenuButton.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var buttonId: String = js.native
  var buttonRect: js.UndefOr[ButtonRect] = js.native
  var closingWithClick: Boolean = js.native
  var isOpen: Boolean = js.native
  var selectionIndex: Double = js.native
}

object State {
  @scala.inline
  def apply(buttonId: String, closingWithClick: Boolean, isOpen: Boolean, selectionIndex: Double): State = {
    val __obj = js.Dynamic.literal(buttonId = buttonId.asInstanceOf[js.Any], closingWithClick = closingWithClick.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], selectionIndex = selectionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosingWithClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closingWithClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonRect(value: ButtonRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonRect")(js.undefined)
        ret
    }
  }
  
}

