package typingsSlinky.cathoQuantum.paginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationProps extends js.Object {
  var activePage: js.UndefOr[Double] = js.native
  var activePageAriaLabel: js.UndefOr[String] = js.native
  var ariaLabel: js.UndefOr[String] = js.native
  var followOnlyFirstPage: js.UndefOr[Boolean] = js.native
  var infoFormatter: js.UndefOr[
    js.Function2[/* activePage */ js.UndefOr[Double], /* lastPage */ js.UndefOr[Double], Unit]
  ] = js.native
  var nextButtonText: js.UndefOr[String] = js.native
  var onPageClick: js.UndefOr[js.Function1[/* page */ js.UndefOr[Double], Unit]] = js.native
  var pageAriaLabel: js.UndefOr[String] = js.native
  var pageHref: js.UndefOr[js.Function1[/* page */ js.UndefOr[Double], Unit]] = js.native
  var prevButtonText: js.UndefOr[String] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var totalPages: Double = js.native
}

object PaginationProps {
  @scala.inline
  def apply(totalPages: Double): PaginationProps = {
    val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
  @scala.inline
  implicit class PaginationPropsOps[Self <: PaginationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTotalPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivePage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivePage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePage")(js.undefined)
        ret
    }
    @scala.inline
    def withActivePageAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePageAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivePageAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePageAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowOnlyFirstPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followOnlyFirstPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowOnlyFirstPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followOnlyFirstPage")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoFormatter(value: (/* activePage */ js.UndefOr[Double], /* lastPage */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoFormatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInfoFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageClick(value: /* page */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPageAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPageHref(value: /* page */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPageHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHref")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
  }
  
}

