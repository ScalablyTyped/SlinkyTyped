package typingsSlinky.pulumiAws.clusterSnapshotMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterSnapshotArgs extends js.Object {
  /**
    * The DocDB Cluster Identifier from which to take the snapshot.
    */
  val dbClusterIdentifier: Input[String] = js.native
  /**
    * The Identifier for the snapshot.
    */
  val dbClusterSnapshotIdentifier: Input[String] = js.native
}

object ClusterSnapshotArgs {
  @scala.inline
  def apply(dbClusterIdentifier: Input[String], dbClusterSnapshotIdentifier: Input[String]): ClusterSnapshotArgs = {
    val __obj = js.Dynamic.literal(dbClusterIdentifier = dbClusterIdentifier.asInstanceOf[js.Any], dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterSnapshotArgs]
  }
  @scala.inline
  implicit class ClusterSnapshotArgsOps[Self <: ClusterSnapshotArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDbClusterIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbClusterSnapshotIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbClusterSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

