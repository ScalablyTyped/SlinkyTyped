package typingsSlinky.opentelemetryCore

import typingsSlinky.opentelemetryApi.getterMod.GetterFunction
import typingsSlinky.opentelemetryApi.mod.Context_
import typingsSlinky.opentelemetryApi.setterMod.SetterFunction
import typingsSlinky.opentelemetryApi.spanContextMod.SpanContext
import typingsSlinky.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/context/propagation/HttpTraceContext", JSImport.Namespace)
@js.native
object httpTraceContextMod extends js.Object {
  
  val TRACE_PARENT_HEADER: /* "traceparent" */ String = js.native
  
  val TRACE_STATE_HEADER: /* "tracestate" */ String = js.native
  
  def parseTraceParent(traceParent: String): SpanContext | Null = js.native
  
  @js.native
  class HttpTraceContext () extends TextMapPropagator {
    
    def extract(context: Context_, carrier: js.Any, getter: GetterFunction[_]): Context_ = js.native
    
    def inject(context: Context_, carrier: js.Any, setter: SetterFunction[_]): Unit = js.native
  }
}
