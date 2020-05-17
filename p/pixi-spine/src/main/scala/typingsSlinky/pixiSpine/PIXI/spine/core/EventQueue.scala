package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventQueue extends js.Object {
  var animState: AnimationState = js.native
  var drainDisabled: Boolean = js.native
  var objects: js.Array[_] = js.native
  def clear(): Unit = js.native
  def complete(entry: TrackEntry): Unit = js.native
  def deprecateStuff(): Boolean = js.native
  def dispose(entry: TrackEntry): Unit = js.native
  def drain(): Unit = js.native
  def end(entry: TrackEntry): Unit = js.native
  def event(entry: TrackEntry, event: Event): Unit = js.native
  def interrupt(entry: TrackEntry): Unit = js.native
  def start(entry: TrackEntry): Unit = js.native
}

object EventQueue {
  @scala.inline
  def apply(
    animState: AnimationState,
    clear: () => Unit,
    complete: TrackEntry => Unit,
    deprecateStuff: () => Boolean,
    dispose: TrackEntry => Unit,
    drain: () => Unit,
    drainDisabled: Boolean,
    end: TrackEntry => Unit,
    event: (TrackEntry, Event) => Unit,
    interrupt: TrackEntry => Unit,
    objects: js.Array[_],
    start: TrackEntry => Unit
  ): EventQueue = {
    val __obj = js.Dynamic.literal(animState = animState.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), complete = js.Any.fromFunction1(complete), deprecateStuff = js.Any.fromFunction0(deprecateStuff), dispose = js.Any.fromFunction1(dispose), drain = js.Any.fromFunction0(drain), drainDisabled = drainDisabled.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), event = js.Any.fromFunction2(event), interrupt = js.Any.fromFunction1(interrupt), objects = objects.asInstanceOf[js.Any], start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[EventQueue]
  }
  @scala.inline
  implicit class EventQueueOps[Self <: EventQueue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimState(value: AnimationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComplete(value: TrackEntry => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeprecateStuff(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecateStuff")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDispose(value: TrackEntry => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDrain(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drain")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDrainDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drainDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: TrackEntry => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEvent(value: (TrackEntry, Event) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInterrupt(value: TrackEntry => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interrupt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withObjects(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: TrackEntry => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

