package typingsSlinky.ol.eventsMod

import org.scalajs.dom.raw.Event
import typingsSlinky.ol.eventMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerObject extends Listener {
  @JSName("handleEvent")
  var handleEvent_Original: ListenerFunction = js.native
  def handleEvent(p0: default): Unit | Boolean = js.native
  def handleEvent(p0: Event): Unit | Boolean = js.native
}

