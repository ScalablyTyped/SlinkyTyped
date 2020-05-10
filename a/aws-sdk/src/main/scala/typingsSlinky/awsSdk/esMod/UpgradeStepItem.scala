package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeStepItem extends js.Object {
  /**
    * A list of strings containing detailed information about the errors encountered in a particular step.
    */
  var Issues: js.UndefOr[typingsSlinky.awsSdk.esMod.Issues] = js.native
  /**
    * The Floating point value representing progress percentage of a particular step.
    */
  var ProgressPercent: js.UndefOr[Double] = js.native
  /**
    *  Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:  PreUpgradeCheck Snapshot Upgrade  
    */
  var UpgradeStep: js.UndefOr[typingsSlinky.awsSdk.esMod.UpgradeStep] = js.native
  /**
    *  The status of a particular step during an upgrade. The status can take one of the following values:  In Progress Succeeded Succeeded with Issues Failed  
    */
  var UpgradeStepStatus: js.UndefOr[UpgradeStatus] = js.native
}

object UpgradeStepItem {
  @scala.inline
  def apply(): UpgradeStepItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeStepItem]
  }
  @scala.inline
  implicit class UpgradeStepItemOps[Self <: UpgradeStepItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssues(value: Issues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Issues")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withUpgradeStep(value: UpgradeStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpgradeStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpgradeStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpgradeStep")(js.undefined)
        ret
    }
    @scala.inline
    def withUpgradeStepStatus(value: UpgradeStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpgradeStepStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpgradeStepStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpgradeStepStatus")(js.undefined)
        ret
    }
  }
  
}

