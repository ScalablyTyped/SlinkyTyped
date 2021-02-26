package typingsSlinky.opentelemetryCore

import typingsSlinky.opentelemetryApi.getterMod.GetterFunction
import typingsSlinky.opentelemetryApi.mod.Context_
import typingsSlinky.opentelemetryApi.setterMod.SetterFunction
import typingsSlinky.opentelemetryApi.spanContextMod.SpanContext
import typingsSlinky.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpTraceContextMod {
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/HttpTraceContext", "HttpTraceContext")
  @js.native
  class HttpTraceContext () extends TextMapPropagator {
    
    def extract(context: Context_, carrier: js.Any, getter: GetterFunction[_]): Context_ = js.native
    
    def inject(context: Context_, carrier: js.Any, setter: SetterFunction[_]): Unit = js.native
  }
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/HttpTraceContext", "TRACE_PARENT_HEADER")
  @js.native
  val TRACE_PARENT_HEADER: /* "traceparent" */ String = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/HttpTraceContext", "TRACE_STATE_HEADER")
  @js.native
  val TRACE_STATE_HEADER: /* "tracestate" */ String = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/HttpTraceContext", "parseTraceParent")
  @js.native
  def parseTraceParent(traceParent: String): SpanContext | Null = js.native
}
