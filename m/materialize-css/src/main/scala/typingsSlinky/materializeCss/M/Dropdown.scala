package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dropdown extends Component[DropdownOptions] {
  /**
    * The DOM element of the dropdown
    */
  var dropdownEl: Element = js.native
  /**
    * The index of the item focused
    */
  var focusedIndex: Double = js.native
  /**
    * ID of the dropdown element
    */
  var id: String = js.native
  /**
    * If the dropdown is open
    */
  var isOpen: Boolean = js.native
  /**
    * If the dropdown content is scrollable
    */
  var isScrollable: Boolean = js.native
  /**
    * Close dropdown
    */
  def close(): Unit = js.native
  /**
    * Open dropdown
    */
  def open(): Unit = js.native
  /**
    * While dropdown is open, you can recalculate its dimensions if its contents have changed
    */
  def recalculateDimensions(): Unit = js.native
}

object Dropdown {
  @scala.inline
  def apply(
    close: () => Unit,
    destroy: () => Unit,
    dropdownEl: Element,
    el: Element,
    focusedIndex: Double,
    id: String,
    isOpen: Boolean,
    isScrollable: Boolean,
    open: () => Unit,
    options: DropdownOptions,
    recalculateDimensions: () => Unit
  ): Dropdown = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), dropdownEl = dropdownEl.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], focusedIndex = focusedIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isScrollable = isScrollable.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any], recalculateDimensions = js.Any.fromFunction0(recalculateDimensions))
    __obj.asInstanceOf[Dropdown]
  }
  @scala.inline
  implicit class DropdownOps[Self <: Dropdown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDropdownEl(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsScrollable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrollable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRecalculateDimensions(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recalculateDimensions")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

