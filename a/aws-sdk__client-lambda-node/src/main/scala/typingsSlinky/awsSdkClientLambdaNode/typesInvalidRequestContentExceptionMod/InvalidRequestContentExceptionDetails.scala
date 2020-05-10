package typingsSlinky.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidRequestContentExceptionDetails extends js.Object {
  /**
    * <p>The exception type.</p>
    */
  var Type: js.UndefOr[String] = js.native
  /**
    * <p>The exception message.</p>
    */
  var message: js.UndefOr[String] = js.native
}

object InvalidRequestContentExceptionDetails {
  @scala.inline
  def apply(): InvalidRequestContentExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvalidRequestContentExceptionDetails]
  }
  @scala.inline
  implicit class InvalidRequestContentExceptionDetailsOps[Self <: InvalidRequestContentExceptionDetails] (val x: Self) extends AnyVal {
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

