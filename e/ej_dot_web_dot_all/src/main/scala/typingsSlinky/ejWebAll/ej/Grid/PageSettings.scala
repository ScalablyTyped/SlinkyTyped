package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageSettings extends js.Object {
  /** Gets or sets a value that indicates whether to define which page to display currently in the grid
    * @Default {1}
    */
  var currentPage: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates whether to pass the current page information as a query string along with the URL while navigating to other page.
    * @Default {false}
    */
  var enableQueryString: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enables pager template for the grid.
    * @Default {false}
    */
  var enableTemplates: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to define the number of pages displayed in the pager for navigation
    * @Default {8}
    */
  var pageCount: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates whether to define the number of records displayed per page
    * @Default {12}
    */
  var pageSize: js.UndefOr[Double] = js.native
  /** Gets or sets different page size values to the Dropdown in Grid Pager, by which number of records in a page can be changed dynamically.
    * @Default {[]}
    */
  var pageSizeList: js.UndefOr[js.Array[_]] = js.native
  /** Gets or sets a value that indicates whether to define the number of pages to print. See printMode.
    * @Default {ej.Grid.PrintMode.AllPages}
    */
  var printMode: js.UndefOr[PrintMode | String] = js.native
  /** Gets or sets a value that indicates whether to enables default pager for the grid.
    * @Default {false}
    */
  var showDefaults: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to add the template as a pager template for grid.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Get the value of total number of pages in the grid. The totalPages value is calculated based on page size and total records of grid
    * @Default {null}
    */
  var totalPages: js.UndefOr[Double] = js.native
  /** Get the value of total number of records which is bound to the grid. The totalRecordsCount value is calculated based on dataSource bound to the grid.
    * @Default {null}
    */
  var totalRecordsCount: js.UndefOr[Double] = js.native
}

object PageSettings {
  @scala.inline
  def apply(): PageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSettings]
  }
  @scala.inline
  implicit class PageSettingsOps[Self <: PageSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableQueryString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableQueryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableQueryString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableQueryString")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTemplates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTemplates")(js.undefined)
        ret
    }
    @scala.inline
    def withPageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizeList(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSizeList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeList")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintMode(value: PrintMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printMode")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDefaults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPages")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRecordsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRecordsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRecordsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRecordsCount")(js.undefined)
        ret
    }
  }
  
}

