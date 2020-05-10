package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CachingConfig extends js.Object {
  /**
    * The caching keys for a resolver that has caching enabled. Valid values are entries from the $context.identity and $context.arguments maps.
    */
  var cachingKeys: js.UndefOr[CachingKeys] = js.native
  /**
    * The TTL in seconds for a resolver that has caching enabled. Valid values are between 1 and 3600 seconds.
    */
  var ttl: js.UndefOr[Long] = js.native
}

object CachingConfig {
  @scala.inline
  def apply(): CachingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CachingConfig]
  }
  @scala.inline
  implicit class CachingConfigOps[Self <: CachingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCachingKeys(value: CachingKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachingKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachingKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachingKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Long): Self = {
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
  }
  
}

