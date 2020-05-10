package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyProviderSettings extends js.Object {
  var StaticKeySettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.StaticKeySettings] = js.native
}

object KeyProviderSettings {
  @scala.inline
  def apply(): KeyProviderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyProviderSettings]
  }
  @scala.inline
  implicit class KeyProviderSettingsOps[Self <: KeyProviderSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStaticKeySettings(value: StaticKeySettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticKeySettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticKeySettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticKeySettings")(js.undefined)
        ret
    }
  }
  
}

