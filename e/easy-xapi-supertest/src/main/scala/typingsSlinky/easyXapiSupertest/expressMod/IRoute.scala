package typingsSlinky.easyXapiSupertest.expressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRoute extends js.Object {
  var path: String = js.native
  var stack: js.Any = js.native
  def all(handler: RequestHandler*): IRoute = js.native
  def delete(handler: RequestHandler*): IRoute = js.native
  def get(handler: RequestHandler*): IRoute = js.native
  def options(handler: RequestHandler*): IRoute = js.native
  def patch(handler: RequestHandler*): IRoute = js.native
  def post(handler: RequestHandler*): IRoute = js.native
  def put(handler: RequestHandler*): IRoute = js.native
}

object IRoute {
  @scala.inline
  def apply(
    all: /* repeated */ RequestHandler => IRoute,
    delete: /* repeated */ RequestHandler => IRoute,
    get: /* repeated */ RequestHandler => IRoute,
    options: /* repeated */ RequestHandler => IRoute,
    patch: /* repeated */ RequestHandler => IRoute,
    path: String,
    post: /* repeated */ RequestHandler => IRoute,
    put: /* repeated */ RequestHandler => IRoute,
    stack: js.Any
  ): IRoute = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction1(all), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), options = js.Any.fromFunction1(options), patch = js.Any.fromFunction1(patch), path = path.asInstanceOf[js.Any], post = js.Any.fromFunction1(post), put = js.Any.fromFunction1(put), stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRoute]
  }
  @scala.inline
  implicit class IRouteOps[Self <: IRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: /* repeated */ RequestHandler => IRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: /* repeated */ RequestHandler => IRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: /* repeated */ RequestHandler => IRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptions(value: /* repeated */ RequestHandler => IRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: /* repeated */ RequestHandler => IRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPost(value: /* repeated */ RequestHandler => IRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPut(value: /* repeated */ RequestHandler => IRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStack(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

