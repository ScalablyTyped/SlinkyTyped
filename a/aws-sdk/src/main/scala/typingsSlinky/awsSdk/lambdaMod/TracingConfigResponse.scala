package typingsSlinky.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TracingConfigResponse extends StObject {
  
  /**
    * The tracing mode.
    */
  var Mode: js.UndefOr[TracingMode] = js.native
}
object TracingConfigResponse {
  
  @scala.inline
  def apply(): TracingConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingConfigResponse]
  }
  
  @scala.inline
  implicit class TracingConfigResponseMutableBuilder[Self <: TracingConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: TracingMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
  }
}
