package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Responders extends js.Object {
  var onBeforeCapture: js.UndefOr[OnBeforeCaptureResponder] = js.native
  var onBeforeDragStart: js.UndefOr[OnBeforeDragStartResponder] = js.native
  // always required
  var onDragEnd: OnDragEndResponder = js.native
  var onDragStart: js.UndefOr[OnDragStartResponder] = js.native
  var onDragUpdate: js.UndefOr[OnDragUpdateResponder] = js.native
}

object Responders {
  @scala.inline
  def apply(onDragEnd: (/* result */ DropResult, /* provided */ ResponderProvided) => Unit): Responders = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2(onDragEnd))
    __obj.asInstanceOf[Responders]
  }
  @scala.inline
  implicit class RespondersOps[Self <: Responders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnDragEnd(value: (/* result */ DropResult, /* provided */ ResponderProvided) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnBeforeCapture(value: /* before */ BeforeCapture => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeDragStart(value: /* start */ DragStart => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: (/* start */ DragStart, /* provided */ ResponderProvided) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragUpdate(value: (/* update */ DragUpdate, /* provided */ ResponderProvided) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragUpdate")(js.undefined)
        ret
    }
  }
  
}

