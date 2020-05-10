package typingsSlinky.entriaRelayExperimental

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNetworkCacheConfig extends js.Object {
  var networkCacheConfig: js.UndefOr[CacheConfig] = js.native
}

object AnonNetworkCacheConfig {
  @scala.inline
  def apply(): AnonNetworkCacheConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNetworkCacheConfig]
  }
  @scala.inline
  implicit class AnonNetworkCacheConfigOps[Self <: AnonNetworkCacheConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkCacheConfig(value: CacheConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkCacheConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkCacheConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkCacheConfig")(js.undefined)
        ret
    }
  }
  
}

