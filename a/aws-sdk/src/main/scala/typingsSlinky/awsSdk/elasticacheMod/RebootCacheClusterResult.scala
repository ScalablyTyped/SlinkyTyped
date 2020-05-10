package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootCacheClusterResult extends js.Object {
  var CacheCluster: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.CacheCluster] = js.native
}

object RebootCacheClusterResult {
  @scala.inline
  def apply(): RebootCacheClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootCacheClusterResult]
  }
  @scala.inline
  implicit class RebootCacheClusterResultOps[Self <: RebootCacheClusterResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheCluster(value: CacheCluster): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheCluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheCluster")(js.undefined)
        ret
    }
  }
  
}

