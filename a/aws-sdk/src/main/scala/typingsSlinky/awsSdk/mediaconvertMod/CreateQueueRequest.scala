package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateQueueRequest extends js.Object {
  /**
    * Optional. A description of the queue that you are creating.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The name of the queue that you are creating.
    */
  var Name: string = js.native
  /**
    * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment. When you use the API to create a queue, the default is on-demand.
    */
  var PricingPlan: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.PricingPlan] = js.native
  /**
    * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
    */
  var ReservationPlanSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.ReservationPlanSettings] = js.native
  /**
    * Initial state of the queue. If you create a paused queue, then jobs in that queue won't begin.
    */
  var Status: js.UndefOr[QueueStatus] = js.native
  /**
    * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
}

object CreateQueueRequest {
  @scala.inline
  def apply(Name: string): CreateQueueRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQueueRequest]
  }
  @scala.inline
  implicit class CreateQueueRequestOps[Self <: CreateQueueRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withPricingPlan(value: PricingPlan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PricingPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricingPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PricingPlan")(js.undefined)
        ret
    }
    @scala.inline
    def withReservationPlanSettings(value: ReservationPlanSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservationPlanSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservationPlanSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservationPlanSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: QueueStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: mapOfString): Self = {
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

