package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeHierarchicalDataSourceSettingsTreeDSFiltering
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * If displayMode is showWithAncestorsAndDescendants, show all records that match filtering conditions and their child records, even if child records don't match filtering conditions. If displayMode is showWithAncestors show only those records that match filtering conditions and do not show child records(if any) that don't match filtering conditions
  	 */
  var displayMode: js.UndefOr[js.Any] = js.native
  /**
  	 * Specifies from which data bound level to be applied filtering - 0 is the first level
  	 */
  var fromLevel: js.UndefOr[Double] = js.native
  /**
  	 * Filtering data source specific property - name of property in dataRecord object - indicates whether dataRow matches filtering conditions. It is used ONLY when filtering is applied.
  	 */
  var matchFiltering: js.UndefOr[String] = js.native
  /**
  	 * Specifies to which data bound level to be applied filtering - if -1 filtering should be applied to the last data bound level
  	 */
  var toLevel: js.UndefOr[Double] = js.native
}

object TreeHierarchicalDataSourceSettingsTreeDSFiltering {
  @scala.inline
  def apply(): TreeHierarchicalDataSourceSettingsTreeDSFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettingsTreeDSFiltering]
  }
  @scala.inline
  implicit class TreeHierarchicalDataSourceSettingsTreeDSFilteringOps[Self <: TreeHierarchicalDataSourceSettingsTreeDSFiltering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

