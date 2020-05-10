package typingsSlinky.pulumiAws.replicationSubnetGroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationSubnetGroupArgs extends js.Object {
  /**
    * The description for the subnet group.
    */
  val replicationSubnetGroupDescription: Input[String] = js.native
  /**
    * The name for the replication subnet group. This value is stored as a lowercase string.
    */
  val replicationSubnetGroupId: Input[String] = js.native
  /**
    * A list of the EC2 subnet IDs for the subnet group.
    */
  val subnetIds: Input[js.Array[Input[String]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ReplicationSubnetGroupArgs {
  @scala.inline
  def apply(
    replicationSubnetGroupDescription: Input[String],
    replicationSubnetGroupId: Input[String],
    subnetIds: Input[js.Array[Input[String]]]
  ): ReplicationSubnetGroupArgs = {
    val __obj = js.Dynamic.literal(replicationSubnetGroupDescription = replicationSubnetGroupDescription.asInstanceOf[js.Any], replicationSubnetGroupId = replicationSubnetGroupId.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationSubnetGroupArgs]
  }
  @scala.inline
  implicit class ReplicationSubnetGroupArgsOps[Self <: ReplicationSubnetGroupArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationSubnetGroupDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationSubnetGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicationSubnetGroupId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationSubnetGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
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
  }
  
}

