package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteQueuedReservedInstancesResult extends js.Object {
  /**
    * Information about the queued purchases that could not be deleted.
    */
  var FailedQueuedPurchaseDeletions: js.UndefOr[FailedQueuedPurchaseDeletionSet] = js.native
  /**
    * Information about the queued purchases that were successfully deleted.
    */
  var SuccessfulQueuedPurchaseDeletions: js.UndefOr[SuccessfulQueuedPurchaseDeletionSet] = js.native
}

object DeleteQueuedReservedInstancesResult {
  @scala.inline
  def apply(): DeleteQueuedReservedInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteQueuedReservedInstancesResult]
  }
  @scala.inline
  implicit class DeleteQueuedReservedInstancesResultOps[Self <: DeleteQueuedReservedInstancesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedQueuedPurchaseDeletions(value: FailedQueuedPurchaseDeletionSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedQueuedPurchaseDeletions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedQueuedPurchaseDeletions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedQueuedPurchaseDeletions")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessfulQueuedPurchaseDeletions(value: SuccessfulQueuedPurchaseDeletionSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfulQueuedPurchaseDeletions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessfulQueuedPurchaseDeletions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfulQueuedPurchaseDeletions")(js.undefined)
        ret
    }
  }
  
}

