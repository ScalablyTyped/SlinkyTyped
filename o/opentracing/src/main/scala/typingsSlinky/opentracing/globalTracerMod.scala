package typingsSlinky.opentracing

import typingsSlinky.opentracing.tracerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("opentracing/lib/global_tracer", JSImport.Namespace)
@js.native
object globalTracerMod extends js.Object {
  
  def globalTracer(): default = js.native
  
  def initGlobalTracer(tracer: default): Unit = js.native
}
