package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeGridColumnFixing
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event which is fired when column fixing operation is finished
  	 */
  var columnFixed: js.UndefOr[ColumnFixedEvent] = js.native
  /**
  	 * Event which is fired when column fixing operation is initiated.
  	 */
  var columnFixing: js.UndefOr[ColumnFixingEvent] = js.native
  /**
  	 * Event which is fired when column fixing operation has failed - e.g. sum of the width of the fixed columns container and width of the column to be fixed exceeds the grid width
  	 */
  var columnFixingRefused: js.UndefOr[ColumnFixingRefusedEvent] = js.native
  /**
  	 * List of column settings that specifies custom column fixing options on a per column basis.
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridColumnFixingColumnSetting]] = js.native
  /**
  	 * Event which is fired when column unfixing operation is done
  	 */
  var columnUnfixed: js.UndefOr[ColumnUnfixedEvent] = js.native
  /**
  	 * Event which is fired when column unfixing operation is initiated
  	 */
  var columnUnfixing: js.UndefOr[ColumnUnfixingEvent] = js.native
  /**
  	 * Event which is fired when column unfixing operation has failed - e.g.: there is only one fixed visible column(and tries to unfix it) and at least one fixed hidden column
  	 */
  var columnUnfixingRefused: js.UndefOr[ColumnUnfixingRefusedEvent] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 *                 Text of the feature chooser button for unfixing a currently fixed column. Use option [locale.featureChooserTextFixedColumn](ui.iggridcolumnfixing#options:locale.featureChooserTextFixedColumn).
  	 */
  var featureChooserTextFixedColumn: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 *                 Text of the feature chooser button for unfixing a currently fixed column. Use option [locale.featureChooserTextUnfixedColumn](ui.iggridcolumnfixing#options:locale.featureChooserTextUnfixedColumn).
  	 */
  var featureChooserTextUnfixedColumn: js.UndefOr[String] = js.native
  /**
  	 * Specify initial fixing of all non data columns. Non-data columns are columns in the grid rendered for specific features, like the row selectors feature. The column containing the row numbering is such a column. This option is applicable when [fixingDirection](ui.iggridcolumnfixing#options:fixingDirection) is set to left. For a full column fixing configuration summary please refer to [this topic](http://www.igniteui.com/help/iggrid-columnfixing-configuring#configuration-summary).
  	 *
  	 */
  var fixNondataColumns: js.UndefOr[Boolean] = js.native
  /**
  	 * Configures which side the fixed columns of the grid will be rendered on. Check [this topic](http://www.igniteui.com/help/iggrid-columnfixing-configuring#direction) out of more information.
  	 *
  	 *
  	 * Valid values:
  	 * "left" Fixed columns are rendered on the left side of the main grid.
  	 * "right" Fixed columns are rendered on the right side of the main grid.
  	 */
  var fixingDirection: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 *             Specifies the tooltip text on the column fixing header icon when column is not fixed. Use option [locale.headerFixButtonText](ui.iggridcolumnfixing#options:locale.headerFixButtonText).
  	 */
  var headerFixButtonText: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 *                 Specifies the tooltip text on the column fixing header icon when column is fixed. Use option [locale.headerUnfixButtonText](ui.iggridcolumnfixing#options:locale.headerUnfixButtonText).
  	 */
  var headerUnfixButtonText: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgGridColumnFixingLocale] = js.native
  /**
  	 * Minimal visible area in pixels for the unfixed columns. If the end user tries to fix a column(or columns), which causes the width of the fixed columns to grow such that the width of visible area of unfixed columns is less than this option then fixing will be canceled. Check [this topic](http://www.igniteui.com/help/iggrid-columnfixing-configuring#non-fixable-min-width) out for more information.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The width can be set in pixels (px) and percentage (%).
  	 * "number" The width can be set in pixels as a number.
  	 */
  var minimalVisibleAreaWidth: js.UndefOr[String | Double] = js.native
  /**
  	 * When true all the TR DOM attributes of the unfixed row will be copied to the fixed row. Note that when enabled this option negatively affects performance when fixing a column.
  	 */
  var populateDataRowsAttributes: js.UndefOr[Boolean] = js.native
  /**
  	 * Scroll delta in pixels when scrolling with the mouse wheel or the keyboard in the fixed columns area of the grid.
  	 *
  	 */
  var scrollDelta: js.UndefOr[Double] = js.native
  /**
  	 * Specifies whether to show the column fixing buttons in header cells/feature chooser.
  	 *
  	 */
  var showFixButtons: js.UndefOr[Boolean] = js.native
  /**
  	 * Enable row height sync for the fixed and unfixed portion of the grid. If you're observing row misalignment, please refer to [this article](http://www.igniteui.com/help/iggrid-known-issues#misalignment-ie9).
  	 *
  	 */
  var syncRowHeights: js.UndefOr[Boolean] = js.native
}

object IgTreeGridColumnFixing {
  @scala.inline
  def apply(): IgTreeGridColumnFixing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridColumnFixing]
  }
  @scala.inline
  implicit class IgTreeGridColumnFixingOps[Self <: IgTreeGridColumnFixing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnFixed(value: (/* event */ Event_, /* ui */ ColumnFixedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFixed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFixed")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnFixing(value: (/* event */ Event_, /* ui */ ColumnFixingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFixing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnFixing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFixing")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnFixingRefused(value: (/* event */ Event_, /* ui */ ColumnFixingRefusedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFixingRefused")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnFixingRefused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFixingRefused")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSettings(value: js.Array[IgGridColumnFixingColumnSetting]): Self = {
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
    def withColumnUnfixed(value: (/* event */ Event_, /* ui */ ColumnUnfixedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnUnfixed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnUnfixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnUnfixed")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnUnfixing(value: (/* event */ Event_, /* ui */ ColumnUnfixingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnUnfixing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnUnfixing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnUnfixing")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnUnfixingRefused(value: (/* event */ Event_, /* ui */ ColumnUnfixingRefusedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnUnfixingRefused")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnUnfixingRefused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnUnfixingRefused")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureChooserTextFixedColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserTextFixedColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureChooserTextFixedColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserTextFixedColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureChooserTextUnfixedColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserTextUnfixedColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureChooserTextUnfixedColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserTextUnfixedColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withFixNondataColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixNondataColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixNondataColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixNondataColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withFixingDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixingDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixingDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixingDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFixButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFixButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFixButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFixButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderUnfixButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerUnfixButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderUnfixButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerUnfixButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: IgGridColumnFixingLocale): Self = {
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
    def withMinimalVisibleAreaWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimalVisibleAreaWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimalVisibleAreaWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimalVisibleAreaWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPopulateDataRowsAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populateDataRowsAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopulateDataRowsAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populateDataRowsAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFixButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFixButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFixButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFixButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncRowHeights(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncRowHeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncRowHeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncRowHeights")(js.undefined)
        ret
    }
  }
  
}

