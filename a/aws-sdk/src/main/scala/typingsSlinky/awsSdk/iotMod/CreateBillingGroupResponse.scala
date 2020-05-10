package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBillingGroupResponse extends js.Object {
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.native
  /**
    * The ID of the billing group.
    */
  var billingGroupId: js.UndefOr[BillingGroupId] = js.native
  /**
    * The name you gave to the billing group.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.native
}

object CreateBillingGroupResponse {
  @scala.inline
  def apply(): CreateBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBillingGroupResponse]
  }
  @scala.inline
  implicit class CreateBillingGroupResponseOps[Self <: CreateBillingGroupResponse] (val x: Self) extends AnyVal {
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
    def withBillingGroupId(value: BillingGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingGroupId")(js.undefined)
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
  }
  
}

