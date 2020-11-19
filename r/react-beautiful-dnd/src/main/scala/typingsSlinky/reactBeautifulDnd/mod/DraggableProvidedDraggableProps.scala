package typingsSlinky.reactBeautifulDnd.mod

import slinky.web.SyntheticTransitionEvent
import typingsSlinky.react.mod.TransitionEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableProvidedDraggableProps extends js.Object {
  
  // used for shared global styles
  var `data-rbd-draggable-context-id`: String = js.native
  
  var `data-rbd-draggable-id`: String = js.native
  
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[_]] = js.native
  
  // inline style
  var style: js.UndefOr[DraggingStyle | NotDraggingStyle] = js.native
}
object DraggableProvidedDraggableProps {
  
  @scala.inline
  def apply(`data-rbd-draggable-context-id`: String, `data-rbd-draggable-id`: String): DraggableProvidedDraggableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data-rbd-draggable-context-id")(`data-rbd-draggable-context-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-rbd-draggable-id")(`data-rbd-draggable-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProvidedDraggableProps]
  }
  
  @scala.inline
  implicit class DraggableProvidedDraggablePropsOps[Self <: DraggableProvidedDraggableProps] (val x: Self) extends AnyVal {
    
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
    def `setData-rbd-draggable-context-id`(value: String): Self = this.set("data-rbd-draggable-context-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setData-rbd-draggable-id`(value: String): Self = this.set("data-rbd-draggable-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTransitionEnd(value: SyntheticTransitionEvent[_] => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    
    @scala.inline
    def setStyle(value: DraggingStyle | NotDraggingStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
