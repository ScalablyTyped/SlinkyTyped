package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCachePolicyRequest extends StObject {
  
  /**
    * A cache policy configuration.
    */
  var CachePolicyConfig: typingsSlinky.awsSdk.cloudfrontMod.CachePolicyConfig = js.native
}
object CreateCachePolicyRequest {
  
  @scala.inline
  def apply(CachePolicyConfig: CachePolicyConfig): CreateCachePolicyRequest = {
    val __obj = js.Dynamic.literal(CachePolicyConfig = CachePolicyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCachePolicyRequest]
  }
  
  @scala.inline
  implicit class CreateCachePolicyRequestMutableBuilder[Self <: CreateCachePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCachePolicyConfig(value: CachePolicyConfig): Self = StObject.set(x, "CachePolicyConfig", value.asInstanceOf[js.Any])
  }
}
