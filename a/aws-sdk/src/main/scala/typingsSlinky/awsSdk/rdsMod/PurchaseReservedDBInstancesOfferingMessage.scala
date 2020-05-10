package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseReservedDBInstancesOfferingMessage extends js.Object {
  /**
    * The number of instances to reserve. Default: 1 
    */
  var DBInstanceCount: js.UndefOr[IntegerOptional] = js.native
  /**
    * Customer-specified identifier to track this reservation. Example: myreservationID
    */
  var ReservedDBInstanceId: js.UndefOr[String] = js.native
  /**
    * The ID of the Reserved DB instance offering to purchase. Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
    */
  var ReservedDBInstancesOfferingId: String = js.native
  var Tags: js.UndefOr[TagList] = js.native
}

object PurchaseReservedDBInstancesOfferingMessage {
  @scala.inline
  def apply(ReservedDBInstancesOfferingId: String): PurchaseReservedDBInstancesOfferingMessage = {
    val __obj = js.Dynamic.literal(ReservedDBInstancesOfferingId = ReservedDBInstancesOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedDBInstancesOfferingMessage]
  }
  @scala.inline
  implicit class PurchaseReservedDBInstancesOfferingMessageOps[Self <: PurchaseReservedDBInstancesOfferingMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReservedDBInstancesOfferingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedDBInstancesOfferingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDBInstanceCount(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedDBInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedDBInstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedDBInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedDBInstanceId")(js.undefined)
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

