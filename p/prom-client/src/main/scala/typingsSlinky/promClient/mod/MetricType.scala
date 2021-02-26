package typingsSlinky.promClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MetricType extends StObject
@JSImport("prom-client", "MetricType")
@js.native
object MetricType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MetricType with Double] = js.native
  
  @js.native
  sealed trait Counter extends MetricType
  /* 0 */ val Counter: typingsSlinky.promClient.mod.MetricType.Counter with Double = js.native
  
  @js.native
  sealed trait Gauge extends MetricType
  /* 1 */ val Gauge: typingsSlinky.promClient.mod.MetricType.Gauge with Double = js.native
  
  @js.native
  sealed trait Histogram extends MetricType
  /* 2 */ val Histogram: typingsSlinky.promClient.mod.MetricType.Histogram with Double = js.native
  
  @js.native
  sealed trait Summary extends MetricType
  /* 3 */ val Summary: typingsSlinky.promClient.mod.MetricType.Summary with Double = js.native
}
