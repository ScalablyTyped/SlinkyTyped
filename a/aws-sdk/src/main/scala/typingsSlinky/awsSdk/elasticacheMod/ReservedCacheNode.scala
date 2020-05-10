package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedCacheNode extends js.Object {
  /**
    * The number of cache nodes that have been reserved.
    */
  var CacheNodeCount: js.UndefOr[Integer] = js.native
  /**
    * The cache node type for the reserved cache nodes. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   M5 node types: cache.m5.large, cache.m5.xlarge, cache.m5.2xlarge, cache.m5.4xlarge, cache.m5.12xlarge, cache.m5.24xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge   T3 node types: cache.t3.micro, cache.t3.small, cache.t3.medium   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R5 node types: cache.r5.large, cache.r5.xlarge, cache.r5.2xlarge, cache.r5.4xlarge, cache.r5.12xlarge, cache.r5.24xlarge   R4 node types: cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge       Additional node type info    All current generation instance types are created in Amazon VPC by default.   Redis append-only files (AOF) are not supported for T1 or T2 instances.   Redis Multi-AZ with automatic failover is not supported on T1 instances.   Redis configuration variables appendonly and appendfsync are not supported on Redis version 2.8.22 and later.  
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  /**
    * The duration of the reservation in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The fixed price charged for this reserved cache node.
    */
  var FixedPrice: js.UndefOr[Double] = js.native
  /**
    * The offering type of this reserved cache node.
    */
  var OfferingType: js.UndefOr[String] = js.native
  /**
    * The description of the reserved cache node.
    */
  var ProductDescription: js.UndefOr[String] = js.native
  /**
    * The recurring price charged to run this reserved cache node.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the reserved cache node. Example: arn:aws:elasticache:us-east-1:123456789012:reserved-instance:ri-2017-03-27-08-33-25-582 
    */
  var ReservationARN: js.UndefOr[String] = js.native
  /**
    * The unique identifier for the reservation.
    */
  var ReservedCacheNodeId: js.UndefOr[String] = js.native
  /**
    * The offering identifier.
    */
  var ReservedCacheNodesOfferingId: js.UndefOr[String] = js.native
  /**
    * The time the reservation started.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The state of the reserved cache node.
    */
  var State: js.UndefOr[String] = js.native
  /**
    * The hourly price charged for this reserved cache node.
    */
  var UsagePrice: js.UndefOr[Double] = js.native
}

object ReservedCacheNode {
  @scala.inline
  def apply(): ReservedCacheNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedCacheNode]
  }
  @scala.inline
  implicit class ReservedCacheNodeOps[Self <: ReservedCacheNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheNodeCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheNodeCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheNodeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheNodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeType")(js.undefined)
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
    def withProductDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductDescription")(js.undefined)
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
    def withReservationARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservationARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservationARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservationARN")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedCacheNodeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedCacheNodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedCacheNodeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedCacheNodeId")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedCacheNodesOfferingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedCacheNodesOfferingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedCacheNodesOfferingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedCacheNodesOfferingId")(js.undefined)
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

