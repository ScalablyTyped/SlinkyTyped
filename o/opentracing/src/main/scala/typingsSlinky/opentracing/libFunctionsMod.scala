package typingsSlinky.opentracing

import typingsSlinky.opentracing.libSpanMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/functions", JSImport.Namespace)
@js.native
object libFunctionsMod extends js.Object {
  def childOf(spanContext: default): typingsSlinky.opentracing.libReferenceMod.default = js.native
  def childOf(spanContext: typingsSlinky.opentracing.libSpanUnderscoreContextMod.default): typingsSlinky.opentracing.libReferenceMod.default = js.native
  def followsFrom(spanContext: default): typingsSlinky.opentracing.libReferenceMod.default = js.native
  def followsFrom(spanContext: typingsSlinky.opentracing.libSpanUnderscoreContextMod.default): typingsSlinky.opentracing.libReferenceMod.default = js.native
}

