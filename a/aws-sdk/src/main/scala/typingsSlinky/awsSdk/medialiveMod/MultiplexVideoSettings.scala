package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexVideoSettings extends js.Object {
  /**
    * The constant bitrate configuration for the video encode.
  When this field is defined, StatmuxSettings must be undefined.
    */
  var ConstantBitrate: js.UndefOr[integerMin100000Max100000000] = js.native
  /**
    * Statmux rate control settings.
  When this field is defined, ConstantBitrate must be undefined.
    */
  var StatmuxSettings: js.UndefOr[MultiplexStatmuxVideoSettings] = js.native
}

object MultiplexVideoSettings {
  @scala.inline
  def apply(): MultiplexVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexVideoSettings]
  }
  @scala.inline
  implicit class MultiplexVideoSettingsOps[Self <: MultiplexVideoSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstantBitrate(value: integerMin100000Max100000000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstantBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstantBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstantBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withStatmuxSettings(value: MultiplexStatmuxVideoSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatmuxSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatmuxSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatmuxSettings")(js.undefined)
        ret
    }
  }
  
}

