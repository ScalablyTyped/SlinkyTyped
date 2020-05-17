package typingsSlinky.reactRelay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheConfig extends js.Object {
  var cacheConfig: js.UndefOr[typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig | Null] = js.native
  var fetchPolicy: js.UndefOr[typingsSlinky.reactRelay.mod.FetchPolicy] = js.native
}

object CacheConfig {
  @scala.inline
  def apply(): CacheConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheConfig]
  }
  @scala.inline
  implicit class CacheConfigOps[Self <: CacheConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheConfig(value: typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig): Self = {
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
    def withFetchPolicy(value: typingsSlinky.reactRelay.mod.FetchPolicy): Self = {
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

