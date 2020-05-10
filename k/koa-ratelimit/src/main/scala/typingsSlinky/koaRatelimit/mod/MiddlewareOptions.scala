package typingsSlinky.koaRatelimit.mod

import typingsSlinky.ioredis.mod.Redis
import typingsSlinky.koa.mod.Context
import typingsSlinky.koaRatelimit.koaRatelimitBooleans.`false`
import typingsSlinky.koaRatelimit.koaRatelimitStrings.memory
import typingsSlinky.koaRatelimit.koaRatelimitStrings.redis
import typingsSlinky.redis.mod.RedisClient
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiddlewareOptions extends js.Object {
  /**
    * The database powering the backing rate-limiter package.
    */
  var db: Redis | RedisClient | (Map[_, _]) = js.native
  /**
    * Whether or not to disable the usage of rate limit headers. This defaults
    * to **false**.
    */
  var disableHeader: js.UndefOr[Boolean] = js.native
  /**
    * Driver to use ("redis" or "memory").
    */
  var driver: redis | memory = js.native
  /**
    * The length of a single limiting period. This value is expressed
    * in milliseconds, defaulting to one hour.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * The message used on the response body if a client is rate-limited. There is
    * a default message; which includes when they should try again.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * A relation of header to the header's display name.
    */
  var headers: js.UndefOr[HeaderNameOptions] = js.native
  /**
    * Get the unique-identifier for a request. This defaults to the
    * client's IP address. Returning "false" will skip rate-limiting.
    */
  var id: js.UndefOr[js.Function1[/* context */ Context, String | `false`]] = js.native
  /**
    * The maximum amount of requests a client (see the `id` field) may
    * make during a limiting period. (see `duration`)
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * Whether or not to throw an error upon being rate-limited. This uses
    * the Koa context function "throw".
    */
  var `throw`: js.UndefOr[Boolean] = js.native
}

object MiddlewareOptions {
  @scala.inline
  def apply(db: Redis | RedisClient | (Map[_, _]), driver: redis | memory): MiddlewareOptions = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareOptions]
  }
  @scala.inline
  implicit class MiddlewareOptionsOps[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDb(value: Redis | RedisClient | (Map[_, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDriver(value: redis | memory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: HeaderNameOptions): Self = {
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
    def withId(value: /* context */ Context => String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withThrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throw")(js.undefined)
        ret
    }
  }
  
}

