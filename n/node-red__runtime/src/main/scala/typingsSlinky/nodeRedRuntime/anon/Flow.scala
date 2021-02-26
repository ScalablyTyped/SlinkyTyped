package typingsSlinky.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flow extends StObject {
  
  var flow: js.Object = js.native
  
  var req: js.UndefOr[js.Object] = js.native
}
object Flow {
  
  @scala.inline
  def apply(flow: js.Object): Flow = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  implicit class FlowMutableBuilder[Self <: Flow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlow(value: js.Object): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
  }
}
