package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCustomAvailabilityZoneResult extends js.Object {
  var CustomAvailabilityZone: js.UndefOr[typingsSlinky.awsSdk.rdsMod.CustomAvailabilityZone] = js.native
}

object DeleteCustomAvailabilityZoneResult {
  @scala.inline
  def apply(): DeleteCustomAvailabilityZoneResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCustomAvailabilityZoneResult]
  }
  @scala.inline
  implicit class DeleteCustomAvailabilityZoneResultOps[Self <: DeleteCustomAvailabilityZoneResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomAvailabilityZone(value: CustomAvailabilityZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAvailabilityZone")(js.undefined)
        ret
    }
  }
  
}

