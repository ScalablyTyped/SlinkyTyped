package typingsSlinky.bull.mod

import typingsSlinky.bull.bullStrings.bclient
import typingsSlinky.bull.bullStrings.client
import typingsSlinky.bull.bullStrings.subscriber
import typingsSlinky.ioredis.mod.Cluster
import typingsSlinky.ioredis.mod.Redis
import typingsSlinky.ioredis.mod.RedisOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueOptions extends js.Object {
  /**
    * When specified, the `Queue` will use this function to create new `ioredis` client connections.
    * This is useful if you want to re-use connections or connect to a Redis cluster.
    */
  var createClient: js.UndefOr[
    js.Function2[
      /* type */ client | subscriber | bclient, 
      /* redisOpts */ js.UndefOr[RedisOptions], 
      Redis | Cluster
    ]
  ] = js.native
  var defaultJobOptions: js.UndefOr[JobOptions] = js.native
  var limiter: js.UndefOr[RateLimiter] = js.native
  /**
    * Prefix to use for all redis keys
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Options passed directly to the `ioredis` constructor
    */
  var redis: js.UndefOr[RedisOptions | String] = js.native
  var settings: js.UndefOr[AdvancedSettings] = js.native
}

object QueueOptions {
  @scala.inline
  def apply(): QueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueOptions]
  }
  @scala.inline
  implicit class QueueOptionsOps[Self <: QueueOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateClient(
      value: (/* type */ client | subscriber | bclient, /* redisOpts */ js.UndefOr[RedisOptions]) => Redis | Cluster
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createClient")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreateClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createClient")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultJobOptions(value: JobOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultJobOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultJobOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultJobOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLimiter(value: RateLimiter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limiter")(js.undefined)
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
    def withRedis(value: RedisOptions | String): Self = {
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
    def withSettings(value: AdvancedSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
  }
  
}

