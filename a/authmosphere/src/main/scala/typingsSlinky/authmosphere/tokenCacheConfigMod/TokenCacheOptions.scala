package typingsSlinky.authmosphere.tokenCacheConfigMod

import typingsSlinky.authmosphere.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenCacheOptions extends js.Object {
  var cacheConfig: js.UndefOr[CacheConfig] = js.native
  var logger: js.UndefOr[Logger] = js.native
}

object TokenCacheOptions {
  @scala.inline
  def apply(): TokenCacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenCacheOptions]
  }
  @scala.inline
  implicit class TokenCacheOptionsOps[Self <: TokenCacheOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheConfig(value: CacheConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
  }
  
}

