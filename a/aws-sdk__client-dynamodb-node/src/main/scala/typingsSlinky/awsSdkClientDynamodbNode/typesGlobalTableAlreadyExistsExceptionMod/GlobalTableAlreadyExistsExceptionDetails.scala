package typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableAlreadyExistsExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalTableAlreadyExistsExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.native
}

object GlobalTableAlreadyExistsExceptionDetails {
  @scala.inline
  def apply(): GlobalTableAlreadyExistsExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalTableAlreadyExistsExceptionDetails]
  }
  @scala.inline
  implicit class GlobalTableAlreadyExistsExceptionDetailsOps[Self <: GlobalTableAlreadyExistsExceptionDetails] (val x: Self) extends AnyVal {
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

