package typingsSlinky.kefir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter[V, E] extends js.Object {
  // Deprecated methods
  def emit(value: V): Boolean = js.native
  def emitEvent(event: Event[V, E]): Boolean = js.native
  def end(): Unit = js.native
  def error(e: E): Boolean = js.native
  def event(event: Event[V, E]): Boolean = js.native
  def value(value: V): Boolean = js.native
}

object Emitter {
  @scala.inline
  def apply[V, E](
    emit: V => Boolean,
    emitEvent: Event[V, E] => Boolean,
    end: () => Unit,
    error: E => Boolean,
    event: Event[V, E] => Boolean,
    value: V => Boolean
  ): Emitter[V, E] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), emitEvent = js.Any.fromFunction1(emitEvent), end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), event = js.Any.fromFunction1(event), value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[Emitter[V, E]]
  }
  @scala.inline
  implicit class EmitterOps[Self[v, e] <: Emitter[v, e], V, E] (val x: Self[V, E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V, E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V, E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[V, E]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[V, E]) with Other]
    @scala.inline
    def withEmit(value: V => Boolean): Self[V, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmitEvent(value: Event[V, E] => Boolean): Self[V, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnd(value: () => Unit): Self[V, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withError(value: E => Boolean): Self[V, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEvent(value: Event[V, E] => Boolean): Self[V, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: V => Boolean): Self[V, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

