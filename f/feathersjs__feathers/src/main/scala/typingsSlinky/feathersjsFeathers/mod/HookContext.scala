package typingsSlinky.feathersjsFeathers.mod

import typingsSlinky.feathersjsFeathers.feathersjsFeathersStrings.after
import typingsSlinky.feathersjsFeathers.feathersjsFeathersStrings.before
import typingsSlinky.feathersjsFeathers.feathersjsFeathersStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookContext[T] extends js.Object {
  /**
    * A read only property that contains the Feathers application object. This can be used to
    * retrieve other services (via context.app.service('name')) or configuration values.
    */
  val app: Application[js.Object] = js.native
  /**
    * A writeable property containing the data of a create, update and patch service
    * method call.
    */
  var data: js.UndefOr[T] = js.native
  /**
    * A writeable, optional property and contains a "safe" version of the data that
    * should be sent to any client. If context.dispatch has not been set context.result
    * will be sent to the client instead.
    */
  var dispatch: js.UndefOr[T] = js.native
  /**
    * A writeable property with the error object that was thrown in a failed method call.
    * It is only available in error hooks.
    */
  var error: js.UndefOr[js.Any] = js.native
  /**
    * A writeable property and the id for a get, remove, update and patch service
    * method call. For remove, update and patch context.id can also be null when
    * modifying multiple entries. In all other cases it will be undefined.
    */
  var id: js.UndefOr[String | Double] = js.native
  /**
    * A read only property with the name of the service method (one of find, get,
    * create, update, patch, remove).
    */
  val method: String = js.native
  /**
    * A writeable property that contains the service method parameters (including
    * params.query).
    */
  var params: Params = js.native
  /**
    * A read only property and contains the service name (or path) without leading or
    * trailing slashes.
    */
  val path: String = js.native
  /**
    * A writeable property containing the result of the successful service method call.
    * It is only available in after hooks.
    *
    * `context.result` can also be set in
    *
    *  - A before hook to skip the actual service method (database) call
    *  - An error hook to swallow the error and return a result instead
    */
  var result: js.UndefOr[T] = js.native
  /**
    * A read only property and contains the service this hook currently runs on.
    */
  val service: Service[T] = js.native
  /**
    * A writeable, optional property that allows to override the standard HTTP status
    * code that should be returned.
    */
  var statusCode: js.UndefOr[Double] = js.native
  /**
    * A read only property with the hook type (one of before, after or error).
    */
  val `type`: before | after | error = js.native
}

object HookContext {
  @scala.inline
  def apply[T](
    app: Application[js.Object],
    method: String,
    params: Params,
    path: String,
    service: Service[T],
    `type`: before | after | error
  ): HookContext[T] = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookContext[T]]
  }
  @scala.inline
  implicit class HookContextOps[Self[t] <: HookContext[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withApp(value: Application[js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: Params): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withService(value: Service[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: before | after | error): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDispatch(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDispatch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String | Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
  }
  
}

