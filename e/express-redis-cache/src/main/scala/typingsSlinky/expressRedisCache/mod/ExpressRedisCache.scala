package typingsSlinky.expressRedisCache.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-redis-cache", "ExpressRedisCache")
@js.native
class ExpressRedisCache () extends EventEmitter {
  def this(options: Options) = this()
  
  val FOREVER: Double = js.native
  
  def add(name: String, body: String, callback: js.Function2[/* error */ js.Any, /* added */ Entry, Unit]): Unit = js.native
  def add(
    name: String,
    body: String,
    options: AddOptions,
    callback: js.Function2[/* error */ js.Any, /* added */ Entry, Unit]
  ): Unit = js.native
  
  var auth_pass: String = js.native
  
  var client: RedisClient = js.native
  
  var connected: Boolean = js.native
  
  def del(name: String, callback: js.Function2[/* error */ js.Any, /* deleted */ Double, Unit]): Unit = js.native
  
  var expire: Double = js.native
  
  def get(callback: js.Function2[/* error */ js.Any, /* entries */ js.Array[Entry], Unit]): Unit = js.native
  def get(name: String, callback: js.Function2[/* error */ js.Any, /* entries */ js.Array[Entry], Unit]): Unit = js.native
  
  var host: String = js.native
  
  var options: Options = js.native
  
  var port: String | Double = js.native
  
  var prefix: String = js.native
  
  def route(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def route(expire: Double): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def route(nameOrOptions: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def route(nameOrOptions: String, expire: ExpireOption): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def route(nameOrOptions: RouteOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def route(nameOrOptions: RouteOptions, expire: ExpireOption): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def size(callback: js.Function2[/* error */ js.Any, /* bytes */ Double, Unit]): Unit = js.native
}
/* static members */
@JSImport("express-redis-cache", "ExpressRedisCache")
@js.native
object ExpressRedisCache extends js.Object {
  
  def init(): ExpressRedisCache = js.native
  def init(options: Options): ExpressRedisCache = js.native
}
