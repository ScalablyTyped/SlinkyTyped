package typingsSlinky.reactBootstrapTable2Paginator.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactBootstrapTableNext.anon.Text
import typingsSlinky.reactBootstrapTableNext.mod.PageButtonRendererOptions
import typingsSlinky.reactBootstrapTableNext.mod.PageListRendererOptions
import typingsSlinky.reactBootstrapTableNext.mod.PaginationOptions
import typingsSlinky.reactBootstrapTableNext.mod.SizePerPageOptionRendererOptions
import typingsSlinky.reactBootstrapTableNext.mod.SizePerPageRendererOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationChildProps extends PaginationOptions {
  var bootstrap4: js.UndefOr[Boolean] = js.undefined
  var tableId: js.UndefOr[String] = js.undefined
}

object PaginationChildProps {
  @scala.inline
  def apply(
    alwaysShowAllBtns: js.UndefOr[Boolean] = js.undefined,
    bootstrap4: js.UndefOr[Boolean] = js.undefined,
    custom: js.UndefOr[Boolean] = js.undefined,
    firstPageText: String = null,
    firstPageTitle: String = null,
    hidePageListOnlyOnePage: js.UndefOr[Boolean] = js.undefined,
    hideSizePerPage: js.UndefOr[Boolean] = js.undefined,
    lastPageText: String = null,
    lastPageTitle: String = null,
    nextPageText: String = null,
    nextPageTitle: String = null,
    onPageChange: (/* page */ Double, /* sizePerPage */ Double) => Unit = null,
    onSizePerPageChange: (/* page */ Double, /* sizePerPage */ Double) => Unit = null,
    page: js.UndefOr[Double] = js.undefined,
    pageButtonRenderer: /* options */ PageButtonRendererOptions => ReactElement = null,
    pageListRenderer: /* options */ PageListRendererOptions => ReactElement = null,
    pageStartIndex: js.UndefOr[Double] = js.undefined,
    paginationSize: js.UndefOr[Double] = js.undefined,
    paginationTotalRenderer: (/* from */ Double, /* to */ Double, /* size */ Double) => ReactElement = null,
    prePageText: String = null,
    prePageTitle: String = null,
    showTotal: js.UndefOr[Boolean] = js.undefined,
    sizePerPage: js.UndefOr[Double] = js.undefined,
    sizePerPageList: js.Array[Double | Text] = null,
    sizePerPageOptionRenderer: /* options */ SizePerPageOptionRendererOptions => ReactElement = null,
    sizePerPageRenderer: /* options */ SizePerPageRendererOptions => ReactElement = null,
    tableId: String = null,
    totalSize: js.UndefOr[Double] = js.undefined,
    withFirstAndLast: js.UndefOr[Boolean] = js.undefined
  ): PaginationChildProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowAllBtns)) __obj.updateDynamic("alwaysShowAllBtns")(alwaysShowAllBtns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bootstrap4)) __obj.updateDynamic("bootstrap4")(bootstrap4.get.asInstanceOf[js.Any])
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.get.asInstanceOf[js.Any])
    if (firstPageText != null) __obj.updateDynamic("firstPageText")(firstPageText.asInstanceOf[js.Any])
    if (firstPageTitle != null) __obj.updateDynamic("firstPageTitle")(firstPageTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePageListOnlyOnePage)) __obj.updateDynamic("hidePageListOnlyOnePage")(hidePageListOnlyOnePage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSizePerPage)) __obj.updateDynamic("hideSizePerPage")(hideSizePerPage.get.asInstanceOf[js.Any])
    if (lastPageText != null) __obj.updateDynamic("lastPageText")(lastPageText.asInstanceOf[js.Any])
    if (lastPageTitle != null) __obj.updateDynamic("lastPageTitle")(lastPageTitle.asInstanceOf[js.Any])
    if (nextPageText != null) __obj.updateDynamic("nextPageText")(nextPageText.asInstanceOf[js.Any])
    if (nextPageTitle != null) __obj.updateDynamic("nextPageTitle")(nextPageTitle.asInstanceOf[js.Any])
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction2(onPageChange))
    if (onSizePerPageChange != null) __obj.updateDynamic("onSizePerPageChange")(js.Any.fromFunction2(onSizePerPageChange))
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (pageButtonRenderer != null) __obj.updateDynamic("pageButtonRenderer")(js.Any.fromFunction1(pageButtonRenderer))
    if (pageListRenderer != null) __obj.updateDynamic("pageListRenderer")(js.Any.fromFunction1(pageListRenderer))
    if (!js.isUndefined(pageStartIndex)) __obj.updateDynamic("pageStartIndex")(pageStartIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paginationSize)) __obj.updateDynamic("paginationSize")(paginationSize.get.asInstanceOf[js.Any])
    if (paginationTotalRenderer != null) __obj.updateDynamic("paginationTotalRenderer")(js.Any.fromFunction3(paginationTotalRenderer))
    if (prePageText != null) __obj.updateDynamic("prePageText")(prePageText.asInstanceOf[js.Any])
    if (prePageTitle != null) __obj.updateDynamic("prePageTitle")(prePageTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(showTotal)) __obj.updateDynamic("showTotal")(showTotal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sizePerPage)) __obj.updateDynamic("sizePerPage")(sizePerPage.get.asInstanceOf[js.Any])
    if (sizePerPageList != null) __obj.updateDynamic("sizePerPageList")(sizePerPageList.asInstanceOf[js.Any])
    if (sizePerPageOptionRenderer != null) __obj.updateDynamic("sizePerPageOptionRenderer")(js.Any.fromFunction1(sizePerPageOptionRenderer))
    if (sizePerPageRenderer != null) __obj.updateDynamic("sizePerPageRenderer")(js.Any.fromFunction1(sizePerPageRenderer))
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    if (!js.isUndefined(totalSize)) __obj.updateDynamic("totalSize")(totalSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withFirstAndLast)) __obj.updateDynamic("withFirstAndLast")(withFirstAndLast.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationChildProps]
  }
}

