package typingsSlinky.flickity.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Touch
import typingsSlinky.flickity.AnonX
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventBindings extends js.Object {
  /**
    * Triggered after a background image has been loaded with bgLazyLoad.
    */
  var bgLazyLoad: js.UndefOr[
    js.Function2[/* event */ js.UndefOr[Event_], /* element */ js.UndefOr[Element], Unit]
  ] = js.native
  var cellSelect: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  /**
    * Triggered when the selected slide is changed.
    */
  var change: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  /**
    * Triggered when dragging ends.
    */
  var dragEnd: js.UndefOr[
    js.Function2[/* event */ Event_, /* pointer */ js.UndefOr[Element | Touch], Unit]
  ] = js.native
  /**
    * Triggered when dragging moves and the slider moves.
    */
  var dragMove: js.UndefOr[
    js.Function3[
      /* event */ js.UndefOr[Event_], 
      /* pointer */ js.UndefOr[Element | Touch], 
      /* moveVector */ js.UndefOr[AnonX], 
      Unit
    ]
  ] = js.native
  /**
    * Triggered when dragging starts and the slider starts moving.
    */
  var dragStart: js.UndefOr[
    js.Function2[/* event */ js.UndefOr[Event_], /* pointer */ js.UndefOr[Element | Touch], Unit]
  ] = js.native
  /**
    * Triggered after entering or exiting fullscreen view.
    */
  var fullscreenChange: js.UndefOr[js.Function1[/* isFullscreen */ js.UndefOr[Boolean], Unit]] = js.native
  /**
    * Triggered after an image has been loaded with lazyLoad.
    */
  var lazyLoad: js.UndefOr[
    js.Function2[/* event */ js.UndefOr[Event_], /* cellElement */ js.UndefOr[Element], Unit]
  ] = js.native
  /**
    * Triggered when the user's pointer (mouse, touch, pointer) presses down.
    */
  var pointerDown: js.UndefOr[
    js.Function2[/* event */ Event_, /* pointer */ js.UndefOr[Element | Touch], Unit]
  ] = js.native
  /**
    * Triggered when the user's pointer moves.
    */
  var pointerMove: js.UndefOr[
    js.Function3[
      /* event */ js.UndefOr[Event_], 
      /* pointer */ js.UndefOr[Element | Touch], 
      /* moveVector */ js.UndefOr[AnonX], 
      Unit
    ]
  ] = js.native
  /**
    * Triggered when the user's pointer unpresses.
    */
  var pointerUp: js.UndefOr[
    js.Function2[/* event */ js.UndefOr[Event_], /* pointer */ js.UndefOr[Element | Touch], Unit]
  ] = js.native
  /**
    * Triggered after Flickity has been activated.
    */
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Triggered when the slider moves.
    */
  var scroll: js.UndefOr[js.Function1[/* progress */ js.UndefOr[Double], Unit]] = js.native
  /**
    * Triggered when a slide is selected.
    * select is triggered any time a slide is selected, even on the same slide. change is triggered only when a different slide is selected.
    * This event was previously cellSelect in Flickity v1. cellSelect will continue to work in Flickity v2.
    */
  var select: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  /**
    * Triggered when the slider is settled at its end position.
    */
  var settle: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  /**
    * Triggered when the user's pointer is pressed and unpressed and has not moved enough to start dragging.
    * click events are hard to detect with draggable UI, as they are triggered whenever a user drags.
    * Flickity's staticClick event resolves this, as it is triggered when the user has not dragged.
    */
  var staticClick: js.UndefOr[
    js.Function4[
      /* event */ js.UndefOr[Event_], 
      /* pointer */ js.UndefOr[Element | Touch], 
      /* cellElement */ js.UndefOr[Element], 
      /* cellIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
}

object EventBindings {
  @scala.inline
  def apply(): EventBindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventBindings]
  }
  @scala.inline
  implicit class EventBindingsOps[Self <: EventBindings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBgLazyLoad(value: (/* event */ js.UndefOr[Event_], /* element */ js.UndefOr[Element]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgLazyLoad")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBgLazyLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgLazyLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSelect(value: /* index */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* index */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEnd(value: (/* event */ Event_, /* pointer */ js.UndefOr[Element | Touch]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDragMove(
      value: (/* event */ js.UndefOr[Event_], /* pointer */ js.UndefOr[Element | Touch], /* moveVector */ js.UndefOr[AnonX]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMove")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDragMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMove")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStart(value: (/* event */ js.UndefOr[Event_], /* pointer */ js.UndefOr[Element | Touch]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreenChange(value: /* isFullscreen */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFullscreenChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenChange")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyLoad(value: (/* event */ js.UndefOr[Event_], /* cellElement */ js.UndefOr[Element]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLazyLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerDown(value: (/* event */ Event_, /* pointer */ js.UndefOr[Element | Touch]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPointerDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerDown")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerMove(
      value: (/* event */ js.UndefOr[Event_], /* pointer */ js.UndefOr[Element | Touch], /* moveVector */ js.UndefOr[AnonX]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerMove")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPointerMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerMove")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerUp(value: (/* event */ js.UndefOr[Event_], /* pointer */ js.UndefOr[Element | Touch]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerUp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPointerUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerUp")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: /* progress */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: /* index */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSettle(value: /* index */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSettle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settle")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticClick(
      value: (/* event */ js.UndefOr[Event_], /* pointer */ js.UndefOr[Element | Touch], /* cellElement */ js.UndefOr[Element], /* cellIndex */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticClick")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutStaticClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticClick")(js.undefined)
        ret
    }
  }
  
}

