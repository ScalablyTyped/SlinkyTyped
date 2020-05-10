package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListedEntitlement extends js.Object {
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[integer] = js.native
  /**
    * The ARN of the entitlement.
    */
  var EntitlementArn: string = js.native
  /**
    * The name of the entitlement.
    */
  var EntitlementName: string = js.native
}

object ListedEntitlement {
  @scala.inline
  def apply(EntitlementArn: string, EntitlementName: string): ListedEntitlement = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn.asInstanceOf[js.Any], EntitlementName = EntitlementName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedEntitlement]
  }
  @scala.inline
  implicit class ListedEntitlementOps[Self <: ListedEntitlement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntitlementArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntitlementArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntitlementName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntitlementName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataTransferSubscriberFeePercent(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTransferSubscriberFeePercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTransferSubscriberFeePercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTransferSubscriberFeePercent")(js.undefined)
        ret
    }
  }
  
}

