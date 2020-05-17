package typingsSlinky.officeJsPreview.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventHandlers[T] extends js.Object {
  def add(handler: js.Function1[/* args */ T, js.Promise[_]]): EventHandlerResult[T] = js.native
  def remove(handler: js.Function1[/* args */ T, js.Promise[_]]): Unit = js.native
}

object EventHandlers {
  @scala.inline
  def apply[T](
    add: js.Function1[/* args */ T, js.Promise[_]] => EventHandlerResult[T],
    remove: js.Function1[/* args */ T, js.Promise[_]] => Unit
  ): EventHandlers[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[EventHandlers[T]]
  }
  @scala.inline
  implicit class EventHandlersOps[Self[t] <: EventHandlers[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAdd(value: js.Function1[/* args */ T, js.Promise[_]] => EventHandlerResult[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: js.Function1[/* args */ T, js.Promise[_]] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

