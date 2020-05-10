package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetRequestConfig extends js.Object {
  /**
    * The progress of the Spot Fleet request. If there is an error, the status is error. After all requests are placed, the status is pending_fulfillment. If the size of the fleet is equal to or greater than its target capacity, the status is fulfilled. If the size of the fleet is decreased, the status is pending_termination while Spot Instances are terminating.
    */
  var ActivityStatus: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ActivityStatus] = js.native
  /**
    * The creation date and time of the request.
    */
  var CreateTime: js.UndefOr[js.Date] = js.native
  /**
    * The configuration of the Spot Fleet request.
    */
  var SpotFleetRequestConfig: js.UndefOr[SpotFleetRequestConfigData] = js.native
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.native
  /**
    * The state of the Spot Fleet request.
    */
  var SpotFleetRequestState: js.UndefOr[BatchState] = js.native
  /**
    * The tags for a Spot Fleet resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object SpotFleetRequestConfig {
  @scala.inline
  def apply(): SpotFleetRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotFleetRequestConfig]
  }
  @scala.inline
  implicit class SpotFleetRequestConfigOps[Self <: SpotFleetRequestConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityStatus(value: ActivityStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivityStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivityStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotFleetRequestConfig(value: SpotFleetRequestConfigData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotFleetRequestConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotFleetRequestConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotFleetRequestConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotFleetRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotFleetRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotFleetRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotFleetRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotFleetRequestState(value: BatchState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotFleetRequestState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotFleetRequestState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotFleetRequestState")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

