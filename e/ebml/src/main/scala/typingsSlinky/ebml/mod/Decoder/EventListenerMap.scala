package typingsSlinky.ebml.mod.Decoder

import typingsSlinky.ebml.mod.StateAndTagData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventListenerMap extends js.Object {
  def close(): Unit = js.native
  def data(chunk: StateAndTagData): Unit = js.native
  def end(): Unit = js.native
  def error(err: js.Error): Unit = js.native
  def readable(): Unit = js.native
}

object EventListenerMap {
  @scala.inline
  def apply(
    close: () => Unit,
    data: StateAndTagData => Unit,
    end: () => Unit,
    error: js.Error => Unit,
    readable: () => Unit
  ): EventListenerMap = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), data = js.Any.fromFunction1(data), end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), readable = js.Any.fromFunction0(readable))
    __obj.asInstanceOf[EventListenerMap]
  }
  @scala.inline
  implicit class EventListenerMapOps[Self <: EventListenerMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withData(value: StateAndTagData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withError(value: js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReadable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readable")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

