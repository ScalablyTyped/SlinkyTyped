package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemActivity extends Entity {
  // An item was accessed.
  var access: js.UndefOr[AccessAction] = js.native
  // Details about when the activity took place. Read-only.
  var activityDateTime: js.UndefOr[String] = js.native
  // Identity of who performed the action. Read-only.
  var actor: js.UndefOr[IdentitySet] = js.native
  // Exposes the driveItem that was the target of this activity.
  var driveItem: js.UndefOr[DriveItem] = js.native
}

object ItemActivity {
  @scala.inline
  def apply(): ItemActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemActivity]
  }
  @scala.inline
  implicit class ItemActivityOps[Self <: ItemActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess(value: AccessAction): Self = {
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
    def withActivityDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withActor(value: IdentitySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actor")(js.undefined)
        ret
    }
    @scala.inline
    def withDriveItem(value: DriveItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveItem")(js.undefined)
        ret
    }
  }
  
}

