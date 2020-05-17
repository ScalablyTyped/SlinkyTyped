package typingsSlinky.reactPaginate.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactPaginate.anon.Selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactPaginateProps extends js.Object {
  /**
    * The classname for the active page.
    */
  var activeClassName: js.UndefOr[String] = js.native
  /**
    * The classname for the active link.
    */
  var activeLinkClassName: js.UndefOr[String] = js.native
  /**
    * The classname on tag `li` of the ellipsis element.
    */
  var breakClassName: js.UndefOr[String] = js.native
  /**
    * Label for ellipsis.
    */
  var breakLabel: js.UndefOr[String | TagMod[Any]] = js.native
  /**
    * The classname on tag `a` of the ellipsis element.
    */
  var breakLinkClassName: js.UndefOr[String] = js.native
  /**
    * The classname of the pagination container.
    */
  var containerClassName: js.UndefOr[String] = js.native
  /**
    * Disable onPageChange callback with initial page. Default: false
    */
  var disableInitialCallback: js.UndefOr[Boolean] = js.native
  /**
    * The classname for disabled `previous` and `next` buttons.
    */
  var disabledClassName: js.UndefOr[String] = js.native
  /**
    * Extra context to add to the aria-label HTML attribute.
    */
  var extraAriaContext: js.UndefOr[String] = js.native
  /**
    * To override selected page with parent prop.
    */
  var forcePage: js.UndefOr[Double] = js.native
  /**
    * The method is called to generate the href attribute value on tag a of each page element.
    */
  var hrefBuilder: js.UndefOr[js.Function1[/* pageIndex */ Double, Unit]] = js.native
  /**
    * The initial page selected.
    */
  var initialPage: js.UndefOr[Double] = js.native
  /**
    * The number of pages to display for margins.
    */
  var marginPagesDisplayed: Double = js.native
  /**
    * The classname on tag `li` of the `next` button.
    */
  var nextClassName: js.UndefOr[String] = js.native
  /**
    * Label for the `next` button.
    */
  var nextLabel: js.UndefOr[TagMod[Any]] = js.native
  /**
    * The classname on tag `a` of the `next` button.
    */
  var nextLinkClassName: js.UndefOr[String] = js.native
  /**
    * The method to call when a page is clicked. Exposes the current page object as an argument.
    */
  var onPageChange: js.UndefOr[js.Function1[/* selectedItem */ Selected, Unit]] = js.native
  /**
    * The classname on tag `li` of each page element.
    */
  var pageClassName: js.UndefOr[String] = js.native
  /**
    * The total number of pages.
    */
  var pageCount: Double = js.native
  /**
    * The classname on tag `a` of each page element.
    */
  var pageLinkClassName: js.UndefOr[String] = js.native
  /**
    * The range of pages displayed.
    */
  var pageRangeDisplayed: Double = js.native
  /**
    * The classname on tag `li` of the `previous` button.
    */
  var previousClassName: js.UndefOr[String] = js.native
  /**
    * Label for the `previous` button.
    */
  var previousLabel: js.UndefOr[TagMod[Any]] = js.native
  /**
    * The classname on tag `a` of the `previous` button.
    */
  var previousLinkClassName: js.UndefOr[String] = js.native
}

object ReactPaginateProps {
  @scala.inline
  def apply(marginPagesDisplayed: Double, pageCount: Double, pageRangeDisplayed: Double): ReactPaginateProps = {
    val __obj = js.Dynamic.literal(marginPagesDisplayed = marginPagesDisplayed.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any], pageRangeDisplayed = pageRangeDisplayed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPaginateProps]
  }
  @scala.inline
  implicit class ReactPaginatePropsOps[Self <: ReactPaginateProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarginPagesDisplayed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginPagesDisplayed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageRangeDisplayed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageRangeDisplayed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveLinkClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLinkClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveLinkClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLinkClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreakLabel(value: String | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakLinkClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakLinkClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakLinkClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakLinkClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableInitialCallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableInitialCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableInitialCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableInitialCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraAriaContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraAriaContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraAriaContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraAriaContext")(js.undefined)
        ret
    }
    @scala.inline
    def withForcePage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForcePage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePage")(js.undefined)
        ret
    }
    @scala.inline
    def withHrefBuilder(value: /* pageIndex */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefBuilder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHrefBuilder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefBuilder")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPage")(js.undefined)
        ret
    }
    @scala.inline
    def withNextClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withNextLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextLabel(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withNextLinkClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextLinkClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextLinkClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextLinkClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageChange(value: /* selectedItem */ Selected => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPageClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLinkClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLinkClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLinkClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLinkClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousLabel(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousLinkClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousLinkClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousLinkClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousLinkClassName")(js.undefined)
        ret
    }
  }
  
}

