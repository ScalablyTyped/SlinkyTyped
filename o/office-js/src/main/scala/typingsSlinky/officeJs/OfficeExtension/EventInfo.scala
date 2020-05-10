package typingsSlinky.officeJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventInfo[T] extends js.Object {
  def eventArgsTransformFunc(args: js.Any): js.Promise[T] = js.native
  def registerFunc(callback: js.Function1[/* args */ js.Any, Unit]): js.Promise[_] = js.native
  def unregisterFunc(callback: js.Function1[/* args */ js.Any, Unit]): js.Promise[_] = js.native
}

object EventInfo {
  @scala.inline
  def apply[T](
    eventArgsTransformFunc: js.Any => js.Promise[T],
    registerFunc: js.Function1[/* args */ js.Any, Unit] => js.Promise[_],
    unregisterFunc: js.Function1[/* args */ js.Any, Unit] => js.Promise[_]
  ): EventInfo[T] = {
    val __obj = js.Dynamic.literal(eventArgsTransformFunc = js.Any.fromFunction1(eventArgsTransformFunc), registerFunc = js.Any.fromFunction1(registerFunc), unregisterFunc = js.Any.fromFunction1(unregisterFunc))
    __obj.asInstanceOf[EventInfo[T]]
  }
  @scala.inline
  implicit class EventInfoOps[Self[t] <: EventInfo[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEventArgsTransformFunc(value: js.Any => js.Promise[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventArgsTransformFunc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterFunc(value: js.Function1[/* args */ js.Any, Unit] => js.Promise[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerFunc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnregisterFunc(value: js.Function1[/* args */ js.Any, Unit] => js.Promise[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregisterFunc")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

