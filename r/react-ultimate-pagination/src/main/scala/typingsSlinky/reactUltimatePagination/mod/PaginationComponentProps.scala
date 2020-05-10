package typingsSlinky.reactUltimatePagination.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationComponentProps extends js.Object {
  /**
    * Show if `currentPage` if the same as `value` of an item (can be used to highlight a current page or disable first, previous, next or last page links when user is already on first/last page)
    */
  var isActive: Boolean = js.native
  /**
    * Show if button should be disabled
    */
  var isDisabled: Boolean = js.native
  /**
    * Number of pages that user should navigate to when item is activated (for items with type `PAGE` it also can be used as a label in UI)
    */
  var value: Double = js.native
  /**
    * Should be called when user interacted with a component and the current page should be changed to the page represented by item (no arguments should be used, can be used for all item types)
    */
  def onClick(): Unit = js.native
}

object PaginationComponentProps {
  @scala.inline
  def apply(isActive: Boolean, isDisabled: Boolean, onClick: () => Unit, value: Double): PaginationComponentProps = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationComponentProps]
  }
  @scala.inline
  implicit class PaginationComponentPropsOps[Self <: PaginationComponentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

