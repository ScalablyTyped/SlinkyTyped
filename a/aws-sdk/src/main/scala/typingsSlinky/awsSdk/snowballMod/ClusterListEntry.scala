package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterListEntry extends js.Object {
  /**
    * The 39-character ID for the cluster that you want to list, for example CID123e4567-e89b-12d3-a456-426655440000.
    */
  var ClusterId: js.UndefOr[String] = js.native
  /**
    * The current state of this cluster. For information about the state of a specific node, see JobListEntry$JobState.
    */
  var ClusterState: js.UndefOr[typingsSlinky.awsSdk.snowballMod.ClusterState] = js.native
  /**
    * The creation date for this cluster.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * Defines an optional description of the cluster, for example Environmental Data Cluster-01.
    */
  var Description: js.UndefOr[String] = js.native
}

object ClusterListEntry {
  @scala.inline
  def apply(): ClusterListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterListEntry]
  }
  @scala.inline
  implicit class ClusterListEntryOps[Self <: ClusterListEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterState(value: ClusterState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterState")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
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
  }
  
}

