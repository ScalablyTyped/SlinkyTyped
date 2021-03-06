package typingsSlinky.reactRelay.anon

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.FetchQueryFetchPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchPolicy extends StObject {
  
  var fetchPolicy: js.UndefOr[FetchQueryFetchPolicy] = js.native
  
  var networkCacheConfig: js.UndefOr[typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig] = js.native
}
object FetchPolicy {
  
  @scala.inline
  def apply(): FetchPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchPolicy]
  }
  
  @scala.inline
  implicit class FetchPolicyMutableBuilder[Self <: FetchPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetchPolicy(value: FetchQueryFetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
    
    @scala.inline
    def setNetworkCacheConfig(value: typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
  }
}
