package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTrafficMirrorFilterResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the Traffic Mirror filter.
    */
  var TrafficMirrorFilter: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TrafficMirrorFilter] = js.native
}
object CreateTrafficMirrorFilterResult {
  
  @scala.inline
  def apply(): CreateTrafficMirrorFilterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTrafficMirrorFilterResult]
  }
  
  @scala.inline
  implicit class CreateTrafficMirrorFilterResultMutableBuilder[Self <: CreateTrafficMirrorFilterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setTrafficMirrorFilter(value: TrafficMirrorFilter): Self = StObject.set(x, "TrafficMirrorFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorFilterUndefined: Self = StObject.set(x, "TrafficMirrorFilter", js.undefined)
  }
}
