package typingsSlinky.googleapisCommon.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoveryOptions extends js.Object {
  var debug: js.UndefOr[Boolean] = js.native
  var includePrivate: js.UndefOr[Boolean] = js.native
}

object DiscoveryOptions {
  @scala.inline
  def apply(): DiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoveryOptions]
  }
  @scala.inline
  implicit class DiscoveryOptionsOps[Self <: DiscoveryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludePrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePrivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludePrivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePrivate")(js.undefined)
        ret
    }
  }
  
}

