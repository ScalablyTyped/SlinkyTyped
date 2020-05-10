package typingsSlinky.rollingRateLimiter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithRedisOptions extends GeneralOptions {
  var namespace: js.UndefOr[String] = js.native
  var redis: CompatibleRedisClient = js.native
}

object WithRedisOptions {
  @scala.inline
  def apply(interval: Double, maxInInterval: Double, redis: CompatibleRedisClient): WithRedisOptions = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], maxInInterval = maxInInterval.asInstanceOf[js.Any], redis = redis.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithRedisOptions]
  }
  @scala.inline
  implicit class WithRedisOptionsOps[Self <: WithRedisOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedis(value: CompatibleRedisClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
  }
  
}

