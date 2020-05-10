package typingsSlinky.reactCalendarTimeline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineKeys extends js.Object {
  var groupIdKey: String = js.native
  var groupRightTitleKey: String = js.native
  var groupTitleKey: String = js.native
  var itemDivTitleKey: String = js.native
  var itemGroupKey: String = js.native
  var itemIdKey: String = js.native
  var itemTimeEndKey: String = js.native
  var itemTimeStartKey: String = js.native
  var itemTitleKey: String = js.native
}

object TimelineKeys {
  @scala.inline
  def apply(
    groupIdKey: String,
    groupRightTitleKey: String,
    groupTitleKey: String,
    itemDivTitleKey: String,
    itemGroupKey: String,
    itemIdKey: String,
    itemTimeEndKey: String,
    itemTimeStartKey: String,
    itemTitleKey: String
  ): TimelineKeys = {
    val __obj = js.Dynamic.literal(groupIdKey = groupIdKey.asInstanceOf[js.Any], groupRightTitleKey = groupRightTitleKey.asInstanceOf[js.Any], groupTitleKey = groupTitleKey.asInstanceOf[js.Any], itemDivTitleKey = itemDivTitleKey.asInstanceOf[js.Any], itemGroupKey = itemGroupKey.asInstanceOf[js.Any], itemIdKey = itemIdKey.asInstanceOf[js.Any], itemTimeEndKey = itemTimeEndKey.asInstanceOf[js.Any], itemTimeStartKey = itemTimeStartKey.asInstanceOf[js.Any], itemTitleKey = itemTitleKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineKeys]
  }
  @scala.inline
  implicit class TimelineKeysOps[Self <: TimelineKeys] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupIdKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIdKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupRightTitleKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRightTitleKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupTitleKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTitleKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemDivTitleKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDivTitleKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemGroupKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemGroupKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemIdKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIdKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemTimeEndKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTimeEndKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemTimeStartKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTimeStartKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemTitleKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTitleKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

