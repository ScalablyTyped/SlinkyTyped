package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCacheSubnetGroupMessage extends js.Object {
  /**
    * A description for the cache subnet group.
    */
  var CacheSubnetGroupDescription: String = js.native
  /**
    * A name for the cache subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters or hyphens. Example: mysubnetgroup 
    */
  var CacheSubnetGroupName: String = js.native
  /**
    * A list of VPC subnet IDs for the cache subnet group.
    */
  var SubnetIds: SubnetIdentifierList = js.native
}

object CreateCacheSubnetGroupMessage {
  @scala.inline
  def apply(CacheSubnetGroupDescription: String, CacheSubnetGroupName: String, SubnetIds: SubnetIdentifierList): CreateCacheSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSubnetGroupDescription = CacheSubnetGroupDescription.asInstanceOf[js.Any], CacheSubnetGroupName = CacheSubnetGroupName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCacheSubnetGroupMessage]
  }
  @scala.inline
  implicit class CreateCacheSubnetGroupMessageOps[Self <: CreateCacheSubnetGroupMessage] (val x: Self) extends AnyVal {
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
    def withCacheSubnetGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheSubnetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: SubnetIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

