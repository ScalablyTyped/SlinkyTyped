package typingsSlinky.materialUiLab.usePaginationMod

import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsePaginationProps extends js.Object {
  /**
    * Number of always visible pages at the beginning and end.
    * @default 1
    */
  var boundaryCount: js.UndefOr[Double] = js.native
  /**
    * The name of the component where this hook is used.
    */
  var componentName: js.UndefOr[String] = js.native
  /**
    * The total number of pages.
    * @default 1
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * The page selected by default when the component is uncontrolled.
    * @default 1
    */
  var defaultPage: js.UndefOr[Double] = js.native
  /**
    * If `true`, the pagination component will be disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, hide the next-page button.
    * @default false
    */
  var hideNextButton: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, hide the previous-page button.
    * @default false
    */
  var hidePrevButton: js.UndefOr[Boolean] = js.native
  /**
    * Callback fired when the page is changed.
    *
    * @param {object} event The event source of the callback.
    * @param {number} page The page selected.
    */
  var onChange: js.UndefOr[js.Function2[/* event */ ChangeEvent[_], /* page */ Double, Unit]] = js.native
  /**
    * The current page.
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * If `true`, show the first-page button.
    * @default false
    */
  var showFirstButton: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, show the last-page button.
    * @default false
    */
  var showLastButton: js.UndefOr[Boolean] = js.native
  /**
    * Number of always visible pages before and after the current page.
    * @default 1
    */
  var siblingCount: js.UndefOr[Double] = js.native
}

object UsePaginationProps {
  @scala.inline
  def apply(): UsePaginationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsePaginationProps]
  }
  @scala.inline
  implicit class UsePaginationPropsOps[Self <: UsePaginationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundaryCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundaryCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryCount")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentName")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPage")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHideNextButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideNextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideNextButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideNextButton")(js.undefined)
        ret
    }
    @scala.inline
    def withHidePrevButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePrevButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidePrevButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePrevButton")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* event */ ChangeEvent[_], /* page */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFirstButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFirstButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFirstButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFirstButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLastButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLastButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLastButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLastButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSiblingCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblingCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiblingCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblingCount")(js.undefined)
        ret
    }
  }
  
}

