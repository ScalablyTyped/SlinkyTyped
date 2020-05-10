package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheSubnetGroup extends js.Object {
  /**
    * The description of the cache subnet group.
    */
  var CacheSubnetGroupDescription: js.UndefOr[String] = js.native
  /**
    * The name of the cache subnet group.
    */
  var CacheSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * A list of subnets associated with the cache subnet group.
    */
  var Subnets: js.UndefOr[SubnetList] = js.native
  /**
    * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object CacheSubnetGroup {
  @scala.inline
  def apply(): CacheSubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSubnetGroup]
  }
  @scala.inline
  implicit class CacheSubnetGroupOps[Self <: CacheSubnetGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheSubnetGroupDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheSubnetGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheSubnetGroupDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheSubnetGroupDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheSubnetGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheSubnetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheSubnetGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheSubnetGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnets(value: SubnetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subnets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subnets")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
  }
  
}

