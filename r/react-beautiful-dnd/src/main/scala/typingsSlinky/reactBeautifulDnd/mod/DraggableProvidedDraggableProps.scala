package typingsSlinky.reactBeautifulDnd.mod

import slinky.web.SyntheticTransitionEvent
import typingsSlinky.react.mod.TransitionEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def `withData-rbd-draggable-context-id`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-rbd-draggable-context-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withData-rbd-draggable-id`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-rbd-draggable-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTransitionEnd(value: SyntheticTransitionEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: DraggingStyle | NotDraggingStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

