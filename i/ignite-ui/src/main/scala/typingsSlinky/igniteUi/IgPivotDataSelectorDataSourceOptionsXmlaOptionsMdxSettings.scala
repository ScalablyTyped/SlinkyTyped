package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotDataSelectorDataSourceOptionsXmlaOptionsMdxSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Optional="true" a value indicating whether a members' set expressions on COLUMNS axis should be wrapped with AddCalculatedMembers MDX method. Default value is true
  	 */
  var addCalculatedMembersOnColumns: js.UndefOr[Boolean] = js.native
  /**
  	 * Optional="true" a value indicating whether a members' set expressions on ROWS axis should be wrapped with AddCalculatedMembers MDX method. Default value is true
  	 */
  var addCalculatedMembersOnRows: js.UndefOr[Boolean] = js.native
  /**
  	 * Optional="true" a string array with the names of intrinsic non-context sensitive member properties applied on COLUMNS axis. By defult CHILDREN_CARDINALITY and PARENT_UNIQUE_NAME properties are always added to DIMENSION PROPERTIES
  	 */
  var dimensionPropertiesOnColumns: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Optional="true" a string array with the names of intrinsic non-context sensitive member properties applied on ROWS axis. By defult CHILDREN_CARDINALITY and PARENT_UNIQUE_NAME properties are always added to DIMENSION PROPERTIES
  	 */
  var dimensionPropertiesOnRows: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Optional="true" a value indicating whether a NON EMPTY clause is present on COLUMNS axis. Default value is true
  	 */
  var nonEmptyOnColumns: js.UndefOr[Boolean] = js.native
  /**
  	 * Optional="true" a value indicating whether a NON EMPTY clause is present on ROWS axis. Default value is true
  	 */
  var nonEmptyOnRows: js.UndefOr[Boolean] = js.native
}

object IgPivotDataSelectorDataSourceOptionsXmlaOptionsMdxSettings {
  @scala.inline
  def apply(): IgPivotDataSelectorDataSourceOptionsXmlaOptionsMdxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptionsXmlaOptionsMdxSettings]
  }
  @scala.inline
  implicit class IgPivotDataSelectorDataSourceOptionsXmlaOptionsMdxSettingsOps[Self <: IgPivotDataSelectorDataSourceOptionsXmlaOptionsMdxSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCalculatedMembersOnColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCalculatedMembersOnColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddCalculatedMembersOnColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCalculatedMembersOnColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withAddCalculatedMembersOnRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCalculatedMembersOnRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddCalculatedMembersOnRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCalculatedMembersOnRows")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensionPropertiesOnColumns(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionPropertiesOnColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionPropertiesOnColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionPropertiesOnColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensionPropertiesOnRows(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionPropertiesOnRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionPropertiesOnRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionPropertiesOnRows")(js.undefined)
        ret
    }
    @scala.inline
    def withNonEmptyOnColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEmptyOnColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonEmptyOnColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEmptyOnColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withNonEmptyOnRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEmptyOnRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonEmptyOnRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEmptyOnRows")(js.undefined)
        ret
    }
  }
  
}

