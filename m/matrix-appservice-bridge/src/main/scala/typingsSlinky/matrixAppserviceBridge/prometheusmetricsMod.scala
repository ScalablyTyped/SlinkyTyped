package typingsSlinky.matrixAppserviceBridge

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.matrixAppserviceBridge.agecountersMod.AgeCounters
import typingsSlinky.matrixAppserviceBridge.mod.Bridge
import typingsSlinky.promClient.mod.Counter
import typingsSlinky.promClient.mod.Gauge
import typingsSlinky.promClient.mod.Histogram
import typingsSlinky.promClient.mod.Registry
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prometheusmetricsMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/prometheusmetrics", "PrometheusMetrics")
  @js.native
  class PrometheusMetrics () extends StObject {
    def this(register: Registry) = this()
    
    /**
      * Registers the <code>/metrics</code> page generating function with the
      * containing Express app.
      * @param {Bridge} bridge The containing Bridge instance.
      */
    def addAppServicePath(bridge: Bridge): Unit = js.native
    
    /**
      * Adds a new collector function. These collector functions are run whenever
      * the /metrics page is about to be generated, allowing code to update values
      * of gauges.
      * @param {Function} func A new collector function.
      * This function is passed no arguments and is not expected to return anything.
      * It runs purely to have a side-effect on previously registered gauges.
      */
    def addCollector(func: CollectorFunction): Unit = js.native
    
    /**
      * Adds a new counter metric
      * @param {Object} opts Options
      * @param {string} opts.namespace An optional toplevel namespace name for the
      * new metric. Default: <code>"bridge"</code>.
      * @param {string} opts.name The variable name for the new metric.
      * @param {string} opts.help Descriptive help text for the new metric.
      * Once created, the value of this metric can be incremented with the
      * <code>incCounter</code> method.
      * @param {Array<string>=} opts.labels An optional list of string label names
      * @return {Counter} A counter metric.
      */
    def addCounter(opts: CounterOpts): Counter[String] = js.native
    
    /**
      * Adds a new gauge metric.
      * @param {Object} opts Options
      * @param {string=} opts.namespace An optional toplevel namespace name for the
      * new metric. Default: <code>"bridge"</code>.
      * @param {string} opts.name The variable name for the new metric.
      * @param {string} opts.help Descriptive help text for the new metric.
      * @param {Array<string>=} opts.labels An optional list of string label names
      * @param {Function=} opts.refresh An optional function to invoke to generate a
      * new value for the gauge.
      * If a refresh function is provided, it is invoked with the gauge as its only
      * parameter. The function should call the <code>set()</code> method on this
      * gauge in order to provide a new value for it.
      * @return {Gauge} A gauge metric.
      */
    def addGauge(opts: GagueOpts): Gauge[String] = js.native
    
    /**
      * Adds a new timer metric, represented by a prometheus Histogram.
      * @param {Object} opts Options
      * @param {string} opts.namespace An optional toplevel namespace name for the
      * new metric. Default: <code>"bridge"</code>.
      * @param {string} opts.name The variable name for the new metric.
      * @param {string} opts.help Descriptive help text for the new metric.
      * @param {Array<string>=} opts.labels An optional list of string label names
      * @return {Histogram} A histogram metric.
      * Once created, the value of this metric can be incremented with the
      * <code>startTimer</code> method.
      */
    def addTimer(opts: CounterOpts): Histogram[String] = js.native
    
    var collectors: js.Any = js.native
    
    var counters: js.Any = js.native
    
    /**
      * Increments the value of a counter metric
      * @param{string} name The name the metric was previously registered as.
      * @param{Object} labels Optional object containing additional label values.
      */
    def incCounter(name: String, labels: StringDictionary[String]): Unit = js.native
    
    def refresh(): Unit = js.native
    
    var register: js.Any = js.native
    
    /**
      * Registers some exported metrics that expose counts of various kinds of
      * objects within the bridge.
      * @param {BridgeGaugesCallback} counterFunc A function that when invoked
      * returns the current counts of various items in the bridge.
      */
    def registerBridgeGauges(counterFunc: js.Function0[BridgeGaugesCounts]): Unit = js.native
    
    /**
      * Registers some exported metrics that relate to operations of the embedded
      * matrix-js-sdk. In particular, a metric is added that counts the number of
      * calls to client API endpoints made by the client library.
      */
    def registerMatrixSdkMetrics(): Unit = js.native
    
    /**
      * Begins a new timer observation for a timer metric.
      * @param{string} name The name the metric was previously registered as.
      * @param{Object} labels Optional object containing additional label values.
      * @return {function} A function to be called to end the timer and report the
      * observation.
      */
    def startTimer(name: String, labels: StringDictionary[String]): js.Function1[/* labels */ js.UndefOr[Partial[Record[String, String | Double]]], Unit] = js.native
    
    var timers: js.Any = js.native
  }
  /* static members */
  object PrometheusMetrics {
    
    @JSImport("matrix-appservice-bridge/lib/components/prometheusmetrics", "PrometheusMetrics")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("matrix-appservice-bridge/lib/components/prometheusmetrics", "PrometheusMetrics.AgeCounters")
    @js.native
    def AgeCounters: Instantiable1[
        /* counterPeriods */ js.UndefOr[js.Array[String]], 
        typingsSlinky.matrixAppserviceBridge.agecountersMod.AgeCounters
      ] = js.native
    @scala.inline
    def AgeCounters_=(x: Instantiable1[/* counterPeriods */ js.UndefOr[js.Array[String]], AgeCounters]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgeCounters")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BridgeGaugesCounts extends StObject {
    
    var matrixGhosts: js.UndefOr[Double] = js.native
    
    var matrixRoomConfigs: js.UndefOr[Double] = js.native
    
    var matrixRoomsByAge: js.UndefOr[AgeCounters] = js.native
    
    var matrixUsersByAge: js.UndefOr[AgeCounters] = js.native
    
    var remoteGhosts: js.UndefOr[Double] = js.native
    
    var remoteRoomConfigs: js.UndefOr[Double] = js.native
    
    var remoteRoomsByAge: js.UndefOr[AgeCounters] = js.native
    
    var remoteUsersByAge: js.UndefOr[AgeCounters] = js.native
  }
  object BridgeGaugesCounts {
    
    @scala.inline
    def apply(): BridgeGaugesCounts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BridgeGaugesCounts]
    }
    
    @scala.inline
    implicit class BridgeGaugesCountsMutableBuilder[Self <: BridgeGaugesCounts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatrixGhosts(value: Double): Self = StObject.set(x, "matrixGhosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrixGhostsUndefined: Self = StObject.set(x, "matrixGhosts", js.undefined)
      
      @scala.inline
      def setMatrixRoomConfigs(value: Double): Self = StObject.set(x, "matrixRoomConfigs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrixRoomConfigsUndefined: Self = StObject.set(x, "matrixRoomConfigs", js.undefined)
      
      @scala.inline
      def setMatrixRoomsByAge(value: AgeCounters): Self = StObject.set(x, "matrixRoomsByAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrixRoomsByAgeUndefined: Self = StObject.set(x, "matrixRoomsByAge", js.undefined)
      
      @scala.inline
      def setMatrixUsersByAge(value: AgeCounters): Self = StObject.set(x, "matrixUsersByAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrixUsersByAgeUndefined: Self = StObject.set(x, "matrixUsersByAge", js.undefined)
      
      @scala.inline
      def setRemoteGhosts(value: Double): Self = StObject.set(x, "remoteGhosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteGhostsUndefined: Self = StObject.set(x, "remoteGhosts", js.undefined)
      
      @scala.inline
      def setRemoteRoomConfigs(value: Double): Self = StObject.set(x, "remoteRoomConfigs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteRoomConfigsUndefined: Self = StObject.set(x, "remoteRoomConfigs", js.undefined)
      
      @scala.inline
      def setRemoteRoomsByAge(value: AgeCounters): Self = StObject.set(x, "remoteRoomsByAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteRoomsByAgeUndefined: Self = StObject.set(x, "remoteRoomsByAge", js.undefined)
      
      @scala.inline
      def setRemoteUsersByAge(value: AgeCounters): Self = StObject.set(x, "remoteUsersByAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteUsersByAgeUndefined: Self = StObject.set(x, "remoteUsersByAge", js.undefined)
    }
  }
  
  type CollectorFunction = js.Function0[Unit]
  
  @js.native
  trait CounterOpts extends StObject {
    
    var help: String = js.native
    
    var labels: js.UndefOr[js.Array[String]] = js.native
    
    var name: String = js.native
    
    var namespace: js.UndefOr[String] = js.native
  }
  object CounterOpts {
    
    @scala.inline
    def apply(help: String, name: String): CounterOpts = {
      val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CounterOpts]
    }
    
    @scala.inline
    implicit class CounterOptsMutableBuilder[Self <: CounterOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    }
  }
  
  @js.native
  trait GagueOpts extends StObject {
    
    var help: String = js.native
    
    var labels: js.UndefOr[js.Array[String]] = js.native
    
    var name: String = js.native
    
    var namespace: js.UndefOr[String] = js.native
    
    var refresh: js.UndefOr[js.Function1[/* gauge */ Gauge[String], Unit]] = js.native
  }
  object GagueOpts {
    
    @scala.inline
    def apply(help: String, name: String): GagueOpts = {
      val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GagueOpts]
    }
    
    @scala.inline
    implicit class GagueOptsMutableBuilder[Self <: GagueOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setRefresh(value: /* gauge */ Gauge[String] => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    }
  }
}
