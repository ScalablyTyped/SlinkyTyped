package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOn extends js.Object {
  /**
    * The name of the add-on.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The next daily time an automatic snapshot will be created. The time shown is in HH:00 format, and in Coordinated Universal Time (UTC). The snapshot is automatically created between the time shown and up to 45 minutes after.
    */
  var nextSnapshotTimeOfDay: js.UndefOr[TimeOfDay] = js.native
  /**
    * The daily time when an automatic snapshot is created. The time shown is in HH:00 format, and in Coordinated Universal Time (UTC). The snapshot is automatically created between the time shown and up to 45 minutes after.
    */
  var snapshotTimeOfDay: js.UndefOr[TimeOfDay] = js.native
  /**
    * The status of the add-on.
    */
  var status: js.UndefOr[String] = js.native
}

object AddOn {
  @scala.inline
  def apply(): AddOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOn]
  }
  @scala.inline
  implicit class AddOnOps[Self <: AddOn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNextSnapshotTimeOfDay(value: TimeOfDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSnapshotTimeOfDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextSnapshotTimeOfDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSnapshotTimeOfDay")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotTimeOfDay(value: TimeOfDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotTimeOfDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotTimeOfDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotTimeOfDay")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

