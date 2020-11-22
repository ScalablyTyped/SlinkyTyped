package typingsSlinky.opentelemetryApi.mod

import typingsSlinky.opentelemetryApi.contextMod.ContextAPI
import typingsSlinky.opentelemetryApi.metricsMod.MetricsAPI
import typingsSlinky.opentelemetryApi.propagationMod.PropagationAPI
import typingsSlinky.opentelemetryApi.traceMod.TraceAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api", JSImport.Default)
@js.native
object default extends js.Object {
  
  var context: ContextAPI = js.native
  
  var metrics: MetricsAPI = js.native
  
  var propagation: PropagationAPI = js.native
  
  var trace: TraceAPI = js.native
}
