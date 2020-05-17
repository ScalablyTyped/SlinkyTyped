package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeGridFiltering
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Defines whether to render editors in advanced [mode](ui.iggridfiltering#options:mode). If false, no editors will be rendered in the advanced [mode](ui.iggridfiltering#options:mode).
  	 *
  	 */
  var advancedModeEditorsVisible: js.UndefOr[Boolean] = js.native
  /**
  	 * Location of the advanced filtering button when [advancedModeEditorsVisible](ui.iggridfiltering#options:advancedModeEditorsVisible) is false (i.e. when the button is rendered in the header).
  	 *
  	 *
  	 * Valid values:
  	 * "left"
  	 * "right"
  	 */
  var advancedModeHeaderButtonLocation: js.UndefOr[String] = js.native
  /**
  	 * Enables or disables the filtering case sensitivity. Works only for local filtering. If true, it case sensitive filtering is performed. If false, filtering is case insensitive.
  	 *
  	 */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
  	 * A list of column settings that specifies custom filtering options on a per column basis.
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridFilteringColumnSetting]] = js.native
  /**
  	 * Event fired after the filtering has been executed and results are rendered.
  	 */
  var dataFiltered: js.UndefOr[DataFilteredEvent] = js.native
  /**
  	 * Event fired before a filtering operation is executed (remote request or local).
  	 * Return false in order to cancel filtering operation.
  	 */
  var dataFiltering: js.UndefOr[DataFilteringEvent] = js.native
  /**
  	 * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
  	 *
  	 */
  var dialogWidget: js.UndefOr[String] = js.native
  /**
  	 * If displayMode is showWithAncestorsAndDescendants, show all records that match filtering conditions and their child records, even if child records don"t match filtering conditions. If displayMode is showWithAncestors show only those records that match filtering conditions and do not show child records(if any) that don"t match filtering conditions
  	 *
  	 */
  var displayMode: js.UndefOr[js.Any] = js.native
  /**
  	 * Event fired after a filter column dropdown is completely closed.
  	 */
  var dropDownClosed: js.UndefOr[DropDownClosedEvent] = js.native
  /**
  	 * Event fired before the filter dropdown starts closing.
  	 * Return false in order to cancel dropdown closing.
  	 */
  var dropDownClosing: js.UndefOr[DropDownClosingEvent] = js.native
  /**
  	 * Event fired after the filter dropdown is opened for a specific column.
  	 */
  var dropDownOpened: js.UndefOr[DropDownOpenedEvent] = js.native
  /**
  	 * Event fired before the filter dropdown is opened for a specific column.
  	 * Return false in order to cancel dropdown opening.
  	 */
  var dropDownOpening: js.UndefOr[DropDownOpeningEvent] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Feature chooser text when filter is shown and filter [mode](ui.iggridfiltering#options:mode) is simple. Use option [locale.featureChooserText](ui.iggridfiltering#options:locale.featureChooserText).
  	 */
  var featureChooserText: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Feature chooser text when filter [mode](ui.iggridfiltering#options:mode) is advanced. Use option [locale.featureChooserTextAdvancedFilter](ui.iggridfiltering#options:locale.featureChooserTextAdvancedFilter).
  	 */
  var featureChooserTextAdvancedFilter: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Feature chooser text when filter is hidden and filter [mode](ui.iggridfiltering#options:mode) is simple. Use option [locale.featureChooserTextHide](ui.iggridfiltering#options:locale.featureChooserTextHide).
  	 */
  var featureChooserTextHide: js.UndefOr[String] = js.native
  /**
  	 * The filtering button for filter dropdowns can be rendered either on the left of the filter editor, or on the right.
  	 *
  	 *
  	 * Valid values:
  	 * "left" The button is rendered on the left.
  	 * "right" The button is rendered on the right.
  	 */
  var filterButtonLocation: js.UndefOr[String] = js.native
  /**
  	 * Time in milliseconds for which widget will wait between keystrokes before sending filtering requests.
  	 *
  	 */
  var filterDelay: js.UndefOr[Double] = js.native
  /**
  	 * Add button width - in the advanced filter dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The dialog Add button width in pixels (100px).
  	 * "number" The dialog Add button width in pixels as a number (100).
  	 */
  var filterDialogAddButtonWidth: js.UndefOr[String | Double] = js.native
  /**
  	 * Custom template for options in dropdown in add condition area in the filter dialog. The default template is "<option value='${value}'>${text}</option>"
  	 * and it is used when [filterDialogAddConditionTemplate](ui.iggridfiltering#options:filterDialogAddConditionTemplate) is applied
  	 *
  	 */
  var filterDialogAddConditionDropDownTemplate: js.UndefOr[String] = js.native
  /**
  	 * Custom template for add condition area in the filter dialog. The default template is "<div><span>${label1}</span><div><input></input></div><span>${label2}</span></div>".
  	 *
  	 */
  var filterDialogAddConditionTemplate: js.UndefOr[String] = js.native
  /**
  	 * Event fired after the advanced filter dialog has been closed.
  	 */
  var filterDialogClosed: js.UndefOr[FilterDialogClosedEvent] = js.native
  /**
  	 * Event fired before the advanced filter dialog is closed.
  	 * Return false in order to cancel filtering dialog closing.
  	 */
  var filterDialogClosing: js.UndefOr[FilterDialogClosingEvent] = js.native
  /**
  	 * Width of the column chooser dropdowns in the advanced filter dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The column chooser dropdowns width in pixels (80px).
  	 * "number" The column chooser dropdowns width in pixels  as a number (80).
  	 */
  var filterDialogColumnDropDownDefaultWidth: js.UndefOr[String | Double] = js.native
  /**
  	 * Controls containment behavior.
  	 *
  	 * owner  The filter dialog will be draggable only within the grid area.
  	 * window  The filter dialog will be draggable within the whole window area.
  	 */
  var filterDialogContainment: js.UndefOr[String] = js.native
  /**
  	 * Event fired after the contents of the advanced filter dialog are rendered.
  	 */
  var filterDialogContentsRendered: js.UndefOr[FilterDialogContentsRenderedEvent] = js.native
  /**
  	 * Event fired before the contents of the advanced filter dialog are rendered.
  	 * Return false in order to cancel filtering dialog rendering.
  	 */
  var filterDialogContentsRendering: js.UndefOr[FilterDialogContentsRenderingEvent] = js.native
  /**
  	 * Width of the filtering expression input boxes in the advanced filter dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The filtering expression input boxes width in pixels (80px).
  	 * "number" The filtering expression input boxes width in pixels as a number (80).
  	 */
  var filterDialogExprInputDefaultWidth: js.UndefOr[String | Double] = js.native
  /**
  	 * Event fired after a filter row is added to the advanced filter dialog.
  	 */
  var filterDialogFilterAdded: js.UndefOr[FilterDialogFilterAddedEvent] = js.native
  /**
  	 * Event fired before a filter row is added to the advanced filter dialog.
  	 * Return false in order to cancel filter adding to the advanced filtering dialog.
  	 */
  var filterDialogFilterAdding: js.UndefOr[FilterDialogFilterAddingEvent] = js.native
  /**
  	 * Custom template for options in condition list in filter dialog. The default template is "<option value='${condition}'>${text}</option>"
  	 * and it is used for custimizing DOM elemenent with attribute "data-af-cond".
  	 *
  	 */
  var filterDialogFilterConditionTemplate: js.UndefOr[String] = js.native
  /**
  	 * Width of the filtering condition dropdowns in the advanced filter dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The filtering condition dropdowns width in pixels (80px).
  	 * "number" The filtering condition dropdowns width in pixels as a number (80).
  	 */
  var filterDialogFilterDropDownDefaultWidth: js.UndefOr[String | Double] = js.native
  /**
  	 * Custom template for filter dialog.
  	 * Each DOM element which is used for selecting filter conditions/columns/filter expressions has "data-*" attribute.
  	 * E.g.: DOM element used for selecting column has attribute "data-af-col", for selecting filter condition - "data-af-cond", for filter expression- "data-af-expr".
  	 * NOTE: The template is supported only with <tr />.
  	 * The default template is "<tr data-af-row><td><input data-af-col/></td><td><input data-af-cond/></td><td><input data-af-expr /> </td><td><span data-af-rmv></span></td></tr>".
  	 *
  	 */
  var filterDialogFilterTemplate: js.UndefOr[String] = js.native
  /**
  	 * Event fired when the OK button in the advanced filter dialog is pressed.
  	 */
  var filterDialogFiltering: js.UndefOr[FilterDialogFilteringEvent] = js.native
  /**
  	 * default filter dialog height (used for Advanced filtering [mode](ui.iggridfiltering#options:mode)).
  	 *
  	 *
  	 * Valid values:
  	 * "string" The dialog window height in pixels (350px).
  	 * "number" The dialog window height in pixels as a number (350).
  	 */
  var filterDialogHeight: js.UndefOr[String | Double] = js.native
  /**
  	 * Maximum number of filter rows in the advanced filtering dialog. If this number is exceeded, an error message will be rendered.
  	 *
  	 */
  var filterDialogMaxFilterCount: js.UndefOr[Double] = js.native
  /**
  	 * Event fired every time the advanced filter dialog changes its position.
  	 */
  var filterDialogMoving: js.UndefOr[FilterDialogMovingEvent] = js.native
  /**
  	 * Width of the Ok and Cancel buttons in the advanced filtering dialogs.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The advanced filter dialog Ok and Cancel buttons width in pixels (120px).
  	 * "number" The advanced filter dialog Ok and Cancel buttons width in pixels as a number (120).
  	 */
  var filterDialogOkCancelButtonWidth: js.UndefOr[String | Double] = js.native
  /**
  	 * Event fired after the advanced filter dialog is already opened.
  	 */
  var filterDialogOpened: js.UndefOr[FilterDialogOpenedEvent] = js.native
  /**
  	 * Event fired before the advanced filtering dialog is opened.
  	 * Return false in order to cancel filter dialog opening.
  	 */
  var filterDialogOpening: js.UndefOr[FilterDialogOpeningEvent] = js.native
  /**
  	 * Default filter dialog width (used for Advanced filtering [mode](ui.iggridfiltering#options:mode)).
  	 *
  	 *
  	 * Valid values:
  	 * "string" The dialog window width in pixels (500px).
  	 * "number" The dialog window width in pixels as a number (500).
  	 */
  var filterDialogWidth: js.UndefOr[String | Double] = js.native
  /**
  	 * Animation duration in milliseconds for the [filterDropDownAnimations](ui.iggridfiltering#options:filterDropDownAnimations).
  	 *
  	 */
  var filterDropDownAnimationDuration: js.UndefOr[Double] = js.native
  /**
  	 * Type of animations for the column filter dropdowns.
  	 *
  	 *
  	 * Valid values:
  	 * "linear" The column filtering drop downs are shown with a linear animation.
  	 * "none" No animation is used when showing the filtering drop downs.
  	 */
  var filterDropDownAnimations: js.UndefOr[String] = js.native
  /**
  	 * Height of the column filter dropdowns.
  	 *
  	 * string  The height of the column filter dropdowns in pixels (0px).
  	 * number  The height of the column filter dropdowns in pixels as a number (0).
  	 */
  var filterDropDownHeight: js.UndefOr[js.Any] = js.native
  /**
  	 * Enable/disable filter icons visibility.
  	 *
  	 *
  	 * Valid values:
  	 * "true" All predefined filters in the filter dropdowns will have icons rendered in front of the text.
  	 * "false" No icons will be rendered.
  	 */
  var filterDropDownItemIcons: js.UndefOr[Boolean] = js.native
  /**
  	 * Width of the column filter dropdowns.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The width in pixels (0px)
  	 * "number" The width in pixels as a number (0)
  	 */
  var filterDropDownWidth: js.UndefOr[String | Double] = js.native
  /**
  	 * URL key name that specifies how the filtering expressions will be encoded for remote requests, e.g. &filter('col') = startsWith. Default is OData.
  	 *
  	 */
  var filterExprUrlKey: js.UndefOr[String] = js.native
  /**
  	 * Enable/disable footer visibility with summary info about the filter.
  	 * When false, the filter summary row (in the footer) will only be visible when paging is enabled (or some other feature that renders a footer).
  	 * When true, the filter summary row will only be visible when a filter is applied i.e. it's not visible by default.
  	 *
  	 */
  var filterSummaryAlwaysVisible: js.UndefOr[Boolean] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Template that is used when filtering is applied and paging is enabled and user goes to another page. It takes precedence over the pagerRecordsLabelTemplate(option from igTreeGridPaging). If it is set to null then it is taken option from igTreeGridPaging.
  	 * Supported options:
  	 * ${currentPageMatches} (filtering)
  	 * ${totalMatches} (filtering)
  	 * ${startRecord} (paging)
  	 * ${endRecord} (paging)
  	 * ${recordCount} (paging)
  	 * Use option [locale.collapseTooltipText](ui.igtreegrid#options:locale.collapseTooltipText).
  	 */
  var filterSummaryInPagerTemplate: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Summary template that will appear in the bottom left corner of the footer. Has the format '${matches} matching records'. Use option [locale.filterSummaryTemplate](ui.iggridfiltering#options:locale.filterSummaryTemplate).
  	 */
  var filterSummaryTemplate: js.UndefOr[String] = js.native
  /**
  	 * Specifies from which data bound level to be applied filtering - 0 is the first level
  	 *
  	 */
  var fromLevel: js.UndefOr[Double] = js.native
  /**
  	 * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * A list of configurable and localized labels that are used for the predefined filtering conditions in the filter dropdowns. Use option [locale](ui.iggridfiltering#options:locale).
  	 */
  var labels: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgTreeGridFilteringLocale] = js.native
  /**
  	 * Specifies the name of a boolean property in the dataRecord object that indicates whether the dataRow matches the filtering conditions.
  	 * When filtering a boolean flag  with the specified name is added on each data record object with a value of true if it matches the condition or false if it doesn"t.
  	 * This is used mainly for internal purposes.
  	 *
  	 */
  var matchFiltering: js.UndefOr[String] = js.native
  /**
  	 * Default is 'simple' for non-virtualized grids, and 'advanced' when [virtualization](ui.iggrid#options:virtualization) is enabled.
  	 *
  	 *
  	 * Valid values:
  	 * "simple" Renders just a filter row.
  	 * "advanced" Allows to configure multiple filters from a dialog - Excel style.
  	 */
  var mode: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * List of configurable and localized null texts that will be used for the filter editors. Use option [locale](ui.iggridfiltering#options:locale).
  	 */
  var nullTexts: js.UndefOr[String] = js.native
  /**
  	 * Enables/disables filtering persistence between states.
  	 *
  	 */
  var persist: js.UndefOr[Boolean] = js.native
  /**
  	 * The property in the response that will hold the total number of records in the data source
  	 *
  	 */
  var recordCountKey: js.UndefOr[String] = js.native
  /**
  	 * Render in [Feature Chooser](http://www.igniteui.com/help/iggrid-feature-chooser)
  	 *
  	 */
  var renderFC: js.UndefOr[Boolean] = js.native
  /**
  	 * Enable/disable filter button visibility. If false, no filter dropdown buttons will be rendered and a predefined list of filters will not be rendered for the columns.
  	 *
  	 */
  var renderFilterButton: js.UndefOr[Boolean] = js.native
  /**
  	 * Enable/disable empty condition visibility in the filter. If true, shows empty and not empty filtering conditions in the dropdowns.
  	 *
  	 */
  var showEmptyConditions: js.UndefOr[Boolean] = js.native
  /**
  	 * Enable/disable visibility of null and not null filtering conditions in the dropdowns. If true, shows null and not null filtering conditions in the dropdowns.
  	 *
  	 */
  var showNullConditions: js.UndefOr[Boolean] = js.native
  /**
  	 * Specifies to which data bound level to be applied filtering - if -1 filtering should be applied to the last data bound level
  	 *
  	 */
  var toLevel: js.UndefOr[Double] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Custom tooltip template for the filter button, when a filter is applied. Use option [locale.tooltipTemplate](ui.iggridfiltering#options:locale.tooltipTemplate).
  	 */
  var tooltipTemplate: js.UndefOr[String] = js.native
  /**
  	 * Type of filtering. Delegates all filtering functionality to the [$.ig.DataSource](ig.datasource).
  	 *
  	 *
  	 * Valid values:
  	 * "remote" Filtering is performed by a remote end-point.
  	 * "local" Filtering is performed locally by the [$.ig.DataSource](ig.datasource).
  	 */
  var `type`: js.UndefOr[String] = js.native
}

object IgTreeGridFiltering {
  @scala.inline
  def apply(): IgTreeGridFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridFiltering]
  }
  @scala.inline
  implicit class IgTreeGridFilteringOps[Self <: IgTreeGridFiltering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvancedModeEditorsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancedModeEditorsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvancedModeEditorsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancedModeEditorsVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvancedModeHeaderButtonLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancedModeHeaderButtonLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvancedModeHeaderButtonLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancedModeHeaderButtonLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSettings(value: js.Array[IgGridFilteringColumnSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFiltered(value: (/* event */ Event, /* ui */ DataFilteredEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFiltered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataFiltered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFiltered")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFiltering(value: (/* event */ Event, /* ui */ DataFilteringEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFiltering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogWidget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogWidget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogWidget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogWidget")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownClosed(value: (/* event */ Event, /* ui */ DropDownClosedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownClosed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownClosing(value: (/* event */ Event, /* ui */ DropDownClosingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownClosing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownOpened(value: (/* event */ Event, /* ui */ DropDownOpenedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOpened")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownOpening(value: (/* event */ Event, /* ui */ DropDownOpeningEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOpening")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureChooserText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureChooserText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserText")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureChooserTextAdvancedFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserTextAdvancedFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureChooserTextAdvancedFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserTextAdvancedFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureChooserTextHide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserTextHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureChooserTextHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserTextHide")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterButtonLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterButtonLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterButtonLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterButtonLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogAddButtonWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogAddButtonWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDialogAddButtonWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogAddButtonWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogAddConditionDropDownTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogAddConditionDropDownTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDialogAddConditionDropDownTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogAddConditionDropDownTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogAddConditionTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogAddConditionTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDialogAddConditionTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogAddConditionTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogClosed(value: (/* event */ Event, /* ui */ FilterDialogClosedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogClosed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDialogClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogClosing(value: (/* event */ Event, /* ui */ FilterDialogClosingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogClosing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDialogClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogColumnDropDownDefaultWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogColumnDropDownDefaultWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDialogColumnDropDownDefaultWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogColumnDropDownDefaultWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogContainment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogContainment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDialogContainment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogContainment")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogContentsRendered(value: (/* event */ Event, /* ui */ FilterDialogContentsRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogContentsRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDialogContentsRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogContentsRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogContentsRendering(value: (/* event */ Event, /* ui */ FilterDialogContentsRenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogContentsRendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDialogContentsRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogContentsRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogExprInputDefaultWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogExprInputDefaultWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDialogExprInputDefaultWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogExprInputDefaultWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogFilterAdded(value: (/* event */ Event, /* ui */ FilterDialogFilterAddedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogFilterAdded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDialogFilterAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogFilterAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogFilterAdding(value: (/* event */ Event, /* ui */ FilterDialogFilterAddingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogFilterAdding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDialogFilterAdding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogFilterAdding")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogFilterConditionTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogFilterConditionTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDialogFilterConditionTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogFilterConditionTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogFilterDropDownDefaultWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogFilterDropDownDefaultWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDialogFilterDropDownDefaultWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogFilterDropDownDefaultWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogFilterTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogFilterTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDialogFilterTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogFilterTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogFiltering(value: (/* event */ Event, /* ui */ FilterDialogFilteringEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogFiltering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDialogFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDialogHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogMaxFilterCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogMaxFilterCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDialogMaxFilterCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogMaxFilterCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogMoving(value: (/* event */ Event, /* ui */ FilterDialogMovingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogMoving")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDialogMoving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogMoving")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogOkCancelButtonWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogOkCancelButtonWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDialogOkCancelButtonWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogOkCancelButtonWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogOpened(value: (/* event */ Event, /* ui */ FilterDialogOpenedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogOpened")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDialogOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogOpening(value: (/* event */ Event, /* ui */ FilterDialogOpeningEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogOpening")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDialogOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDialogWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDialogWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDialogWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropDownAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownAnimationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDropDownAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownAnimationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropDownAnimations(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDropDownAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownAnimations")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropDownHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDropDownHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropDownItemIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownItemIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDropDownItemIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownItemIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropDownWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDropDownWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterExprUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterExprUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterExprUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterExprUrlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterSummaryAlwaysVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSummaryAlwaysVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterSummaryAlwaysVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSummaryAlwaysVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterSummaryInPagerTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSummaryInPagerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterSummaryInPagerTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSummaryInPagerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterSummaryTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSummaryTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterSummaryTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSummaryTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFromLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromLevel")(js.undefined)
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
    def withLabels(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: IgTreeGridFilteringLocale): Self = {
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
    def withMatchFiltering(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withNullTexts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullTexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullTexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullTexts")(js.undefined)
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
    def withRenderFC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderFC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFC")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFilterButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFilterButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderFilterButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFilterButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowEmptyConditions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEmptyConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowEmptyConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEmptyConditions")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNullConditions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNullConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNullConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNullConditions")(js.undefined)
        ret
    }
    @scala.inline
    def withToLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(js.undefined)
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
  }
  
}

