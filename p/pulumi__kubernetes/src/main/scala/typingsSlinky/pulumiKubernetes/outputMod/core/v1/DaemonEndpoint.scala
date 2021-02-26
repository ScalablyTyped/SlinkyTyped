package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DaemonEndpoint contains information about a single Daemon endpoint.
  */
@js.native
trait DaemonEndpoint extends StObject {
  
  /**
    * Port number of the given endpoint.
    */
  var Port: Double = js.native
}
object DaemonEndpoint {
  
  @scala.inline
  def apply(Port: Double): DaemonEndpoint = {
    val __obj = js.Dynamic.literal(Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonEndpoint]
  }
  
  @scala.inline
  implicit class DaemonEndpointMutableBuilder[Self <: DaemonEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
  }
}
