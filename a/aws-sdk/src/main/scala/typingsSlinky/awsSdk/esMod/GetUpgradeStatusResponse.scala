package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUpgradeStatusResponse extends js.Object {
  /**
    *  One of 4 statuses that a step can go through returned as part of the  GetUpgradeStatusResponse  object. The status can take one of the following values:  In Progress Succeeded Succeeded with Issues Failed  
    */
  var StepStatus: js.UndefOr[UpgradeStatus] = js.native
  /**
    * A string that describes the update briefly
    */
  var UpgradeName: js.UndefOr[typingsSlinky.awsSdk.esMod.UpgradeName] = js.native
  /**
    *  Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:  PreUpgradeCheck Snapshot Upgrade  
    */
  var UpgradeStep: js.UndefOr[typingsSlinky.awsSdk.esMod.UpgradeStep] = js.native
}

object GetUpgradeStatusResponse {
  @scala.inline
  def apply(): GetUpgradeStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUpgradeStatusResponse]
  }
  @scala.inline
  implicit class GetUpgradeStatusResponseOps[Self <: GetUpgradeStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStepStatus(value: UpgradeStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepStatus")(js.undefined)
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
  }
  
}

