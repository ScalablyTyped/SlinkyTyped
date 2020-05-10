package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterSnapshotMessage extends js.Object {
  /**
    * The unique identifier of the cluster the snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name. Constraints: Must be the name of valid cluster.
    */
  var SnapshotClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The unique identifier of the manual snapshot to be deleted. Constraints: Must be the name of an existing snapshot that is in the available, failed, or cancelled state.
    */
  var SnapshotIdentifier: String = js.native
}

object DeleteClusterSnapshotMessage {
  @scala.inline
  def apply(SnapshotIdentifier: String): DeleteClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterSnapshotMessage]
  }
  @scala.inline
  implicit class DeleteClusterSnapshotMessageOps[Self <: DeleteClusterSnapshotMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotClusterIdentifier")(js.undefined)
        ret
    }
  }
  
}

