package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridHiding
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies time of milliseconds for animation duration to show/hide modal dialog
  	 *
  	 */
  var columnChooserAnimationDuration: js.UndefOr[Double] = js.native
  /**
  	 * Event fired when button Apply in column chooser is clicked
  	 */
  var columnChooserButtonApplyClick: js.UndefOr[ColumnChooserButtonApplyClickEvent] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text of button which apply changes in modal dialog. Use option [locale.columnChooserButtonApplyText](ui.iggridhiding#options:locale.columnChooserButtonApplyText).
  	 */
  var columnChooserButtonApplyText: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text of button which cancel changes in modal dialog. Use option [locale.columnChooserButtonCancelText](ui.iggridhiding#options:locale.columnChooserButtonCancelText).
  	 */
  var columnChooserButtonCancelText: js.UndefOr[String] = js.native
  /**
  	 * Event fired when button Reset in column chooser is clicked
  	 */
  var columnChooserButtonResetClick: js.UndefOr[ColumnChooserButtonResetClickEvent] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * The caption of the column chooser dialog. Use option [locale.columnChooserCaptionText](ui.iggridhiding#options:locale.columnChooserCaptionText).
  	 */
  var columnChooserCaptionText: js.UndefOr[String] = js.native
  /**
  	 * Event fired after the column chooser has been closed.
  	 */
  var columnChooserClosed: js.UndefOr[ColumnChooserClosedEvent] = js.native
  /**
  	 * Event fired before the column chooser is closed.
  	 */
  var columnChooserClosing: js.UndefOr[ColumnChooserClosingEvent] = js.native
  /**
  	 * Controls containment behavior.
  	 *
  	 * owner  The column chooser dialog will be draggable only in the grid area
  	 * window  The column chooser dialog will be draggable in the whole window area
  	 */
  var columnChooserContainment: js.UndefOr[String] = js.native
  /**
  	 * Event fired after the contents of the column chooser are rendered.
  	 */
  var columnChooserContentsRendered: js.UndefOr[ColumnChooserContentsRenderedEvent] = js.native
  /**
  	 * Event fired before the contents of the column chooser are rendered.
  	 */
  var columnChooserContentsRendering: js.UndefOr[ColumnChooserContentsRenderingEvent] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * The text used in the drop down tools menu(Feature Chooser) to launch the column chooser dialog. Use option [locale.columnChooserDisplayText](ui.iggridhiding#options:locale.columnChooserDisplayText).
  	 */
  var columnChooserDisplayText: js.UndefOr[String] = js.native
  /**
  	 * The default column chooser height.
  	 *
  	 */
  var columnChooserHeight: js.UndefOr[String] = js.native
  /**
  	 * Specifies on click show/hide directly to be shown/hidden columns. If columnChooserHideOnClick is false then Apply and Cancel Buttons are shown on the bottom of modal dialog. Columns are Shown/Hidden after the Apply button is clicked
  	 *
  	 */
  var columnChooserHideOnClick: js.UndefOr[Boolean] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * The text used in the column chooser to hide column. Use option [locale.columnChooserHideText](ui.iggridhiding#options:locale.columnChooserHideText).
  	 */
  var columnChooserHideText: js.UndefOr[String] = js.native
  /**
  	 * Event fired every time the column chooser changes its position.
  	 */
  var columnChooserMoving: js.UndefOr[ColumnChooserMovingEvent] = js.native
  /**
  	 * Event fired after the column chooser is already opened.
  	 */
  var columnChooserOpened: js.UndefOr[ColumnChooserOpenedEvent] = js.native
  /**
  	 * Event fired before the column chooser is opened.
  	 */
  var columnChooserOpening: js.UndefOr[ColumnChooserOpeningEvent] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text label for reset button. Use option [locale.columnChooserResetButtonLabel](ui.iggridhiding#options:locale.columnChooserResetButtonLabel).
  	 */
  var columnChooserResetButtonLabel: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * The text used in the column chooser to show column. Use option [locale.columnChooserShowText](ui.iggridhiding#options:locale.columnChooserShowText).
  	 */
  var columnChooserShowText: js.UndefOr[String] = js.native
  /**
  	 * The default column chooser width.
  	 *
  	 */
  var columnChooserWidth: js.UndefOr[String] = js.native
  /**
  	 * Event fired after the hiding has been executed and results are rendered.
  	 */
  var columnHidden: js.UndefOr[ColumnHiddenEvent] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * The text used in the drop down tools menu(Feature Chooser) to hide a column. Use option [locale.columnHideText](ui.iggridhiding#options:locale.columnHideText).
  	 */
  var columnHideText: js.UndefOr[String] = js.native
  /**
  	 * Event fired before a hiding operation is executed.
  	 */
  var columnHiding: js.UndefOr[ColumnHidingEvent] = js.native
  /**
  	 * Event fired when trying to hide all columns in fixed or unfixed area.
  	 */
  var columnHidingRefused: js.UndefOr[ColumnHidingRefusedEvent] = js.native
  /**
  	 * A list of column settings that specifies hiding options on a per column basis.
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridHidingColumnSetting]] = js.native
  /**
  	 * Event fired before a showing operation is executed.
  	 */
  var columnShowing: js.UndefOr[ColumnShowingEvent] = js.native
  /**
  	 * Event fired when trying to show column(s) in fixed area and total width of fixed are will be larger than whole grid width.
  	 */
  var columnShowingRefused: js.UndefOr[ColumnShowingRefusedEvent] = js.native
  /**
  	 * Event fired after the showing has been executed and results are rendered.
  	 */
  var columnShown: js.UndefOr[ColumnShownEvent] = js.native
  /**
  	 * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
  	 *
  	 */
  var dialogWidget: js.UndefOr[String] = js.native
  /**
  	 * The duration of the dropdown animation in milliseconds.
  	 *
  	 */
  var dropDownAnimationDuration: js.UndefOr[Double] = js.native
  /**
  	 * The width in pixels of the hidden column indicator in the header.
  	 *
  	 */
  var hiddenColumnIndicatorHeaderWidth: js.UndefOr[Double] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * The text displayed in the tooltip of the hidden column indicator. Use option [locale.hiddenColumnIndicatorTooltipText](ui.iggridhiding#options:locale.hiddenColumnIndicatorTooltipText).
  	 */
  var hiddenColumnIndicatorTooltipText: js.UndefOr[String] = js.native
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
  var locale: js.UndefOr[IgGridHidingLocale] = js.native
  /**
  	 * Event fired before a hiding operation is executed.
  	 */
  var multiColumnHiding: js.UndefOr[MultiColumnHidingEvent] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
}

object IgGridHiding {
  @scala.inline
  def apply(): IgGridHiding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridHiding]
  }
  @scala.inline
  implicit class IgGridHidingOps[Self <: IgGridHiding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnChooserAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserAnimationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserAnimationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserButtonApplyClick(value: (/* event */ Event, /* ui */ ColumnChooserButtonApplyClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserButtonApplyClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnChooserButtonApplyClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserButtonApplyClick")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserButtonApplyText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserButtonApplyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserButtonApplyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserButtonApplyText")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserButtonCancelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserButtonCancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserButtonCancelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserButtonCancelText")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserButtonResetClick(value: (/* event */ Event, /* ui */ ColumnChooserButtonResetClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserButtonResetClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnChooserButtonResetClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserButtonResetClick")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserCaptionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserCaptionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserCaptionText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserCaptionText")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserClosed(value: (/* event */ Event, /* ui */ ColumnChooserClosedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserClosed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnChooserClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserClosing(value: (/* event */ Event, /* ui */ ColumnChooserClosingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserClosing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnChooserClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserContainment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserContainment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserContainment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserContainment")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserContentsRendered(value: (/* event */ Event, /* ui */ ColumnChooserContentsRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserContentsRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnChooserContentsRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserContentsRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserContentsRendering(value: (/* event */ Event, /* ui */ ColumnChooserContentsRenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserContentsRendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnChooserContentsRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserContentsRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserDisplayText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserDisplayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserDisplayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserDisplayText")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserHideOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserHideOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserHideOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserHideOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserHideText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserHideText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserHideText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserHideText")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserMoving(value: (/* event */ Event, /* ui */ ColumnChooserMovingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserMoving")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnChooserMoving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserMoving")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserOpened(value: (/* event */ Event, /* ui */ ColumnChooserOpenedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserOpened")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnChooserOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserOpening(value: (/* event */ Event, /* ui */ ColumnChooserOpeningEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserOpening")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnChooserOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserResetButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserResetButtonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserResetButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserResetButtonLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserShowText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserShowText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserShowText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserShowText")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHidden(value: (/* event */ Event, /* ui */ ColumnHiddenEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHidden")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHideText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHideText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHideText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHideText")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHiding(value: (/* event */ Event, /* ui */ ColumnHidingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHiding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnHiding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHiding")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHidingRefused(value: (/* event */ Event, /* ui */ ColumnHidingRefusedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHidingRefused")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnHidingRefused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHidingRefused")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSettings(value: js.Array[IgGridHidingColumnSetting]): Self = {
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
    def withColumnShowing(value: (/* event */ Event, /* ui */ ColumnShowingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnShowing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnShowing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnShowing")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnShowingRefused(value: (/* event */ Event, /* ui */ ColumnShowingRefusedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnShowingRefused")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnShowingRefused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnShowingRefused")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnShown(value: (/* event */ Event, /* ui */ ColumnShownEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnShown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnShown")(js.undefined)
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
    def withDropDownAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAnimationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAnimationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenColumnIndicatorHeaderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenColumnIndicatorHeaderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenColumnIndicatorHeaderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenColumnIndicatorHeaderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenColumnIndicatorTooltipText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenColumnIndicatorTooltipText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenColumnIndicatorTooltipText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenColumnIndicatorTooltipText")(js.undefined)
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
    def withLocale(value: IgGridHidingLocale): Self = {
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
    def withMultiColumnHiding(value: (/* event */ Event, /* ui */ MultiColumnHidingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiColumnHiding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMultiColumnHiding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiColumnHiding")(js.undefined)
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
  }
  
}

