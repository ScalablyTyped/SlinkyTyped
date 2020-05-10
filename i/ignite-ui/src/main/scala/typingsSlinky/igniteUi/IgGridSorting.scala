package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridSorting
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Enables/disables special styling for sorted columns. If false, sorted column cells will not have any special sort-related styling.
  	 *
  	 */
  var applySortedColumnCss: js.UndefOr[Boolean] = js.native
  /**
  	 * Enables or disables the case sensitivity of the sorting. Works only for [local](ui.iggridsorting#options:type) sorting.
  	 *
  	 */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
  	 * A list of custom column settings that specify custom sorting settings for a specific column (whether sorting is enabled / disabled, default sort direction, first sort direction, etc.).
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridSortingColumnSetting]] = js.native
  /**
  	 * Event fired after the column has already been sorted and data - re-rendered.
  	 */
  var columnSorted: js.UndefOr[ColumnSortedEvent] = js.native
  /**
  	 * Event fired before sorting is invoked for a certain column.
  	 * Return false in order to cancel column sorting.
  	 */
  var columnSorting: js.UndefOr[ColumnSortingEvent] = js.native
  /**
  	 * Custom sort function(or name of the function as a string) accepting three parameters - the data to be sorted, an array of data source field definitions, and the direction to sort with (optional). The function should return the sorted data array.
  	 *
  	 */
  var customSortFunction: js.UndefOr[js.Function] = js.native
  /**
  	 * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
  	 *
  	 */
  var dialogWidget: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the text shown in the feature chooser item for sorting in ascending order (displayed only on touch environment).
  	 * Use option [locale.featureChooserSortAsc](ui.iggridsorting#options:locale.featureChooserSortAsc).
  	 */
  var featureChooserSortAsc: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the text shown in the feature chooser item for sorting in descending order (displayed only on touch environment).
  	 * Use option [locale.featureChooserSortDesc](ui.iggridsorting#options:locale.featureChooserSortDesc).
  	 */
  var featureChooserSortDesc: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the text of the feature chooser sorting button.
  	 * Use option [locale.featureChooserText](ui.iggridsorting#options:locale.featureChooserText).
  	 */
  var featureChooserText: js.UndefOr[String] = js.native
  /**
  	 * Specifies which direction to use on the first click / keydown, if the column is sorted for the first time.
  	 *
  	 *
  	 * Valid values:
  	 * "ascending" The first sort of the column data will be in ascending order.
  	 * "descending" The first sort of the column data will be in descending order.
  	 */
  var firstSortDirection: js.UndefOr[String] = js.native
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
  var locale: js.UndefOr[IgGridSortingLocale] = js.native
  /**
  	 * Specifies time of milliseconds for animation duration to show/hide modal dialog.
  	 *
  	 */
  var modalDialogAnimationDuration: js.UndefOr[Double] = js.native
  /**
  	 * Event fired when button Apply in modal dialog is clicked
  	 */
  var modalDialogButtonApplyClick: js.UndefOr[ModalDialogButtonApplyClickEvent] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text of button which apply changes in modal dialog.
  	 * Use option [locale.modalDialogButtonApplyText](ui.iggridsorting#options:locale.modalDialogButtonApplyText).
  	 */
  var modalDialogButtonApplyText: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text of button which cancels the changes in the advanced sorting modal dialog.
  	 * Use option [locale.modalDialogButtonCancelText](ui.iggridsorting#options:locale.modalDialogButtonCancelText).
  	 */
  var modalDialogButtonCancelText: js.UndefOr[String] = js.native
  /**
  	 * Event fired when the button to reset sorting is clicked.
  	 */
  var modalDialogButtonResetClick: js.UndefOr[ModalDialogButtonResetClickEvent] = js.native
  /**
  	 * Event fired when button to unsort column is clicked in modal dialog
  	 */
  var modalDialogButtonUnsortClick: js.UndefOr[ModalDialogButtonUnsortClickEvent] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for each ascending sorted column in multiple sorting dialog.
  	 * Use option [locale.modalDialogCaptionButtonAsc](ui.iggridsorting#options:locale.modalDialogCaptionButtonAsc).
  	 */
  var modalDialogCaptionButtonAsc: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for each descending sorted column in multiple sorting dialog.
  	 * Use option [locale.modalDialogCaptionButtonDesc](ui.iggridsorting#options:locale.modalDialogCaptionButtonDesc).
  	 */
  var modalDialogCaptionButtonDesc: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for unsort button in multiple sorting dialog.
  	 * Use option [locale.modalDialogCaptionButtonUnsort](ui.iggridsorting#options:locale.modalDialogCaptionButtonUnsort).
  	 */
  var modalDialogCaptionButtonUnsort: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption text for multiple sorting dialog.
  	 * Use option [locale.modalDialogCaptionText](ui.iggridsorting#options:locale.modalDialogCaptionText).
  	 */
  var modalDialogCaptionText: js.UndefOr[String] = js.native
  /**
  	 * Event fired after the modal dialog has been closed.
  	 */
  var modalDialogClosed: js.UndefOr[ModalDialogClosedEvent] = js.native
  /**
  	 * Event fired before the modal dialog is closed.
  	 */
  var modalDialogClosing: js.UndefOr[ModalDialogClosingEvent] = js.native
  /**
  	 * Event fired after the contents of the modal dialog are rendered.
  	 */
  var modalDialogContentsRendered: js.UndefOr[ModalDialogContentsRenderedEvent] = js.native
  /**
  	 * Event fired before the contents of the modal dialog are rendered.
  	 */
  var modalDialogContentsRendering: js.UndefOr[ModalDialogContentsRenderingEvent] = js.native
  /**
  	 * Specifies height of multiple sorting dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget height can be set in pixels (px) and percentage (%).
  	 * "number" The widget height can be set in pixels as a number.
  	 */
  var modalDialogHeight: js.UndefOr[String | Double] = js.native
  /**
  	 * Event fired every time the modal dialog changes its position.
  	 */
  var modalDialogMoving: js.UndefOr[ModalDialogMovingEvent] = js.native
  /**
  	 * Event fired after the modal dialog is already opened.
  	 */
  var modalDialogOpened: js.UndefOr[ModalDialogOpenedEvent] = js.native
  /**
  	 * Event fired before the modal dialog is opened.
  	 */
  var modalDialogOpening: js.UndefOr[ModalDialogOpeningEvent] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies reset button text in multiple sorting dialog.
  	 * Use option [locale.modalDialogResetButton](ui.iggridsorting#options:locale.modalDialogResetButton).
  	 */
  var modalDialogResetButtonLabel: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies sortby button text for each unsorted column in multiple sorting dialog.
  	 * Use option [locale.modalDialogSortByButtonText](ui.iggridsorting#options:locale.modalDialogSortByButtonText).
  	 */
  var modalDialogSortByButtonText: js.UndefOr[String] = js.native
  /**
  	 * Event fired when column(which is not sorted) is clicked to be sorted in modal dialog
  	 */
  var modalDialogSortClick: js.UndefOr[ModalDialogSortClickEvent] = js.native
  /**
  	 * Specifies whether sorting to be applied immediately when click sort/unsort columns when using the multiple sorting dialog. When it is false Apply button shows and sorting is applied when the button is clicked.
  	 *
  	 */
  var modalDialogSortOnClick: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired when sorting of column is changed in modal dialog. Column should be sorted
  	 */
  var modalDialogSortingChanged: js.UndefOr[ModalDialogSortingChangedEvent] = js.native
  /**
  	 * Specifies width of multiple sorting dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specifies the width in pixels as a string ("300px").
  	 * "number" Specifies the width in pixels as a number (300)
  	 */
  var modalDialogWidth: js.UndefOr[String | Double] = js.native
  /**
  	 * Defines single column sorting or multiple column sorting.
  	 *
  	 *
  	 * Valid values:
  	 * "single" Only a single column can be sorted. Previously sorted columns will not preserve their sorting upon sorting a new column.
  	 * "multi" If enabled, previous sorted state for columns won't be cleared
  	 */
  var mode: js.UndefOr[String] = js.native
  /**
  	 * Enables/disables sorting persistence when the grid is rebound.
  	 *
  	 */
  var persist: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * URL param name which specifies how sorting expressions will be encoded in the URL. Uses OData conventions. ex: ?sort(col1)=asc
  	 *
  	 */
  var sortUrlKey: js.UndefOr[String] = js.native
  /**
  	 * URL param value for ascending type of sorting. Uses OData conventions. Example: ?sort(col1)=asc
  	 *
  	 */
  var sortUrlKeyAscValue: js.UndefOr[String] = js.native
  /**
  	 * URL param value for descending type of sorting. Uses OData conventions. Example: ?sort(col1)=desc
  	 *
  	 */
  var sortUrlKeyDescValue: js.UndefOr[String] = js.native
  /**
  	 * Controls containment behavior of multiple sorting dialog.
  	 *
  	 * owner  The multi sorting dialog will be draggable only in the grid area
  	 * window  The multi sorting dialog will be draggable in the whole window area
  	 */
  var sortingDialogContainment: js.UndefOr[String] = js.native
  /**
  	 * Defines local or remote sorting operations.
  	 *
  	 *
  	 * Valid values:
  	 * "remote" Sorting is performed remotely as a server-side operation.
  	 * "local" Sorting is performed locally by the [$.ig.DataSource](ig.datasource) component.
  	 */
  var `type`: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Custom unsorted column tooltip in [igTemplating](http://www.igniteui.com/help/igtemplating-overview) format.
  	 * Use option [locale.unsortedColumnTooltip](ui.iggridsorting#options:locale.unsortedColumnTooltip).
  	 */
  var unsortedColumnTooltip: js.UndefOr[String] = js.native
}

object IgGridSorting {
  @scala.inline
  def apply(): IgGridSorting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSorting]
  }
  @scala.inline
  implicit class IgGridSortingOps[Self <: IgGridSorting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplySortedColumnCss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applySortedColumnCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplySortedColumnCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applySortedColumnCss")(js.undefined)
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
    def withColumnSettings(value: js.Array[IgGridSortingColumnSetting]): Self = {
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
    def withColumnSorted(value: (/* event */ Event_, /* ui */ ColumnSortedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSorted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnSorted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSorted")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSorting(value: (/* event */ Event_, /* ui */ ColumnSortingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSorting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSortFunction(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSortFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSortFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSortFunction")(js.undefined)
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
    def withFeatureChooserSortAsc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserSortAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureChooserSortAsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserSortAsc")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureChooserSortDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserSortDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureChooserSortDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserSortDesc")(js.undefined)
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
    def withFirstSortDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstSortDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSortDirection")(js.undefined)
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
    def withLocale(value: IgGridSortingLocale): Self = {
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
    def withModalDialogAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogAnimationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogAnimationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogButtonApplyClick(value: (/* event */ Event_, /* ui */ ModalDialogButtonApplyClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonApplyClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogButtonApplyClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonApplyClick")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogButtonApplyText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonApplyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogButtonApplyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonApplyText")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogButtonCancelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonCancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogButtonCancelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonCancelText")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogButtonResetClick(value: (/* event */ Event_, /* ui */ ModalDialogButtonResetClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonResetClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogButtonResetClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonResetClick")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogButtonUnsortClick(value: (/* event */ Event_, /* ui */ ModalDialogButtonUnsortClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonUnsortClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogButtonUnsortClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonUnsortClick")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogCaptionButtonAsc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogCaptionButtonAsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonAsc")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogCaptionButtonDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogCaptionButtonDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogCaptionButtonUnsort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonUnsort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogCaptionButtonUnsort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonUnsort")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogCaptionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogCaptionText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionText")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogClosed(value: (/* event */ Event_, /* ui */ ModalDialogClosedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogClosed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogClosing(value: (/* event */ Event_, /* ui */ ModalDialogClosingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogClosing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogContentsRendered(value: (/* event */ Event_, /* ui */ ModalDialogContentsRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogContentsRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogContentsRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogContentsRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogContentsRendering(value: (/* event */ Event_, /* ui */ ModalDialogContentsRenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogContentsRendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogContentsRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogContentsRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogMoving(value: (/* event */ Event_, /* ui */ ModalDialogMovingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogMoving")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogMoving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogMoving")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogOpened(value: (/* event */ Event_, /* ui */ ModalDialogOpenedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogOpened")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogOpening(value: (/* event */ Event_, /* ui */ ModalDialogOpeningEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogOpening")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogResetButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogResetButtonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogResetButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogResetButtonLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogSortByButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogSortByButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogSortByButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogSortByButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogSortClick(value: (/* event */ Event_, /* ui */ ModalDialogSortClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogSortClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogSortClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogSortClick")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogSortOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogSortOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogSortOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogSortOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogSortingChanged(value: (/* event */ Event_, /* ui */ ModalDialogSortingChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogSortingChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogSortingChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogSortingChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogWidth")(js.undefined)
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
    def withSortUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortUrlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSortUrlKeyAscValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortUrlKeyAscValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortUrlKeyAscValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortUrlKeyAscValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSortUrlKeyDescValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortUrlKeyDescValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortUrlKeyDescValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortUrlKeyDescValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSortingDialogContainment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingDialogContainment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortingDialogContainment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingDialogContainment")(js.undefined)
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
    def withUnsortedColumnTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsortedColumnTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsortedColumnTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsortedColumnTooltip")(js.undefined)
        ret
    }
  }
  
}

