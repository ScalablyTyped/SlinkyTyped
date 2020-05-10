package typingsSlinky.awsSdkClientKmsBrowser.typesUnsupportedOperationExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsupportedOperationExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.native
}

object UnsupportedOperationExceptionDetails {
  @scala.inline
  def apply(): UnsupportedOperationExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsupportedOperationExceptionDetails]
  }
  @scala.inline
  implicit class UnsupportedOperationExceptionDetailsOps[Self <: UnsupportedOperationExceptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

