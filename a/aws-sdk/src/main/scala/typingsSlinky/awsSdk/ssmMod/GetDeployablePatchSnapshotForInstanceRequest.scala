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
}

