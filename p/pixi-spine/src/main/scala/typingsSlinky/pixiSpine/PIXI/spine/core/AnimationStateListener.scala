package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationStateListener extends js.Object {
  var complete: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.native
  var dispose: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.native
  var end: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.native
  var event: js.UndefOr[js.Function2[/* entry */ TrackEntry, /* event */ Event, Unit]] = js.native
  var interrupt: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.native
  var start: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.native
}

object AnimationStateListener {
  @scala.inline
  def apply(): AnimationStateListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationStateListener]
  }
  @scala.inline
  implicit class AnimationStateListenerOps[Self <: AnimationStateListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: /* entry */ TrackEntry => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withDispose(value: /* entry */ TrackEntry => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDispose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: /* entry */ TrackEntry => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: (/* entry */ TrackEntry, /* event */ Event) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withInterrupt(value: /* entry */ TrackEntry => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interrupt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInterrupt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interrupt")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: /* entry */ TrackEntry => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

