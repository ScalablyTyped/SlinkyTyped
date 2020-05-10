package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchReadOperationResponse extends js.Object {
  /**
    * Identifies which operation in a batch has failed.
    */
  var ExceptionResponse: js.UndefOr[BatchReadException] = js.native
  /**
    * Identifies which operation in a batch has succeeded.
    */
  var SuccessfulResponse: js.UndefOr[BatchReadSuccessfulResponse] = js.native
}

object BatchReadOperationResponse {
  @scala.inline
  def apply(): BatchReadOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchReadOperationResponse]
  }
  @scala.inline
  implicit class BatchReadOperationResponseOps[Self <: BatchReadOperationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExceptionResponse(value: BatchReadException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExceptionResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExceptionResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExceptionResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessfulResponse(value: BatchReadSuccessfulResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfulResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessfulResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfulResponse")(js.undefined)
        ret
    }
  }
  
}

