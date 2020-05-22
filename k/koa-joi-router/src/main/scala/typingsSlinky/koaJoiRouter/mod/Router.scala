package typingsSlinky.koaJoiRouter.mod

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koaJoiRouter.anon.FnCall
import typingsSlinky.koaRouter.mod.IMiddleware
import typingsSlinky.koaRouter.mod.IParamMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  @JSName("delete")
  var delete_Original: Method = js.native
  @JSName("get")
  var get_Original: Method = js.native
  @JSName("head")
  var head_Original: Method = js.native
  @JSName("options")
  var options_Original: Method = js.native
  @JSName("param")
  var param_Original: js.Function2[
    /* param */ String, 
    /* middleware */ IParamMiddleware[_, js.Object], 
    typingsSlinky.koaRouter.mod.Router[_, js.Object]
  ] = js.native
  @JSName("patch")
  var patch_Original: Method = js.native
  @JSName("post")
  var post_Original: Method = js.native
  @JSName("prefix")
  var prefix_Original: js.Function1[/* prefix */ String, typingsSlinky.koaRouter.mod.Router[_, js.Object]] = js.native
  @JSName("put")
  var put_Original: Method = js.native
  var routes: js.Array[Spec] = js.native
  @JSName("use")
  var use_Original: FnCall = js.native
  def delete(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def delete(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def delete(path: js.RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def delete(path: js.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def get(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def get(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def get(path: js.RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def get(path: js.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def head(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def head(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def head(path: js.RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def head(path: js.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def middleware(): Middleware[DefaultState, DefaultContext] = js.native
  def options(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def options(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def options(path: js.RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def options(path: js.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def param(param: String, middleware: IParamMiddleware[_, js.Object]): typingsSlinky.koaRouter.mod.Router[_, js.Object] = js.native
  def patch(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def patch(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def patch(path: js.RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def patch(path: js.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def post(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def post(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def post(path: js.RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def post(path: js.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def prefix(prefix: String): typingsSlinky.koaRouter.mod.Router[_, js.Object] = js.native
  def put(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def put(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def put(path: js.RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def put(path: js.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def route(spec: js.Array[Spec]): Router = js.native
  def route(spec: Spec): Router = js.native
  def use(middleware: (IMiddleware[_, js.Object])*): typingsSlinky.koaRouter.mod.Router[_, js.Object] = js.native
  def use(path: String, middleware: (IMiddleware[_, js.Object])*): typingsSlinky.koaRouter.mod.Router[_, js.Object] = js.native
  def use(path: js.Array[String], middleware: (IMiddleware[_, js.Object])*): typingsSlinky.koaRouter.mod.Router[_, js.Object] = js.native
  def use(path: js.RegExp, middleware: (IMiddleware[_, js.Object])*): typingsSlinky.koaRouter.mod.Router[_, js.Object] = js.native
}

