package typingsSlinky.opentracing

import typingsSlinky.opentracing.spanMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("opentracing/lib/noop", JSImport.Namespace)
@js.native
object noopMod extends js.Object {
  
  def initialize(): Unit = js.native
  
  var span: default | Null = js.native
  
  var spanContext: typingsSlinky.opentracing.spanContextMod.default | Null = js.native
  
  var tracer: typingsSlinky.opentracing.tracerMod.default | Null = js.native
}
