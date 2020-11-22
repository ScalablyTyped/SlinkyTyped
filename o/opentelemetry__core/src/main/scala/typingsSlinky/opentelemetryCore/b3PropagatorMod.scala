package typingsSlinky.opentelemetryCore

import typingsSlinky.opentelemetryApi.getterMod.GetterFunction
import typingsSlinky.opentelemetryApi.mod.Context_
import typingsSlinky.opentelemetryApi.setterMod.SetterFunction
import typingsSlinky.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/context/propagation/B3Propagator", JSImport.Namespace)
@js.native
object b3PropagatorMod extends js.Object {
  
  val DEBUG_FLAG_KEY: js.Symbol = js.native
  
  val PARENT_SPAN_ID_KEY: js.Symbol = js.native
  
  val X_B3_FLAGS: /* "x-b3-flags" */ String = js.native
  
  val X_B3_PARENT_SPAN_ID: /* "x-b3-parentspanid" */ String = js.native
  
  val X_B3_SAMPLED: /* "x-b3-sampled" */ String = js.native
  
  val X_B3_SPAN_ID: /* "x-b3-spanid" */ String = js.native
  
  val X_B3_TRACE_ID: /* "x-b3-traceid" */ String = js.native
  
  @js.native
  class B3Propagator () extends TextMapPropagator {
    
    def extract(context: Context_, carrier: js.Any, getter: GetterFunction[_]): Context_ = js.native
    
    def inject(context: Context_, carrier: js.Any, setter: SetterFunction[_]): Unit = js.native
  }
}
