package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceConfigurationUserOverview extends Entity {
  // Version of the policy for that overview
  var configurationVersion: js.UndefOr[Double] = js.native
  // Number of error Users
  var errorCount: js.UndefOr[Double] = js.native
  // Number of failed Users
  var failedCount: js.UndefOr[Double] = js.native
  // Last update time
  var lastUpdateDateTime: js.UndefOr[String] = js.native
  // Number of not applicable users
  var notApplicableCount: js.UndefOr[Double] = js.native
  // Number of pending Users
  var pendingCount: js.UndefOr[Double] = js.native
  // Number of succeeded Users
  var successCount: js.UndefOr[Double] = js.native
}

object DeviceConfigurationUserOverview {
  @scala.inline
  def apply(): DeviceConfigurationUserOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfigurationUserOverview]
  }
  @scala.inline
  implicit class DeviceConfigurationUserOverviewOps[Self <: DeviceConfigurationUserOverview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNotApplicableCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notApplicableCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotApplicableCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notApplicableCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCount")(js.undefined)
        ret
    }
  }
  
}

