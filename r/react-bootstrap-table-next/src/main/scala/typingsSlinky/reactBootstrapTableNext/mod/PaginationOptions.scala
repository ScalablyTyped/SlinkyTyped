package typingsSlinky.reactBootstrapTableNext.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactBootstrapTableNext.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  custom  :boolean,   page  :number,   sizePerPage  :number,   totalSize  :number,   pageStartIndex  :number,   paginationSize  :number,   showTotal  :boolean,   sizePerPageList  :std.Array<number> | std.Array<{  text  :string,   value  :number}>,   withFirstAndLast  :boolean,   alwaysShowAllBtns  :boolean,   firstPageText  :string,   prePageText  :string,   nextPageText  :string,   lastPageText  :string,   nextPageTitle  :string,   prePageTitle  :string,   firstPageTitle  :string,   lastPageTitle  :string,   hideSizePerPage  :boolean,   hidePageListOnlyOnePage  :boolean, pageButtonRenderer (options : react-bootstrap-table-next.react-bootstrap-table-next.PageButtonRendererOptions): react.react._Global_.JSX.Element, onPageChange (page : number, sizePerPage : number): void, onSizePerPageChange (page : number, sizePerPage : number): void, pageListRenderer (options : react-bootstrap-table-next.react-bootstrap-table-next.PageListRendererOptions): react.react._Global_.JSX.Element, sizePerPageRenderer (options : react-bootstrap-table-next.react-bootstrap-table-next.SizePerPageRendererOptions): react.react._Global_.JSX.Element, sizePerPageOptionRenderer (options : react-bootstrap-table-next.react-bootstrap-table-next.SizePerPageOptionRendererOptions): react.react._Global_.JSX.Element, paginationTotalRenderer (from : number, to : number, size : number): react.react._Global_.JSX.Element}> */
@js.native
trait PaginationOptions extends js.Object {
  var alwaysShowAllBtns: js.UndefOr[Boolean] = js.native
  var custom: js.UndefOr[Boolean] = js.native
  var firstPageText: js.UndefOr[String] = js.native
  var firstPageTitle: js.UndefOr[String] = js.native
  var hidePageListOnlyOnePage: js.UndefOr[Boolean] = js.native
  var hideSizePerPage: js.UndefOr[Boolean] = js.native
  var lastPageText: js.UndefOr[String] = js.native
  var lastPageTitle: js.UndefOr[String] = js.native
  var nextPageText: js.UndefOr[String] = js.native
  var nextPageTitle: js.UndefOr[String] = js.native
  var onPageChange: js.UndefOr[js.Function2[/* page */ Double, /* sizePerPage */ Double, Unit]] = js.native
  var onSizePerPageChange: js.UndefOr[js.Function2[/* page */ Double, /* sizePerPage */ Double, Unit]] = js.native
  var page: js.UndefOr[Double] = js.native
  var pageButtonRenderer: js.UndefOr[js.Function1[/* options */ PageButtonRendererOptions, ReactElement]] = js.native
  var pageListRenderer: js.UndefOr[js.Function1[/* options */ PageListRendererOptions, ReactElement]] = js.native
  var pageStartIndex: js.UndefOr[Double] = js.native
  var paginationSize: js.UndefOr[Double] = js.native
  var paginationTotalRenderer: js.UndefOr[
    js.Function3[/* from */ Double, /* to */ Double, /* size */ Double, ReactElement]
  ] = js.native
  var prePageText: js.UndefOr[String] = js.native
  var prePageTitle: js.UndefOr[String] = js.native
  var showTotal: js.UndefOr[Boolean] = js.native
  var sizePerPage: js.UndefOr[Double] = js.native
  var sizePerPageList: js.UndefOr[js.Array[AnonText | Double]] = js.native
  var sizePerPageOptionRenderer: js.UndefOr[js.Function1[/* options */ SizePerPageOptionRendererOptions, ReactElement]] = js.native
  var sizePerPageRenderer: js.UndefOr[js.Function1[/* options */ SizePerPageRendererOptions, ReactElement]] = js.native
  var totalSize: js.UndefOr[Double] = js.native
  var withFirstAndLast: js.UndefOr[Boolean] = js.native
}

object PaginationOptions {
  @scala.inline
  def apply(): PaginationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationOptions]
  }
  @scala.inline
  implicit class PaginationOptionsOps[Self <: PaginationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysShowAllBtns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowAllBtns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysShowAllBtns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowAllBtns")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstPageText(value: String): Self = {
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
    def withFirstPageTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPageTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withHidePageListOnlyOnePage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePageListOnlyOnePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidePageListOnlyOnePage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePageListOnlyOnePage")(js.undefined)
        ret
    }
    @scala.inline
    def withHideSizePerPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSizePerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideSizePerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSizePerPage")(js.undefined)
        ret
    }
    @scala.inline
    def withLastPageText(value: String): Self = {
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
    def withLastPageTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPageTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastPageTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPageTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageText(value: String): Self = {
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
    def withNextPageTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageChange(value: (/* page */ Double, /* sizePerPage */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPageChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSizePerPageChange(value: (/* page */ Double, /* sizePerPage */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSizePerPageChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSizePerPageChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSizePerPageChange")(js.undefined)
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
    def withPageButtonRenderer(value: /* options */ PageButtonRendererOptions => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageButtonRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPageButtonRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageButtonRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withPageListRenderer(value: /* options */ PageListRendererOptions => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageListRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPageListRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageListRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withPageStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageStartIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationTotalRenderer(value: (/* from */ Double, /* to */ Double, /* size */ Double) => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationTotalRenderer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPaginationTotalRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationTotalRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withPrePageText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prePageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrePageText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prePageText")(js.undefined)
        ret
    }
    @scala.inline
    def withPrePageTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prePageTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrePageTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prePageTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTotal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withSizePerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizePerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizePerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizePerPage")(js.undefined)
        ret
    }
    @scala.inline
    def withSizePerPageList(value: js.Array[AnonText | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizePerPageList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizePerPageList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizePerPageList")(js.undefined)
        ret
    }
    @scala.inline
    def withSizePerPageOptionRenderer(value: /* options */ SizePerPageOptionRendererOptions => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizePerPageOptionRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSizePerPageOptionRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizePerPageOptionRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withSizePerPageRenderer(value: /* options */ SizePerPageRendererOptions => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizePerPageRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSizePerPageRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizePerPageRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSize")(js.undefined)
        ret
    }
    @scala.inline
    def withWithFirstAndLast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withFirstAndLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithFirstAndLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withFirstAndLast")(js.undefined)
        ret
    }
  }
  
}

