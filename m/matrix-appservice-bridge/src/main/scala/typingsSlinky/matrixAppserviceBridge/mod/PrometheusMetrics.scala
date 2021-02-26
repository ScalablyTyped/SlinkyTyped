package typingsSlinky.matrixAppserviceBridge.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.promClient.mod.Registry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "PrometheusMetrics")
@js.native
class PrometheusMetrics ()
  extends typingsSlinky.matrixAppserviceBridge.prometheusmetricsMod.PrometheusMetrics {
  def this(register: Registry) = this()
}
/* static members */
object PrometheusMetrics {
  
  @JSImport("matrix-appservice-bridge", "PrometheusMetrics")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("matrix-appservice-bridge", "PrometheusMetrics.AgeCounters")
  @js.native
  def AgeCounters: Instantiable1[
    /* counterPeriods */ js.UndefOr[js.Array[String]], 
    typingsSlinky.matrixAppserviceBridge.agecountersMod.AgeCounters
  ] = js.native
  @scala.inline
  def AgeCounters_=(
    x: Instantiable1[
      /* counterPeriods */ js.UndefOr[js.Array[String]], 
      typingsSlinky.matrixAppserviceBridge.agecountersMod.AgeCounters
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgeCounters")(x.asInstanceOf[js.Any])
}
