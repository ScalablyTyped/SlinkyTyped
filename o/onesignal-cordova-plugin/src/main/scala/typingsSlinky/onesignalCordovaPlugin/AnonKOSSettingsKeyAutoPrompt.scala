package typingsSlinky.onesignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKOSSettingsKeyAutoPrompt extends js.Object {
  var kOSSettingsKeyAutoPrompt: Boolean = js.native
  var kOSSettingsKeyInAppLaunchURL: Boolean = js.native
}

object AnonKOSSettingsKeyAutoPrompt {
  @scala.inline
  def apply(kOSSettingsKeyAutoPrompt: Boolean, kOSSettingsKeyInAppLaunchURL: Boolean): AnonKOSSettingsKeyAutoPrompt = {
    val __obj = js.Dynamic.literal(kOSSettingsKeyAutoPrompt = kOSSettingsKeyAutoPrompt.asInstanceOf[js.Any], kOSSettingsKeyInAppLaunchURL = kOSSettingsKeyInAppLaunchURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKOSSettingsKeyAutoPrompt]
  }
  @scala.inline
  implicit class AnonKOSSettingsKeyAutoPromptOps[Self <: AnonKOSSettingsKeyAutoPrompt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKOSSettingsKeyAutoPrompt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kOSSettingsKeyAutoPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKOSSettingsKeyInAppLaunchURL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kOSSettingsKeyInAppLaunchURL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

