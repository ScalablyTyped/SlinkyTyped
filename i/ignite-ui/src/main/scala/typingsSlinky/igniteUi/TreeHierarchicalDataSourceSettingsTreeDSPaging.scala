package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeHierarchicalDataSourceSettingsTreeDSPaging
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * When data flows to the next page there are a couple of different modes that can help communicate the context of a leaf level row. When mode option is 'rootLevelOnly' then the context row always shows the value of the contextRowRootText option.
  	 *
  	 *
  	 * Valid values:
  	 * "none" Does not render the contextual row
  	 * "parent" Renders a read-only representation of the immediate parent row
  	 * "breadcrumb" Renders a read-only breadcrumb trail representing the full path through all ancestors
  	 */
  var contextRowMode: js.UndefOr[String] = js.native
  /**
  	 * Sets gets paging mode.
  	 *
  	 * Valid values:
  	 * "allLevels" includes all visible records in paging.
  	 */
  var mode: js.UndefOr[String] = js.native
}

object TreeHierarchicalDataSourceSettingsTreeDSPaging {
  @scala.inline
  def apply(): TreeHierarchicalDataSourceSettingsTreeDSPaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettingsTreeDSPaging]
  }
  @scala.inline
  implicit class TreeHierarchicalDataSourceSettingsTreeDSPagingOps[Self <: TreeHierarchicalDataSourceSettingsTreeDSPaging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextRowMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextRowMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextRowMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextRowMode")(js.undefined)
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
  }
  
}

