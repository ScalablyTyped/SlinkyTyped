package typingsSlinky.ol.pointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var handleDownEvent: js.UndefOr[
    js.Function1[/* p0 */ typingsSlinky.ol.mapBrowserPointerEventMod.default, Boolean]
  ] = js.native
  var handleDragEvent: js.UndefOr[js.Function1[/* p0 */ typingsSlinky.ol.mapBrowserPointerEventMod.default, Unit]] = js.native
  var handleEvent: js.UndefOr[js.Function1[/* p0 */ typingsSlinky.ol.mapBrowserEventMod.default, Boolean]] = js.native
  var handleMoveEvent: js.UndefOr[js.Function1[/* p0 */ typingsSlinky.ol.mapBrowserPointerEventMod.default, Unit]] = js.native
  var handleUpEvent: js.UndefOr[
    js.Function1[/* p0 */ typingsSlinky.ol.mapBrowserPointerEventMod.default, Boolean]
  ] = js.native
  var stopDown: js.UndefOr[js.Function1[/* p0 */ Boolean, Boolean]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleDownEvent(value: /* p0 */ typingsSlinky.ol.mapBrowserPointerEventMod.default => Boolean): Self = {
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
    def withHandleDragEvent(value: /* p0 */ typingsSlinky.ol.mapBrowserPointerEventMod.default => Unit): Self = {
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
    def withHandleEvent(value: /* p0 */ typingsSlinky.ol.mapBrowserEventMod.default => Boolean): Self = {
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
    def withHandleMoveEvent(value: /* p0 */ typingsSlinky.ol.mapBrowserPointerEventMod.default => Unit): Self = {
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
    def withHandleUpEvent(value: /* p0 */ typingsSlinky.ol.mapBrowserPointerEventMod.default => Boolean): Self = {
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
    @scala.inline
    def withStopDown(value: /* p0 */ Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStopDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopDown")(js.undefined)
        ret
    }
  }
  
}

