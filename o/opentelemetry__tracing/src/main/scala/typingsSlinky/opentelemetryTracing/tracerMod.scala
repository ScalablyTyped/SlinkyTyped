package typingsSlinky.opentelemetryTracing

import typingsSlinky.opentelemetryApi.loggerMod.Logger
import typingsSlinky.opentelemetryApi.mod.Context_
import typingsSlinky.opentelemetryApi.spanMod.Span
import typingsSlinky.opentelemetryApi.spanOptionsMod.SpanOptions
import typingsSlinky.opentelemetryCore.typesMod.InstrumentationLibrary
import typingsSlinky.opentelemetryResources.mod.Resource
import typingsSlinky.opentelemetryTracing.basicTracerProviderMod.BasicTracerProvider
import typingsSlinky.opentelemetryTracing.spanProcessorMod.SpanProcessor
import typingsSlinky.opentelemetryTracing.typesMod.TraceParams
import typingsSlinky.opentelemetryTracing.typesMod.TracerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/tracing/build/src/Tracer", JSImport.Namespace)
@js.native
object tracerMod extends js.Object {
  
  @js.native
  class Tracer protected ()
    extends typingsSlinky.opentelemetryApi.tracerMod.Tracer {
    /**
      * Constructs a new Tracer instance.
      */
    def this(
      instrumentationLibrary: InstrumentationLibrary,
      config: TracerConfig,
      _tracerProvider: BasicTracerProvider
    ) = this()
    
    val _idGenerator: js.Any = js.native
    
    val _sampler: js.Any = js.native
    
    val _traceParams: js.Any = js.native
    
    var _tracerProvider: js.Any = js.native
    
    def getActiveSpanProcessor(): SpanProcessor = js.native
    
    /** Returns the active {@link TraceParams}. */
    def getActiveTraceParams(): TraceParams = js.native
    
    val instrumentationLibrary: InstrumentationLibrary = js.native
    
    val logger: Logger = js.native
    
    val resource: Resource = js.native
    
    def startSpan(name: String, options: js.UndefOr[scala.Nothing], context: Context_): Span = js.native
    def startSpan(name: String, options: SpanOptions, context: Context_): Span = js.native
  }
}
