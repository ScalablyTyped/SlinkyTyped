package typingsSlinky.doubleclickGpt.googletag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafeFrameConfig extends js.Object {
  var allowOverlayExpansion: js.UndefOr[Boolean] = js.native
  var allowPushExpansion: js.UndefOr[Boolean] = js.native
  var sandbox: js.UndefOr[Boolean] = js.native
}

object SafeFrameConfig {
  @scala.inline
  def apply(): SafeFrameConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeFrameConfig]
  }
  @scala.inline
  implicit class SafeFrameConfigOps[Self <: SafeFrameConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowOverlayExpansion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverlayExpansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOverlayExpansion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverlayExpansion")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowPushExpansion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPushExpansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPushExpansion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPushExpansion")(js.undefined)
        ret
    }
    @scala.inline
    def withSandbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSandbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(js.undefined)
        ret
    }
  }
  
}

