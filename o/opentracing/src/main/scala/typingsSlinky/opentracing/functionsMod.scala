package typingsSlinky.opentracing

import typingsSlinky.opentracing.spanContextMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/functions", JSImport.Namespace)
@js.native
object functionsMod extends js.Object {
  def childOf(spanContext: default): typingsSlinky.opentracing.referenceMod.default = js.native
  def childOf(spanContext: typingsSlinky.opentracing.spanMod.default): typingsSlinky.opentracing.referenceMod.default = js.native
  def followsFrom(spanContext: default): typingsSlinky.opentracing.referenceMod.default = js.native
  def followsFrom(spanContext: typingsSlinky.opentracing.spanMod.default): typingsSlinky.opentracing.referenceMod.default = js.native
}

