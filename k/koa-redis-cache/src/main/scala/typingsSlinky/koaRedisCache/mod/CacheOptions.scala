package typingsSlinky.koaRedisCache.mod

import typingsSlinky.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheOptions extends js.Object {
  /**
    * the routes to exclude, default is [].
    * example: ['/api/(.*)', '/view/:id']
    */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * redis expire time (second), default is 30 * 60 (30 min)
    */
  var expire: js.UndefOr[Double] = js.native
  /**
    * max length of body size (in bytes) to cache.
    * if the size of the body exceeds maxLength, the body will not be cached.
    * default is: Infinity
    */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * callback function for error, default is function() {}
    */
  var onerror: js.UndefOr[onErrorCallback] = js.native
  /**
    * if the passParam exists in the query string, skip the cache
    */
  var passParam: js.UndefOr[String] = js.native
  /**
    * redis key prefix, default is koa-redis-cache:
    * If a function is supplied, its signature should be function(ctx) {} and it should return a string to use as the redis key prefix
    */
  var prefix: js.UndefOr[String | getPrefixCallback] = js.native
  /**
    * redis options
    */
  var redis: js.UndefOr[RedisOptions] = js.native
  /**
    * the routes to cache, default is ['(.*)'].
    * can be set to an array of routes (string), or an array of RouteOptions
    */
  var routes: js.UndefOr[js.Array[RouteOptions | String]] = js.native
}

object CacheOptions {
  @scala.inline
  def apply(): CacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheOptions]
  }
  @scala.inline
  implicit class CacheOptionsOps[Self <: CacheOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withExpire(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expire")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expire")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withPassParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passParam")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixFunction1(value: /* ctx */ Context => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrefix(value: String | getPrefixCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withRedis(value: RedisOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redis")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutes(value: js.Array[RouteOptions | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(js.undefined)
        ret
    }
  }
  
}

