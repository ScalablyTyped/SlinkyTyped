package typingsSlinky.reactAdaptiveHooks.mediaCapabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConfigurationInfo extends js.Object {
  var powerEfficient: Boolean = js.native
  var smooth: Boolean = js.native
  var supported: Boolean = js.native
}

object MediaConfigurationInfo {
  @scala.inline
  def apply(powerEfficient: Boolean, smooth: Boolean, supported: Boolean): MediaConfigurationInfo = {
    val __obj = js.Dynamic.literal(powerEfficient = powerEfficient.asInstanceOf[js.Any], smooth = smooth.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigurationInfo]
  }
  @scala.inline
  implicit class MediaConfigurationInfoOps[Self <: MediaConfigurationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPowerEfficient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerEfficient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmooth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

