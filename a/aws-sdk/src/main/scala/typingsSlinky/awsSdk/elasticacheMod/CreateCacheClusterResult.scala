package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCacheClusterResult extends js.Object {
  
  var CacheCluster: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.CacheCluster] = js.native
}
object CreateCacheClusterResult {
  
  @scala.inline
  def apply(): CreateCacheClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCacheClusterResult]
  }
  
  @scala.inline
  implicit class CreateCacheClusterResultOps[Self <: CreateCacheClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCacheCluster(value: CacheCluster): Self = this.set("CacheCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheCluster: Self = this.set("CacheCluster", js.undefined)
  }
}
