package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotGridLevelSortDirection
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the unique name of the level, which will be sorted.
  	 */
  var levelUniqueName: js.UndefOr[String] = js.native
  /**
  	 * optional="true" Specifies what type of sorting will be applied to the header cells. If no behavior is specified, the level is going to be sorted with the behavior specified in the defaultLevelSortBehavior option.
  	 *
  	 * Valid values:
  	 * "system" Sorts the headers by a specified sort key.
  	 * "alphabetical" Sorts alphabetically the header captions.
  	 */
  var sortBehavior: js.UndefOr[String] = js.native
  /**
  	 * optional="true" Specifies the sort direction. If no direction is specified, the level is going to be sorted in the direction specified by the firstLevelSortDirection option.
  	 */
  var sortDirection: js.UndefOr[js.Any] = js.native
}

object IgPivotGridLevelSortDirection {
  @scala.inline
  def apply(): IgPivotGridLevelSortDirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGridLevelSortDirection]
  }
  @scala.inline
  implicit class IgPivotGridLevelSortDirectionOps[Self <: IgPivotGridLevelSortDirection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevelUniqueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelUniqueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelUniqueName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelUniqueName")(js.undefined)
        ret
    }
    @scala.inline
    def withSortBehavior(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDirection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(js.undefined)
        ret
    }
  }
  
}

