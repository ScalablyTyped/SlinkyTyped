package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdHocFilteringOption extends js.Object {
  /**
    * Availability status.
    */
  var AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.native
}

object AdHocFilteringOption {
  @scala.inline
  def apply(): AdHocFilteringOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdHocFilteringOption]
  }
  @scala.inline
  implicit class AdHocFilteringOptionOps[Self <: AdHocFilteringOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityStatus(value: DashboardBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityStatus")(js.undefined)
        ret
    }
  }
  
}

