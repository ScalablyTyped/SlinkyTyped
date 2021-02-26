package typingsSlinky.firebasePerformance

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.PerformanceEntry
import typingsSlinky.firebasePerformance.anon.Attributes
import typingsSlinky.firebasePerformanceTypes.mod.PerformanceTrace
import typingsSlinky.std.PerformanceNavigationTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traceMod {
  
  @JSImport("@firebase/performance/dist/src/resources/trace", "Trace")
  @js.native
  class Trace protected () extends PerformanceTrace {
    /**
      * @param name The name of the trace.
      * @param isAuto If the trace is auto-instrumented.
      * @param traceMeasureName The name of the measure marker in user timing specification. This field
      * is only set when the trace is built for logging when the user directly uses the user timing
      * api (performance.mark and performance.measure).
      */
    def this(name: String) = this()
    def this(name: String, isAuto: Boolean) = this()
    def this(name: String, isAuto: js.UndefOr[scala.Nothing], traceMeasureName: String) = this()
    def this(name: String, isAuto: Boolean, traceMeasureName: String) = this()
    
    var api: js.Any = js.native
    
    /**
      * Calculates and assigns the duration and start time of the trace using the measure performance
      * entry.
      */
    var calculateTraceMetrics: js.Any = js.native
    
    var counters: StringDictionary[Double] = js.native
    
    var customAttributes: js.Any = js.native
    
    var durationUs: Double = js.native
    
    val isAuto: Boolean = js.native
    
    val name: String = js.native
    
    var randomId: js.Any = js.native
    
    def record(startTime: Double, duration: Double, options: Attributes): Unit = js.native
    
    var setDuration: js.Any = js.native
    
    var setStartTime: js.Any = js.native
    
    var startTimeUs: Double = js.native
    
    var state: js.Any = js.native
    
    var traceMeasure: js.Any = js.native
    
    var traceStartMark: js.Any = js.native
    
    var traceStopMark: js.Any = js.native
  }
  /* static members */
  object Trace {
    
    /**
      * @param navigationTimings A single element array which contains the navigationTIming object of
      * the page load
      * @param paintTimings A array which contains paintTiming object of the page load
      * @param firstInputDelay First input delay in millisec
      */
    @JSImport("@firebase/performance/dist/src/resources/trace", "Trace.createOobTrace")
    @js.native
    def createOobTrace(navigationTimings: js.Array[PerformanceNavigationTiming], paintTimings: js.Array[PerformanceEntry]): Unit = js.native
    @JSImport("@firebase/performance/dist/src/resources/trace", "Trace.createOobTrace")
    @js.native
    def createOobTrace(
      navigationTimings: js.Array[PerformanceNavigationTiming],
      paintTimings: js.Array[PerformanceEntry],
      firstInputDelay: Double
    ): Unit = js.native
    
    @JSImport("@firebase/performance/dist/src/resources/trace", "Trace.createUserTimingTrace")
    @js.native
    def createUserTimingTrace(measureName: String): Unit = js.native
  }
}
