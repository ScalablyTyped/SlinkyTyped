package typingsSlinky.awsSdk.migrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHomeRegionControlRequest extends js.Object {
  /**
    * Optional Boolean flag to indicate whether any effect should take place. It tests whether the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typingsSlinky.awsSdk.migrationhubconfigMod.DryRun] = js.native
  /**
    * The name of the home region of the calling account.
    */
  var HomeRegion: typingsSlinky.awsSdk.migrationhubconfigMod.HomeRegion = js.native
  /**
    * The account for which this command sets up a home region control. The Target is always of type ACCOUNT.
    */
  var Target: typingsSlinky.awsSdk.migrationhubconfigMod.Target = js.native
}

object CreateHomeRegionControlRequest {
  @scala.inline
  def apply(HomeRegion: HomeRegion, Target: Target): CreateHomeRegionControlRequest = {
    val __obj = js.Dynamic.literal(HomeRegion = HomeRegion.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHomeRegionControlRequest]
  }
  @scala.inline
  implicit class CreateHomeRegionControlRequestOps[Self <: CreateHomeRegionControlRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHomeRegion(value: HomeRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Target): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: DryRun): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
  }
  
}

