package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterSubnetGroupMessage extends js.Object {
  /**
    * The name of the subnet group to be modified.
    */
  var ClusterSubnetGroupName: String = js.native
  /**
    * A text description of the subnet group to be modified.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a single request.
    */
  var SubnetIds: SubnetIdentifierList = js.native
}

object ModifyClusterSubnetGroupMessage {
  @scala.inline
  def apply(ClusterSubnetGroupName: String, SubnetIds: SubnetIdentifierList): ModifyClusterSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ClusterSubnetGroupName = ClusterSubnetGroupName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterSubnetGroupMessage]
  }
  @scala.inline
  implicit class ModifyClusterSubnetGroupMessageOps[Self <: ModifyClusterSubnetGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterSubnetGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSubnetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: SubnetIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
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

