package typingsSlinky.pulumiCloud.topicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream[T] extends js.Object {
  /**
    * Subscribe to items published to this stream.
    *
    * Each subscription receives all items published to the stream. If a
    * subscription handler returns a failed promise, the subscription handler
    * may be retried some number of times.  If no retry is successful, the item
    * will be sent to the global error handler.  Note that as a result,
    * subscription handlers must ensure they can safely be retried.
    *
    * @param name The name of the subscription.
    * @param handler A callback to handle each item published to the stream.
    */
  def subscribe(name: String, handler: js.Function1[/* item */ T, js.Promise[Unit]]): Unit = js.native
}

object Stream {
  @scala.inline
  def apply[T](subscribe: (String, js.Function1[/* item */ T, js.Promise[Unit]]) => Unit): Stream[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe))
    __obj.asInstanceOf[Stream[T]]
  }
  @scala.inline
  implicit class StreamOps[Self[t] <: Stream[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSubscribe(value: (String, js.Function1[/* item */ T, js.Promise[Unit]]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

