package typingsSlinky.ol.interactionInteractionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InteractionOptions extends js.Object {
  
  def handleEvent(p0: typingsSlinky.ol.mapBrowserEventMod.default): Boolean = js.native
}
object InteractionOptions {
  
  @scala.inline
  def apply(handleEvent: typingsSlinky.ol.mapBrowserEventMod.default => Boolean): InteractionOptions = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[InteractionOptions]
  }
  
  @scala.inline
  implicit class InteractionOptionsOps[Self <: InteractionOptions] (val x: Self) extends AnyVal {
    
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
    def setHandleEvent(value: typingsSlinky.ol.mapBrowserEventMod.default => Boolean): Self = this.set("handleEvent", js.Any.fromFunction1(value))
  }
}
