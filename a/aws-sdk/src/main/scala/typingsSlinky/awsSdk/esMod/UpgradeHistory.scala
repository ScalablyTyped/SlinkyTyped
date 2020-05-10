package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeHistory extends js.Object {
  /**
    * UTC Timestamp at which the Upgrade API call was made in "yyyy-MM-ddTHH:mm:ssZ" format.
    */
  var StartTimestamp: js.UndefOr[js.Date] = js.native
  /**
    *  A list of  UpgradeStepItem  s representing information about each step performed as pard of a specific Upgrade or Upgrade Eligibility Check. 
    */
  var StepsList: js.UndefOr[UpgradeStepsList] = js.native
  /**
    * A string that describes the update briefly
    */
  var UpgradeName: js.UndefOr[typingsSlinky.awsSdk.esMod.UpgradeName] = js.native
  /**
    *  The overall status of the update. The status can take one of the following values:  In Progress Succeeded Succeeded with Issues Failed  
    */
  var UpgradeStatus: js.UndefOr[typingsSlinky.awsSdk.esMod.UpgradeStatus] = js.native
}

object UpgradeHistory {
  @scala.inline
  def apply(): UpgradeHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeHistory]
  }
  @scala.inline
  implicit class UpgradeHistoryOps[Self <: UpgradeHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withStepsList(value: UpgradeStepsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepsList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepsList")(js.undefined)
        ret
    }
    @scala.inline
    def withUpgradeName(value: UpgradeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpgradeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpgradeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpgradeName")(js.undefined)
        ret
    }
    @scala.inline
    def withUpgradeStatus(value: UpgradeStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpgradeStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpgradeStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpgradeStatus")(js.undefined)
        ret
    }
  }
  
}

