package typingsSlinky.opentelemetryTracing

import typingsSlinky.opentelemetryApi.linkMod.Link
import typingsSlinky.opentelemetryApi.spanContextMod.SpanContext
import typingsSlinky.opentelemetryApi.spanKindMod.SpanKind
import typingsSlinky.opentelemetryApi.timeMod.TimeInput
import typingsSlinky.opentelemetryCore.typesMod.InstrumentationLibrary
import typingsSlinky.opentelemetryTracing.spanExporterMod.SpanExporter
import typingsSlinky.opentelemetryTracing.typesMod.BufferConfig
import typingsSlinky.opentelemetryTracing.typesMod.TracerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/tracing", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class BasicTracerProvider ()
    extends typingsSlinky.opentelemetryTracing.basicTracerProviderMod.BasicTracerProvider {
    def this(config: TracerConfig) = this()
  }
  
  @js.native
  class BatchSpanProcessor protected ()
    extends typingsSlinky.opentelemetryTracing.batchSpanProcessorMod.BatchSpanProcessor {
    def this(_exporter: SpanExporter) = this()
    def this(_exporter: SpanExporter, config: BufferConfig) = this()
  }
  
  @js.native
  class ConsoleSpanExporter ()
    extends typingsSlinky.opentelemetryTracing.consoleSpanExporterMod.ConsoleSpanExporter
  
  @js.native
  class InMemorySpanExporter ()
    extends typingsSlinky.opentelemetryTracing.inMemorySpanExporterMod.InMemorySpanExporter
  
  @js.native
  class SimpleSpanProcessor protected ()
    extends typingsSlinky.opentelemetryTracing.simpleSpanProcessorMod.SimpleSpanProcessor {
    def this(_exporter: SpanExporter) = this()
  }
  
  @js.native
  class Span protected ()
    extends typingsSlinky.opentelemetryTracing.spanMod.Span {
    /** Constructs a new Span instance. */
    def this(
      parentTracer: typingsSlinky.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind
    ) = this()
    def this(
      parentTracer: typingsSlinky.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String
    ) = this()
    def this(
      parentTracer: typingsSlinky.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: js.UndefOr[scala.Nothing],
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: typingsSlinky.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: typingsSlinky.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: js.UndefOr[scala.Nothing],
      links: js.UndefOr[scala.Nothing],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typingsSlinky.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: js.UndefOr[scala.Nothing],
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typingsSlinky.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.UndefOr[scala.Nothing],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typingsSlinky.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
  }
  
  @js.native
  class Tracer protected ()
    extends typingsSlinky.opentelemetryTracing.tracerMod.Tracer {
    /**
      * Constructs a new Tracer instance.
      */
    def this(
      instrumentationLibrary: InstrumentationLibrary,
      config: TracerConfig,
      _tracerProvider: typingsSlinky.opentelemetryTracing.basicTracerProviderMod.BasicTracerProvider
    ) = this()
  }
}
