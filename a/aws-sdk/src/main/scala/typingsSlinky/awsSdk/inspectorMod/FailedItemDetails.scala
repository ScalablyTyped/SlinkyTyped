package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedItemDetails extends js.Object {
  /**
    * The status code of a failed item.
    */
  var failureCode: FailedItemErrorCode = js.native
  /**
    * Indicates whether you can immediately retry a request for this item for a specified resource.
    */
  var retryable: Bool = js.native
}

object FailedItemDetails {
  @scala.inline
  def apply(failureCode: FailedItemErrorCode, retryable: Bool): FailedItemDetails = {
    val __obj = js.Dynamic.literal(failureCode = failureCode.asInstanceOf[js.Any], retryable = retryable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedItemDetails]
  }
  @scala.inline
  implicit class FailedItemDetailsOps[Self <: FailedItemDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailureCode(value: FailedItemErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetryable(value: Bool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

