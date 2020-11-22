package typingsSlinky.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prom-client", "Registry")
@js.native
class Registry () extends js.Object {
  
  /**
  	 * Remove all metrics from the registry
  	 */
  def clear(): Unit = js.native
  
  /**
  	 * Gets the Content-Type of the metrics for use in the response headers.
  	 */
  var contentType: String = js.native
  
  /**
  	 * Get all metrics as objects
  	 */
  def getMetricsAsArray(): js.Array[metric] = js.native
  
  /**
  	 * Get all metrics as objects
  	 */
  def getMetricsAsJSON(): js.Array[metric] = js.native
  
  /**
  	 * Get a single metric
  	 * @param name The name of the metric
  	 */
  def getSingleMetric[T /* <: String */](name: String): Metric_[T] = js.native
  
  /**
  	 * Get a string representation of a single metric by name
  	 * @param name The name of the metric
  	 */
  def getSingleMetricAsString(name: String): String = js.native
  
  /**
  	 * Get string representation for all metrics
  	 */
  def metrics(): String = js.native
  
  /**
  	 * Register metric to register
  	 * @param metric Metric to add to register
  	 */
  def registerMetric[T /* <: String */](metric: Metric_[T]): Unit = js.native
  
  /**
  	 * Remove a single metric
  	 * @param name The name of the metric to remove
  	 */
  def removeSingleMetric(name: String): Unit = js.native
  
  /**
  	 * Reset all metrics in the registry
  	 */
  def resetMetrics(): Unit = js.native
  
  /**
  	 * Set static labels to every metric emitted by this registry
  	 * @param labels of name/value pairs:
  	 * { defaultLabel: "value", anotherLabel: "value 2" }
  	 */
  def setDefaultLabels(labels: js.Object): Unit = js.native
}
/* static members */
@JSImport("prom-client", "Registry")
@js.native
object Registry extends js.Object {
  
  /**
  	 * Merge registers
  	 * @param registers The registers you want to merge together
  	 */
  def merge(registers: js.Array[Registry]): Registry = js.native
}
