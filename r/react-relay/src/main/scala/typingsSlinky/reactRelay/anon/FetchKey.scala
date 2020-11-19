package typingsSlinky.reactRelay.anon

import typingsSlinky.reactRelay.queryResourceMod.RenderPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchKey extends js.Object {
  
  var UNSTABLE_renderPolicy: js.UndefOr[RenderPolicy] = js.native
  
  var fetchKey: js.UndefOr[String | Double] = js.native
  
  var fetchPolicy: js.UndefOr[typingsSlinky.reactRelay.queryResourceMod.FetchPolicy] = js.native
  
  var networkCacheConfig: js.UndefOr[typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig] = js.native
}
object FetchKey {
  
  @scala.inline
  def apply(): FetchKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchKey]
  }
  
  @scala.inline
  implicit class FetchKeyOps[Self <: FetchKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUNSTABLE_renderPolicy(value: RenderPolicy): Self = this.set("UNSTABLE_renderPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUNSTABLE_renderPolicy: Self = this.set("UNSTABLE_renderPolicy", js.undefined)
    
    @scala.inline
    def setFetchKey(value: String | Double): Self = this.set("fetchKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchKey: Self = this.set("fetchKey", js.undefined)
    
    @scala.inline
    def setFetchPolicy(value: typingsSlinky.reactRelay.queryResourceMod.FetchPolicy): Self = this.set("fetchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchPolicy: Self = this.set("fetchPolicy", js.undefined)
    
    @scala.inline
    def setNetworkCacheConfig(value: typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig): Self = this.set("networkCacheConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkCacheConfig: Self = this.set("networkCacheConfig", js.undefined)
  }
}
