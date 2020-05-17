package typingsSlinky.reactRelay.anon

import typingsSlinky.reactRelay.queryResourceMod.RenderPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchKey extends js.Object {
  var fetchKey: js.UndefOr[String | Double] = js.native
  var fetchPolicy: js.UndefOr[typingsSlinky.reactRelay.queryResourceMod.FetchPolicy] = js.native
  var networkCacheConfig: js.UndefOr[typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig] = js.native
  var renderPolicy_UNSTABLE: js.UndefOr[RenderPolicy] = js.native
}

object FetchKey {
  @scala.inline
  def apply(): FetchKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchKey]
  }
  @scala.inline
  implicit class FetchKeyOps[Self <: FetchKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetchKey(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchPolicy(value: typingsSlinky.reactRelay.queryResourceMod.FetchPolicy): Self = {
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
    @scala.inline
    def withNetworkCacheConfig(value: typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig): Self = {
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
    @scala.inline
    def withRenderPolicy_UNSTABLE(value: RenderPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPolicy_UNSTABLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderPolicy_UNSTABLE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPolicy_UNSTABLE")(js.undefined)
        ret
    }
  }
  
}

