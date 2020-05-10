package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyClusterSnapshotMessage extends js.Object {
  /**
    * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653. The default value is -1.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * The identifier of the cluster the source snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name. Constraints:   Must be the identifier for a valid cluster.  
    */
  var SourceSnapshotClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The identifier for the source snapshot. Constraints:   Must be the identifier for a valid automated snapshot whose state is available.  
    */
  var SourceSnapshotIdentifier: String = js.native
  /**
    * The identifier given to the new manual snapshot. Constraints:   Cannot be null, empty, or blank.   Must contain from 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique for the AWS account that is making the request.  
    */
  var TargetSnapshotIdentifier: String = js.native
}

object CopyClusterSnapshotMessage {
  @scala.inline
  def apply(SourceSnapshotIdentifier: String, TargetSnapshotIdentifier: String): CopyClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(SourceSnapshotIdentifier = SourceSnapshotIdentifier.asInstanceOf[js.Any], TargetSnapshotIdentifier = TargetSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyClusterSnapshotMessage]
  }
  @scala.inline
  implicit class CopyClusterSnapshotMessageOps[Self <: CopyClusterSnapshotMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualSnapshotRetentionPeriod(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManualSnapshotRetentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualSnapshotRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManualSnapshotRetentionPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceSnapshotClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSnapshotClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSnapshotClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSnapshotClusterIdentifier")(js.undefined)
        ret
    }
  }
  
}

