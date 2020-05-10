package typingsSlinky.openlayers.mod.olx.interaction

import typingsSlinky.openlayers.mod.MapBrowserPointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerOptions extends js.Object {
  var handleDownEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.native
  var handleDragEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.native
  var handleEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.native
  var handleMoveEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.native
  var handleUpEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.native
}

object PointerOptions {
  @scala.inline
  def apply(): PointerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointerOptions]
  }
  @scala.inline
  implicit class PointerOptionsOps[Self <: PointerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleDownEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDownEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleDownEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDownEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleDragEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDragEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleDragEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDragEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleMoveEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMoveEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleMoveEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMoveEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleUpEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleUpEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleUpEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleUpEvent")(js.undefined)
        ret
    }
  }
  
}

