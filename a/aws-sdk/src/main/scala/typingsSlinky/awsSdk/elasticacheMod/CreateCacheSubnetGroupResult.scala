package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCacheSubnetGroupResult extends js.Object {
  var CacheSubnetGroup: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.CacheSubnetGroup] = js.native
}

object CreateCacheSubnetGroupResult {
  @scala.inline
  def apply(): CreateCacheSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCacheSubnetGroupResult]
  }
  @scala.inline
  implicit class CreateCacheSubnetGroupResultOps[Self <: CreateCacheSubnetGroupResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheSubnetGroup(value: CacheSubnetGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheSubnetGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheSubnetGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheSubnetGroup")(js.undefined)
        ret
    }
  }
  
}

