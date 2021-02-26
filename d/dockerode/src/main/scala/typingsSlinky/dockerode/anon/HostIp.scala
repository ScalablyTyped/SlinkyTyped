package typingsSlinky.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostIp extends StObject {
  
  var HostIp: String = js.native
  
  var HostPort: String = js.native
}
object HostIp {
  
  @scala.inline
  def apply(HostIp: String, HostPort: String): HostIp = {
    val __obj = js.Dynamic.literal(HostIp = HostIp.asInstanceOf[js.Any], HostPort = HostPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostIp]
  }
  
  @scala.inline
  implicit class HostIpMutableBuilder[Self <: HostIp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostIp(value: String): Self = StObject.set(x, "HostIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPort(value: String): Self = StObject.set(x, "HostPort", value.asInstanceOf[js.Any])
  }
}
