package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.openfinStrings.maximized
import typingsSlinky.openfin.openfinStrings.minimized
import typingsSlinky.openfin.openfinStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowEndBoundsChangingEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  
  var height: Double = js.native
  
  var left: Double = js.native
  
  var top: Double = js.native
  
  var width: Double = js.native
  
  var windowState: minimized | normal | maximized = js.native
}
object WindowEndBoundsChangingEvent {
  
  @scala.inline
  def apply[Topic, Type](
    height: Double,
    left: Double,
    name: String,
    top: Double,
    topic: Topic,
    `type`: Type,
    uuid: String,
    width: Double,
    windowState: minimized | normal | maximized
  ): WindowEndBoundsChangingEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], windowState = windowState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEndBoundsChangingEvent[Topic, Type]]
  }
  
  @scala.inline
  implicit class WindowEndBoundsChangingEventOps[Self <: WindowEndBoundsChangingEvent[_, _], Topic, Type] (val x: Self with (WindowEndBoundsChangingEvent[Topic, Type])) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowState(value: minimized | normal | maximized): Self = this.set("windowState", value.asInstanceOf[js.Any])
  }
}
