package typingsSlinky.ol.eventsMod

import org.scalajs.dom.raw.Event
import typingsSlinky.ol.eventMod.default
import typingsSlinky.ol.targetMod.EventTargetLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsKey extends js.Object {
  @JSName("listener")
  var listener_Original: ListenerFunction = js.native
  var target: EventTargetLike = js.native
  var `type`: String = js.native
  def listener(p0: default): Unit | Boolean = js.native
  def listener(p0: Event): Unit | Boolean = js.native
}

