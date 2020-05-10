package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBProxyTargetGroup extends js.Object {
  /**
    * The settings that determine the size and behavior of the connection pool for the target group.
    */
  var ConnectionPoolConfig: js.UndefOr[ConnectionPoolConfigurationInfo] = js.native
  /**
    * The date and time when the target group was first created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The identifier for the RDS proxy associated with this target group.
    */
  var DBProxyName: js.UndefOr[String] = js.native
  /**
    * Whether this target group is the first one used for connection requests by the associated proxy. Because each proxy is currently associated with a single target group, currently this setting is always true.
    */
  var IsDefault: js.UndefOr[Boolean] = js.native
  /**
    * The current status of this target group. A status of available means the target group is correctly associated with a database. Other values indicate that you must wait for the target group to be ready, or take some action to resolve an issue.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) representing the target group.
    */
  var TargetGroupArn: js.UndefOr[String] = js.native
  /**
    * The identifier for the target group. This name must be unique for all target groups owned by your AWS account in the specified AWS Region.
    */
  var TargetGroupName: js.UndefOr[String] = js.native
  /**
    * The date and time when the target group was last updated.
    */
  var UpdatedDate: js.UndefOr[js.Date] = js.native
}

object DBProxyTargetGroup {
  @scala.inline
  def apply(): DBProxyTargetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBProxyTargetGroup]
  }
  @scala.inline
  implicit class DBProxyTargetGroupOps[Self <: DBProxyTargetGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionPoolConfig(value: ConnectionPoolConfigurationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionPoolConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionPoolConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionPoolConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDBProxyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBProxyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBProxyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBProxyName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroupArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedDate")(js.undefined)
        ret
    }
  }
  
}

