package typingsSlinky.opentelemetryTracing

import typingsSlinky.opentelemetryApi.linkMod.Link
import typingsSlinky.opentelemetryApi.spanContextMod.SpanContext
import typingsSlinky.opentelemetryApi.spanKindMod.SpanKind
import typingsSlinky.opentelemetryApi.timeMod.TimeInput
import typingsSlinky.opentelemetryTracing.readableSpanMod.ReadableSpan
import typingsSlinky.opentelemetryTracing.tracerMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/tracing/build/src/Span", JSImport.Namespace)
@js.native
object spanMod extends js.Object {
  
  @js.native
  class Span protected ()
    extends typingsSlinky.opentelemetryApi.spanMod.Span
       with ReadableSpan {
    /** Constructs a new Span instance. */
    def this(parentTracer: Tracer, spanName: String, spanContext: SpanContext, kind: SpanKind) = this()
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String
    ) = this()
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: js.UndefOr[scala.Nothing],
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: js.UndefOr[scala.Nothing],
      links: js.UndefOr[scala.Nothing],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: js.UndefOr[scala.Nothing],
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.UndefOr[scala.Nothing],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
    
    var _duration: js.Any = js.native
    
    var _ended: js.Any = js.native
    
    var _isSpanEnded: js.Any = js.native
    
    val _logger: js.Any = js.native
    
    val _spanProcessor: js.Any = js.native
    
    val _traceParams: js.Any = js.native
  }
}
