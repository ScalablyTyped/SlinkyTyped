package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotInfo extends js.Object {
  /**
    * Description specified by the CreateSnapshotRequest that has been applied to all snapshots.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Indicates whether the snapshot is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * Account id used when creating this snapshot.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Progress this snapshot has made towards completing.
    */
  var Progress: js.UndefOr[String] = js.native
  /**
    * Snapshot id that can be used to describe this snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.native
  /**
    * Time this snapshot was started. This is the same for all snapshots initiated by the same request.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * Current state of the snapshot.
    */
  var State: js.UndefOr[SnapshotState] = js.native
  /**
    * Tags associated with this snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * Source volume from which this snapshot was created.
    */
  var VolumeId: js.UndefOr[String] = js.native
  /**
    * Size of the volume from which this snapshot was created.
    */
  var VolumeSize: js.UndefOr[Integer] = js.native
}

object SnapshotInfo {
  @scala.inline
  def apply(): SnapshotInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotInfo]
  }
  @scala.inline
  implicit class SnapshotInfoOps[Self <: SnapshotInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Progress")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotId")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: SnapshotState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeId")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeSize(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeSize")(js.undefined)
        ret
    }
  }
  
}

