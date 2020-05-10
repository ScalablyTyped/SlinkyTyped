package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsDefenderAdvancedThreatProtectionConfiguration extends DeviceConfiguration {
  // Windows Defender AdvancedThreatProtection 'Allow Sample Sharing' Rule
  var allowSampleSharing: js.UndefOr[Boolean] = js.native
  // Expedite Windows Defender Advanced Threat Protection telemetry reporting frequency.
  var enableExpeditedTelemetryReporting: js.UndefOr[Boolean] = js.native
}

object WindowsDefenderAdvancedThreatProtectionConfiguration {
  @scala.inline
  def apply(): WindowsDefenderAdvancedThreatProtectionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsDefenderAdvancedThreatProtectionConfiguration]
  }
  @scala.inline
  implicit class WindowsDefenderAdvancedThreatProtectionConfigurationOps[Self <: WindowsDefenderAdvancedThreatProtectionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSampleSharing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSampleSharing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSampleSharing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSampleSharing")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableExpeditedTelemetryReporting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableExpeditedTelemetryReporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableExpeditedTelemetryReporting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableExpeditedTelemetryReporting")(js.undefined)
        ret
    }
  }
  
}

