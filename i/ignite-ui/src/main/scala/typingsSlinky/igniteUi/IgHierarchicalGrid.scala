package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgHierarchicalGrid
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * If this option is set to true, the height of the grid row will be calculated automatically based on the [avgRowHeight](ui.ighierarchicalgrid#options:avgRowHeight) and the visible virtual records. If no [avgRowHeight](ui.ighierarchicalgrid#options:avgRowHeight) is specified, it will be calculated automatically at runtime.
  	 *
  	 */
  var adjustVirtualHeights: js.UndefOr[Boolean] = js.native
  /**
  	 * If set to true, the following behavior will take place:
  	 * If a new row is added, and then deleted, there will be no transaction added to the log.
  	 * If a new row is added, edited, then deleted, there will be no transaction added to the log.
  	 * If several edits are made to a row or an individual cell, this should result in a single transaction.
  	 * Note: This option takes effect only when [autoCommit](ui.ighierarchicalgrid#options:autoCommit) is set to false.
  	 *
  	 */
  var aggregateTransactions: js.UndefOr[Boolean] = js.native
  /**
  	 * Enables/disables rendering of alternating row styles (odd and even rows receive different styling).
  	 *
  	 */
  var alternateRowStyles: js.UndefOr[Boolean] = js.native
  /**
  	 * The row expanding/collapsing animation duration in ms.
  	 *
  	 */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
  	 * If autoAdjustHeight is set to false, the [height](ui.ighierarchicalgrid#options:height) will be set only on the scrolling container, and all other UI elements such as paging footer / filter row / headers will add on top of that, so the total height of the grid will be more than this value - the height of the scroll container (content area) will not be dynamically calculated. Setting this option to false will usually result in a lot better initial rendering performance for large data sets ( > 1000 rows rendered at once, no [virtualization](ui.ighierarchicalgrid#options:virtualization) enabled), since no reflows will be made by browsers when accessing DOM properties such as offsetHeight.
  	 *
  	 */
  var autoAdjustHeight: js.UndefOr[Boolean] = js.native
  /**
  	 * Automatically commits the transactions as rows/cells are being edited to the client data source. A [saveChanges](ui.ighierarchicalgrid#methods:saveChanges) call still needs to be performed in order to commit the transactions to a server-side data source.
  	 *
  	 */
  var autoCommit: js.UndefOr[Boolean] = js.native
  /**
  	 * Sets gets ability to automatically format text in cells for numeric and date columns. The format patterns and rules for numbers and dates are defined in $.ig.regional.defaults object. [Here column formatting is explained in details](http://www.igniteui.com/help/iggrid-columns-and-layout#column-formatting)
  	 *
  	 *
  	 * Valid values:
  	 * "date" formats only Date columns
  	 * "number" formats only number columns
  	 * "dateandnumber" formats both Date and number columns
  	 * "true" formats Date and number columns
  	 * "false" auto formatting is disabled
  	 */
  var autoFormat: js.UndefOr[String | Boolean] = js.native
  /**
  	 * If no [columns](ui.ighierarchicalgrid#options:columns) collection is defined, and autoGenerateColumns is set to true, [columns](ui.ighierarchicalgrid#options:columns) will be inferred from the data source before the [dataRendering](ui.iggrid#events:dataRendering) event is fired. The inferred [columns](ui.ighierarchicalgrid#options:columns) collection will be available to the developer for modification at [dataRendering](ui.iggrid#events:dataRendering). If autoGenerateColumns is not explicitly set and [columns](ui.ighierarchicalgrid#options:columns) has at least one column defined then autoGenerateColumns is automatically set to false.
  	 * If autoGenerateColumns is true and there are columns defined auto-generated columns will render after the explicitly defined ones.
  	 * Since auto-generated columns don't have width defined consider setting [defaultColumnWidth](ui.ighierarchicalgrid#options:defaultColumnWidth) as well.
  	 *
  	 */
  var autoGenerateColumns: js.UndefOr[Boolean] = js.native
  /**
  	 * If true, will autogenerate all layouts assuming default values for "childrenDataProperty"
  	 * When autoGenerateLayouts is enabled, it will automatically generate all columns recursively. (all columns on all levels)
  	 *
  	 */
  var autoGenerateLayouts: js.UndefOr[Boolean] = js.native
  /**
  	 * If set to true and all columns' widths are specified and their combined width is less than the grid width then the last column width will be automatically adjusted to fill the remaining empty space of the grid.
  	 *
  	 */
  var autofitLastColumn: js.UndefOr[Boolean] = js.native
  /**
  	 * Used for [column virtualization](ui.ighierarchicalgrid#options:columnVirtualization) in [fixed mode](ui.ighierarchicalgrid#options:virtualizationMode). This is the average value in pixels for a column width.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The avarage column width can be set in pixels ("25px").
  	 * "number" The avarage column width can be set in pixels as a number (25).
  	 */
  var avgColumnWidth: js.UndefOr[String | Double] = js.native
  /**
  	 * Used for [row virtualization](ui.ighierarchicalgrid#options:rowVirtualization) in [fixed mode](ui.ighierarchicalgrid#options:virtualizationMode). This is the average value in pixels (default) that will be used to calculate how many rows to render as the end user scrolls. Also all rows' height will be automatically set to this value.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The avarage row height can be set in pixels ("25px").
  	 * "number" The avarage row height can be set in pixels as a number (25).
  	 */
  var avgRowHeight: js.UndefOr[String | Double] = js.native
  /**
  	 * Caption text that will be shown above the grid header.
  	 *
  	 */
  var caption: js.UndefOr[String] = js.native
  /**
  	 * Event fired after the caption has been rendered.
  	 */
  var captionRendered: js.UndefOr[CaptionRenderedEvent] = js.native
  /**
  	 * Event fired before the caption starts its rendering.
  	 * Return false in order to cancel caption rendering.
  	 */
  var captionRendering: js.UndefOr[CaptionRenderingEvent] = js.native
  /**
  	 * Event fired when a cell is clicked.
  	 */
  var cellClick: js.UndefOr[CellClickEvent] = js.native
  /**
  	 * Event fired when a cell is right clicked.
  	 */
  var cellRightClick: js.UndefOr[CellRightClickEvent] = js.native
  /**
  	 * Event fired after a child grid is created
  	 */
  var childGridCreated: js.UndefOr[ChildGridCreatedEvent] = js.native
  /**
  	 * Event fired before a child grid is going to be created, allows the developer to override the child grid creation
  	 */
  var childGridCreating: js.UndefOr[ChildGridCreatingEvent] = js.native
  /**
  	 * Event fired when child grid is rendered
  	 */
  var childGridRendered: js.UndefOr[ChildGridRenderedEvent] = js.native
  /**
  	 * Event which is fired when children have been populated (Load on demand)
  	 */
  var childrenPopulated: js.UndefOr[ChildrenPopulatedEvent] = js.native
  /**
  	 * Event which is fired when children are about to be populated (Load on demand)
  	 */
  var childrenPopulating: js.UndefOr[ChildrenPopulatingEvent] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the default tooltip applied to an expand column cell, that is currently expanded. Use option [locale.collapseTooltip](ui.ighierarchicalgrid#options:locale.collapseTooltip).
  	 */
  var collapseTooltip: js.UndefOr[String] = js.native
  /**
  	 * List of columnLayout objects that specify the structure of the child grids. All options that are applicable to a flat grid are also applicable here
  	 *
  	 */
  var columnLayouts: js.UndefOr[js.Array[IgHierarchicalGridColumnLayout]] = js.native
  /**
  	 * Enables virtualization for columns only. Column virtualization can work only in combination with fixed row virtalization. Setting columnVirtualization to true will automatically set [virtualization](ui.ighierarchicalgrid#options:virtualization) to true and [virtualizationMode](ui.ighierarchicalgrid#options:virtualizationMode) to "fixed".
  	 *
  	 */
  var columnVirtualization: js.UndefOr[Boolean] = js.native
  /**
  	 * An array of column objects. Checkout the [Columns and Layout](http://www.igniteui.com/help/iggrid-columns-and-layout#defining-columns) topic for details on configuring the columns array.
  	 *
  	 */
  var columns: js.UndefOr[js.Array[IgHierarchicalGridColumn]] = js.native
  /**
  	 * Event fired after the columns colection has been modified(e.g. a column is hidden)
  	 */
  var columnsCollectionModified: js.UndefOr[ColumnsCollectionModifiedEvent] = js.native
  /**
  	 * Fired when the grid is created and the initial structure is rendered (this doesn't necessarily imply the data will be there if the data source is remote)
  	 */
  var created: js.UndefOr[CreatedEvent] = js.native
  /**
  	 * Event fired before data binding takes place.
  	 *
  	 * Return false in order to cancel data binding.
  	 */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.native
  /**
  	 * Event fired after data binding is complete.
  	 */
  var dataBound: js.UndefOr[DataBoundEvent] = js.native
  /**
  	 * Event fired after all of the data records in the grid table body have been rendered.
  	 */
  var dataRendered: js.UndefOr[DataRenderedEvent] = js.native
  /**
  	 * Event fired before the TBODY holding the data records starts its rendering.
  	 * Return false in order to cancel data records rendering.
  	 */
  var dataRendering: js.UndefOr[DataRenderingEvent] = js.native
  /**
  	 * Can be any valid data source accepted by [$.ig.DataSource](ig.datasource), or an instance of an $.ig.DataSource itself
  	 *
  	 *
  	 * Valid values:
  	 * "string" DataSource as a string. For example a Url.
  	 * "array" DataSource as an array.
  	 * "object" DataSource as an object. For example a JSON object
  	 */
  var dataSource: js.UndefOr[String | js.Array[_] | js.Object] = js.native
  /**
  	 * Explicitly set data source type (such as "json"). Please refer to the documentation of [$.ig.DataSource type](ig.datasource#options:settings.type).
  	 *
  	 */
  var dataSourceType: js.UndefOr[String] = js.native
  /**
  	 * Specifies a remote URL as a data source, from which data will be retrieved using the [$.ig.DataSource](ig.datasource).
  	 *
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.native
  /**
  	 * Specifies the default property in the response where children will be located
  	 *
  	 */
  var defaultChildrenDataProperty: js.UndefOr[String] = js.native
  /**
  	 * Default column width that will be set for all columns, that don't have [column width](ui.ighierarchicalgrid#options:columns.width) defined.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The default column width can be set in pixels ("100px").
  	 * "number" The default column width can be set in pixels as a number (100).
  	 */
  var defaultColumnWidth: js.UndefOr[String | Double] = js.native
  /**
  	 * Fired when the grid is destroyed
  	 */
  var destroyed: js.UndefOr[DestroyedEvent] = js.native
  /**
  	 * Enables/disables rendering of hover styles when the mouse is over a record. This can be useful in templating scenarios, for example, where we don't want to apply hover styling to templated content.
  	 *
  	 */
  var enableHoverStyles: js.UndefOr[Boolean] = js.native
  /**
  	 * Enables/disables grid adjusting its dimensions when its [width](ui.ighierarchicalgrid#options:width) and/or [height](ui.ighierarchicalgrid#options:height) is set in percent (%) and grid parent DOM container is resized.
  	 *
  	 */
  var enableResizeContainerCheck: js.UndefOr[Boolean] = js.native
  /**
  	 * Nables/Disables serializing client date as UTC ISO 8061 string instead of using the local time and zone values.
  	 *
  	 */
  var enableUTCDates: js.UndefOr[Boolean] = js.native
  /**
  	 * Specifies the expand column width
  	 *
  	 */
  var expandColWidth: js.UndefOr[Double] = js.native
  /**
  	 * Applies a linear animation - either expanding or collapsing depending on the parent row state
  	 *
  	 */
  var expandCollapseAnimations: js.UndefOr[Boolean] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the default tooltip applied to an expand column cell, that is currently collapsed. Use option [locale.columnChooserCaptionText](ui.ighierarchicalgrid#options:locale.expandTooltip).
  	 */
  var expandTooltip: js.UndefOr[String] = js.native
  /**
  	 * Configures how the feature chooser icon should display on header cells - e.g. to display as gear icon or not.
  	 *
  	 *
  	 * Valid values:
  	 * "none" Always hide the feature chooser icon; The feature chooser is shown on tapping/clicking the column header.
  	 * "desktopOnly" Always show the icon on desktop but hide when touch device detected.
  	 * "always" Always show it in any environment. Chooser is shown when tapping the gear icon or column header.
  	 */
  var featureChooserIconDisplay: js.UndefOr[String] = js.native
  /**
  	 * List of grid feature definitions: sorting, paging, etc. Each feature goes with its separate options that are documented for the feature accordingly. [Here you can find detailed documentation for all igGrid features](http://www.igniteui.com/help/iggrid-features-landing-page)
  	 *
  	 */
  var features: js.UndefOr[js.Array[IgHierarchicalGridFeature]] = js.native
  /**
  	 * Footers will be fixed if this option is set to true, and only the grid data will be scrollable. If [virtualization](ui.ighierarchicalgrid#options:virtualization) is enabled, fixedFooters will always act as if it's true, no matter which value is set.
  	 *
  	 */
  var fixedFooters: js.UndefOr[Boolean] = js.native
  /**
  	 * Headers will be fixed if this option is set to true, and only the grid data will be scrollable. If [virtualization](ui.ighierarchicalgrid#options:virtualization) is enabled, fixedHeaders will always act as if it's true, no matter which value is set.
  	 *
  	 */
  var fixedHeaders: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired after the footer has been rendered.
  	 */
  var footerRendered: js.UndefOr[FooterRenderedEvent] = js.native
  /**
  	 * Event fired before the footer starts its rendering.
  	 *
  	 * Return false in order to cancel footer rendering.
  	 */
  var footerRendering: js.UndefOr[FooterRenderingEvent] = js.native
  /**
  	 * Event fired after every TH in the grid header has been rendered.
  	 */
  var headerCellRendered: js.UndefOr[HeaderCellRenderedEvent] = js.native
  /**
  	 * Event fired after the header has been rendered.
  	 */
  var headerRendered: js.UndefOr[HeaderRenderedEvent] = js.native
  /**
  	 * Event fired before the header starts its rendering.
  	 * Return false in order to cancel header rendering.
  	 */
  var headerRendering: js.UndefOr[HeaderRenderingEvent] = js.native
  /**
  	 * This is the total height of the grid, including all UI elements - scroll container with data rows, header, footer, filter row - (if any), etc. [Here you can find more info about setting igGrid height](http://www.igniteui.com/help/iggrid-columns-and-layout#width-height).
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget height can be set in pixels (px) and percentage (%).
  	 * "number" The widget height can be set as a number
  	 * "null" will stretch vertically to fit data.
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Only the first level will be data-bound initially. Also serves as "render" depth, meaning that depending on this prop, the grid will render the child grids up to the specified level.
  	 *
  	 */
  var initialDataBindDepth: js.UndefOr[Double] = js.native
  /**
  	 * No levels will be automatically expanded when the widget is instantiated for the first time
  	 *
  	 */
  var initialExpandDepth: js.UndefOr[Double] = js.native
  /**
  	 * When dataSource is a remote URL, defines whether to set the type of the remote data source to JSONP.
  	 *
  	 */
  var jsonpRequest: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * If this option is set to false, the data to which the grid is bound will be used "as is" with no additional transformations based on [columns](ui.ighierarchicalgrid#options:columns) defined. Otherwise only the subset of data properties used in the [columns](ui.ighierarchicalgrid#options:columns) defined will be extracted in a new object and used.
  	 *
  	 */
  var localSchemaTransform: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[IgHierarchicalGridLocale] = js.native
  /**
  	 * Specifies the limit on the number of levels to bind to
  	 *
  	 */
  var maxDataBindDepth: js.UndefOr[Double] = js.native
  /**
  	 * Merge unbound columns values inside data source when data source is remote. If true then the unbound columns are merged to the data source at runtime on the server. Note that data source is expanded with the new data and this could cause performance issues when the data is huge. If mergeUnboundColumns is false then the unbound data is sent and merged on the client. This option is used by the [igGrid MVC Helper](http://www.igniteui.com/help/iggrid-developing-asp-net-mvc-applications-with-iggrid).
  	 * Checkout [Populating Unbound Columns Remotely (igGrid)](http://www.igniteui.com/help/iggrid-unboundcolumns-populating-with-data-remotely) topic for more information.
  	 *
  	 */
  var mergeUnboundColumns: js.UndefOr[Boolean] = js.native
  /**
  	 * If true, encodes all requests using OData conventions and the $expand syntax
  	 *
  	 */
  var odata: js.UndefOr[Boolean] = js.native
  /**
  	 * Specifies the delimiter for constructing paths , for hierarchical lookup of data
  	 *
  	 */
  var pathSeparator: js.UndefOr[String] = js.native
  /**
  	 * Key of the column containing unique identifiers for the data records.
  	 *
  	 */
  var primaryKey: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Gets sets ability to render checkboxes and use checkbox editor when dataType of a column is "bool". Checkboxes are not rendered for boolean values in columns with a [column template](ui.ighierarchicalgrid#options:columns.template).
  	 *
  	 */
  var renderCheckboxes: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired after the whole grid widget has been rendered (including headers, footers, etc.).
  	 * This event is fired only when the grid is being initialized.
  	 * It will not be fired if the grid is rebound to its data
  	 * (for example, when calling the dataBind() API method
  	 * or when changing the page size (when paging is enabled)).
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  /**
  	 * Event fired before the grid starts rendering (all contents).
  	 * This event is fired only when the grid is being initialized.
  	 * It will not be fired if the grid is rebound to its data
  	 * (for example, when calling the dataBind() API method
  	 * or when changing the page size (when paging is enabled)).
  	 * Return false in order to cancel grid rendering.
  	 */
  var rendering: js.UndefOr[RenderingEvent] = js.native
  /**
  	 * Event fired if there is an error in the request, when the grid is doing a remote operation,
  	 * such as data binding, paging, sorting, etc.
  	 */
  var requestError: js.UndefOr[RequestErrorEvent] = js.native
  /**
  	 * Specifies the HTTP verb to be used to issue the requests to a remote data source.
  	 *
  	 */
  var requestType: js.UndefOr[String] = js.native
  /**
  	 * Content type of the response. See http://api.jquery.com/jQuery.ajax/ => contentType
  	 *
  	 */
  var responseContentType: js.UndefOr[String] = js.native
  /**
  	 * See [$.ig.DataSource responseDataKey](ig.datasource#options:settings.responseDataKey). This is the property in the responses where data records are held, if the response is wrapped.
  	 *
  	 */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
  	 * See [$.ig.DataSource responseTotalRecCountKey](ig.datasource#options:settings.responseTotalRecCountKey). Property in the response specifying the total number of records on the server.
  	 *
  	 */
  var responseTotalRecCountKey: js.UndefOr[String] = js.native
  /**
  	 * If true, load on demand will be achieved using REST compliant resource access with appropriate url-s for
  	 * the ajax GET calls.
  	 *
  	 */
  var rest: js.UndefOr[Boolean] = js.native
  /**
  	 * Settings related to REST compliant update routines.
  	 *
  	 */
  var restSettings: js.UndefOr[IgHierarchicalGridRestSettings] = js.native
  /**
  	 * Event which is fired when a hierarchical row has been collapsed
  	 */
  var rowCollapsed: js.UndefOr[RowCollapsedEvent] = js.native
  /**
  	 * Event which is fired when a hierarchical row is about to be collapsed
  	 */
  var rowCollapsing: js.UndefOr[RowCollapsingEvent] = js.native
  /**
  	 * Event which is fired after a hierarchical row has been expanded
  	 */
  var rowExpanded: js.UndefOr[RowExpandedEvent] = js.native
  /**
  	 * Event which is fired when a hierarchical row is about to be expanded
  	 */
  var rowExpanding: js.UndefOr[RowExpandingEvent] = js.native
  /**
  	 * Enables virtualization for rows only. [Here you can find more info about igGrid row virtualization](http://www.igniteui.com/help/iggrid-virtualization-overview)
  	 *
  	 */
  var rowVirtualization: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired after data rows are rendered.
  	 */
  var rowsRendered: js.UndefOr[RowsRenderedEvent] = js.native
  /**
  	 * Event fired before actual data rows (TRs) are rendered.
  	 * Return false in order to cancel rows rendering.
  	 */
  var rowsRendering: js.UndefOr[RowsRenderingEvent] = js.native
  /**
  	 * Event fired after $.ig.DataSource schema has been generated, in case it needs to be modified.
  	 */
  var schemaGenerated: js.UndefOr[SchemaGeneratedEvent] = js.native
  /**
  	 * Settings related to content scrolling.
  	 *
  	 */
  var scrollSettings: js.UndefOr[IgHierarchicalGridScrollSettings] = js.native
  /**
  	 * If true, the transaction log will always be sent in the request for remote data, by the data source. Also this means that if there are values in the log, a POST will be performed instead of GET.
  	 *
  	 */
  var serializeTransactionLog: js.UndefOr[Boolean] = js.native
  /**
  	 * Controls the visibility of the grid footer.
  	 *
  	 */
  var showFooter: js.UndefOr[Boolean] = js.native
  /**
  	 * Controls the visibility of the grid header.
  	 *
  	 */
  var showHeader: js.UndefOr[Boolean] = js.native
  /**
  	 * Initial tabIndex attribute that will be set on all focusable elements.
  	 *
  	 */
  var tabIndex: js.UndefOr[Double] = js.native
  /**
  	 * The templating engine that will be used to render the grid [column templates](ui.ighierarchicalgrid#options:columns.template). [Here you can find](http://www.infragistics.com/community/blogs/marina_stoyanova/archive/2014/05/30/using-different-template-engines-with-ignite-ui-controls.aspx) how to use templating engines other than igTemplating and jsRender.
  	 *
  	 *
  	 * Valid values:
  	 * "infragistics" The grid will use the Infragistics Templating engine to render its [column templates](ui.ighierarchicalgrid#options:columns.template) and specific parts of the UI.
  	 * "jsRender" The grid will use jsRender to render its [column templates](ui.ighierarchicalgrid#options:columns.template) and specific parts of the UI.
  	 */
  var templatingEngine: js.UndefOr[String] = js.native
  /**
  	 * URL to which updating requests will be made.
  	 *
  	 */
  var updateUrl: js.UndefOr[String] = js.native
  /**
  	 * Enables/disables column and row virtualization at the same time. Virtualization can greatly enhance rendering performance. If enabled, the number of actual rendered rows (DOM elements) will be constant and related to the visible viewport of the grid. As the end user scrolls, those DOM elements will be dynamically reused to render the new data. [Here you can find more info about the performance guidelines when using the igGrid](http://www.igniteui.com/help/iggrid-performance-guide)
  	 *
  	 */
  var virtualization: js.UndefOr[Boolean] = js.native
  /**
  	 * Determines row virtualization mode.
  	 *
  	 *
  	 * Valid values:
  	 * "fixed" Renders only the visible rows and/or columns in the grid. On scrolling the same rows and/or columns are updated with new data from the data source. Only fixed virtualization can work with column virtualization at the same time. Fixed virtualization is not supported by some grid features: Resizing, Group By, Responsive.
  	 * "continuous" renders a pre-defined number of rows in the grid. On scrolling the continuous virtualization loads another portion of rows and disposes the current one.
  	 */
  var virtualizationMode: js.UndefOr[String] = js.native
  /**
  	 * Number of pixels to scroll the grid by, when virtualization is enabled, and mouse wheel scrolling is performed over the virtual grid area. If "null" the step will be equal to the [avgRowHeight](ui.ighierarchicalgrid#options:avgRowHeight).
  	 *
  	 */
  var virtualizationMouseWheelStep: js.UndefOr[Double] = js.native
  /**
  	 * Defines the grid width in pixels or percents. [Here you can find more info about setting igGrid width](http://www.igniteui.com/help/iggrid-columns-and-layout#width-height).
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget width can be set in pixels (px) or percentage (%). Example values: "800px", "800" (defaults to pixels), "100%".
  	 * "number" The widget width can be set in pixels as a number. Example values: 800, 700.
  	 * "null" will stretch to fit the sum of the columns widths.
  	 */
  var width: js.UndefOr[String | Double] = js.native
}

object IgHierarchicalGrid {
  @scala.inline
  def apply(): IgHierarchicalGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgHierarchicalGrid]
  }
  @scala.inline
  implicit class IgHierarchicalGridOps[Self <: IgHierarchicalGrid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustVirtualHeights(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustVirtualHeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustVirtualHeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustVirtualHeights")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregateTransactions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateTransactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateTransactions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateTransactions")(js.undefined)
        ret
    }
    @scala.inline
    def withAlternateRowStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateRowStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateRowStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateRowStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAdjustHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAdjustHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCommit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCommit")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFormat(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoGenerateColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGenerateColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGenerateColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGenerateColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoGenerateLayouts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGenerateLayouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGenerateLayouts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGenerateLayouts")(js.undefined)
        ret
    }
    @scala.inline
    def withAutofitLastColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofitLastColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutofitLastColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofitLastColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withAvgColumnWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avgColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvgColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avgColumnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAvgRowHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avgRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvgRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avgRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionRendered(value: (/* event */ Event_, /* ui */ CaptionRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCaptionRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionRendering(value: (/* event */ Event_, /* ui */ CaptionRenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionRendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCaptionRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withCellClick(value: (/* event */ Event_, /* ui */ CellClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCellRightClick(value: (/* event */ Event_, /* ui */ CellRightClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRightClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellRightClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRightClick")(js.undefined)
        ret
    }
    @scala.inline
    def withChildGridCreated(value: (/* event */ Event_, /* ui */ ChildGridCreatedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childGridCreated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChildGridCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childGridCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withChildGridCreating(value: (/* event */ Event_, /* ui */ ChildGridCreatingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childGridCreating")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChildGridCreating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childGridCreating")(js.undefined)
        ret
    }
    @scala.inline
    def withChildGridRendered(value: (/* event */ Event_, /* ui */ ChildGridRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childGridRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChildGridRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childGridRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenPopulated(value: (/* event */ Event_, /* ui */ ChildrenPopulatedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenPopulated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChildrenPopulated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenPopulated")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenPopulating(value: (/* event */ Event_, /* ui */ ChildrenPopulatingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenPopulating")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChildrenPopulating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenPopulating")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnLayouts(value: js.Array[IgHierarchicalGridColumnLayout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnLayouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnLayouts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnLayouts")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnVirtualization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnVirtualization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnVirtualization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnVirtualization")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[IgHierarchicalGridColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnsCollectionModified(value: (/* event */ Event_, /* ui */ ColumnsCollectionModifiedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsCollectionModified")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnsCollectionModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsCollectionModified")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: (/* event */ Event_, /* ui */ CreatedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBinding(value: (/* event */ Event_, /* ui */ DataBindingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBound(value: (/* event */ Event_, /* ui */ DataBoundEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withDataRendered(value: (/* event */ Event_, /* ui */ DataRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withDataRendering(value: (/* event */ Event_, /* ui */ DataRenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String | js.Array[_] | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultChildrenDataProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChildrenDataProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultChildrenDataProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChildrenDataProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultColumnWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyed(value: (/* event */ Event_, /* ui */ DestroyedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDestroyed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHoverStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHoverStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHoverStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHoverStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableResizeContainerCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResizeContainerCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableResizeContainerCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResizeContainerCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableUTCDates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUTCDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableUTCDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUTCDates")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandColWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandColWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandColWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandColWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandCollapseAnimations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandCollapseAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandCollapseAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandCollapseAnimations")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureChooserIconDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserIconDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureChooserIconDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserIconDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: js.Array[IgHierarchicalGridFeature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedFooters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedFooters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedFooters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedFooters")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterRendered(value: (/* event */ Event_, /* ui */ FooterRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFooterRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterRendering(value: (/* event */ Event_, /* ui */ FooterRenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFooterRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCellRendered(value: (/* event */ Event_, /* ui */ HeaderCellRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHeaderCellRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRendered(value: (/* event */ Event_, /* ui */ HeaderRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHeaderRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRendering(value: (/* event */ Event_, /* ui */ HeaderRenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHeaderRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialDataBindDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDataBindDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDataBindDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDataBindDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialExpandDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialExpandDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialExpandDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialExpandDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonpRequest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonpRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonpRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonpRequest")(js.undefined)
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
    def withLocalSchemaTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localSchemaTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalSchemaTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localSchemaTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: IgHierarchicalGridLocale): Self = {
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
    def withMaxDataBindDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDataBindDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDataBindDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDataBindDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeUnboundColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeUnboundColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeUnboundColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeUnboundColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withOdata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("odata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("odata")(js.undefined)
        ret
    }
    @scala.inline
    def withPathSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(js.undefined)
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
    def withRenderCheckboxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCheckboxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderCheckboxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCheckboxes")(js.undefined)
        ret
    }
    @scala.inline
    def withRendered(value: (/* event */ Event_, /* ui */ RenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.undefined)
        ret
    }
    @scala.inline
    def withRendering(value: (/* event */ Event_, /* ui */ RenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendering")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestError(value: (/* event */ Event_, /* ui */ RequestErrorEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRequestError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestError")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseDataKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseDataKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataKey")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTotalRecCountKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTotalRecCountKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTotalRecCountKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTotalRecCountKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest")(js.undefined)
        ret
    }
    @scala.inline
    def withRestSettings(value: IgHierarchicalGridRestSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withRowCollapsed(value: (/* event */ Event_, /* ui */ RowCollapsedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCollapsed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withRowCollapsing(value: (/* event */ Event_, /* ui */ RowCollapsingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCollapsing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowCollapsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCollapsing")(js.undefined)
        ret
    }
    @scala.inline
    def withRowExpanded(value: (/* event */ Event_, /* ui */ RowExpandedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpanded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withRowExpanding(value: (/* event */ Event_, /* ui */ RowExpandingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpanding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowExpanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpanding")(js.undefined)
        ret
    }
    @scala.inline
    def withRowVirtualization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowVirtualization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowVirtualization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowVirtualization")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsRendered(value: (/* event */ Event_, /* ui */ RowsRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowsRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsRendering(value: (/* event */ Event_, /* ui */ RowsRenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsRendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowsRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaGenerated(value: (/* event */ Event_, /* ui */ SchemaGeneratedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaGenerated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSchemaGenerated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaGenerated")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSettings(value: IgHierarchicalGridScrollSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializeTransactionLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeTransactionLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializeTransactionLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeTransactionLog")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(js.undefined)
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
    @scala.inline
    def withTemplatingEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templatingEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplatingEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templatingEngine")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualization")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualizationMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualizationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualizationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualizationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualizationMouseWheelStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualizationMouseWheelStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualizationMouseWheelStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualizationMouseWheelStep")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

