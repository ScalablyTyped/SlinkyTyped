package typingsSlinky.dustjsLinkedin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream_ extends js.Object {
  def emit(evt: String, data: js.Any): Unit = js.native
  def flush(): Unit = js.native
  /*
    * Registers an event listener. Streams accept a single listener for a given event.
    * @param evt the event. Possible values are data, end, error (maybe more, look in the source).
    */
  def on(evt: String, callback: js.Function1[/* data */ js.UndefOr[js.Any], _]): this.type = js.native
  def pipe(stream: Stream_): Stream_ = js.native
}

object Stream_ {
  @scala.inline
  def apply(
    emit: (String, js.Any) => Unit,
    flush: () => Unit,
    on: (String, js.Function1[/* data */ js.UndefOr[js.Any], _]) => Stream_,
    pipe: Stream_ => Stream_
  ): Stream_ = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), flush = js.Any.fromFunction0(flush), on = js.Any.fromFunction2(on), pipe = js.Any.fromFunction1(pipe))
    __obj.asInstanceOf[Stream_]
  }
  @scala.inline
  implicit class Stream_Ops[Self <: Stream_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmit(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Function1[/* data */ js.UndefOr[js.Any], _]) => Stream_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPipe(value: Stream_ => Stream_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

