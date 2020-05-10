package typingsSlinky.apicache.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apicache.AnonExclude
import typingsSlinky.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options_ extends js.Object {
  /** appendKey takes the req/res objects and returns a custom value to extend the cache key */
  var appendKey: js.UndefOr[js.Any] = js.native
  /** if true, enables console output */
  var debug: js.UndefOr[Boolean] = js.native
  /** should be either a number (in ms) or a string, defaults to 1 hour */
  var defaultDuration: js.UndefOr[String] = js.native
  /** if false, turns off caching globally (useful on dev) */
  var enabled: js.UndefOr[Boolean] = js.native
  /** list of headers that should never be cached */
  var headerBlacklist: js.UndefOr[js.Array[String]] = js.native
  /**
    * 'cache-control':  'no-cache' // example of header overwrite
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * if provided, uses the [node-redis](https://github.com/NodeRedis/node_redis) client instead of [memory-cache](https://github.com/ptarjan/node-cache)
    */
  var redisClient: js.UndefOr[RedisClient] = js.native
  var statusCodes: js.UndefOr[AnonExclude] = js.native
  /**
    * enable/disable performance tracking... WARNING: super cool feature, but may cause memory overhead issues
    */
  var trackPerformance: js.UndefOr[Boolean] = js.native
}

object Options_ {
  @scala.inline
  def apply(): Options_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options_]
  }
  @scala.inline
  implicit class Options_Ops[Self <: Options_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderBlacklist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBlacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBlacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withRedisClient(value: RedisClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redisClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedisClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redisClient")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCodes(value: AnonExclude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackPerformance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackPerformance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackPerformance")(js.undefined)
        ret
    }
  }
  
}

