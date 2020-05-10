package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyCacheSubnetGroupMessage extends js.Object {
  /**
    * A description of the cache subnet group.
    */
  var CacheSubnetGroupDescription: js.UndefOr[String] = js.native
  /**
    * The name for the cache subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters or hyphens. Example: mysubnetgroup 
    */
  var CacheSubnetGroupName: String = js.native
  /**
    * The EC2 subnet IDs for the cache subnet group.
    */
  var SubnetIds: js.UndefOr[SubnetIdentifierList] = js.native
}

object ModifyCacheSubnetGroupMessage {
  @scala.inline
  def apply(CacheSubnetGroupName: String): ModifyCacheSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSubnetGroupName = CacheSubnetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCacheSubnetGroupMessage]
  }
  @scala.inline
  implicit class ModifyCacheSubnetGroupMessageOps[Self <: ModifyCacheSubnetGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheSubnetGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheSubnetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withSubnetIds(value: SubnetIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(js.undefined)
        ret
    }
  }
  
}

