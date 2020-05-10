package typingsSlinky.pulumiAws.snapshotCreateVolumePermissionMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotCreateVolumePermissionState extends js.Object {
  /**
    * An AWS Account ID to add create volume permissions
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  /**
    * A snapshot ID
    */
  val snapshotId: js.UndefOr[Input[String]] = js.native
}

object SnapshotCreateVolumePermissionState {
  @scala.inline
  def apply(): SnapshotCreateVolumePermissionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotCreateVolumePermissionState]
  }
  @scala.inline
  implicit class SnapshotCreateVolumePermissionStateOps[Self <: SnapshotCreateVolumePermissionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotId")(js.undefined)
        ret
    }
  }
  
}

