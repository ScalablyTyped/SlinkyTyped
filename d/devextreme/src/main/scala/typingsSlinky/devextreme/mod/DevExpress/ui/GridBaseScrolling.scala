package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.always
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.never
import typingsSlinky.devextreme.devextremeStrings.onHover
import typingsSlinky.devextreme.devextremeStrings.onScroll
import typingsSlinky.devextreme.devextremeStrings.standard
import typingsSlinky.devextreme.devextremeStrings.virtual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridBaseScrolling extends js.Object {
  /** Specifies the rendering mode for columns. Applies when columns are left outside the viewport. Requires the columnWidth, columnAutoWidth, or width (for all columns) option specified. */
  var columnRenderingMode: js.UndefOr[standard | virtual] = js.native
  /** Specifies whether the widget should load adjacent pages. Applies only if scrolling.mode is "virtual" or "infinite". */
  var preloadEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies the rendering mode for loaded rows. */
  var rowRenderingMode: js.UndefOr[standard | virtual] = js.native
  /** Specifies whether a user can scroll the content with a swipe gesture. Applies only if useNative is false. */
  var scrollByContent: js.UndefOr[Boolean] = js.native
  /** Specifies whether a user can scroll the content with the scrollbar. Applies only if useNative is false. */
  var scrollByThumb: js.UndefOr[Boolean] = js.native
  /** Specifies when to show scrollbars. Applies only if useNative is false. */
  var showScrollbar: js.UndefOr[always | never | onHover | onScroll] = js.native
  /** Specifies whether the widget should use native or simulated scrolling. */
  var useNative: js.UndefOr[Boolean | auto] = js.native
}

object GridBaseScrolling {
  @scala.inline
  def apply(): GridBaseScrolling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridBaseScrolling]
  }
  @scala.inline
  implicit class GridBaseScrollingOps[Self <: GridBaseScrolling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnRenderingMode(value: standard | virtual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnRenderingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnRenderingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnRenderingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRowRenderingMode(value: standard | virtual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowRenderingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowRenderingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowRenderingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollByContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollByContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollByContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollByContent")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollByThumb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollByThumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollByThumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollByThumb")(js.undefined)
        ret
    }
    @scala.inline
    def withShowScrollbar(value: always | never | onHover | onScroll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNative(value: Boolean | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(js.undefined)
        ret
    }
  }
  
}

