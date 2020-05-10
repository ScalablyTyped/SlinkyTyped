package typingsSlinky.expressRedisCache.mod.expressServeStaticCoreAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var express_redis_cache_name: js.UndefOr[String] = js.native
  var use_express_redis_cache: js.UndefOr[Boolean] = js.native
}

object Response {
  @scala.inline
  def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpress_redis_cache_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("express_redis_cache_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpress_redis_cache_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("express_redis_cache_name")(js.undefined)
        ret
    }
    @scala.inline
    def withUse_express_redis_cache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_express_redis_cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse_express_redis_cache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_express_redis_cache")(js.undefined)
        ret
    }
  }
  
}

