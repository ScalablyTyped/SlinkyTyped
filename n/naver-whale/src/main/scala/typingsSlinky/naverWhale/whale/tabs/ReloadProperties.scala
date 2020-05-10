package typingsSlinky.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReloadProperties extends js.Object {
  /** Optional. Whether using any local cache. Default is false. */
  var bypassCache: js.UndefOr[Boolean] = js.native
}

object ReloadProperties {
  @scala.inline
  def apply(): ReloadProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReloadProperties]
  }
  @scala.inline
  implicit class ReloadPropertiesOps[Self <: ReloadProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBypassCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBypassCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassCache")(js.undefined)
        ret
    }
  }
  
}

