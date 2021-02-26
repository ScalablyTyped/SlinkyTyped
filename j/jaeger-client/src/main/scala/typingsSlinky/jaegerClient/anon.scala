package typingsSlinky.jaegerClient

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.promClient.mod.AggregatorRegistry
import typingsSlinky.promClient.mod.CounterConfiguration
import typingsSlinky.promClient.mod.DefaultMetricsCollectorConfiguration
import typingsSlinky.promClient.mod.GaugeConfiguration
import typingsSlinky.promClient.mod.HistogramConfiguration
import typingsSlinky.promClient.mod.Registry
import typingsSlinky.promClient.mod.SummaryConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofAggregatorRegistry extends Instantiable0[AggregatorRegistry] {
    
    /**
    	 * Creates a new Registry instance from an array of metrics that were
    	 * created by `registry.getMetricsAsJSON()`. Metrics are aggregated using
    	 * the method specified by their `aggregator` property, or by summation if
    	 * `aggregator` is undefined.
    	 * @param {Array} metricsArr Array of metrics, each of which created by
    	 *   `registry.getMetricsAsJSON()`.
    	 * @return {Registry} aggregated registry.
    	 */
    def aggregate(metricsArr: js.Array[js.Object]): Registry = js.native
    
    /**
    	 * Sets the registry or registries to be aggregated. Call from workers to
    	 * use a registry/registries other than the default global registry.
    	 * @param {Array<Registry>|Registry} regs Registry or registries to be
    	 *   aggregated.
    	 * @return {void}
    	 */
    def setRegistries(regs: js.Array[Registry]): Unit = js.native
    def setRegistries(regs: Registry): Unit = js.native
  }
  
  @js.native
  trait TypeofRegistry extends Instantiable0[Registry] {
    
    /**
    	 * Merge registers
    	 * @param registers The registers you want to merge together
    	 */
    def merge(registers: js.Array[Registry]): Registry = js.native
  }
  
  @js.native
  trait Typeofprometheus extends StObject {
    
    var AggregatorRegistry: TypeofAggregatorRegistry = js.native
    
    var Counter: Instantiable1[
        /* configuration */ CounterConfiguration[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
        typingsSlinky.promClient.mod.Counter[String]
      ] = js.native
    
    var Gauge: Instantiable1[
        /* configuration */ GaugeConfiguration[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
        typingsSlinky.promClient.mod.Gauge[String]
      ] = js.native
    
    var Histogram: Instantiable1[
        /* configuration */ HistogramConfiguration[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
        typingsSlinky.promClient.mod.Histogram[String]
      ] = js.native
    
    var Pushgateway: Instantiable1[/* url */ String, typingsSlinky.promClient.mod.Pushgateway] = js.native
    
    var Registry: TypeofRegistry = js.native
    
    var Summary: Instantiable1[
        /* configuration */ SummaryConfiguration[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
        typingsSlinky.promClient.mod.Summary[String]
      ] = js.native
    
    def collectDefaultMetrics(): Unit = js.native
    def collectDefaultMetrics(config: DefaultMetricsCollectorConfiguration): Unit = js.native
    
    def exponentialBuckets(start: Double, factor: Double, count: Double): js.Array[Double] = js.native
    
    def linearBuckets(start: Double, width: Double, count: Double): js.Array[Double] = js.native
    
    val register: Registry = js.native
    
    def validateMetricName(name: String): Boolean = js.native
  }
}
