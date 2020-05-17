package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridCellMerging
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  var cellsMerged: js.UndefOr[CellsMergedEvent] = js.native
  /**
  	 * Event fired before a new merged cells group is created.
  	 */
  var cellsMerging: js.UndefOr[CellsMergingEvent] = js.native
  /**
  	 * A list of column settings that specifies hiding options on a per column basis.
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridCellMergingColumnSetting]] = js.native
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Defines when merging should be applied.
  	 *
  	 *
  	 * Valid values:
  	 * "sorting" Only sorted columns will have merging applied
  	 * "always" Merging will be applied to all columns always
  	 * "never" No merging will be applied
  	 */
  var mergeOn: js.UndefOr[String] = js.native
  /**
  	 * Defines the whether the rows will be merged or not.
  	 *
  	 */
  var mergeRows: js.UndefOr[js.Any] = js.native
  /**
  	 * Defines the rules merging is based on.
  	 *
  	 *
  	 * Valid values:
  	 * "duplicate" Duplicate values in the column will be merged together.
  	 * "null" Merging will be applied for each subsequent null value after a non-null value.
  	 */
  var mergeStrategy: js.UndefOr[String | js.Function] = js.native
  /**
  	 * Defines the type of merging.
  	 *
  	 *
  	 * Valid values:
  	 * "visual" the grid cells will be merged only visually
  	 * "physical" the grid cell will be merged physically throughout rowspan
  	 */
  var mergeType: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Defines the rules merging is based on.
  	 *
  	 *
  	 * Valid values:
  	 * "duplicate" Duplicate values in the column will be merged together.
  	 * "null" Merging will be applied for each subsequent null value after a non-null value.
  	 */
  var rowMergeStrategy: js.UndefOr[String | js.Function] = js.native
}

object IgGridCellMerging {
  @scala.inline
  def apply(): IgGridCellMerging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridCellMerging]
  }
  @scala.inline
  implicit class IgGridCellMergingOps[Self <: IgGridCellMerging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellsMerged(value: (/* event */ Event, /* ui */ CellsMergedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellsMerged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellsMerged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellsMerged")(js.undefined)
        ret
    }
    @scala.inline
    def withCellsMerging(value: (/* event */ Event, /* ui */ CellsMergingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellsMerging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellsMerging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellsMerging")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSettings(value: js.Array[IgGridCellMergingColumnSetting]): Self = {
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
    def withLocale(value: js.Any): Self = {
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
    def withMergeOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeOn")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeRows(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeRows")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeStrategy(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeType")(js.undefined)
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
    def withRowMergeStrategy(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMergeStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowMergeStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMergeStrategy")(js.undefined)
        ret
    }
  }
  
}

