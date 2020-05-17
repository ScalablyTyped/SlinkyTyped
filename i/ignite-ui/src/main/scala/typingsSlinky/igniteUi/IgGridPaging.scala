package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridPaging
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Leading label text for the drop down from where the page index can be switched. Use option [locale.currentPageDropDownLeadingLabel](ui.iggridpaging#options:locale.currentPageDropDownLeadingLabel).
  	 */
  var currentPageDropDownLeadingLabel: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the page index drop down. Use option [locale.currentPageDropDownTooltip](ui.iggridpaging#options:locale.currentPageDropDownTooltip).
  	 */
  var currentPageDropDownTooltip: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Trailing label text for the drop down from where the page index can be switched. Use option [locale.currentPageDropDownTrailingLabel](ui.iggridpaging#options:locale.currentPageDropDownTrailingLabel).
  	 */
  var currentPageDropDownTrailingLabel: js.UndefOr[String] = js.native
  /**
  	 * Current page index that's bound in the data source and rendered in the UI.
  	 *
  	 */
  var currentPageIndex: js.UndefOr[Double] = js.native
  /**
  	 * Drop down width for the page size and page index drop downs.
  	 *
  	 */
  var defaultDropDownWidth: js.UndefOr[Double] = js.native
  /**
  	 * Time in milliseconds for which page drop down will wait for keystrokes before changing the page.
  	 *
  	 */
  var delayOnPageChanged: js.UndefOr[Double] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text for the first page label. Use option [locale.firstPageLabelText](ui.iggridpaging#options:locale.firstPageLabelText).
  	 */
  var firstPageLabelText: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the first page button. Use option [locale.firstPageTooltip](ui.iggridpaging#options:locale.firstPageTooltip).
  	 */
  var firstPageTooltip: js.UndefOr[String] = js.native
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 *
  	 */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text for the last page label. Use option [locale.lastPageLabelText](ui.iggridpaging#options:locale.lastPageLabelText).
  	 */
  var lastPageLabelText: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the last page button. Use option [locale.lastPageTooltip](ui.iggridpaging#options:locale.lastPageTooltip).
  	 */
  var lastPageTooltip: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgGridPagingLocale] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text for the next page label. Use option [locale.nextPageLabelText](ui.iggridpaging#options:locale.nextPageLabelText).
  	 */
  var nextPageLabelText: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the next page button. Use option [locale.nextPageTooltip](ui.iggridpaging#options:locale.nextPageTooltip).
  	 */
  var nextPageTooltip: js.UndefOr[String] = js.native
  /**
  	 * Sets/Gets the number of pages which if exceeded a drop down list of page indices is displayed. If the number of pages is less than or equal to this option then buttons for each page are displayed.
  	 *
  	 */
  var pageCountLimit: js.UndefOr[Double] = js.native
  /**
  	 * Event fired after the page index is changed , but before grid data rebinds
  	 */
  var pageIndexChanged: js.UndefOr[PageIndexChangedEvent] = js.native
  /**
  	 * Event fired before the page index is changed.
  	 * Return false in order to cancel page index changing.
  	 */
  var pageIndexChanging: js.UndefOr[PageIndexChangingEvent] = js.native
  /**
  	 * Denotes the name of the encoded URL parameter that will state what is the currently requested page index.
  	 *
  	 */
  var pageIndexUrlKey: js.UndefOr[String] = js.native
  /**
  	 * Number of records loaded and displayed per page.
  	 *
  	 */
  var pageSize: js.UndefOr[Double] = js.native
  /**
  	 * Event fired after the page size is changed from the page size dropdown.
  	 */
  var pageSizeChanged: js.UndefOr[PageSizeChangedEvent] = js.native
  /**
  	 * Event fired when the page size is about to be changed from the page size dropdown.
  	 * Return false in order to cancel page size changing.
  	 */
  var pageSizeChanging: js.UndefOr[PageSizeChangingEvent] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text rendered in front of the page size dropdown, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true.
  	 * Use option [locale.pageSizeDropDownLabel](ui.iggridpaging#options:locale.pageSizeDropDownLabel).
  	 */
  var pageSizeDropDownLabel: js.UndefOr[String] = js.native
  /**
  	 * Page size dropdown location, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true. Can be rendered above the grid header or inside the pager, next to the page links.
  	 *
  	 *
  	 * Valid values:
  	 * "above" The page size drop down will be rendered above the grid header.
  	 * "inpager" The page size drop down will be rendered next to page links.
  	 */
  var pageSizeDropDownLocation: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the page size drop down. Use option [locale.pageSizeDropDownTooltip](ui.iggridpaging#options:locale.pageSizeDropDownTooltip).
  	 */
  var pageSizeDropDownTooltip: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Trailing text for the page size dropdown, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true.
  	 * Use option [locale.pageSizeDropDownTrailingLabel](ui.iggridpaging#options:locale.pageSizeDropDownTrailingLabel).
  	 */
  var pageSizeDropDownTrailingLabel: js.UndefOr[String] = js.native
  /**
  	 * Predefined page sizes that are available to the end user to switch their grid paging to, through a drop down in the grid header.
  	 *
  	 */
  var pageSizeList: js.UndefOr[js.Any] = js.native
  /**
  	 * Denotes the name of the encoded URL parameter that will state what is the currently requested page size.
  	 *
  	 */
  var pageSizeUrlKey: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text templates of buttons that navigate to a particular page. The format string follows the [igTemplating](http://www.igniteui.com/help/igtemplating-overview) style and syntax. See also the [pageCountLimit](ui.iggridpaging#options:pageCountLimit) option.
  	 * Use option [locale.pageTooltipFormat](ui.iggridpaging#options:locale.pageTooltipFormat).
  	 */
  var pageTooltipFormat: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Custom pager records label template - in [igTemplating](http://www.igniteui.com/help/igtemplating-overview) style and syntax.
  	 * Use option [locale.pagerRecordsLabelTemplate](ui.iggridpaging#options:locale.pagerRecordsLabelTemplate).
  	 */
  var pagerRecordsLabelTemplate: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the pager records label. Use option [locale.pagerRecordsLabelTooltip](ui.iggridpaging#options:locale.pagerRecordsLabelTooltip).
  	 */
  var pagerRecordsLabelTooltip: js.UndefOr[String] = js.native
  /**
  	 * Event fired after the pager footer is rendered
  	 */
  var pagerRendered: js.UndefOr[PagerRenderedEvent] = js.native
  /**
  	 * Event fired before the pager footer is rendered (the whole area below the grid records).
  	 *  Event fired after the page size is changed from the page size dropdown.
  	 */
  var pagerRendering: js.UndefOr[PagerRenderingEvent] = js.native
  /**
  	 * Enables/disables paging persistence between states.
  	 *
  	 */
  var persist: js.UndefOr[Boolean] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text for the previous page label. Use option [locale.prevPageLabelText](ui.iggridpaging#options:locale.prevPageLabelText).
  	 */
  var prevPageLabelText: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the previous page button. Use option [locale.prevPageTooltip](ui.iggridpaging#options:locale.prevPageTooltip).
  	 */
  var prevPageTooltip: js.UndefOr[String] = js.native
  /**
  	 * The property in the response data, when using remote data source, that will hold the total number of records in the data source.
  	 *
  	 */
  var recordCountKey: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Option specifying whether to render the first and last page navigation buttons.
  	 *
  	 */
  var showFirstLastPages: js.UndefOr[Boolean] = js.native
  /**
  	 * If false, a dropdown allowing to change the page size will not be rendered in the UI.
  	 *
  	 */
  var showPageSizeDropDown: js.UndefOr[Boolean] = js.native
  /**
  	 * Option specifying whether to show summary label for the currently rendered records or not.
  	 *
  	 */
  var showPagerRecordsLabel: js.UndefOr[Boolean] = js.native
  /**
  	 * Option specifying whether to render the previous and next page navigation buttons.
  	 *
  	 */
  var showPrevNextPages: js.UndefOr[Boolean] = js.native
  /**
  	 * Type of paging. Delegates all paging functionality to the [$.ig.DataSource](ig.datasource).
  	 *
  	 *
  	 * Valid values:
  	 * "remote" Paging is performed by a remote end-point.
  	 * "local" Paging is performed locally by the [$.ig.DataSource](ig.datasource).
  	 */
  var `type`: js.UndefOr[String] = js.native
  /**
  	 * Number of page buttons, adjacent to and including the [active page](ui.iggridpaging#options:currentPageIndex), that are constantly visible. For the invisible pages, previous and next buttons are used.
  	 *
  	 */
  var visiblePageCount: js.UndefOr[Double] = js.native
}

object IgGridPaging {
  @scala.inline
  def apply(): IgGridPaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridPaging]
  }
  @scala.inline
  implicit class IgGridPagingOps[Self <: IgGridPaging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentPageDropDownLeadingLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageDropDownLeadingLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPageDropDownLeadingLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageDropDownLeadingLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPageDropDownTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageDropDownTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPageDropDownTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageDropDownTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPageDropDownTrailingLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageDropDownTrailingLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPageDropDownTrailingLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageDropDownTrailingLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPageIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDropDownWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDropDownWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDropDownWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDropDownWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayOnPageChanged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayOnPageChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayOnPageChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayOnPageChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstPageLabelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageLabelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPageLabelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageLabelText")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstPageTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPageTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withInherit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLastPageLabelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPageLabelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastPageLabelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPageLabelText")(js.undefined)
        ret
    }
    @scala.inline
    def withLastPageTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPageTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastPageTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPageTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: IgGridPagingLocale): Self = {
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
    def withNextPageLabelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageLabelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageLabelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageLabelText")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withPageCountLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageCountLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageCountLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageCountLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withPageIndexChanged(value: (/* event */ Event, /* ui */ PageIndexChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndexChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPageIndexChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndexChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withPageIndexChanging(value: (/* event */ Event, /* ui */ PageIndexChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndexChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPageIndexChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndexChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withPageIndexUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndexUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageIndexUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndexUrlKey")(js.undefined)
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
    def withPageSizeChanged(value: (/* event */ Event, /* ui */ PageSizeChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPageSizeChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizeChanging(value: (/* event */ Event, /* ui */ PageSizeChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPageSizeChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizeDropDownLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeDropDownLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSizeDropDownLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeDropDownLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizeDropDownLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeDropDownLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSizeDropDownLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeDropDownLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizeDropDownTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeDropDownTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSizeDropDownTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeDropDownTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizeDropDownTrailingLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeDropDownTrailingLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSizeDropDownTrailingLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeDropDownTrailingLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizeList(value: js.Any): Self = {
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
    def withPageSizeUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSizeUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeUrlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPageTooltipFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTooltipFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageTooltipFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTooltipFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPagerRecordsLabelTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerRecordsLabelTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagerRecordsLabelTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerRecordsLabelTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withPagerRecordsLabelTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerRecordsLabelTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagerRecordsLabelTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerRecordsLabelTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withPagerRendered(value: (/* event */ Event, /* ui */ PagerRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPagerRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withPagerRendering(value: (/* event */ Event, /* ui */ PagerRenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerRendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPagerRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withPersist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevPageLabelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPageLabelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevPageLabelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPageLabelText")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevPageTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPageTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevPageTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPageTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordCountKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordCountKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFirstLastPages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFirstLastPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFirstLastPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFirstLastPages")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPageSizeDropDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPageSizeDropDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPageSizeDropDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPageSizeDropDown")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPagerRecordsLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPagerRecordsLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPagerRecordsLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPagerRecordsLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPrevNextPages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrevNextPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPrevNextPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrevNextPages")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVisiblePageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visiblePageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisiblePageCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visiblePageCount")(js.undefined)
        ret
    }
  }
  
}

