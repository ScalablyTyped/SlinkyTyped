package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeployablePatchSnapshotForInstanceRequest extends js.Object {
  /**
    * The ID of the instance for which the appropriate patch snapshot should be retrieved.
    */
  var InstanceId: typingsSlinky.awsSdk.ssmMod.InstanceId = js.native
  /**
    * The user-defined snapshot ID.
    */
  var SnapshotId: typingsSlinky.awsSdk.ssmMod.SnapshotId = js.native
}

object GetDeployablePatchSnapshotForInstanceRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, SnapshotId: SnapshotId): GetDeployablePatchSnapshotForInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeployablePatchSnapshotForInstanceRequest]
  }
  @scala.inline
  implicit class GetDeployablePatchSnapshotForInstanceRequestOps[Self <: GetDeployablePatchSnapshotForInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotId(value: SnapshotId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

