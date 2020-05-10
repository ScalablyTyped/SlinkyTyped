package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsInformationProtectionAppLearningSummary extends Entity {
  // Application Name
  var applicationName: js.UndefOr[String] = js.native
  // Application Type. Possible values are: universal, desktop.
  var applicationType: js.UndefOr[ApplicationType] = js.native
  // Device Count
  var deviceCount: js.UndefOr[Double] = js.native
}

object WindowsInformationProtectionAppLearningSummary {
  @scala.inline
  def apply(): WindowsInformationProtectionAppLearningSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionAppLearningSummary]
  }
  @scala.inline
  implicit class WindowsInformationProtectionAppLearningSummaryOps[Self <: WindowsInformationProtectionAppLearningSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationType(value: ApplicationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationType")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCount")(js.undefined)
        ret
    }
  }
  
}

