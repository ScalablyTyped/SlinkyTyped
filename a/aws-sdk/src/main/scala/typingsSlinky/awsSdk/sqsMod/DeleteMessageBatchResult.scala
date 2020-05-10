package typingsSlinky.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMessageBatchResult extends js.Object {
  /**
    * A list of  BatchResultErrorEntry  items.
    */
  var Failed: BatchResultErrorEntryList = js.native
  /**
    * A list of  DeleteMessageBatchResultEntry  items.
    */
  var Successful: DeleteMessageBatchResultEntryList = js.native
}

object DeleteMessageBatchResult {
  @scala.inline
  def apply(Failed: BatchResultErrorEntryList, Successful: DeleteMessageBatchResultEntryList): DeleteMessageBatchResult = {
    val __obj = js.Dynamic.literal(Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessageBatchResult]
  }
  @scala.inline
  implicit class DeleteMessageBatchResultOps[Self <: DeleteMessageBatchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailed(value: BatchResultErrorEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessful(value: DeleteMessageBatchResultEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Successful")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

