package typingsSlinky.reachMenuButton

import typingsSlinky.reachMenuButton.mod.ButtonRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@reach/menu-button.@reach/menu-button.State> */
@js.native
trait PartialState extends js.Object {
  var buttonId: js.UndefOr[String] = js.native
  var buttonRect: js.UndefOr[ButtonRect] = js.native
  var closingWithClick: js.UndefOr[Boolean] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var selectionIndex: js.UndefOr[Double] = js.native
}

object PartialState {
  @scala.inline
  def apply(): PartialState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialState]
  }
  @scala.inline
  implicit class PartialStateOps[Self <: PartialState] (val x: Self) extends AnyVal {
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
    def withoutButtonId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonId")(js.undefined)
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
    @scala.inline
    def withClosingWithClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closingWithClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosingWithClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closingWithClick")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionIndex")(js.undefined)
        ret
    }
  }
  
}

