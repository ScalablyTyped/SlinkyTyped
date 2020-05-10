package typingsSlinky.redisRateLimiter.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.redis.mod.RedisClient
import typingsSlinky.redisRateLimiter.redisRateLimiterStrings.ip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var deleteImmediatelyIfRaceCondition: js.UndefOr[Boolean] = js.native
  var key: ip | (js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]) = js.native
  var limit: js.UndefOr[Double] = js.native
  var onPossibleRaceCondition: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
  var rate: js.UndefOr[String] = js.native
  var redis: RedisClient = js.native
  var window: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(
    key: ip | (js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]),
    redis: RedisClient
  ): Options = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], redis = redis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyFunction1(value: /* req */ Request_[ParamsDictionary, _, _, Query] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKey(value: ip | (js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedis(value: RedisClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteImmediatelyIfRaceCondition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteImmediatelyIfRaceCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteImmediatelyIfRaceCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteImmediatelyIfRaceCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPossibleRaceCondition(value: /* key */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPossibleRaceCondition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPossibleRaceCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPossibleRaceCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(js.undefined)
        ret
    }
    @scala.inline
    def withWindow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(js.undefined)
        ret
    }
  }
  
}

