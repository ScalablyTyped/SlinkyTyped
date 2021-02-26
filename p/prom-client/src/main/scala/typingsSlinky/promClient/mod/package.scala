package typingsSlinky.promClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type LabelValues[T /* <: java.lang.String */] = typingsSlinky.std.Partial[typingsSlinky.std.Record[T, java.lang.String | scala.Double]]
  
  @scala.inline
  def collectDefaultMetrics(): scala.Unit = typingsSlinky.promClient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("collectDefaultMetrics")().asInstanceOf[scala.Unit]
  @scala.inline
  def collectDefaultMetrics(config: typingsSlinky.promClient.mod.DefaultMetricsCollectorConfiguration): scala.Unit = typingsSlinky.promClient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("collectDefaultMetrics")(config.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def exponentialBuckets(start: scala.Double, factor: scala.Double, count: scala.Double): js.Array[scala.Double] = (typingsSlinky.promClient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("exponentialBuckets")(start.asInstanceOf[js.Any], factor.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[scala.Double]]
  
  @scala.inline
  def linearBuckets(start: scala.Double, width: scala.Double, count: scala.Double): js.Array[scala.Double] = (typingsSlinky.promClient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("linearBuckets")(start.asInstanceOf[js.Any], width.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[scala.Double]]
  
  @scala.inline
  def register: typingsSlinky.promClient.mod.Registry = typingsSlinky.promClient.mod.^.asInstanceOf[js.Dynamic].selectDynamic("register").asInstanceOf[typingsSlinky.promClient.mod.Registry]
  
  @scala.inline
  def validateMetricName(name: java.lang.String): scala.Boolean = typingsSlinky.promClient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validateMetricName")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
}
