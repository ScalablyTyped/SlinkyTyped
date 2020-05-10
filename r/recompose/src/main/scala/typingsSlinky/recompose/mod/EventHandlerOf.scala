package typingsSlinky.recompose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// createEventHandler: https://github.com/acdlite/recompose/blob/master/docs/API.md#createEventHandler
@js.native
trait EventHandlerOf[T, TSubs /* <: Subscribable[T] */] extends js.Object {
  var stream: TSubs = js.native
  def handler(value: T): Unit = js.native
}

object EventHandlerOf {
  @scala.inline
  def apply[T, TSubs](handler: T => Unit, stream: TSubs): EventHandlerOf[T, TSubs] = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventHandlerOf[T, TSubs]]
  }
  @scala.inline
  implicit class EventHandlerOfOps[Self[t, tsubs] <: EventHandlerOf[t, tsubs], T, TSubs] (val x: Self[T, TSubs]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, TSubs] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, TSubs]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, TSubs]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, TSubs]) with Other]
    @scala.inline
    def withHandler(value: T => Unit): Self[T, TSubs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStream(value: TSubs): Self[T, TSubs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

