package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThirdPartyVPNProperties extends js.Object {
  /** ID of the third-party VPN provider extension. */
  var ExtensionID: String = js.native
  /** The VPN provider name. */
  var ProviderName: js.UndefOr[String] = js.native
}

object ThirdPartyVPNProperties {
  @scala.inline
  def apply(ExtensionID: String): ThirdPartyVPNProperties = {
    val __obj = js.Dynamic.literal(ExtensionID = ExtensionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartyVPNProperties]
  }
  @scala.inline
  implicit class ThirdPartyVPNPropertiesOps[Self <: ThirdPartyVPNProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensionID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtensionID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderName")(js.undefined)
        ret
    }
  }
  
}

