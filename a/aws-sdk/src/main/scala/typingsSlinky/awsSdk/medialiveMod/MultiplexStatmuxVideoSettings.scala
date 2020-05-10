package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexStatmuxVideoSettings extends js.Object {
  /**
    * Maximum statmux bitrate.
    */
  var MaximumBitrate: js.UndefOr[integerMin100000Max100000000] = js.native
  /**
    * Minimum statmux bitrate.
    */
  var MinimumBitrate: js.UndefOr[integerMin100000Max100000000] = js.native
}

object MultiplexStatmuxVideoSettings {
  @scala.inline
  def apply(): MultiplexStatmuxVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexStatmuxVideoSettings]
  }
  @scala.inline
  implicit class MultiplexStatmuxVideoSettingsOps[Self <: MultiplexStatmuxVideoSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumBitrate(value: integerMin100000Max100000000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumBitrate(value: integerMin100000Max100000000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumBitrate")(js.undefined)
        ret
    }
  }
  
}

