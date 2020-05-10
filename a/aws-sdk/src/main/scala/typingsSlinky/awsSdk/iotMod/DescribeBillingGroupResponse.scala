package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBillingGroupResponse extends js.Object {
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.native
  /**
    * The ID of the billing group.
    */
  var billingGroupId: js.UndefOr[BillingGroupId] = js.native
  /**
    * Additional information about the billing group.
    */
  var billingGroupMetadata: js.UndefOr[BillingGroupMetadata] = js.native
  /**
    * The name of the billing group.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.native
  /**
    * The properties of the billing group.
    */
  var billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.native
  /**
    * The version of the billing group.
    */
  var version: js.UndefOr[Version] = js.native
}

object DescribeBillingGroupResponse {
  @scala.inline
  def apply(): DescribeBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBillingGroupResponse]
  }
  @scala.inline
  implicit class DescribeBillingGroupResponseOps[Self <: DescribeBillingGroupResponse] (val x: Self) extends AnyVal {
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
    def withBillingGroupMetadata(value: BillingGroupMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingGroupMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingGroupMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingGroupMetadata")(js.undefined)
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
    def withVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

