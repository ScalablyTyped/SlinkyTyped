package typingsSlinky.reactToastify.eventManagerMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactToastify.reactToastifyNumbers.`0`
import typingsSlinky.reactToastify.reactToastifyNumbers.`1`
import typingsSlinky.reactToastify.reactToastifyNumbers.`2`
import typingsSlinky.reactToastify.reactToastifyNumbers.`3`
import typingsSlinky.reactToastify.reactToastifyNumbers.`4`
import typingsSlinky.reactToastify.reactToastifyNumbers.`5`
import typingsSlinky.reactToastify.typesMod.ClearWaitingQueueParams
import typingsSlinky.reactToastify.typesMod.NotValidatedToastProps
import typingsSlinky.reactToastify.useToastContainerMod.ContainerInstance
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventManager_ extends js.Object {
  var emitQueue: Map[Event, js.Array[TimeoutId]] = js.native
  var list: Map[Event, js.Array[Callback]] = js.native
  def cancelEmit(event: Event): EventManager_ = js.native
  @JSName("emit")
  def emit_0(event: `0`, content: ReactElement, options: NotValidatedToastProps): Unit = js.native
  @JSName("emit")
  def emit_1(event: `1`): Unit = js.native
  @JSName("emit")
  def emit_1(event: `1`, id: String): Unit = js.native
  @JSName("emit")
  def emit_1(event: `1`, id: Double): Unit = js.native
  @JSName("emit")
  def emit_2(event: `2`, containerInstance: ContainerInstance): Unit = js.native
  @JSName("emit")
  def emit_3(event: `3`, containerInstance: ContainerInstance): Unit = js.native
  @JSName("emit")
  def emit_4(event: `4`, toast: Double): Unit = js.native
  @JSName("emit")
  def emit_4(event: `4`, toast: Double, containerId: String): Unit = js.native
  @JSName("emit")
  def emit_4(event: `4`, toast: Double, containerId: Double): Unit = js.native
  @JSName("emit")
  def emit_5(event: `5`, params: ClearWaitingQueueParams): Unit = js.native
  def off(event: Event): EventManager_ = js.native
  def off(event: Event, callback: Callback): EventManager_ = js.native
  @JSName("on")
  def on_0(event: `0`, callback: OnShowCallback): EventManager_ = js.native
  @JSName("on")
  def on_1(event: `1`, callback: OnClearCallback): EventManager_ = js.native
  @JSName("on")
  def on_2(event: `2`, callback: OnDidMountCallback): EventManager_ = js.native
  @JSName("on")
  def on_3(event: `3`, callback: OnWillUnmountCallback): EventManager_ = js.native
  @JSName("on")
  def on_4(event: `4`, callback: OnChangeCallback): EventManager_ = js.native
  @JSName("on")
  def on_5(event: `5`, callback: OnClearWaitingQueue): EventManager_ = js.native
}

