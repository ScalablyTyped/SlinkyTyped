package typingsSlinky.reactAutocomplete.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  /**
    * Index of the highlighted item, `null` if none currently is.
    */
  var highlightedIndex: Double | Null = js.native
  /**
    * True when the menu is visible. Provided to `onMenuVisibilityChange`.
    */
  var isOpen: Boolean = js.native
  /**
    * These three `menu___` values are used in CSS to layout the menu.
    */
  var menuLeft: js.UndefOr[Double] = js.native
  var menuTop: js.UndefOr[Double] = js.native
  var menuWidth: js.UndefOr[Double] = js.native
}

object State {
  @scala.inline
  def apply(isOpen: Boolean): State = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedIndexNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedIndex")(null)
        ret
    }
    @scala.inline
    def withMenuLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuTop")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuWidth")(js.undefined)
        ret
    }
  }
  
}

