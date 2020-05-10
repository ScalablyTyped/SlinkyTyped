package typingsSlinky.elm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortFromElm[V] extends js.Object {
  def subscribe(handler: js.Function1[/* value */ V, Unit]): Unit = js.native
  def unsubscribe(handler: js.Function1[/* value */ V, Unit]): Unit = js.native
}

object PortFromElm {
  @scala.inline
  def apply[V](
    subscribe: js.Function1[/* value */ V, Unit] => Unit,
    unsubscribe: js.Function1[/* value */ V, Unit] => Unit
  ): PortFromElm[V] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[PortFromElm[V]]
  }
  @scala.inline
  implicit class PortFromElmOps[Self[v] <: PortFromElm[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withSubscribe(value: js.Function1[/* value */ V, Unit] => Unit): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnsubscribe(value: js.Function1[/* value */ V, Unit] => Unit): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

