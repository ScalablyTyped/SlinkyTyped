package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheSecurityGroupMembership extends js.Object {
  /**
    * The name of the cache security group.
    */
  var CacheSecurityGroupName: js.UndefOr[String] = js.native
  /**
    * The membership status in the cache security group. The status changes when a cache security group is modified, or when the cache security groups assigned to a cluster are modified.
    */
  var Status: js.UndefOr[String] = js.native
}

object CacheSecurityGroupMembership {
  @scala.inline
  def apply(): CacheSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSecurityGroupMembership]
  }
  @scala.inline
  implicit class CacheSecurityGroupMembershipOps[Self <: CacheSecurityGroupMembership] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheSecurityGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheSecurityGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheSecurityGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheSecurityGroupName")(js.undefined)
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
  }
  
}

