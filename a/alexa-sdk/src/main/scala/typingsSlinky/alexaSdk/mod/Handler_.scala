package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler_[T /* <: Request */] extends js.Object {
  var attributes: js.Any = js.native
  var context: js.Any = js.native
  var emitWithState: js.Any = js.native
  var event: RequestBody[T] = js.native
  var handler: js.Any = js.native
  var i18n: js.Any = js.native
  var isOverriden: js.Any = js.native
  var locale: js.Any = js.native
  var name: js.Any = js.native
  var on: js.Any = js.native
  var response: ResponseBuilder = js.native
  var state: js.Any = js.native
  def callback(param: js.Any): Unit = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def t(token: String, args: js.Any*): Unit = js.native
}

object Handler_ {
  @scala.inline
  def apply[T](
    attributes: js.Any,
    callback: js.Any => Unit,
    context: js.Any,
    emit: (String, /* repeated */ js.Any) => Boolean,
    emitWithState: js.Any,
    event: RequestBody[T],
    handler: js.Any,
    i18n: js.Any,
    isOverriden: js.Any,
    locale: js.Any,
    name: js.Any,
    on: js.Any,
    response: ResponseBuilder,
    state: js.Any,
    t: (String, /* repeated */ js.Any) => Unit
  ): Handler_[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], callback = js.Any.fromFunction1(callback), context = context.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit), emitWithState = emitWithState.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], isOverriden = isOverriden.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], t = js.Any.fromFunction2(t))
    __obj.asInstanceOf[Handler_[T]]
  }
  @scala.inline
  implicit class Handler_Ops[Self[t] <: Handler_[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAttributes(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(value: js.Any => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmit(value: (String, /* repeated */ js.Any) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEmitWithState(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitWithState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: RequestBody[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandler(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withI18n(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOverriden(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOverriden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: ResponseBuilder): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT(value: (String, /* repeated */ js.Any) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

