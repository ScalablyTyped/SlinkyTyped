package typingsSlinky.ejWebAll.ej.Pager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers when the current page value of the Pager control is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Triggered when pager numeric item is clicked in pager control.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** Triggered when Pager control is successfully created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root CSS class, which can be used for customization of pager control.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to define which page to display currently in pager.
    * @Default {1}
    */
  var currentPage: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates whether to display the custom text message in Pager.
    */
  var customText: js.UndefOr[String] = js.native
  /** Triggered when Pager control is successfully destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to display the external Message in Pager.
    * @Default {false}
    */
  var enableExternalMessage: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to pass the current page information as a query string along with the URL while navigating to other page.
    * @Default {false}
    */
  var enableQueryString: js.UndefOr[Boolean] = js.native
  /** Align content in the pager control from right to left by setting the property as true.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Enable or disable the Pager control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to display the external Message in Pager.
    */
  var externalMessage: js.UndefOr[String] = js.native
  /** Enables or disables responsive support for the Pager control items on window resize.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
    * a particular country or region.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to define the number of pages displayed in the pager for navigation.
    * @Default {10}
    */
  var pageCount: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates whether to define the number of records displayed per page.
    * @Default {12}
    */
  var pageSize: js.UndefOr[Double] = js.native
  /** It allows to have multiple choices of pageSize values for Pager control. The &quot;pageSize&quot; API value of the pager will be updated depending upon the value being selected
    * from the dropdown.
    * @Default {null}
    */
  var pageSizeList: js.UndefOr[js.Array[_]] = js.native
  /** Indicates the pageSizeMessage to be displayed in Pager when pageSizeList API is defined.
    */
  var pageSizeMessage: js.UndefOr[String] = js.native
  /** Triggered when a value is selected in the pageSizeList dropdown.
    */
  var pageSizeSelected: js.UndefOr[js.Function1[/* e */ PageSizeSelectedEventArgs, Unit]] = js.native
  /** Shows or hides the current page information in pager footer.
    * @Default {true}
    */
  var showPageInfo: js.UndefOr[Boolean] = js.native
  /** Template option allows to customize UI appearance of the ejPager by defining their own page layout.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Get or sets a value of total number of pages in the pager. The totalPages value is calculated based on page size and total records.
    * @Default {null}
    */
  var totalPages: js.UndefOr[Double] = js.native
  /** Get the value of total number of records which is bound to a data item.
    * @Default {null}
    */
  var totalRecordsCount: js.UndefOr[Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: /* e */ ChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: /* e */ ClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
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
    def withCustomText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customText")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableExternalMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableExternalMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableExternalMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableExternalMessage")(js.undefined)
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
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
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
    def withPageSizeMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSizeMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizeSelected(value: /* e */ PageSizeSelectedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPageSizeSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPageInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPageInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPageInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPageInfo")(js.undefined)
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

