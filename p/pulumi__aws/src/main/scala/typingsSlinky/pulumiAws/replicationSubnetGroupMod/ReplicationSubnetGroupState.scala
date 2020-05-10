package typingsSlinky.pulumiAws.replicationSubnetGroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationSubnetGroupState extends js.Object {
  val replicationSubnetGroupArn: js.UndefOr[Input[String]] = js.native
  /**
    * The description for the subnet group.
    */
  val replicationSubnetGroupDescription: js.UndefOr[Input[String]] = js.native
  /**
    * The name for the replication subnet group. This value is stored as a lowercase string.
    */
  val replicationSubnetGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * A list of the EC2 subnet IDs for the subnet group.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The ID of the VPC the subnet group is in.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object ReplicationSubnetGroupState {
  @scala.inline
  def apply(): ReplicationSubnetGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationSubnetGroupState]
  }
  @scala.inline
  implicit class ReplicationSubnetGroupStateOps[Self <: ReplicationSubnetGroupState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationSubnetGroupArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationSubnetGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationSubnetGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationSubnetGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationSubnetGroupDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationSubnetGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationSubnetGroupDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationSubnetGroupDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationSubnetGroupId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationSubnetGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationSubnetGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationSubnetGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(js.undefined)
        ret
    }
  }
  
}

