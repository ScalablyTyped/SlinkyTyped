package typingsSlinky.extjs.Ext.grid.feature

import typingsSlinky.extjs.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGrouping extends IAbstractSummary {
  /** [Method] Collapse a group
  		* @param groupName String The group name
  		* @param focus Boolean Pass true to focus the group after expand.
  		*/
  var collapse: js.UndefOr[
    js.Function2[/* groupName */ js.UndefOr[String], /* focus */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Collapse all groups */
  var collapseAll: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var depthToIndent: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var enableGroupingMenu: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableNoGroups: js.UndefOr[Boolean] = js.native
  /** [Method] Expand a group
  		* @param groupName String The group name
  		* @param focus Boolean Pass true to focus the group after expand.
  		*/
  var expand: js.UndefOr[
    js.Function2[/* groupName */ js.UndefOr[String], /* focus */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Expand all groups */
  var expandAll: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the group data object for the group to which the passed record belongs if the Store is grouped
  		* @param record Ext.data.Model The record for which to return group information.
  		* @returns Object A single group data block as returned from Store.getGroups. Returns undefined if the Store is not grouped.
  		*/
  var getRecordGroup: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], _]] = js.native
  /** [Config Option] (String) */
  var groupByText: js.UndefOr[String] = js.native
  /** [Config Option] (String/Array/Ext.Template) */
  var groupHeaderTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var hideGroupedHeader: js.UndefOr[Boolean] = js.native
  /** [Method] Returns true if the named group is expanded
  		* @param groupName String The group name as returned from getGroupString. This is usually the value of the groupField.
  		* @returns Boolean true if the group defined by that value is expanded.
  		*/
  var isExpanded: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[String], Boolean]] = js.native
  /** [Config Option] (String) */
  var showGroupsText: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var startCollapsed: js.UndefOr[Boolean] = js.native
}

object IGrouping {
  @scala.inline
  def apply(): IGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGrouping]
  }
  @scala.inline
  implicit class IGroupingOps[Self <: IGrouping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapse(value: (/* groupName */ js.UndefOr[String], /* focus */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCollapseAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAll")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthToIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthToIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthToIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthToIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGroupingMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupingMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGroupingMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupingMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableNoGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNoGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNoGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNoGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: (/* groupName */ js.UndefOr[String], /* focus */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutExpandAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAll")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRecordGroup(value: /* record */ js.UndefOr[IModel] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecordGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRecordGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecordGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByText")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupHeaderTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHeaderTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupHeaderTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHeaderTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withHideGroupedHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideGroupedHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideGroupedHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideGroupedHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExpanded(value: /* groupName */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGroupsText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGroupsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGroupsText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGroupsText")(js.undefined)
        ret
    }
    @scala.inline
    def withStartCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCollapsed")(js.undefined)
        ret
    }
  }
  
}

