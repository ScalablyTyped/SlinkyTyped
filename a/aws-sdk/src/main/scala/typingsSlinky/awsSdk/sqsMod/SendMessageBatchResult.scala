package typingsSlinky.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessageBatchResult extends js.Object {
  /**
    * A list of  BatchResultErrorEntry  items with error details about each message that can't be enqueued.
    */
  var Failed: BatchResultErrorEntryList = js.native
  /**
    * A list of  SendMessageBatchResultEntry  items.
    */
  var Successful: SendMessageBatchResultEntryList = js.native
}

object SendMessageBatchResult {
  @scala.inline
  def apply(Failed: BatchResultErrorEntryList, Successful: SendMessageBatchResultEntryList): SendMessageBatchResult = {
    val __obj = js.Dynamic.literal(Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageBatchResult]
  }
  @scala.inline
  implicit class SendMessageBatchResultOps[Self <: SendMessageBatchResult] (val x: Self) extends AnyVal {
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
    def withSuccessful(value: SendMessageBatchResultEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Successful")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

