package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetLocation extends js.Object {
  /**
    * The AWS accounts targeted by the current Automation execution.
    */
  var Accounts: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Accounts] = js.native
  /**
    * The Automation execution role used by the currently running Automation.
    */
  var ExecutionRoleName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ExecutionRoleName] = js.native
  /**
    * The AWS Regions targeted by the current Automation execution.
    */
  var Regions: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Regions] = js.native
  /**
    * The maximum number of AWS accounts and AWS regions allowed to run the Automation concurrently 
    */
  var TargetLocationMaxConcurrency: js.UndefOr[MaxConcurrency] = js.native
  /**
    * The maximum number of errors allowed before the system stops queueing additional Automation executions for the currently running Automation. 
    */
  var TargetLocationMaxErrors: js.UndefOr[MaxErrors] = js.native
}

object TargetLocation {
  @scala.inline
  def apply(): TargetLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetLocation]
  }
  @scala.inline
  implicit class TargetLocationOps[Self <: TargetLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccounts(value: Accounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounts")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionRoleName(value: ExecutionRoleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionRoleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionRoleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionRoleName")(js.undefined)
        ret
    }
    @scala.inline
    def withRegions(value: Regions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Regions")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetLocationMaxConcurrency(value: MaxConcurrency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetLocationMaxConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetLocationMaxConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetLocationMaxConcurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetLocationMaxErrors(value: MaxErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetLocationMaxErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetLocationMaxErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetLocationMaxErrors")(js.undefined)
        ret
    }
  }
  
}

