package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageSettings extends js.Object {
  /** Specifies the current page to display at load time.
    * @Default {1}
    */
  var currentPage: js.UndefOr[Double] = js.native
  /** Using this property we can specify the number of pages should pager contains, according to this count TreeGrid height will be updated.
    * @Default {8}
    */
  var pageCount: js.UndefOr[Double] = js.native
  /** This specifies the number of rows to display in each page.
    * @Default {12}
    */
  var pageSize: js.UndefOr[Double] = js.native
  /** Specifies the mode of record count in a page, whether it should count all the records or the root to count zero level parent records.
    * @Default {ej.TreeGrid.PageSizeMode.All}
    */
  var pageSizeMode: js.UndefOr[PageSizeMode | String] = js.native
  /** Specifies the mode of printing the control, whether it should print the all the records or the current page content.
    * @Default {ej.TreeGrid.PrintMode.AllPages}
    */
  var printMode: js.UndefOr[PrintMode | String] = js.native
  /** Specifies the Custom template for Pager control.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Get the value of records which is bound to TreeGrid. The totalRecordsCount value is calculated based on the datasource bound to TreeGrid.
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
    def withPageSizeMode(value: PageSizeMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSizeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeMode")(js.undefined)
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

