package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFleetMetadataRequest extends js.Object {
  /**
    * The fleet name to display. The existing DisplayName is unset if null is passed.
    */
  var DisplayName: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.DisplayName] = js.native
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsSlinky.awsSdk.worklinkMod.FleetArn = js.native
  /**
    * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region.
    */
  var OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.native
}

object UpdateFleetMetadataRequest {
  @scala.inline
  def apply(FleetArn: FleetArn): UpdateFleetMetadataRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetMetadataRequest]
  }
  @scala.inline
  implicit class UpdateFleetMetadataRequestOps[Self <: UpdateFleetMetadataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetArn(value: FleetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizeForEndUserLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptimizeForEndUserLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizeForEndUserLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptimizeForEndUserLocation")(js.undefined)
        ret
    }
  }
  
}

