package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationGroupPendingModifiedValues extends js.Object {
  /**
    * The auth token status
    */
  var AuthTokenStatus: js.UndefOr[AuthTokenUpdateStatus] = js.native
  /**
    * Indicates the status of Multi-AZ with automatic failover for this Redis replication group. Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:   Redis versions earlier than 2.8.6.   Redis (cluster mode disabled): T1 node types.   Redis (cluster mode enabled): T1 node types.  
    */
  var AutomaticFailoverStatus: js.UndefOr[PendingAutomaticFailoverStatus] = js.native
  /**
    * The primary cluster ID that is applied immediately (if --apply-immediately was specified), or during the next maintenance window.
    */
  var PrimaryClusterId: js.UndefOr[String] = js.native
  /**
    * The status of an online resharding operation.
    */
  var Resharding: js.UndefOr[ReshardingStatus] = js.native
}

object ReplicationGroupPendingModifiedValues {
  @scala.inline
  def apply(): ReplicationGroupPendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationGroupPendingModifiedValues]
  }
  @scala.inline
  implicit class ReplicationGroupPendingModifiedValuesOps[Self <: ReplicationGroupPendingModifiedValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthTokenStatus(value: AuthTokenUpdateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthTokenStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthTokenStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthTokenStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomaticFailoverStatus(value: PendingAutomaticFailoverStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticFailoverStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticFailoverStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticFailoverStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryClusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withResharding(value: ReshardingStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resharding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResharding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resharding")(js.undefined)
        ret
    }
  }
  
}

