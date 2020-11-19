package typingsSlinky.promClient.mod

import typingsSlinky.promClient.anon.FnCall
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prom-client", "collectDefaultMetrics")
@js.native
object collectDefaultMetrics extends js.Object {
  
  def apply(): ReturnType[FnCall] = js.native
  def apply(config: DefaultMetricsCollectorConfiguration): ReturnType[FnCall] = js.native
  def apply(timeout: Double): Double = js.native
}
