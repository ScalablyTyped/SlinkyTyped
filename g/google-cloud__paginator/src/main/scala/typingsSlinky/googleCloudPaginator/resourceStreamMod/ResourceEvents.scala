package typingsSlinky.googleCloudPaginator.resourceStreamMod

import typingsSlinky.googleCloudPaginator.googleCloudPaginatorStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceEvents[T] extends js.Object {
  @JSName("addListener")
  def addListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
  @JSName("emit")
  def emit_data(event: data, data: T): Boolean = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
}

object ResourceEvents {
  @scala.inline
  def apply[T](
    addListener: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
    emit: (data, T) => Boolean,
    on: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
    once: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
    prependListener: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
    prependOnceListener: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
    removeListener: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]
  ): ResourceEvents[T] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener), removeListener = js.Any.fromFunction2(removeListener))
    __obj.asInstanceOf[ResourceEvents[T]]
  }
  @scala.inline
  implicit class ResourceEventsOps[Self[t] <: ResourceEvents[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAddListener(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEmit(value: (data, T) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnce(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPrependListener(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPrependOnceListener(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependOnceListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveListener(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

