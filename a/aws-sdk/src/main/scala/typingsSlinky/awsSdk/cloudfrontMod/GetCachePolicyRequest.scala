package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCachePolicyRequest extends StObject {
  
  /**
    * The unique identifier for the cache policy. If the cache policy is attached to a distribution’s cache behavior, you can get the policy’s identifier using ListDistributions or GetDistribution. If the cache policy is not attached to a cache behavior, you can get the identifier using ListCachePolicies.
    */
  var Id: String = js.native
}
object GetCachePolicyRequest {
  
  @scala.inline
  def apply(Id: String): GetCachePolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCachePolicyRequest]
  }
  
  @scala.inline
  implicit class GetCachePolicyRequestMutableBuilder[Self <: GetCachePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
