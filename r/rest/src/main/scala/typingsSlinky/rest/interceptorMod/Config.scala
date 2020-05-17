package typingsSlinky.rest.interceptorMod

import typingsSlinky.rest.mod.Meta
import typingsSlinky.rest.mod.Request
import typingsSlinky.rest.mod.Response
import typingsSlinky.when.When.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config[T, U] extends js.Object {
  var error: js.UndefOr[
    js.Function3[/* response */ Response, /* config */ U, /* meta */ Meta, Response | Promise[Response]]
  ] = js.native
  var init: js.UndefOr[js.Function1[/* config */ T, U]] = js.native
  var request: js.UndefOr[
    js.Function3[/* request */ Request, /* config */ U, /* meta */ Meta, Request | Promise[Request]]
  ] = js.native
  var response: js.UndefOr[
    js.Function3[/* response */ Response, /* config */ U, /* meta */ Meta, Response | Promise[Response]]
  ] = js.native
  var success: js.UndefOr[
    js.Function3[/* response */ Response, /* config */ U, /* meta */ Meta, Response | Promise[Response]]
  ] = js.native
}

object Config {
  @scala.inline
  def apply[T, U](): Config[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config[T, U]]
  }
  @scala.inline
  implicit class ConfigOps[Self[t, u] <: Config[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withError(value: (/* response */ Response, /* config */ U, /* meta */ Meta) => Response | Promise[Response]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutError: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: /* config */ T => U): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInit: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: (/* request */ Request, /* config */ U, /* meta */ Meta) => Request | Promise[Request]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRequest: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: (/* response */ Response, /* config */ U, /* meta */ Meta) => Response | Promise[Response]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutResponse: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: (/* response */ Response, /* config */ U, /* meta */ Meta) => Response | Promise[Response]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

