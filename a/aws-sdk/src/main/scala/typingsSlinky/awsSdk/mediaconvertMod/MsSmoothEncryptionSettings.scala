package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsSmoothEncryptionSettings extends js.Object {
  /**
    * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a SPEKE-compliant key provider.  If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
    */
  var SpekeKeyProvider: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.SpekeKeyProvider] = js.native
}

object MsSmoothEncryptionSettings {
  @scala.inline
  def apply(): MsSmoothEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsSmoothEncryptionSettings]
  }
  @scala.inline
  implicit class MsSmoothEncryptionSettingsOps[Self <: MsSmoothEncryptionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpekeKeyProvider(value: SpekeKeyProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpekeKeyProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpekeKeyProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpekeKeyProvider")(js.undefined)
        ret
    }
  }
  
}

