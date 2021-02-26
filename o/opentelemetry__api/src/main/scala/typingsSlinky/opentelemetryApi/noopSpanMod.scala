package typingsSlinky.opentelemetryApi

import typingsSlinky.opentelemetryApi.spanContextMod.SpanContext
import typingsSlinky.opentelemetryApi.spanMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopSpanMod {
  
  @JSImport("@opentelemetry/api/build/src/trace/NoopSpan", "NOOP_SPAN")
  @js.native
  val NOOP_SPAN: NoopSpan = js.native
  
  @JSImport("@opentelemetry/api/build/src/trace/NoopSpan", "NoopSpan")
  @js.native
  class NoopSpan () extends Span {
    def this(_spanContext: SpanContext) = this()
    
    val _spanContext: js.Any = js.native
  }
}
