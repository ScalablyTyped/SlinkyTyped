package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoSnapshotDetails extends js.Object {
  /**
    * The timestamp when the automatic snapshot was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The date of the automatic snapshot in YYYY-MM-DD format.
    */
  var date: js.UndefOr[String] = js.native
  /**
    * An array of objects that describe the block storage disks attached to the instance when the automatic snapshot was created.
    */
  var fromAttachedDisks: js.UndefOr[AttachedDiskList] = js.native
  /**
    * The status of the automatic snapshot.
    */
  var status: js.UndefOr[AutoSnapshotStatus] = js.native
}

object AutoSnapshotDetails {
  @scala.inline
  def apply(): AutoSnapshotDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoSnapshotDetails]
  }
  @scala.inline
  implicit class AutoSnapshotDetailsOps[Self <: AutoSnapshotDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withFromAttachedDisks(value: AttachedDiskList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromAttachedDisks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromAttachedDisks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromAttachedDisks")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: AutoSnapshotStatus): Self = {
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

