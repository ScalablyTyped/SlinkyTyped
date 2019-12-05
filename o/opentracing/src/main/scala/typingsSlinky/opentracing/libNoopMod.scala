package typingsSlinky.opentracing

import typingsSlinky.opentracing.libSpanMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/noop", JSImport.Namespace)
@js.native
object libNoopMod extends js.Object {
  var span: default | Null = js.native
  var spanContext: typingsSlinky.opentracing.libSpanUnderscoreContextMod.default | Null = js.native
  var tracer: typingsSlinky.opentracing.libTracerMod.default | Null = js.native
  def initialize(): Unit = js.native
}

