package typingsSlinky.apolloServerCaching.keyValueCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyValueCacheSetOptions extends js.Object {
  var ttl: js.UndefOr[Double | Null] = js.native
}

object KeyValueCacheSetOptions {
  @scala.inline
  def apply(): KeyValueCacheSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValueCacheSetOptions]
  }
  @scala.inline
  implicit class KeyValueCacheSetOptionsOps[Self <: KeyValueCacheSetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTtl(value: Double): Self = {
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
    @scala.inline
    def withTtlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(null)
        ret
    }
  }
  
}

