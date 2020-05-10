package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchReadResponse extends js.Object {
  /**
    * A list of all the responses for each batch read.
    */
  var Responses: js.UndefOr[BatchReadOperationResponseList] = js.native
}

object BatchReadResponse {
  @scala.inline
  def apply(): BatchReadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchReadResponse]
  }
  @scala.inline
  implicit class BatchReadResponseOps[Self <: BatchReadResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponses(value: BatchReadOperationResponseList): Self = {
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

