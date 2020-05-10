package typingsSlinky.awsSdk.migrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HomeRegionControl extends js.Object {
  /**
    * A unique identifier that's generated for each home region control. It's always a string that begins with "hrc-" followed by 12 lowercase letters and numbers.
    */
  var ControlId: js.UndefOr[typingsSlinky.awsSdk.migrationhubconfigMod.ControlId] = js.native
  /**
    * The AWS Region that's been set as home region. For example, "us-west-2" or "eu-central-1" are valid home regions.
    */
  var HomeRegion: js.UndefOr[typingsSlinky.awsSdk.migrationhubconfigMod.HomeRegion] = js.native
  /**
    * A timestamp representing the time when the customer called CreateHomeregionControl and set the home region for the account.
    */
  var RequestedTime: js.UndefOr[js.Date] = js.native
  /**
    * The target parameter specifies the identifier to which the home region is applied, which is always an ACCOUNT. It applies the home region to the current ACCOUNT.
    */
  var Target: js.UndefOr[typingsSlinky.awsSdk.migrationhubconfigMod.Target] = js.native
}

object HomeRegionControl {
  @scala.inline
  def apply(): HomeRegionControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HomeRegionControl]
  }
  @scala.inline
  implicit class HomeRegionControlOps[Self <: HomeRegionControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlId(value: ControlId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlId")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeRegion(value: HomeRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: Target): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(js.undefined)
        ret
    }
  }
  
}

