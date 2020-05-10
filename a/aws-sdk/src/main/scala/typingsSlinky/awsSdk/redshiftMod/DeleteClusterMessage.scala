package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterMessage extends js.Object {
  /**
    * The identifier of the cluster to be deleted. Constraints:   Must contain lowercase characters.   Must contain from 1 to 63 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ClusterIdentifier: String = js.native
  /**
    * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this parameter is provided, SkipFinalClusterSnapshot must be false.  Constraints:   Must be 1 to 255 alphanumeric characters.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var FinalClusterSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely. The value must be either -1 or an integer between 1 and 3,653. The default value is -1.
    */
  var FinalClusterSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If true, a final cluster snapshot is not created. If false, a final cluster snapshot is created before the cluster is deleted.   The FinalClusterSnapshotIdentifier parameter must be specified if SkipFinalClusterSnapshot is false.  Default: false 
    */
  var SkipFinalClusterSnapshot: js.UndefOr[Boolean] = js.native
}

object DeleteClusterMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): DeleteClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterMessage]
  }
  @scala.inline
  implicit class DeleteClusterMessageOps[Self <: DeleteClusterMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinalClusterSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalClusterSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalClusterSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalClusterSnapshotIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalClusterSnapshotRetentionPeriod(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalClusterSnapshotRetentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalClusterSnapshotRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalClusterSnapshotRetentionPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipFinalClusterSnapshot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkipFinalClusterSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipFinalClusterSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkipFinalClusterSnapshot")(js.undefined)
        ret
    }
  }
  
}

