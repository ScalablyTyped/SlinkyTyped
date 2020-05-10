package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncreaseNodeGroupsInGlobalReplicationGroupMessage extends js.Object {
  /**
    * Indicates that the process begins immediately. At present, the only permitted value for this parameter is true.
    */
  var ApplyImmediately: Boolean = js.native
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
  /**
    * The number of node groups you wish to add
    */
  var NodeGroupCount: Integer = js.native
  /**
    * Describes the replication group IDs, the AWS regions where they are stored and the shard configuration for each that comprise the Global Datastore
    */
  var RegionalConfigurations: js.UndefOr[RegionalConfigurationList] = js.native
}

object IncreaseNodeGroupsInGlobalReplicationGroupMessage {
  @scala.inline
  def apply(ApplyImmediately: Boolean, GlobalReplicationGroupId: String, NodeGroupCount: Integer): IncreaseNodeGroupsInGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], NodeGroupCount = NodeGroupCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncreaseNodeGroupsInGlobalReplicationGroupMessage]
  }
  @scala.inline
  implicit class IncreaseNodeGroupsInGlobalReplicationGroupMessageOps[Self <: IncreaseNodeGroupsInGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalReplicationGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalReplicationGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeGroupCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroupCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegionalConfigurations(value: RegionalConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionalConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionalConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionalConfigurations")(js.undefined)
        ret
    }
  }
  
}

