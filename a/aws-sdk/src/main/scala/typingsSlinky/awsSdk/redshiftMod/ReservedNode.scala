package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedNode extends js.Object {
  /**
    * The currency code for the reserved cluster.
    */
  var CurrencyCode: js.UndefOr[String] = js.native
  /**
    * The duration of the node reservation in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The fixed cost Amazon Redshift charges you for this reserved node.
    */
  var FixedPrice: js.UndefOr[Double] = js.native
  /**
    * The number of reserved compute nodes.
    */
  var NodeCount: js.UndefOr[Integer] = js.native
  /**
    * The node type of the reserved node.
    */
  var NodeType: js.UndefOr[String] = js.native
  /**
    * The anticipated utilization of the reserved node, as defined in the reserved node offering.
    */
  var OfferingType: js.UndefOr[String] = js.native
  /**
    * The recurring charges for the reserved node.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.native
  /**
    * The unique identifier for the reservation.
    */
  var ReservedNodeId: js.UndefOr[String] = js.native
  /**
    * The identifier for the reserved node offering.
    */
  var ReservedNodeOfferingId: js.UndefOr[String] = js.native
  /**
    * 
    */
  var ReservedNodeOfferingType: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.ReservedNodeOfferingType] = js.native
  /**
    * The time the reservation started. You purchase a reserved node offering for a duration. This is the start time of that duration.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The state of the reserved compute node. Possible Values:   pending-payment-This reserved node has recently been purchased, and the sale has been approved, but payment has not yet been confirmed.   active-This reserved node is owned by the caller and is available for use.   payment-failed-Payment failed for the purchase attempt.   retired-The reserved node is no longer available.    exchanging-The owner is exchanging the reserved node for another reserved node.  
    */
  var State: js.UndefOr[String] = js.native
  /**
    * The hourly rate Amazon Redshift charges you for this reserved node.
    */
  var UsagePrice: js.UndefOr[Double] = js.native
}

object ReservedNode {
  @scala.inline
  def apply(): ReservedNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedNode]
  }
  @scala.inline
  implicit class ReservedNodeOps[Self <: ReservedNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedPrice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeCount")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeType")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingType")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurringCharges(value: RecurringChargeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecurringCharges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurringCharges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecurringCharges")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedNodeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedNodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedNodeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedNodeId")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedNodeOfferingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedNodeOfferingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedNodeOfferingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedNodeOfferingId")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedNodeOfferingType(value: ReservedNodeOfferingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedNodeOfferingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedNodeOfferingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedNodeOfferingType")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withUsagePrice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsagePrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsagePrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsagePrice")(js.undefined)
        ret
    }
  }
  
}

