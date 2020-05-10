package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridSummaries
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies when calculations are made.
  	 *
  	 *
  	 * Valid values:
  	 * "onselect" summaries are updated when checkbox is checked/unchecked
  	 * "okcancelbuttons" summaries are updated only when OK button is clicked
  	 */
  var calculateRenderMode: js.UndefOr[String] = js.native
  /**
  	 * Function reference - it is called when data is retrieved from the data source
  	 *
  	 */
  var callee: js.UndefOr[js.Function] = js.native
  /**
  	 * A list of column settings that specifies custom summaries options per column basis
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridSummariesColumnSetting]] = js.native
  /**
  	 * Specifies how compact the summaries are rendered.
  	 * When true indicates that the summaries may be rendered compactly, even mixing different summaries on the same line.
  	 * False ensures that each summary type is occupying a separate line.
  	 * Auto will use True if the maximum number of visible summaries is one or less and False otherwise.
  	 *
  	 */
  var compactRenderingMode: js.UndefOr[js.Any] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text of the button Cancel in the summaries dropdown
  	 * Use option [locale.dialogButtonCancelText](ui.iggridsummaries#options:locale.dialogButtonCancelText).
  	 */
  var dialogButtonCancelText: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text of the button OK in the summaries dropdown
  	 * Use option [locale.dialogButtonOKText](ui.iggridsummaries#options:locale.dialogButtonOKText).
  	 */
  var dialogButtonOKText: js.UndefOr[String] = js.native
  /**
  	 * Event is fired when Cancel button is clicked in drop down.
  	 */
  var dropDownCancelClicked: js.UndefOr[DropDownCancelClickedEvent] = js.native
  /**
  	 * Event fired after the dropdown for a summary column is closed
  	 */
  var dropDownClosed: js.UndefOr[DropDownClosedEvent] = js.native
  /**
  	 * Event fired before the dropdown for a summary column starts closing
  	 * Return false in order to cancel closing the drop down.
  	 */
  var dropDownClosing: js.UndefOr[DropDownClosingEvent] = js.native
  /**
  	 * Dropdown animation duration
  	 *
  	 */
  var dropDownDialogAnimationDuration: js.UndefOr[Double] = js.native
  /**
  	 * Height of the dropdown in pixels
  	 *
  	 */
  var dropDownHeight: js.UndefOr[Double] = js.native
  /**
  	 * Event is fired when OK button is clicked in drop down
  	 */
  var dropDownOKClicked: js.UndefOr[DropDownOKClickedEvent] = js.native
  /**
  	 * Event fired after the summaries dropdown is opened for a specific column
  	 */
  var dropDownOpened: js.UndefOr[DropDownOpenedEvent] = js.native
  /**
  	 * Event fired before drop down is opened for a specific column summary
  	 * Return false in order to cancel opening the drop down.
  	 */
  var dropDownOpening: js.UndefOr[DropDownOpeningEvent] = js.native
  /**
  	 * Width of the dropdown in pixels
  	 *
  	 */
  var dropDownWidth: js.UndefOr[Double] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Empty text template to be shown for empty cells
  	 * Use option [locale.emptyCellText](ui.iggridsummaries#options:locale.emptyCellText).
  	 */
  var emptyCellText: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set text that is shown in the feature chooser dropdown when summaries are hidden
  	 * Use option [locale.featureChooserText](ui.iggridsummaries#options:locale.featureChooserText).
  	 */
  var featureChooserText: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set text that is shown in the feauture chooser dropdown when summaries are shown
  	 * Use option [locale.featureChooserTextHide](ui.iggridsummaries#options:locale.featureChooserTextHide).
  	 */
  var featureChooserTextHide: js.UndefOr[String] = js.native
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgGridSummariesLocale] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * a reference or name of a javascript function - renders summary cell in grid footer.(if not set it is used default render function) It takes 3 parameters - methodName(summary method), columnKey, data(summary data which should be rendered)
  	 *
  	 */
  var renderSummaryCellFunc: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Result template for summary result(shown in table cell)
  	 *
  	 */
  var resultTemplate: js.UndefOr[String] = js.native
  /**
  	 * Show/hide footer button(on click show/hide dropdown)
  	 *
  	 */
  var showDropDownButton: js.UndefOr[Boolean] = js.native
  /**
  	 * Show header button icon in the header cell. On click - shows/hides summaries. If false then summary icon should not be shown in the feature chooser(if shown).
  	 *
  	 */
  var showSummariesButton: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired after summaries calculation are completely made
  	 */
  var summariesCalculated: js.UndefOr[SummariesCalculatedEvent] = js.native
  /**
  	 * Event fired before summaries calculations are made
  	 * Return false in order to cancel calculation of summaries.
  	 */
  var summariesCalculating: js.UndefOr[SummariesCalculatingEvent] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for header cell button
  	 * Use option [locale.summariesHeaderButtonTooltip](ui.iggridsummaries#options:locale.summariesHeaderButtonTooltip).
  	 */
  var summariesHeaderButtonTooltip: js.UndefOr[String] = js.native
  /**
  	 * Event fired when user selects/deselects summary method from checkbox
  	 */
  var summariesMethodSelectionChanged: js.UndefOr[SummariesMethodSelectionChangedEvent] = js.native
  /**
  	 * Result key by which we get data from the result returned by remote data source.
  	 *
  	 */
  var summariesResponseKey: js.UndefOr[String] = js.native
  /**
  	 * Event is fired after summary rows are toggled
  	 */
  var summariesToggled: js.UndefOr[SummariesToggledEvent] = js.native
  /**
  	 * Event is fired bofore summary rows start toggling
  	 * Return false in order to cancel showing/hiding of summaries.
  	 */
  var summariesToggling: js.UndefOr[SummariesTogglingEvent] = js.native
  /**
  	 * Determines when the summary values are calculated when type is local
  	 *
  	 *
  	 * Valid values:
  	 * "priortofilteringandpaging" summaries are calculated prior to filtering and paging
  	 * "afterfilteringbeforepaging" summaries are calculated after filtering and before paging
  	 * "afterfilteringandpaging" summaries are calculated after filtering and paging
  	 */
  var summaryExecution: js.UndefOr[String] = js.native
  /**
  	 * Set key in GET Request for summaries - used only when type is remote
  	 *
  	 */
  var summaryExprUrlKey: js.UndefOr[String] = js.native
  /**
  	 * type of summaries calculating.
  	 *
  	 *
  	 * Valid values:
  	 * "remote" when it is remote summaries calculations are made on the server
  	 * "local"	When it is local calculations are made on the client
  	 */
  var `type`: js.UndefOr[String] = js.native
}

object IgGridSummaries {
  @scala.inline
  def apply(): IgGridSummaries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSummaries]
  }
  @scala.inline
  implicit class IgGridSummariesOps[Self <: IgGridSummaries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculateRenderMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateRenderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculateRenderMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateRenderMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCallee(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callee")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSettings(value: js.Array[IgGridSummariesColumnSetting]): Self = {
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
    def withCompactRenderingMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactRenderingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompactRenderingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactRenderingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogButtonCancelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogButtonCancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogButtonCancelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogButtonCancelText")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogButtonOKText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogButtonOKText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogButtonOKText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogButtonOKText")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownCancelClicked(value: (/* event */ Event_, /* ui */ DropDownCancelClickedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownCancelClicked")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownCancelClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownCancelClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownClosed(value: (/* event */ Event_, /* ui */ DropDownClosedEventUIParam) => Unit): Self = {
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
    def withDropDownClosing(value: (/* event */ Event_, /* ui */ DropDownClosingEventUIParam) => Unit): Self = {
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
    def withDropDownDialogAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownDialogAnimationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownDialogAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownDialogAnimationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownOKClicked(value: (/* event */ Event_, /* ui */ DropDownOKClickedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOKClicked")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownOKClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOKClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownOpened(value: (/* event */ Event_, /* ui */ DropDownOpenedEventUIParam) => Unit): Self = {
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
    def withDropDownOpening(value: (/* event */ Event_, /* ui */ DropDownOpeningEventUIParam) => Unit): Self = {
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
    def withDropDownWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyCellText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyCellText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyCellText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyCellText")(js.undefined)
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
    def withLocale(value: IgGridSummariesLocale): Self = {
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
    def withRenderSummaryCellFunc(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSummaryCellFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderSummaryCellFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSummaryCellFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withResultTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDropDownButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDropDownButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDropDownButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDropDownButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSummariesButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSummariesButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSummariesButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSummariesButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSummariesCalculated(value: (/* event */ Event_, /* ui */ SummariesCalculatedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesCalculated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSummariesCalculated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesCalculated")(js.undefined)
        ret
    }
    @scala.inline
    def withSummariesCalculating(value: (/* event */ Event_, /* ui */ SummariesCalculatingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesCalculating")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSummariesCalculating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesCalculating")(js.undefined)
        ret
    }
    @scala.inline
    def withSummariesHeaderButtonTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesHeaderButtonTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummariesHeaderButtonTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesHeaderButtonTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withSummariesMethodSelectionChanged(value: (/* event */ Event_, /* ui */ SummariesMethodSelectionChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesMethodSelectionChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSummariesMethodSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesMethodSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withSummariesResponseKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesResponseKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummariesResponseKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesResponseKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSummariesToggled(value: (/* event */ Event_, /* ui */ SummariesToggledEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesToggled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSummariesToggled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesToggled")(js.undefined)
        ret
    }
    @scala.inline
    def withSummariesToggling(value: (/* event */ Event_, /* ui */ SummariesTogglingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesToggling")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSummariesToggling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesToggling")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryExecution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryExecution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryExecution")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryExprUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryExprUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryExprUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryExprUrlKey")(js.undefined)
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

