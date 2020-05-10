package typingsSlinky.reactRelay

import typingsSlinky.reactRelay.mod.FetchPolicy
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCacheConfig extends js.Object {
  var cacheConfig: js.UndefOr[CacheConfig | Null] = js.native
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.native
}

object AnonCacheConfig {
  @scala.inline
  def apply(): AnonCacheConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCacheConfig]
  }
  @scala.inline
  implicit class AnonCacheConfigOps[Self <: AnonCacheConfig] (val x: Self) extends AnyVal {
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
    def withCacheConfigNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheConfig")(null)
        ret
    }
    @scala.inline
    def withFetchPolicy(value: FetchPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(js.undefined)
        ret
    }
  }
  
}

