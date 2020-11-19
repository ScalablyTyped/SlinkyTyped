package typingsSlinky.reactToastify.anon

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.DOMAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventHandlers extends js.Object {
  
  var eventHandlers: DOMAttributes[HTMLElement] = js.native
  
  var isRunning: Boolean = js.native
  
  def pauseToast(): Unit = js.native
  
  def playToast(): Unit = js.native
  
  var preventExitTransition: Boolean = js.native
  
  var toastRef: ReactRef[HTMLDivElement] = js.native
}
object EventHandlers {
  
  @scala.inline
  def apply(
    eventHandlers: DOMAttributes[HTMLElement],
    isRunning: Boolean,
    pauseToast: () => Unit,
    playToast: () => Unit,
    preventExitTransition: Boolean,
    toastRef: ReactRef[HTMLDivElement]
  ): EventHandlers = {
    val __obj = js.Dynamic.literal(eventHandlers = eventHandlers.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any], pauseToast = js.Any.fromFunction0(pauseToast), playToast = js.Any.fromFunction0(playToast), preventExitTransition = preventExitTransition.asInstanceOf[js.Any], toastRef = toastRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventHandlers]
  }
  
  @scala.inline
  implicit class EventHandlersOps[Self <: EventHandlers] (val x: Self) extends AnyVal {
    
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
    def setEventHandlers(value: DOMAttributes[HTMLElement]): Self = this.set("eventHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRunning(value: Boolean): Self = this.set("isRunning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseToast(value: () => Unit): Self = this.set("pauseToast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlayToast(value: () => Unit): Self = this.set("playToast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreventExitTransition(value: Boolean): Self = this.set("preventExitTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToastRef(value: ReactRef[HTMLDivElement]): Self = this.set("toastRef", value.asInstanceOf[js.Any])
  }
}
