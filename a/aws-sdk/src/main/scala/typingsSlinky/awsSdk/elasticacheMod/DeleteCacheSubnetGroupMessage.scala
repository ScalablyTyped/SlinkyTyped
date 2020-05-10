package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCacheSubnetGroupMessage extends js.Object {
  /**
    * The name of the cache subnet group to delete. Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
    */
  var CacheSubnetGroupName: String = js.native
}

object DeleteCacheSubnetGroupMessage {
  @scala.inline
  def apply(CacheSubnetGroupName: String): DeleteCacheSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSubnetGroupName = CacheSubnetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCacheSubnetGroupMessage]
  }
  @scala.inline
  implicit class DeleteCacheSubnetGroupMessageOps[Self <: DeleteCacheSubnetGroupMessage] (val x: Self) extends AnyVal {
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
  }
  
}

