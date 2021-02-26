package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTreeGridPaging
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Sets/gets (it is set via  $.html()) delimiter between ancestors in the breadcrumb trail. It is used only when contextRowMode is breadcrumb
    *
    */
  var breadcrumbDelimiter: js.UndefOr[String] = js.native
  
  /**
    * Sets/gets the column key of ancestor to be shown in the breadcrumb trail. It is used only when contextRowMode is breadcrumb
    *
    */
  var breadcrumbKey: js.UndefOr[String] = js.native
  
  /**
    * This option has been deprecated as of the 2017.2 Volume release.
    * Sets/gets the text message shown while loading content of the context row(while processing breadcrumb/immediate parent row). It is set via $.html(). If set to null loading message is not shown.
    * Use option [locale.contextRowLoadingText](ui.igtreegridpaging#options:locale.contextRowLoadingText)
    */
  var contextRowLoadingText: js.UndefOr[String] = js.native
  
  /**
    * When data flows to the next page there are a couple of different modes that can help communicate the context of a leaf level row. When mode option is "rootLevelOnly" then the context row always shows the value of the contextRowRootText option.
    *
    *
    * Valid values:
    * "none" Does not render the contextual row
    * "parent" Renders a read-only representation of the immediate parent row
    * "breadcrumb" Renders a read-only breadcrumb trail representing the full path through all ancestors
    */
  var contextRowMode: js.UndefOr[String] = js.native
  
  /**
    * Event fired context row content is rendered.
    */
  var contextRowRendered: js.UndefOr[ContextRowRenderedEvent] = js.native
  
  /**
    * Event fired before rendering context row content.
    * Return false in order to cancel this event.
    */
  var contextRowRendering: js.UndefOr[ContextRowRenderingEvent] = js.native
  
  /**
    * This option has been deprecated as of the 2017.2 Volume release.
    * Sets/gets the content of the context row when the first record in the page is root(hasn't ancestors) record. It is set via $.html()
    * Use option [locale.contextRowRootText](ui.igtreegridpaging#options:locale.contextRowRootText)
    */
  var contextRowRootText: js.UndefOr[String] = js.native
  
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
    * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  
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
  
  var locale: js.UndefOr[IgTreeGridPagingLocale] = js.native
  
  /**
    * Sets gets paging mode.
    *
    *
    * Valid values:
    * "rootLevelOnly" Only pages records at the root of the tree grid are displayed.
    * "allLevels" includes all visible records in paging.
    */
  var mode: js.UndefOr[String] = js.native
  
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
    * Reference to the (or name of )function, called before rendering context row content(rendering loading message/bread crumb/parent row). The function takes 4 arguments- dataRow, $textArea- jQuery representation of the text area of the context row(when mode is loading/breadcrumb then it is <span /> otherwise <tr />), array of parent rows and context mode - "loading"|"breadcrumb"|"parent". When the function returns string it is used as html set in $textArea. If the function does not return result or returns false/empty string then rendering of the content of the context row should be handled by the developer(similar to canceling rendering of context row content).
    *
    */
  var renderContextRowFunc: js.UndefOr[js.Function | String] = js.native
  
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
object IgTreeGridPaging {
  
  @scala.inline
  def apply(): IgTreeGridPaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridPaging]
  }
  
  @scala.inline
  implicit class IgTreeGridPagingMutableBuilder[Self <: IgTreeGridPaging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreadcrumbDelimiter(value: String): Self = StObject.set(x, "breadcrumbDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreadcrumbDelimiterUndefined: Self = StObject.set(x, "breadcrumbDelimiter", js.undefined)
    
    @scala.inline
    def setBreadcrumbKey(value: String): Self = StObject.set(x, "breadcrumbKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreadcrumbKeyUndefined: Self = StObject.set(x, "breadcrumbKey", js.undefined)
    
    @scala.inline
    def setContextRowLoadingText(value: String): Self = StObject.set(x, "contextRowLoadingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextRowLoadingTextUndefined: Self = StObject.set(x, "contextRowLoadingText", js.undefined)
    
    @scala.inline
    def setContextRowMode(value: String): Self = StObject.set(x, "contextRowMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextRowModeUndefined: Self = StObject.set(x, "contextRowMode", js.undefined)
    
    @scala.inline
    def setContextRowRendered(value: (/* event */ Event, /* ui */ ContextRowRenderedEventUIParam) => Unit): Self = StObject.set(x, "contextRowRendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setContextRowRenderedUndefined: Self = StObject.set(x, "contextRowRendered", js.undefined)
    
    @scala.inline
    def setContextRowRendering(value: (/* event */ Event, /* ui */ ContextRowRenderingEventUIParam) => Unit): Self = StObject.set(x, "contextRowRendering", js.Any.fromFunction2(value))
    
    @scala.inline
    def setContextRowRenderingUndefined: Self = StObject.set(x, "contextRowRendering", js.undefined)
    
    @scala.inline
    def setContextRowRootText(value: String): Self = StObject.set(x, "contextRowRootText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextRowRootTextUndefined: Self = StObject.set(x, "contextRowRootText", js.undefined)
    
    @scala.inline
    def setCurrentPageDropDownLeadingLabel(value: String): Self = StObject.set(x, "currentPageDropDownLeadingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageDropDownLeadingLabelUndefined: Self = StObject.set(x, "currentPageDropDownLeadingLabel", js.undefined)
    
    @scala.inline
    def setCurrentPageDropDownTooltip(value: String): Self = StObject.set(x, "currentPageDropDownTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageDropDownTooltipUndefined: Self = StObject.set(x, "currentPageDropDownTooltip", js.undefined)
    
    @scala.inline
    def setCurrentPageDropDownTrailingLabel(value: String): Self = StObject.set(x, "currentPageDropDownTrailingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageDropDownTrailingLabelUndefined: Self = StObject.set(x, "currentPageDropDownTrailingLabel", js.undefined)
    
    @scala.inline
    def setCurrentPageIndex(value: Double): Self = StObject.set(x, "currentPageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageIndexUndefined: Self = StObject.set(x, "currentPageIndex", js.undefined)
    
    @scala.inline
    def setDefaultDropDownWidth(value: Double): Self = StObject.set(x, "defaultDropDownWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDropDownWidthUndefined: Self = StObject.set(x, "defaultDropDownWidth", js.undefined)
    
    @scala.inline
    def setDelayOnPageChanged(value: Double): Self = StObject.set(x, "delayOnPageChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayOnPageChangedUndefined: Self = StObject.set(x, "delayOnPageChanged", js.undefined)
    
    @scala.inline
    def setFirstPageLabelText(value: String): Self = StObject.set(x, "firstPageLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageLabelTextUndefined: Self = StObject.set(x, "firstPageLabelText", js.undefined)
    
    @scala.inline
    def setFirstPageTooltip(value: String): Self = StObject.set(x, "firstPageTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageTooltipUndefined: Self = StObject.set(x, "firstPageTooltip", js.undefined)
    
    @scala.inline
    def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    @scala.inline
    def setLastPageLabelText(value: String): Self = StObject.set(x, "lastPageLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPageLabelTextUndefined: Self = StObject.set(x, "lastPageLabelText", js.undefined)
    
    @scala.inline
    def setLastPageTooltip(value: String): Self = StObject.set(x, "lastPageTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPageTooltipUndefined: Self = StObject.set(x, "lastPageTooltip", js.undefined)
    
    @scala.inline
    def setLocale(value: IgTreeGridPagingLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setNextPageLabelText(value: String): Self = StObject.set(x, "nextPageLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageLabelTextUndefined: Self = StObject.set(x, "nextPageLabelText", js.undefined)
    
    @scala.inline
    def setNextPageTooltip(value: String): Self = StObject.set(x, "nextPageTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTooltipUndefined: Self = StObject.set(x, "nextPageTooltip", js.undefined)
    
    @scala.inline
    def setPageCountLimit(value: Double): Self = StObject.set(x, "pageCountLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageCountLimitUndefined: Self = StObject.set(x, "pageCountLimit", js.undefined)
    
    @scala.inline
    def setPageIndexChanged(value: (/* event */ Event, /* ui */ PageIndexChangedEventUIParam) => Unit): Self = StObject.set(x, "pageIndexChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPageIndexChangedUndefined: Self = StObject.set(x, "pageIndexChanged", js.undefined)
    
    @scala.inline
    def setPageIndexChanging(value: (/* event */ Event, /* ui */ PageIndexChangingEventUIParam) => Unit): Self = StObject.set(x, "pageIndexChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPageIndexChangingUndefined: Self = StObject.set(x, "pageIndexChanging", js.undefined)
    
    @scala.inline
    def setPageIndexUrlKey(value: String): Self = StObject.set(x, "pageIndexUrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIndexUrlKeyUndefined: Self = StObject.set(x, "pageIndexUrlKey", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeChanged(value: (/* event */ Event, /* ui */ PageSizeChangedEventUIParam) => Unit): Self = StObject.set(x, "pageSizeChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPageSizeChangedUndefined: Self = StObject.set(x, "pageSizeChanged", js.undefined)
    
    @scala.inline
    def setPageSizeChanging(value: (/* event */ Event, /* ui */ PageSizeChangingEventUIParam) => Unit): Self = StObject.set(x, "pageSizeChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPageSizeChangingUndefined: Self = StObject.set(x, "pageSizeChanging", js.undefined)
    
    @scala.inline
    def setPageSizeDropDownLabel(value: String): Self = StObject.set(x, "pageSizeDropDownLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeDropDownLabelUndefined: Self = StObject.set(x, "pageSizeDropDownLabel", js.undefined)
    
    @scala.inline
    def setPageSizeDropDownLocation(value: String): Self = StObject.set(x, "pageSizeDropDownLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeDropDownLocationUndefined: Self = StObject.set(x, "pageSizeDropDownLocation", js.undefined)
    
    @scala.inline
    def setPageSizeDropDownTooltip(value: String): Self = StObject.set(x, "pageSizeDropDownTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeDropDownTooltipUndefined: Self = StObject.set(x, "pageSizeDropDownTooltip", js.undefined)
    
    @scala.inline
    def setPageSizeDropDownTrailingLabel(value: String): Self = StObject.set(x, "pageSizeDropDownTrailingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeDropDownTrailingLabelUndefined: Self = StObject.set(x, "pageSizeDropDownTrailingLabel", js.undefined)
    
    @scala.inline
    def setPageSizeList(value: js.Any): Self = StObject.set(x, "pageSizeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeListUndefined: Self = StObject.set(x, "pageSizeList", js.undefined)
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageSizeUrlKey(value: String): Self = StObject.set(x, "pageSizeUrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUrlKeyUndefined: Self = StObject.set(x, "pageSizeUrlKey", js.undefined)
    
    @scala.inline
    def setPageTooltipFormat(value: String): Self = StObject.set(x, "pageTooltipFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTooltipFormatUndefined: Self = StObject.set(x, "pageTooltipFormat", js.undefined)
    
    @scala.inline
    def setPagerRecordsLabelTemplate(value: String): Self = StObject.set(x, "pagerRecordsLabelTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagerRecordsLabelTemplateUndefined: Self = StObject.set(x, "pagerRecordsLabelTemplate", js.undefined)
    
    @scala.inline
    def setPagerRecordsLabelTooltip(value: String): Self = StObject.set(x, "pagerRecordsLabelTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagerRecordsLabelTooltipUndefined: Self = StObject.set(x, "pagerRecordsLabelTooltip", js.undefined)
    
    @scala.inline
    def setPagerRendered(value: (/* event */ Event, /* ui */ PagerRenderedEventUIParam) => Unit): Self = StObject.set(x, "pagerRendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPagerRenderedUndefined: Self = StObject.set(x, "pagerRendered", js.undefined)
    
    @scala.inline
    def setPagerRendering(value: (/* event */ Event, /* ui */ PagerRenderingEventUIParam) => Unit): Self = StObject.set(x, "pagerRendering", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPagerRenderingUndefined: Self = StObject.set(x, "pagerRendering", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    @scala.inline
    def setPrevPageLabelText(value: String): Self = StObject.set(x, "prevPageLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevPageLabelTextUndefined: Self = StObject.set(x, "prevPageLabelText", js.undefined)
    
    @scala.inline
    def setPrevPageTooltip(value: String): Self = StObject.set(x, "prevPageTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevPageTooltipUndefined: Self = StObject.set(x, "prevPageTooltip", js.undefined)
    
    @scala.inline
    def setRecordCountKey(value: String): Self = StObject.set(x, "recordCountKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordCountKeyUndefined: Self = StObject.set(x, "recordCountKey", js.undefined)
    
    @scala.inline
    def setRenderContextRowFunc(value: js.Function | String): Self = StObject.set(x, "renderContextRowFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderContextRowFuncUndefined: Self = StObject.set(x, "renderContextRowFunc", js.undefined)
    
    @scala.inline
    def setShowFirstLastPages(value: Boolean): Self = StObject.set(x, "showFirstLastPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFirstLastPagesUndefined: Self = StObject.set(x, "showFirstLastPages", js.undefined)
    
    @scala.inline
    def setShowPageSizeDropDown(value: Boolean): Self = StObject.set(x, "showPageSizeDropDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPageSizeDropDownUndefined: Self = StObject.set(x, "showPageSizeDropDown", js.undefined)
    
    @scala.inline
    def setShowPagerRecordsLabel(value: Boolean): Self = StObject.set(x, "showPagerRecordsLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPagerRecordsLabelUndefined: Self = StObject.set(x, "showPagerRecordsLabel", js.undefined)
    
    @scala.inline
    def setShowPrevNextPages(value: Boolean): Self = StObject.set(x, "showPrevNextPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPrevNextPagesUndefined: Self = StObject.set(x, "showPrevNextPages", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisiblePageCount(value: Double): Self = StObject.set(x, "visiblePageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisiblePageCountUndefined: Self = StObject.set(x, "visiblePageCount", js.undefined)
  }
}
