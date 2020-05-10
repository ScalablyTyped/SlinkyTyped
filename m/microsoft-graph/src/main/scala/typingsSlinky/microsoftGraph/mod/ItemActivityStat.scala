package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemActivityStat extends Entity {
  // Statistics about the access actions in this interval. Read-only.
  var access: js.UndefOr[ItemActionStat] = js.native
  // Exposes the itemActivities represented in this itemActivityStat resource.
  var activities: js.UndefOr[js.Array[ItemActivity]] = js.native
  // Statistics about the create actions in this interval. Read-only.
  var create: js.UndefOr[ItemActionStat] = js.native
  // Statistics about the delete actions in this interval. Read-only.
  var delete: js.UndefOr[ItemActionStat] = js.native
  // Statistics about the edit actions in this interval. Read-only.
  var edit: js.UndefOr[ItemActionStat] = js.native
  // When the interval ends. Read-only.
  var endDateTime: js.UndefOr[String] = js.native
  // Indicates that the statistics in this interval are based on incomplete data. Read-only.
  var incompleteData: js.UndefOr[IncompleteData] = js.native
  // Indicates whether the item is 'trending.' Read-only.
  var isTrending: js.UndefOr[Boolean] = js.native
  // Statistics about the move actions in this interval. Read-only.
  var move: js.UndefOr[ItemActionStat] = js.native
  // When the interval starts. Read-only.
  var startDateTime: js.UndefOr[String] = js.native
}

object ItemActivityStat {
  @scala.inline
  def apply(): ItemActivityStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemActivityStat]
  }
  @scala.inline
  implicit class ItemActivityStatOps[Self <: ItemActivityStat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess(value: ItemActionStat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(js.undefined)
        ret
    }
    @scala.inline
    def withActivities(value: js.Array[ItemActivity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activities")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: ItemActionStat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete(value: ItemActionStat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withEdit(value: ItemActionStat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withIncompleteData(value: IncompleteData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incompleteData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncompleteData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incompleteData")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTrending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTrending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrending")(js.undefined)
        ret
    }
    @scala.inline
    def withMove(value: ItemActionStat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateTime")(js.undefined)
        ret
    }
  }
  
}

