package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.anon.Left
import typingsSlinky.openfin.openfinStrings.`desktop-icon-clicked`
import typingsSlinky.openfin.openfinStrings.system
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DesktopIconClickedEvent extends js.Object {
  var mouse: Left
  /**
    * the number of milliseconds that have elapsed since the system was started,
    */
  var tickCount: Double
  var topic: system
  var `type`: `desktop-icon-clicked`
}

object DesktopIconClickedEvent {
  @scala.inline
  def apply(mouse: Left, tickCount: Double, topic: system, `type`: `desktop-icon-clicked`): DesktopIconClickedEvent = {
    val __obj = js.Dynamic.literal(mouse = mouse.asInstanceOf[js.Any], tickCount = tickCount.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesktopIconClickedEvent]
  }
}

