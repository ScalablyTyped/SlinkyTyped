package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable or disable scrolling in Spreadsheet.
    * @Default {true}
    */
  var allowScrolling: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable sheet on demand. By enabling this, it render only the active sheet element while paging remaining sheets are
    * created one by one.
    * @Default {false}
    */
  var allowSheetOnDemand: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable virtual scrolling feature in the Spreadsheet.
    * @Default {true}
    */
  var allowVirtualScrolling: js.UndefOr[Boolean] = js.native
  /** Gets or sets the value that indicates to define the height of spreadsheet.
    * @Default {100%}
    */
  var height: js.UndefOr[Double | String] = js.native
  /** Gets or sets the value that indicates whether to enable or disable responsive mode in the Spreadsheet.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to set scroll mode in Spreadsheet. It has two scroll modes, Normal and Infinite.
    * @Default {ej.Spreadsheet.scrollMode.Infinite}
    */
  var scrollMode: js.UndefOr[typingsSlinky.ejWebAll.ej.Spreadsheet.scrollMode | String] = js.native
  /** Gets or sets the value that indicates to define the height of the spreadsheet.
    * @Default {100%}
    */
  var width: js.UndefOr[Double | String] = js.native
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
    def withAllowScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSheetOnDemand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSheetOnDemand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSheetOnDemand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSheetOnDemand")(js.undefined)
        ret
    }
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
    def withHeight(value: Double | String): Self = {
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
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollMode(value: scrollMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
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

