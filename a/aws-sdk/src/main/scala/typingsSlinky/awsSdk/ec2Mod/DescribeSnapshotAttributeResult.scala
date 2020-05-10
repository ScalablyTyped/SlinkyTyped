package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSnapshotAttributeResult extends js.Object {
  /**
    * The users and groups that have the permissions for creating volumes from the snapshot.
    */
  var CreateVolumePermissions: js.UndefOr[CreateVolumePermissionList] = js.native
  /**
    * The product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  /**
    * The ID of the EBS snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.native
}

object DescribeSnapshotAttributeResult {
  @scala.inline
  def apply(): DescribeSnapshotAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotAttributeResult]
  }
  @scala.inline
  implicit class DescribeSnapshotAttributeResultOps[Self <: DescribeSnapshotAttributeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateVolumePermissions(value: CreateVolumePermissionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateVolumePermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateVolumePermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateVolumePermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withProductCodes(value: ProductCodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductCodes")(js.undefined)
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
  }
  
}

