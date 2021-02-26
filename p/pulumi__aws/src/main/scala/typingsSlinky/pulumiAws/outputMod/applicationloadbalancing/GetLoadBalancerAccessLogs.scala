package typingsSlinky.pulumiAws.outputMod.applicationloadbalancing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLoadBalancerAccessLogs extends StObject {
  
  var bucket: String = js.native
  
  var enabled: Boolean = js.native
  
  var prefix: String = js.native
}
object GetLoadBalancerAccessLogs {
  
  @scala.inline
  def apply(bucket: String, enabled: Boolean, prefix: String): GetLoadBalancerAccessLogs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerAccessLogs]
  }
  
  @scala.inline
  implicit class GetLoadBalancerAccessLogsMutableBuilder[Self <: GetLoadBalancerAccessLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
