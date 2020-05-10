package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OmnitureSettings extends js.Object {
  /** Whether placement cost data will be sent to Omniture. This property can be enabled only if omnitureIntegrationEnabled is true. */
  var omnitureCostDataEnabled: js.UndefOr[Boolean] = js.native
  /** Whether Omniture integration is enabled. This property can be enabled only when the "Advanced Ad Serving" account setting is enabled. */
  var omnitureIntegrationEnabled: js.UndefOr[Boolean] = js.native
}

object OmnitureSettings {
  @scala.inline
  def apply(): OmnitureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmnitureSettings]
  }
  @scala.inline
  implicit class OmnitureSettingsOps[Self <: OmnitureSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOmnitureCostDataEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omnitureCostDataEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmnitureCostDataEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omnitureCostDataEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOmnitureIntegrationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omnitureIntegrationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmnitureIntegrationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omnitureIntegrationEnabled")(js.undefined)
        ret
    }
  }
  
}

