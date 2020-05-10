package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheSecurityGroup extends js.Object {
  /**
    * The name of the cache security group.
    */
  var CacheSecurityGroupName: js.UndefOr[String] = js.native
  /**
    * The description of the cache security group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * A list of Amazon EC2 security groups that are associated with this cache security group.
    */
  var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.native
  /**
    * The AWS account ID of the cache security group owner.
    */
  var OwnerId: js.UndefOr[String] = js.native
}

object CacheSecurityGroup {
  @scala.inline
  def apply(): CacheSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSecurityGroup]
  }
  @scala.inline
  implicit class CacheSecurityGroupOps[Self <: CacheSecurityGroup] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withEC2SecurityGroups(value: EC2SecurityGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2SecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEC2SecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2SecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
  }
  
}

