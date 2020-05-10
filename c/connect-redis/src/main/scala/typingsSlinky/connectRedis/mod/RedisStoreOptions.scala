package typingsSlinky.connectRedis.mod

import typingsSlinky.expressSession.mod._Global_.Express.SessionData
import typingsSlinky.ioredis.mod.Redis
import typingsSlinky.redis.mod.RedisClient
import typingsSlinky.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedisStoreOptions extends js.Object {
  var client: js.UndefOr[RedisClient | Redis] = js.native
  var db: js.UndefOr[Double] = js.native
  var disableTTL: js.UndefOr[Boolean] = js.native
  var disableTouch: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String] = js.native
  var logErrors: js.UndefOr[Boolean | (js.Function1[/* error */ String, Unit])] = js.native
  var pass: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var prefix: js.UndefOr[String] = js.native
  var scanCount: js.UndefOr[Double] = js.native
  var serializer: js.UndefOr[Serializer | JSON] = js.native
  var socket: js.UndefOr[String] = js.native
  var ttl: js.UndefOr[
    Double | String | (js.Function3[/* store */ RedisStore, /* sess */ SessionData, /* sid */ String, Double])
  ] = js.native
  var unref: js.UndefOr[Boolean] = js.native
  var url: js.UndefOr[String] = js.native
}

object RedisStoreOptions {
  @scala.inline
  def apply(): RedisStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedisStoreOptions]
  }
  @scala.inline
  implicit class RedisStoreOptionsOps[Self <: RedisStoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: RedisClient | Redis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withDb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTTL")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withLogErrorsFunction1(value: /* error */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logErrors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLogErrors(value: Boolean | (js.Function1[/* error */ String, Unit])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withPass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
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
    def withScanCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializer(value: Serializer | JSON): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializer")(js.undefined)
        ret
    }
    @scala.inline
    def withSocket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(js.undefined)
        ret
    }
    @scala.inline
    def withTtlFunction3(value: (/* store */ RedisStore, /* sess */ SessionData, /* sid */ String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTtl(
      value: Double | String | (js.Function3[/* store */ RedisStore, /* sess */ SessionData, /* sid */ String, Double])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
    @scala.inline
    def withUnref(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unref")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

