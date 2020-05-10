package typingsSlinky.awsSdk.migrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHomeRegionControlResult extends js.Object {
  /**
    * This object is the HomeRegionControl object that's returned by a successful call to CreateHomeRegionControl.
    */
  var HomeRegionControl: js.UndefOr[typingsSlinky.awsSdk.migrationhubconfigMod.HomeRegionControl] = js.native
}

object CreateHomeRegionControlResult {
  @scala.inline
  def apply(): CreateHomeRegionControlResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHomeRegionControlResult]
  }
  @scala.inline
  implicit class CreateHomeRegionControlResultOps[Self <: CreateHomeRegionControlResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHomeRegionControl(value: HomeRegionControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeRegionControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeRegionControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeRegionControl")(js.undefined)
        ret
    }
  }
  
}

