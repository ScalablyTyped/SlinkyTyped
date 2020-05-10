package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchWriteResponse extends js.Object {
  /**
    * A list of all the responses for each batch write.
    */
  var Responses: js.UndefOr[BatchWriteOperationResponseList] = js.native
}

object BatchWriteResponse {
  @scala.inline
  def apply(): BatchWriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteResponse]
  }
  @scala.inline
  implicit class BatchWriteResponseOps[Self <: BatchWriteResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponses(value: BatchWriteOperationResponseList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Responses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Responses")(js.undefined)
        ret
    }
  }
  
}

