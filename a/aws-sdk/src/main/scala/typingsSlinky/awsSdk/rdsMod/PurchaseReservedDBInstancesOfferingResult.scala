package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseReservedDBInstancesOfferingResult extends js.Object {
  var ReservedDBInstance: js.UndefOr[typingsSlinky.awsSdk.rdsMod.ReservedDBInstance] = js.native
}

object PurchaseReservedDBInstancesOfferingResult {
  @scala.inline
  def apply(ReservedDBInstance: ReservedDBInstance = null): PurchaseReservedDBInstancesOfferingResult = {
    val __obj = js.Dynamic.literal()
    if (ReservedDBInstance != null) __obj.updateDynamic("ReservedDBInstance")(ReservedDBInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedDBInstancesOfferingResult]
  }
}

