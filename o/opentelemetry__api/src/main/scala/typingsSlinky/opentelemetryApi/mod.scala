package typingsSlinky.opentelemetryApi

import typingsSlinky.opentelemetryApi.boundInstrumentMod.BoundBaseObserver
import typingsSlinky.opentelemetryApi.boundInstrumentMod.BoundCounter
import typingsSlinky.opentelemetryApi.boundInstrumentMod.BoundValueRecorder
import typingsSlinky.opentelemetryApi.contextMod.ContextAPI
import typingsSlinky.opentelemetryApi.metricsMod.MetricsAPI
import typingsSlinky.opentelemetryApi.propagationMod.PropagationAPI
import typingsSlinky.opentelemetryApi.spanContextMod.SpanContext
import typingsSlinky.opentelemetryApi.traceMod.TraceAPI
import typingsSlinky.opentelemetryContextBase.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("@opentelemetry/api", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api", "default.context")
    @js.native
    def context: ContextAPI = js.native
    @scala.inline
    def context_=(x: ContextAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("context")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/api", "default.metrics")
    @js.native
    def metrics: MetricsAPI = js.native
    @scala.inline
    def metrics_=(x: MetricsAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metrics")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/api", "default.propagation")
    @js.native
    def propagation: PropagationAPI = js.native
    @scala.inline
    def propagation_=(x: PropagationAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propagation")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/api", "default.trace")
    @js.native
    def trace: TraceAPI = js.native
    @scala.inline
    def trace_=(x: TraceAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trace")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@opentelemetry/api", "CanonicalCode")
  @js.native
  object CanonicalCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.opentelemetryApi.statusMod.CanonicalCode with Double] = js.native
    
    /* 10 */ val ABORTED: typingsSlinky.opentelemetryApi.statusMod.CanonicalCode.ABORTED with Double = js.native
    
    /* 6 */ val ALREADY_EXISTS: typingsSlinky.opentelemetryApi.statusMod.CanonicalCode.ALREADY_EXISTS with Double = js.native
    
    /* 1 */ val CANCELLED: typingsSlinky.opentelemetryApi.statusMod.CanonicalCode.CANCELLED with Double = js.native
    
    /* 15 */ val DATA_LOSS: typingsSlinky.opentelemetryApi.statusMod.CanonicalCode.DATA_LOSS with Double = js.native
    
    /* 4 */ val DEADLINE_EXCEEDED: typingsSlinky.opentelemetryApi.statusMod.CanonicalCode.DEADLINE_EXCEEDED with Double = js.native
    
    /* 9 */ val FAILED_PRECONDITION: typingsSlinky.opentelemetryApi.statusMod.CanonicalCode.FAILED_PRECONDITION with Double = js.native
    
    /* 13 */ val INTERNAL: typingsSlinky.opentelemetryApi.statusMod.CanonicalCode.INTERNAL with Double = js.native
    
    /* 3 */ val INVALID_ARGUMENT: typingsSlinky.opentelemetryApi.statusMod.CanonicalCode.INVALID_ARGUMENT with Double = js.native
    
    /* 5 */ val NOT_FOUND: typingsSlinky.opentelemetryApi.statusMod.CanonicalCode.NOT_FOUND with Double = js.native
    
    /* 0 */ val OK: typingsSlinky.opentelemetryApi.statusMod.CanonicalCode.OK with Double = js.native
    
    /* 11 */ val OUT_OF_RANGE: typingsSlinky.opentelemetryApi.statusMod.CanonicalCode.OUT_OF_RANGE with Double = js.native
    
    /* 7 */ val PERMISSION_DENIED: typingsSlinky.opentelemetryApi.statusMod.CanonicalCode.PERMISSION_DENIED with Double = js.native
    
    /* 8 */ val RESOURCE_EXHAUSTED: typingsSlinky.opentelemetryApi.statusMod.CanonicalCode.RESOURCE_EXHAUSTED with Double = js.native
    
    /* 16 */ val UNAUTHENTICATED: typingsSlinky.opentelemetryApi.statusMod.CanonicalCode.UNAUTHENTICATED with Double = js.native
    
    /* 14 */ val UNAVAILABLE: typingsSlinky.opentelemetryApi.statusMod.CanonicalCode.UNAVAILABLE with Double = js.native
    
    /* 12 */ val UNIMPLEMENTED: typingsSlinky.opentelemetryApi.statusMod.CanonicalCode.UNIMPLEMENTED with Double = js.native
    
    /* 2 */ val UNKNOWN: typingsSlinky.opentelemetryApi.statusMod.CanonicalCode.UNKNOWN with Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "Context")
  @js.native
  /**
    * Construct a new context which inherits values from an optional parent context.
    *
    * @param parentContext a context from which to inherit values
    */
  class Context_ protected () extends Context
  /* static members */
  object Context_ {
    
    /** The root context is used as the default parent context when there is no active context */
    @JSImport("@opentelemetry/api", "Context.ROOT_CONTEXT")
    @js.native
    val ROOT_CONTEXT: typingsSlinky.opentelemetryContextBase.contextMod.Context = js.native
    
    /**
      * This is another identifier to the root context which allows developers to easily search the
      * codebase for direct uses of context which need to be removed in later PRs.
      *
      * It's existence is temporary and it should be removed when all references are fixed.
      */
    @JSImport("@opentelemetry/api", "Context.TODO")
    @js.native
    val TODO: typingsSlinky.opentelemetryContextBase.contextMod.Context = js.native
    
    /** Get a key to uniquely identify a context value */
    @JSImport("@opentelemetry/api", "Context.createKey")
    @js.native
    def createKey(description: String): js.Symbol = js.native
  }
  
  @JSImport("@opentelemetry/api", "EntryTtl")
  @js.native
  object EntryTtl extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.opentelemetryApi.entryValueMod.EntryTtl with Double] = js.native
    
    /* 0 */ val NO_PROPAGATION: typingsSlinky.opentelemetryApi.entryValueMod.EntryTtl.NO_PROPAGATION with Double = js.native
    
    /* -1 */ val UNLIMITED_PROPAGATION: typingsSlinky.opentelemetryApi.entryValueMod.EntryTtl.UNLIMITED_PROPAGATION with Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "INVALID_SPANID")
  @js.native
  val INVALID_SPANID: /* "0000000000000000" */ String = js.native
  
  @JSImport("@opentelemetry/api", "INVALID_SPAN_CONTEXT")
  @js.native
  val INVALID_SPAN_CONTEXT: SpanContext = js.native
  
  @JSImport("@opentelemetry/api", "INVALID_TRACEID")
  @js.native
  val INVALID_TRACEID: /* "00000000000000000000000000000000" */ String = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_BATCH_OBSERVER_METRIC")
  @js.native
  val NOOP_BATCH_OBSERVER_METRIC: typingsSlinky.opentelemetryApi.noopMeterMod.NoopBatchObserverMetric = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_BOUND_BASE_OBSERVER")
  @js.native
  val NOOP_BOUND_BASE_OBSERVER: typingsSlinky.opentelemetryApi.noopMeterMod.NoopBoundBaseObserver = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_BOUND_COUNTER")
  @js.native
  val NOOP_BOUND_COUNTER: typingsSlinky.opentelemetryApi.noopMeterMod.NoopBoundCounter = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_BOUND_VALUE_RECORDER")
  @js.native
  val NOOP_BOUND_VALUE_RECORDER: typingsSlinky.opentelemetryApi.noopMeterMod.NoopBoundValueRecorder = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_COUNTER_METRIC")
  @js.native
  val NOOP_COUNTER_METRIC: typingsSlinky.opentelemetryApi.noopMeterMod.NoopCounterMetric = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_METER")
  @js.native
  val NOOP_METER: typingsSlinky.opentelemetryApi.noopMeterMod.NoopMeter = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_METER_PROVIDER")
  @js.native
  val NOOP_METER_PROVIDER: typingsSlinky.opentelemetryApi.noopMeterProviderMod.NoopMeterProvider = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_SPAN")
  @js.native
  val NOOP_SPAN: typingsSlinky.opentelemetryApi.noopSpanMod.NoopSpan = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_SUM_OBSERVER_METRIC")
  @js.native
  val NOOP_SUM_OBSERVER_METRIC: typingsSlinky.opentelemetryApi.noopMeterMod.NoopBaseObserverMetric = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_TEXT_MAP_PROPAGATOR")
  @js.native
  val NOOP_TEXT_MAP_PROPAGATOR: typingsSlinky.opentelemetryApi.noopTextMapPropagatorMod.NoopTextMapPropagator = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_TRACER")
  @js.native
  val NOOP_TRACER: typingsSlinky.opentelemetryApi.noopTracerMod.NoopTracer = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_TRACER_PROVIDER")
  @js.native
  val NOOP_TRACER_PROVIDER: typingsSlinky.opentelemetryApi.noopTracerProviderMod.NoopTracerProvider = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_UP_DOWN_SUM_OBSERVER_METRIC")
  @js.native
  val NOOP_UP_DOWN_SUM_OBSERVER_METRIC: typingsSlinky.opentelemetryApi.noopMeterMod.NoopBaseObserverMetric = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_VALUE_OBSERVER_METRIC")
  @js.native
  val NOOP_VALUE_OBSERVER_METRIC: typingsSlinky.opentelemetryApi.noopMeterMod.NoopBaseObserverMetric = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_VALUE_RECORDER_METRIC")
  @js.native
  val NOOP_VALUE_RECORDER_METRIC: typingsSlinky.opentelemetryApi.noopMeterMod.NoopValueRecorderMetric = js.native
  
  @JSImport("@opentelemetry/api", "NoopBaseObserverMetric")
  @js.native
  class NoopBaseObserverMetric protected ()
    extends typingsSlinky.opentelemetryApi.noopMeterMod.NoopBaseObserverMetric {
    def this(instrument: BoundBaseObserver) = this()
  }
  
  @JSImport("@opentelemetry/api", "NoopBatchObserverMetric")
  @js.native
  class NoopBatchObserverMetric protected ()
    extends typingsSlinky.opentelemetryApi.noopMeterMod.NoopBatchObserverMetric {
    def this(instrument: Unit) = this()
  }
  
  @JSImport("@opentelemetry/api", "NoopBoundBaseObserver")
  @js.native
  class NoopBoundBaseObserver ()
    extends typingsSlinky.opentelemetryApi.noopMeterMod.NoopBoundBaseObserver
  
  @JSImport("@opentelemetry/api", "NoopBoundCounter")
  @js.native
  class NoopBoundCounter ()
    extends typingsSlinky.opentelemetryApi.noopMeterMod.NoopBoundCounter
  
  @JSImport("@opentelemetry/api", "NoopBoundValueRecorder")
  @js.native
  class NoopBoundValueRecorder ()
    extends typingsSlinky.opentelemetryApi.noopMeterMod.NoopBoundValueRecorder
  
  @JSImport("@opentelemetry/api", "NoopCounterMetric")
  @js.native
  class NoopCounterMetric protected ()
    extends typingsSlinky.opentelemetryApi.noopMeterMod.NoopCounterMetric {
    def this(instrument: BoundCounter) = this()
  }
  
  @JSImport("@opentelemetry/api", "NoopMeter")
  @js.native
  class NoopMeter ()
    extends typingsSlinky.opentelemetryApi.noopMeterMod.NoopMeter
  
  @JSImport("@opentelemetry/api", "NoopMeterProvider")
  @js.native
  class NoopMeterProvider ()
    extends typingsSlinky.opentelemetryApi.noopMeterProviderMod.NoopMeterProvider
  
  @JSImport("@opentelemetry/api", "NoopMetric")
  @js.native
  class NoopMetric[T] protected ()
    extends typingsSlinky.opentelemetryApi.noopMeterMod.NoopMetric[T] {
    def this(instrument: T) = this()
  }
  
  @JSImport("@opentelemetry/api", "NoopSpan")
  @js.native
  class NoopSpan ()
    extends typingsSlinky.opentelemetryApi.noopSpanMod.NoopSpan {
    def this(_spanContext: SpanContext) = this()
  }
  
  @JSImport("@opentelemetry/api", "NoopTextMapPropagator")
  @js.native
  class NoopTextMapPropagator ()
    extends typingsSlinky.opentelemetryApi.noopTextMapPropagatorMod.NoopTextMapPropagator
  
  @JSImport("@opentelemetry/api", "NoopTracer")
  @js.native
  class NoopTracer ()
    extends typingsSlinky.opentelemetryApi.noopTracerMod.NoopTracer
  
  @JSImport("@opentelemetry/api", "NoopTracerProvider")
  @js.native
  class NoopTracerProvider ()
    extends typingsSlinky.opentelemetryApi.noopTracerProviderMod.NoopTracerProvider
  
  @JSImport("@opentelemetry/api", "NoopValueRecorderMetric")
  @js.native
  class NoopValueRecorderMetric protected ()
    extends typingsSlinky.opentelemetryApi.noopMeterMod.NoopValueRecorderMetric {
    def this(instrument: BoundValueRecorder) = this()
  }
  
  @JSImport("@opentelemetry/api", "ProxyTracer")
  @js.native
  class ProxyTracer protected ()
    extends typingsSlinky.opentelemetryApi.proxyTracerMod.ProxyTracer {
    def this(_provider: typingsSlinky.opentelemetryApi.proxyTracerProviderMod.ProxyTracerProvider, name: String) = this()
    def this(
      _provider: typingsSlinky.opentelemetryApi.proxyTracerProviderMod.ProxyTracerProvider,
      name: String,
      version: String
    ) = this()
  }
  
  @JSImport("@opentelemetry/api", "ProxyTracerProvider")
  @js.native
  class ProxyTracerProvider ()
    extends typingsSlinky.opentelemetryApi.proxyTracerProviderMod.ProxyTracerProvider
  
  @JSImport("@opentelemetry/api", "SamplingDecision")
  @js.native
  object SamplingDecision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.opentelemetryApi.samplingResultMod.SamplingDecision with Double] = js.native
    
    /* 0 */ val NOT_RECORD: typingsSlinky.opentelemetryApi.samplingResultMod.SamplingDecision.NOT_RECORD with Double = js.native
    
    /* 1 */ val RECORD: typingsSlinky.opentelemetryApi.samplingResultMod.SamplingDecision.RECORD with Double = js.native
    
    /* 2 */ val RECORD_AND_SAMPLED: typingsSlinky.opentelemetryApi.samplingResultMod.SamplingDecision.RECORD_AND_SAMPLED with Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "SpanKind")
  @js.native
  object SpanKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.opentelemetryApi.spanKindMod.SpanKind with Double] = js.native
    
    /* 2 */ val CLIENT: typingsSlinky.opentelemetryApi.spanKindMod.SpanKind.CLIENT with Double = js.native
    
    /* 4 */ val CONSUMER: typingsSlinky.opentelemetryApi.spanKindMod.SpanKind.CONSUMER with Double = js.native
    
    /* 0 */ val INTERNAL: typingsSlinky.opentelemetryApi.spanKindMod.SpanKind.INTERNAL with Double = js.native
    
    /* 3 */ val PRODUCER: typingsSlinky.opentelemetryApi.spanKindMod.SpanKind.PRODUCER with Double = js.native
    
    /* 1 */ val SERVER: typingsSlinky.opentelemetryApi.spanKindMod.SpanKind.SERVER with Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "TraceFlags")
  @js.native
  object TraceFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.opentelemetryApi.traceFlagsMod.TraceFlags with Double] = js.native
    
    /* 0 */ val NONE: typingsSlinky.opentelemetryApi.traceFlagsMod.TraceFlags.NONE with Double = js.native
    
    /* 1 */ val SAMPLED: typingsSlinky.opentelemetryApi.traceFlagsMod.TraceFlags.SAMPLED with Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "ValueType")
  @js.native
  object ValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.opentelemetryApi.metricMod.ValueType with Double] = js.native
    
    /* 1 */ val DOUBLE: typingsSlinky.opentelemetryApi.metricMod.ValueType.DOUBLE with Double = js.native
    
    /* 0 */ val INT: typingsSlinky.opentelemetryApi.metricMod.ValueType.INT with Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "context")
  @js.native
  val context: ContextAPI = js.native
  
  @JSImport("@opentelemetry/api", "defaultGetter")
  @js.native
  def defaultGetter(carrier: js.Any, key: String): js.Any = js.native
  
  @JSImport("@opentelemetry/api", "defaultSetter")
  @js.native
  def defaultSetter(carrier: js.Any, key: String, value: js.Any): Unit = js.native
  
  @JSImport("@opentelemetry/api", "metrics")
  @js.native
  val metrics: MetricsAPI = js.native
  
  @JSImport("@opentelemetry/api", "propagation")
  @js.native
  val propagation: PropagationAPI = js.native
  
  @JSImport("@opentelemetry/api", "trace")
  @js.native
  val trace: TraceAPI = js.native
}
