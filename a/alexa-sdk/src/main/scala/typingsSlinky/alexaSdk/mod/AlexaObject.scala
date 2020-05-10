package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlexaObject[T /* <: Request */] extends Handler_[T] {
  var _callback: js.Any = js.native
  var _context: js.Any = js.native
  var _event: js.Any = js.native
  var appId: js.Any = js.native
  var dynamoDBTableName: js.Any = js.native
  var resources: js.Any = js.native
  var saveBeforeResponse: Boolean = js.native
  def execute(): Unit = js.native
  def registerHandlers(handlers: Handlers[T]*): js.Any = js.native
}

object AlexaObject {
  @scala.inline
  def apply[T](
    _callback: js.Any,
    _context: js.Any,
    _event: js.Any,
    appId: js.Any,
    attributes: js.Any,
    callback: js.Any => Unit,
    context: js.Any,
    dynamoDBTableName: js.Any,
    emit: (String, /* repeated */ js.Any) => Boolean,
    emitWithState: js.Any,
    event: RequestBody[T],
    execute: () => Unit,
    handler: js.Any,
    i18n: js.Any,
    isOverriden: js.Any,
    locale: js.Any,
    name: js.Any,
    on: js.Any,
    registerHandlers: /* repeated */ Handlers[T] => js.Any,
    resources: js.Any,
    response: ResponseBuilder,
    saveBeforeResponse: Boolean,
    state: js.Any,
    t: (String, /* repeated */ js.Any) => Unit
  ): AlexaObject[T] = {
    val __obj = js.Dynamic.literal(_callback = _callback.asInstanceOf[js.Any], _context = _context.asInstanceOf[js.Any], _event = _event.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], callback = js.Any.fromFunction1(callback), context = context.asInstanceOf[js.Any], dynamoDBTableName = dynamoDBTableName.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit), emitWithState = emitWithState.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], execute = js.Any.fromFunction0(execute), handler = handler.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], isOverriden = isOverriden.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], registerHandlers = js.Any.fromFunction1(registerHandlers), resources = resources.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], saveBeforeResponse = saveBeforeResponse.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], t = js.Any.fromFunction2(t))
    __obj.asInstanceOf[AlexaObject[T]]
  }
  @scala.inline
  implicit class AlexaObjectOps[Self[t] <: AlexaObject[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_callback(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_context(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_event(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppId(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDynamoDBTableName(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamoDBTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecute(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterHandlers(value: /* repeated */ Handlers[T] => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerHandlers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResources(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveBeforeResponse(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveBeforeResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

