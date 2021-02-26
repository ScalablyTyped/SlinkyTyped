package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecListenerTimeoutHttp2PerRequest extends StObject {
  
  /**
    * The unit of time. Valid values: `ms`, `s`.
    */
  var unit: Input[String] = js.native
  
  /**
    * The number of time units. Minimum value of `0`.
    */
  var value: Input[Double] = js.native
}
object VirtualNodeSpecListenerTimeoutHttp2PerRequest {
  
  @scala.inline
  def apply(unit: Input[String], value: Input[Double]): VirtualNodeSpecListenerTimeoutHttp2PerRequest = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecListenerTimeoutHttp2PerRequest]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerTimeoutHttp2PerRequestMutableBuilder[Self <: VirtualNodeSpecListenerTimeoutHttp2PerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: Input[String]): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Input[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
