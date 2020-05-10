package typingsSlinky.reactJsPagination.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactJsPaginationProps extends js.Object {
  var activeClass: js.UndefOr[String] = js.native
  var activeLinkClass: js.UndefOr[String] = js.native
  var activePage: Double = js.native
  var disabledClass: js.UndefOr[String] = js.native
  var firstPageText: js.UndefOr[String | ReactElement] = js.native
  var getPageUrl: js.UndefOr[js.Function1[/* pageNumber */ Double, String]] = js.native
  var hideDisabled: js.UndefOr[Boolean] = js.native
  var hideFirstLastPages: js.UndefOr[Boolean] = js.native
  var hideNavigation: js.UndefOr[Boolean] = js.native
  var innerClass: js.UndefOr[String] = js.native
  var itemClass: js.UndefOr[String] = js.native
  var itemClassFirst: js.UndefOr[String] = js.native
  var itemClassLast: js.UndefOr[String] = js.native
  var itemClassNext: js.UndefOr[String] = js.native
  var itemClassPrev: js.UndefOr[String] = js.native
  var itemsCountPerPage: js.UndefOr[Double] = js.native
  var lastPageText: js.UndefOr[String | ReactElement] = js.native
  var linkClass: js.UndefOr[String] = js.native
  var linkClassFirst: js.UndefOr[String] = js.native
  var linkClassLast: js.UndefOr[String] = js.native
  var linkClassNext: js.UndefOr[String] = js.native
  var linkClassPrev: js.UndefOr[String] = js.native
  var nextPageText: js.UndefOr[String | ReactElement] = js.native
  var pageRangeDisplayed: js.UndefOr[Double] = js.native
  var prevPageText: js.UndefOr[String | ReactElement] = js.native
  var totalItemsCount: Double = js.native
  def onChange(pageNumber: Double): Unit = js.native
}

object ReactJsPaginationProps {
  @scala.inline
  def apply(activePage: Double, onChange: Double => Unit, totalItemsCount: Double): ReactJsPaginationProps = {
    val __obj = js.Dynamic.literal(activePage = activePage.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), totalItemsCount = totalItemsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactJsPaginationProps]
  }
  @scala.inline
  implicit class ReactJsPaginationPropsOps[Self <: ReactJsPaginationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivePage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTotalItemsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItemsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveLinkClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLinkClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveLinkClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLinkClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstPageTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstPageText(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPageText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPageUrl(value: /* pageNumber */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHideFirstLastPages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFirstLastPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideFirstLastPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFirstLastPages")(js.undefined)
        ret
    }
    @scala.inline
    def withHideNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withItemClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClass")(js.undefined)
        ret
    }
    @scala.inline
    def withItemClassFirst(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClassFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemClassFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClassFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withItemClassLast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClassLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemClassLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClassLast")(js.undefined)
        ret
    }
    @scala.inline
    def withItemClassNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClassNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemClassNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClassNext")(js.undefined)
        ret
    }
    @scala.inline
    def withItemClassPrev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClassPrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemClassPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClassPrev")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsCountPerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsCountPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsCountPerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsCountPerPage")(js.undefined)
        ret
    }
    @scala.inline
    def withLastPageTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastPageText(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastPageText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPageText")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkClassFirst(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkClassFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkClassFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkClassFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkClassLast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkClassLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkClassLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkClassLast")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkClassNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkClassNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkClassNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkClassNext")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkClassPrev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkClassPrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkClassPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkClassPrev")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPageText(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageText")(js.undefined)
        ret
    }
    @scala.inline
    def withPageRangeDisplayed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageRangeDisplayed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageRangeDisplayed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageRangeDisplayed")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevPageTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevPageText(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevPageText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPageText")(js.undefined)
        ret
    }
  }
  
}

