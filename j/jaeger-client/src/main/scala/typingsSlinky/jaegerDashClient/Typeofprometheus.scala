package typingsSlinky.jaegerDashClient

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.promDashClient.Fn_Arguments
import typingsSlinky.promDashClient.promDashClientMod.CounterConfiguration
import typingsSlinky.promDashClient.promDashClientMod.DefaultMetricsCollectorConfiguration
import typingsSlinky.promDashClient.promDashClientMod.GaugeConfiguration
import typingsSlinky.promDashClient.promDashClientMod.HistogramConfiguration
import typingsSlinky.promDashClient.promDashClientMod.Registry
import typingsSlinky.promDashClient.promDashClientMod.SummaryConfiguration
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofprometheus extends js.Object {
  var AggregatorRegistry: TypeofClassAggregatorRegistry = js.native
  var Counter: Instantiable1[
    /* configuration */ CounterConfiguration, 
    typingsSlinky.promDashClient.promDashClientMod.Counter
  ] = js.native
  var Gauge: Instantiable1[
    /* configuration */ GaugeConfiguration, 
    typingsSlinky.promDashClient.promDashClientMod.Gauge
  ] = js.native
  var Histogram: Instantiable1[
    /* configuration */ HistogramConfiguration, 
    typingsSlinky.promDashClient.promDashClientMod.Histogram
  ] = js.native
  var Pushgateway: Instantiable1[/* url */ String, typingsSlinky.promDashClient.promDashClientMod.Pushgateway] = js.native
  var Registry: TypeofClassRegistry = js.native
  var Summary: Instantiable1[
    /* configuration */ SummaryConfiguration, 
    typingsSlinky.promDashClient.promDashClientMod.Summary
  ] = js.native
  val register: Registry = js.native
  def collectDefaultMetrics(): ReturnType[Fn_Arguments] = js.native
  def collectDefaultMetrics(config: DefaultMetricsCollectorConfiguration): ReturnType[Fn_Arguments] = js.native
  def collectDefaultMetrics(timeout: Double): Double = js.native
  def exponentialBuckets(start: Double, factor: Double, count: Double): js.Array[Double] = js.native
  def linearBuckets(start: Double, width: Double, count: Double): js.Array[Double] = js.native
  def validateMetricName(name: String): Boolean = js.native
}

