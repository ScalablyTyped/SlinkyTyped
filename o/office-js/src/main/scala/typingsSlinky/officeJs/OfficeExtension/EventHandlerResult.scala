package typingsSlinky.officeJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventHandlerResult[T] extends js.Object {
  /** The request context associated with the object */
  var context: ClientRequestContext = js.native
  def remove(): Unit = js.native
}

object EventHandlerResult {
  @scala.inline
  def apply[T](context: ClientRequestContext, remove: () => Unit): EventHandlerResult[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[EventHandlerResult[T]]
  }
  @scala.inline
  implicit class EventHandlerResultOps[Self[t] <: EventHandlerResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withContext(value: ClientRequestContext): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

