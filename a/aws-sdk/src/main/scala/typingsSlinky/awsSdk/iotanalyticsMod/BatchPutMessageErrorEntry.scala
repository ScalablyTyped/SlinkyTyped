package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutMessageErrorEntry extends js.Object {
  /**
    * The code associated with the error.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  /**
    * The message associated with the error.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
  /**
    * The ID of the message that caused the error. (See the value corresponding to the "messageId" key in the message object.)
    */
  var messageId: js.UndefOr[MessageId] = js.native
}

object BatchPutMessageErrorEntry {
  @scala.inline
  def apply(): BatchPutMessageErrorEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPutMessageErrorEntry]
  }
  @scala.inline
  implicit class BatchPutMessageErrorEntryOps[Self <: BatchPutMessageErrorEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: ErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageId(value: MessageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(js.undefined)
        ret
    }
  }
  
}

