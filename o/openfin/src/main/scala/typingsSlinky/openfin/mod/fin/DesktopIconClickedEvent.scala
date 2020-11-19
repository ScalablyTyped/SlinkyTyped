package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.anon.Top
import typingsSlinky.openfin.openfinStrings.`desktop-icon-clicked`
import typingsSlinky.openfin.openfinStrings.system
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DesktopIconClickedEvent extends js.Object {
  
  var mouse: Top = js.native
  
  /**
    * the number of milliseconds that have elapsed since the system was started,
    */
  var tickCount: Double = js.native
  
  var topic: system = js.native
  
  var `type`: `desktop-icon-clicked` = js.native
}
object DesktopIconClickedEvent {
  
  @scala.inline
  def apply(mouse: Top, tickCount: Double, topic: system, `type`: `desktop-icon-clicked`): DesktopIconClickedEvent = {
    val __obj = js.Dynamic.literal(mouse = mouse.asInstanceOf[js.Any], tickCount = tickCount.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesktopIconClickedEvent]
  }
  
  @scala.inline
  implicit class DesktopIconClickedEventOps[Self <: DesktopIconClickedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMouse(value: Top): Self = this.set("mouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickCount(value: Double): Self = this.set("tickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: system): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `desktop-icon-clicked`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
