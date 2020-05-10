package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddThingToBillingGroupRequest extends js.Object {
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.native
  /**
    * The name of the billing group.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.native
  /**
    * The ARN of the thing to be added to the billing group.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  /**
    * The name of the thing to be added to the billing group.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}

object AddThingToBillingGroupRequest {
  @scala.inline
  def apply(): AddThingToBillingGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddThingToBillingGroupRequest]
  }
  @scala.inline
  implicit class AddThingToBillingGroupRequestOps[Self <: AddThingToBillingGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingGroupArn(value: BillingGroupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingGroupName(value: BillingGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withThingArn(value: ThingArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingArn")(js.undefined)
        ret
    }
    @scala.inline
    def withThingName(value: ThingName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(js.undefined)
        ret
    }
  }
  
}

