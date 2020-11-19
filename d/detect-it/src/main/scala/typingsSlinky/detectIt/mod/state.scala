package typingsSlinky.detectIt.mod

import typingsSlinky.detectHover.mod.detectHover
import typingsSlinky.detectPassiveEvents.mod.detectPassiveEvents
import typingsSlinky.detectPointer.mod.detectPointer
import typingsSlinky.detectTouchEvents.mod.detectTouchEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait state extends js.Object {
  
  var detectHover: typingsSlinky.detectHover.mod.detectHover = js.native
  
  var detectPassiveEvents: typingsSlinky.detectPassiveEvents.mod.detectPassiveEvents = js.native
  
  var detectPointer: typingsSlinky.detectPointer.mod.detectPointer = js.native
  
  var detectTouchEvents: typingsSlinky.detectTouchEvents.mod.detectTouchEvents = js.native
}
object state {
  
  @scala.inline
  def apply(
    detectHover: detectHover,
    detectPassiveEvents: detectPassiveEvents,
    detectPointer: detectPointer,
    detectTouchEvents: detectTouchEvents
  ): state = {
    val __obj = js.Dynamic.literal(detectHover = detectHover.asInstanceOf[js.Any], detectPassiveEvents = detectPassiveEvents.asInstanceOf[js.Any], detectPointer = detectPointer.asInstanceOf[js.Any], detectTouchEvents = detectTouchEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[state]
  }
  
  @scala.inline
  implicit class stateOps[Self <: state] (val x: Self) extends AnyVal {
    
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
    def setDetectHover(value: detectHover): Self = this.set("detectHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectPassiveEvents(value: detectPassiveEvents): Self = this.set("detectPassiveEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectPointer(value: detectPointer): Self = this.set("detectPointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectTouchEvents(value: detectTouchEvents): Self = this.set("detectTouchEvents", value.asInstanceOf[js.Any])
  }
}
