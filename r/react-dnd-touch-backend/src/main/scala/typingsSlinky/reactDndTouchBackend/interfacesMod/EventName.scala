package typingsSlinky.reactDndTouchBackend.interfacesMod

import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.contextmenu
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.keydown
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.mousedown
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.mousemove
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.mouseup
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.touchend
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.touchmove
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventName extends js.Object {
  
  var contextmenu: js.UndefOr[typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.contextmenu] = js.native
  
  var end: js.UndefOr[mouseup | touchend] = js.native
  
  var keydown: js.UndefOr[typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.keydown] = js.native
  
  var move: js.UndefOr[mousemove | touchmove] = js.native
  
  var start: js.UndefOr[mousedown | touchstart] = js.native
}
object EventName {
  
  @scala.inline
  def apply(): EventName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventName]
  }
  
  @scala.inline
  implicit class EventNameOps[Self <: EventName] (val x: Self) extends AnyVal {
    
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
    def setContextmenu(value: contextmenu): Self = this.set("contextmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextmenu: Self = this.set("contextmenu", js.undefined)
    
    @scala.inline
    def setEnd(value: mouseup | touchend): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setKeydown(value: keydown): Self = this.set("keydown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeydown: Self = this.set("keydown", js.undefined)
    
    @scala.inline
    def setMove(value: mousemove | touchmove): Self = this.set("move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    
    @scala.inline
    def setStart(value: mousedown | touchstart): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
