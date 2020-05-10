package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecreaseReplicationFactorRequest extends js.Object {
  /**
    * The Availability Zone(s) from which to remove nodes.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
  /**
    * The name of the DAX cluster from which you want to remove nodes.
    */
  var ClusterName: String = js.native
  /**
    * The new number of nodes for the DAX cluster.
    */
  var NewReplicationFactor: Integer = js.native
  /**
    * The unique identifiers of the nodes to be removed from the cluster.
    */
  var NodeIdsToRemove: js.UndefOr[NodeIdentifierList] = js.native
}

object DecreaseReplicationFactorRequest {
  @scala.inline
  def apply(ClusterName: String, NewReplicationFactor: Integer): DecreaseReplicationFactorRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any], NewReplicationFactor = NewReplicationFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecreaseReplicationFactorRequest]
  }
  @scala.inline
  implicit class DecreaseReplicationFactorRequestOps[Self <: DecreaseReplicationFactorRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewReplicationFactor(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewReplicationFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailabilityZones(value: AvailabilityZoneList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeIdsToRemove(value: NodeIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeIdsToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeIdsToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeIdsToRemove")(js.undefined)
        ret
    }
  }
  
}

