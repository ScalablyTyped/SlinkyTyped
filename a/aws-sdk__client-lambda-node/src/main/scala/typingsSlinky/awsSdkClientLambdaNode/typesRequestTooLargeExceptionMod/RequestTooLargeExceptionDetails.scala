package typingsSlinky.awsSdkClientLambdaNode.typesRequestTooLargeExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestTooLargeExceptionDetails extends js.Object {
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.native
  /**
    * _String shape
    */
  var message: js.UndefOr[String] = js.native
}

object RequestTooLargeExceptionDetails {
  @scala.inline
  def apply(): RequestTooLargeExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestTooLargeExceptionDetails]
  }
  @scala.inline
  implicit class RequestTooLargeExceptionDetailsOps[Self <: RequestTooLargeExceptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

