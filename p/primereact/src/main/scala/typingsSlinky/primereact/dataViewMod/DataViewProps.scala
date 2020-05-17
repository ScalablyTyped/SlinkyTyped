package typingsSlinky.primereact.dataViewMod

import slinky.core.facade.ReactElement
import typingsSlinky.primereact.anon.Rows
import typingsSlinky.primereact.primereactStrings.grid
import typingsSlinky.primereact.primereactStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataViewProps extends js.Object {
  var alwaysShowPaginator: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var currentPageReportTemplate: js.UndefOr[String] = js.native
  var emptyMessage: js.UndefOr[String] = js.native
  var first: js.UndefOr[Double] = js.native
  var footer: js.UndefOr[ReactElement | String] = js.native
  var header: js.UndefOr[ReactElement | String] = js.native
  var id: js.UndefOr[String] = js.native
  var itemTemplate: js.UndefOr[
    js.Function2[/* item */ js.Any, /* layout */ grid | list, js.UndefOr[ReactElement]]
  ] = js.native
  var layout: js.UndefOr[String] = js.native
  var `lazy`: js.UndefOr[Boolean] = js.native
  var onPage: js.UndefOr[js.Function1[/* e */ Rows, Unit]] = js.native
  var pageLinkSize: js.UndefOr[Double] = js.native
  var paginator: js.UndefOr[Boolean] = js.native
  var paginatorLeft: js.UndefOr[js.Any] = js.native
  var paginatorPosition: js.UndefOr[String] = js.native
  var paginatorRight: js.UndefOr[js.Any] = js.native
  var paginatorTemplate: js.UndefOr[String] = js.native
  var rows: js.UndefOr[Double] = js.native
  var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.native
  var sortField: js.UndefOr[String] = js.native
  var sortOrder: js.UndefOr[Double] = js.native
  var style: js.UndefOr[String] = js.native
  var totalRecords: js.UndefOr[Double] = js.native
  var value: js.UndefOr[js.Array[_]] = js.native
}

object DataViewProps {
  @scala.inline
  def apply(): DataViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataViewProps]
  }
  @scala.inline
  implicit class DataViewPropsOps[Self <: DataViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysShowPaginator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowPaginator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysShowPaginator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowPaginator")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPageReportTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageReportTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPageReportTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageReportTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooter(value: ReactElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: ReactElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTemplate(value: (/* item */ js.Any, /* layout */ grid | list) => js.UndefOr[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItemTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLazy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPage(value: /* e */ Rows => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPage")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLinkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLinkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLinkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLinkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginator")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginatorLeft(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginatorLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginatorLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginatorLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginatorPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginatorPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginatorPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginatorPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginatorRight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginatorRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginatorRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginatorRight")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginatorTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginatorTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginatorTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginatorTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsPerPageOptions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsPerPageOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsPerPageOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsPerPageOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSortField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortField")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRecords(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

