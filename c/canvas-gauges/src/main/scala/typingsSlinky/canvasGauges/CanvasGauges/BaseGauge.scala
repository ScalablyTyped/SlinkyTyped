package typingsSlinky.canvasGauges.CanvasGauges

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.canvasGauges.canvasGaugesStrings.animate
import typingsSlinky.canvasGauges.canvasGaugesStrings.animationEnd
import typingsSlinky.canvasGauges.canvasGaugesStrings.animationStart
import typingsSlinky.canvasGauges.canvasGaugesStrings.beforeHighlights
import typingsSlinky.canvasGauges.canvasGaugesStrings.beforeMajorTicks
import typingsSlinky.canvasGauges.canvasGaugesStrings.beforeMinorTicks
import typingsSlinky.canvasGauges.canvasGaugesStrings.beforeNeedle
import typingsSlinky.canvasGauges.canvasGaugesStrings.beforeNumbers
import typingsSlinky.canvasGauges.canvasGaugesStrings.beforePlate
import typingsSlinky.canvasGauges.canvasGaugesStrings.beforeProgressBar
import typingsSlinky.canvasGauges.canvasGaugesStrings.beforeTitle
import typingsSlinky.canvasGauges.canvasGaugesStrings.beforeUnits
import typingsSlinky.canvasGauges.canvasGaugesStrings.beforeValueBox
import typingsSlinky.canvasGauges.canvasGaugesStrings.destroy
import typingsSlinky.canvasGauges.canvasGaugesStrings.init
import typingsSlinky.canvasGauges.canvasGaugesStrings.render
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CanvasGauges.BaseGauge")
@js.native
abstract class BaseGauge protected () extends js.Object {
  def this(options: GenericOptions) = this()
  var animation: Animation = js.native
  var canvas: SmartCanvas = js.native
  var options: GenericOptions = js.native
  var `type`: BaseGauge = js.native
  var value: Double = js.native
  def destroy(): js.Any = js.native
  def draw(): BaseGauge = js.native
  @JSName("on")
  def on_animate(event: animate, listeners: js.Function2[/* percent */ Double, /* value */ Double, Unit]): Unit = js.native
  @JSName("on")
  def on_animationEnd(event: animationEnd, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_animationStart(event: animationStart, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeHighlights(event: beforeHighlights, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeMajorTicks(event: beforeMajorTicks, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeMinorTicks(event: beforeMinorTicks, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeNeedle(event: beforeNeedle, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeNumbers(event: beforeNumbers, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforePlate(event: beforePlate, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeProgressBar(event: beforeProgressBar, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeTitle(event: beforeTitle, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeUnits(event: beforeUnits, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeValueBox(event: beforeValueBox, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_destroy(event: destroy, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_init(event: init, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_render(event: render, listeners: js.Function0[Unit]): Unit = js.native
  def update(options: GenericOptions): BaseGauge = js.native
}

/* static members */
@JSGlobal("CanvasGauges.BaseGauge")
@js.native
object BaseGauge extends js.Object {
  val version: Double = js.native
  def ensureValue(value: Double): Double = js.native
  def fromElement(element: HTMLElement): js.Any = js.native
  def initialize(`type`: String, options: GenericOptions): js.Any = js.native
}

