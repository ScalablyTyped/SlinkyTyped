package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSnapshotRecordSourceInfo extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the source instance or disk snapshot.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date when the source instance or disk snapshot was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * A list of objects describing a disk snapshot.
    */
  var diskSnapshotInfo: js.UndefOr[DiskSnapshotInfo] = js.native
  /**
    * The Amazon Resource Name (ARN) of the snapshot's source instance or disk.
    */
  var fromResourceArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the snapshot's source instance or disk.
    */
  var fromResourceName: js.UndefOr[NonEmptyString] = js.native
  /**
    * A list of objects describing an instance snapshot.
    */
  var instanceSnapshotInfo: js.UndefOr[InstanceSnapshotInfo] = js.native
  /**
    * The name of the source instance or disk snapshot.
    */
  var name: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Lightsail resource type (e.g., InstanceSnapshot or DiskSnapshot).
    */
  var resourceType: js.UndefOr[ExportSnapshotRecordSourceType] = js.native
}

object ExportSnapshotRecordSourceInfo {
  @scala.inline
  def apply(): ExportSnapshotRecordSourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportSnapshotRecordSourceInfo]
  }
  @scala.inline
  implicit class ExportSnapshotRecordSourceInfoOps[Self <: ExportSnapshotRecordSourceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
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
    def withDiskSnapshotInfo(value: DiskSnapshotInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSnapshotInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskSnapshotInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSnapshotInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withFromResourceArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromResourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFromResourceName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromResourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceSnapshotInfo(value: InstanceSnapshotInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceSnapshotInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceSnapshotInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceSnapshotInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NonEmptyString): Self = {
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
    def withResourceType(value: ExportSnapshotRecordSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
  }
  
}

