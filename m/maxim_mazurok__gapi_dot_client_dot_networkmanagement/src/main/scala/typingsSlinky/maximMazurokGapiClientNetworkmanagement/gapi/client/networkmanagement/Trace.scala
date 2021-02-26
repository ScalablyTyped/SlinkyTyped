package typingsSlinky.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trace extends StObject {
  
  /**
    * Derived from the source and destination endpoints definition, and validated by the data plane model. If there are multiple traces starting from different source locations, then the
    * endpoint_info may be different between traces.
    */
  var endpointInfo: js.UndefOr[EndpointInfo] = js.native
  
  /**
    * A trace of a test contains multiple steps from the initial state to the final state (delivered, dropped, forwarded, or aborted). The steps are ordered by the processing sequence
    * within the simulated network state machine. It is critical to preserve the order of the steps and avoid reordering or sorting them.
    */
  var steps: js.UndefOr[js.Array[Step]] = js.native
}
object Trace {
  
  @scala.inline
  def apply(): Trace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trace]
  }
  
  @scala.inline
  implicit class TraceMutableBuilder[Self <: Trace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointInfo(value: EndpointInfo): Self = StObject.set(x, "endpointInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointInfoUndefined: Self = StObject.set(x, "endpointInfo", js.undefined)
    
    @scala.inline
    def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
