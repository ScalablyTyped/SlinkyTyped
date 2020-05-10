package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedQueuedPurchaseDeletion extends js.Object {
  /**
    * The error.
    */
  var Error: js.UndefOr[DeleteQueuedReservedInstancesError] = js.native
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
}

object FailedQueuedPurchaseDeletion {
  @scala.inline
  def apply(): FailedQueuedPurchaseDeletion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedQueuedPurchaseDeletion]
  }
  @scala.inline
  implicit class FailedQueuedPurchaseDeletionOps[Self <: FailedQueuedPurchaseDeletion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: DeleteQueuedReservedInstancesError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedInstancesId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstancesId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedInstancesId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstancesId")(js.undefined)
        ret
    }
  }
  
}

