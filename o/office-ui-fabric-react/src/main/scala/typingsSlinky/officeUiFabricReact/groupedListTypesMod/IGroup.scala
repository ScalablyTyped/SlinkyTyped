package typingsSlinky.officeUiFabricReact.groupedListTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroup extends js.Object {
  /**
    * Optional accessibility label (aria-label) attribute that will be stamped on to the element.
    * If none is specified, the arai-label attribute will contain the group name
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Nested groups, if any.
    */
  var children: js.UndefOr[js.Array[IGroup]] = js.native
  /**
    * How many items should be rendered within the group.
    */
  var count: Double = js.native
  /**
    * Arbitrary data required to be preserved by the caller.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * Optional flag to indicate the group has more data to load than the current group count indicated.
    * This can be used to indicate that a plus should be rendered next to the group count in the header.
    */
  var hasMoreData: js.UndefOr[Boolean] = js.native
  /**
    * If all the items in the group are collapsed.
    */
  var isCollapsed: js.UndefOr[Boolean] = js.native
  /**
    * If drag/drop is enabled for the group header.
    */
  var isDropEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated at 1.0.0, selection state will be controled by the selection store only.
    * @deprecated At 1.0.0, selection state wil be controlled by the selection store only.
    */
  var isSelected: js.UndefOr[Boolean] = js.native
  /**
    * If the items within the group are summarized or showing all.
    */
  var isShowingAll: js.UndefOr[Boolean] = js.native
  /**
    * Unique identifier for the group.
    */
  var key: String = js.native
  /**
    * Number indicating the level of nested groups.
    */
  var level: js.UndefOr[Double] = js.native
  /**
    * Display name for the group, rendered on the header.
    */
  var name: String = js.native
  /**
    * Start index for the group within the given items.
    */
  var startIndex: Double = js.native
}

object IGroup {
  @scala.inline
  def apply(count: Double, key: String, name: String, startIndex: Double): IGroup = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroup]
  }
  @scala.inline
  implicit class IGroupOps[Self <: IGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[IGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withHasMoreData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasMoreData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreData")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDropEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDropEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withIsShowingAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShowingAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsShowingAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShowingAll")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
  }
  
}

