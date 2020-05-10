package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBillingGroupRequest extends js.Object {
  /**
    * The name you wish to give to the billing group.
    */
  var billingGroupName: BillingGroupName = js.native
  /**
    * The properties of the billing group.
    */
  var billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.native
  /**
    * Metadata which can be used to manage the billing group.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateBillingGroupRequest {
  @scala.inline
  def apply(billingGroupName: BillingGroupName): CreateBillingGroupRequest = {
    val __obj = js.Dynamic.literal(billingGroupName = billingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBillingGroupRequest]
  }
  @scala.inline
  implicit class CreateBillingGroupRequestOps[Self <: CreateBillingGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingGroupName(value: BillingGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBillingGroupProperties(value: BillingGroupProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingGroupProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingGroupProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingGroupProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

