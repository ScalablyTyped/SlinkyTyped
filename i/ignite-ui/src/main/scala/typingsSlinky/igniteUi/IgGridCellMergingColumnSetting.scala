package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridCellMergingColumnSetting
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Column index. This is a required property in every column setting if columnKey is not set.
  	 *
  	 */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
  	 * Column key. This is a required property in every column setting if columnIndex is not set.
  	 *
  	 */
  var columnKey: js.UndefOr[String] = js.native
  /**
  	 * Defines when merging should be applied.
  	 *
  	 *
  	 * Valid values:
  	 * "sorting" The column will only be merged when sorted
  	 * "always" The column will always be merged
  	 * "never" No merging will be applied
  	 */
  var mergeOn: js.UndefOr[String] = js.native
  /**
  	 * Defines the rules merging is based on.
  	 *
  	 *
  	 * Valid values:
  	 * "duplicate" Duplicate values in the column will be merged together.
  	 * "null" Merging will be applied for each subsequent null value after a non-null value.
  	 */
  var mergeStrategy: js.UndefOr[String | js.Function] = js.native
}

object IgGridCellMergingColumnSetting {
  @scala.inline
  def apply(): IgGridCellMergingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridCellMergingColumnSetting]
  }
  @scala.inline
  implicit class IgGridCellMergingColumnSettingOps[Self <: IgGridCellMergingColumnSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(js.undefined)
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
  }
  
}

