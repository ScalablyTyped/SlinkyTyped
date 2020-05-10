package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchOptions extends js.Object {
  var doubleTapTimeout: js.UndefOr[Double] = js.native
  var doubletap: js.UndefOr[js.Function1[/* e */ TouchDoubletapEvent, Unit]] = js.native
  var drag: js.UndefOr[js.Function1[/* e */ TouchDragEvent, Unit]] = js.native
  var dragend: js.UndefOr[js.Function1[/* e */ TouchDragendEvent, Unit]] = js.native
  var dragstart: js.UndefOr[js.Function1[/* e */ TouchDragstartEvent, Unit]] = js.native
  var enableSwipe: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[String] = js.native
  var gesturechange: js.UndefOr[js.Function1[/* e */ TouchGesturechangeEvent, Unit]] = js.native
  var gestureend: js.UndefOr[js.Function1[/* e */ TouchGestureendEvent, Unit]] = js.native
  var gesturestart: js.UndefOr[js.Function1[/* e */ TouchGesturestartEvent, Unit]] = js.native
  var hold: js.UndefOr[js.Function1[/* e */ TouchHoldEvent, Unit]] = js.native
  var maxDuration: js.UndefOr[Double] = js.native
  var maxYDelta: js.UndefOr[Double] = js.native
  var minHold: js.UndefOr[Double] = js.native
  var minXDelta: js.UndefOr[Double] = js.native
  var multiTouch: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var surface: js.UndefOr[JQuery] = js.native
  var swipe: js.UndefOr[js.Function1[/* e */ TouchSwipeEvent, Unit]] = js.native
  var tap: js.UndefOr[js.Function1[/* e */ TouchTapEvent, Unit]] = js.native
  var touchstart: js.UndefOr[js.Function1[/* e */ TouchTouchstartEvent, Unit]] = js.native
}

object TouchOptions {
  @scala.inline
  def apply(): TouchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchOptions]
  }
  @scala.inline
  implicit class TouchOptionsOps[Self <: TouchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoubleTapTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleTapTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleTapTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleTapTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubletap(value: /* e */ TouchDoubletapEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoubletap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(js.undefined)
        ret
    }
    @scala.inline
    def withDrag(value: /* e */ TouchDragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragend(value: /* e */ TouchDragendEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(js.undefined)
        ret
    }
    @scala.inline
    def withDragstart(value: /* e */ TouchDragstartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSwipe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSwipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSwipe")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGesturechange(value: /* e */ TouchGesturechangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gesturechange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGesturechange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gesturechange")(js.undefined)
        ret
    }
    @scala.inline
    def withGestureend(value: /* e */ TouchGestureendEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGestureend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureend")(js.undefined)
        ret
    }
    @scala.inline
    def withGesturestart(value: /* e */ TouchGesturestartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gesturestart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGesturestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gesturestart")(js.undefined)
        ret
    }
    @scala.inline
    def withHold(value: /* e */ TouchHoldEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hold")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxYDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxYDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxYDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxYDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHold")(js.undefined)
        ret
    }
    @scala.inline
    def withMinXDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minXDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinXDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minXDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSurface(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surface")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipe(value: /* e */ TouchSwipeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(js.undefined)
        ret
    }
    @scala.inline
    def withTap(value: /* e */ TouchTapEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchstart(value: /* e */ TouchTouchstartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTouchstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(js.undefined)
        ret
    }
  }
  
}

