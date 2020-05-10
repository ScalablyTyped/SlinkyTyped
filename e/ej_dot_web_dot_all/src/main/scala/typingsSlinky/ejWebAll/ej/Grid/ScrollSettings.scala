package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollSettings extends js.Object {
  /** This specify the grid to to view data that you require without buffering the entire load of a huge database
    * @Default {false}
    */
  var allowVirtualScrolling: js.UndefOr[Boolean] = js.native
  /** It accepts the boolean value and shows or hides the scrollbar while focus in or focus out of the Grid.
    * @Default {false}
    */
  var autoHide: js.UndefOr[Boolean] = js.native
  /** Specifies the height and width of button in the scrollbar.
    * @Default {18}
    */
  var buttonSize: js.UndefOr[Double] = js.native
  /** This specify the grid to enable/disable touch control for scrolling.
    * @Default {true}
    */
  var enableTouchScroll: js.UndefOr[Boolean] = js.native
  /** This is used to enable the enhanced virtual scrolling in Grid.
    * @Default {false}
    */
  var enableVirtualization: js.UndefOr[Boolean] = js.native
  /** This specify the grid to freeze particular columns at the time of scrolling.
    * @Default {0}
    */
  var frozenColumns: js.UndefOr[Double] = js.native
  /** This specify the grid to freeze particular rows at the time of scrolling.
    * @Default {0}
    */
  var frozenRows: js.UndefOr[Double] = js.native
  /** This specify the grid to show the vertical scroll bar, to scroll and view the grid contents.
    * @Default {0}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** This specify the scroll down pixel of mouse wheel, to scroll mouse wheel and view the grid contents.
    * @Default {57}
    */
  var scrollOneStepBy: js.UndefOr[Double] = js.native
  /** It accepts the integer value and sets the width of scrollbar.
    * @Default {18}
    */
  var scrollerSize: js.UndefOr[Double] = js.native
  /** This is used to define the mode of virtual scrolling in grid. See virtualScrollMode
    * @Default {ej.Grid.VirtualScrollMode.Normal}
    */
  var virtualScrollMode: js.UndefOr[VirtualScrollMode | String] = js.native
  /** This specify the grid to show the horizontal scroll bar, to scroll and view the grid contents
    * @Default {250}
    */
  var width: js.UndefOr[String | Double] = js.native
}

object ScrollSettings {
  @scala.inline
  def apply(): ScrollSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollSettings]
  }
  @scala.inline
  implicit class ScrollSettingsOps[Self <: ScrollSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowVirtualScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowVirtualScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowVirtualScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowVirtualScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTouchScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTouchScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTouchScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTouchScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableVirtualization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVirtualization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableVirtualization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVirtualization")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozenColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozenRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenRows")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollOneStepBy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOneStepBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollOneStepBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOneStepBy")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollerSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualScrollMode(value: VirtualScrollMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualScrollMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualScrollMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualScrollMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

