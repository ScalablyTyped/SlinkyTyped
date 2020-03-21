package typingsSlinky.datadogTracer.mod

import typingsSlinky.datadogTracer.datadogTracerStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracer
  extends typingsSlinky.opentracing.tracerMod.Tracer {
  @JSName("addEventListener")
  def addEventListener_error(method: error): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(method: error, cb: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_error(method: error): Unit = js.native
  @JSName("on")
  def on_error(method: error, cb: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
}

