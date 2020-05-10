package typingsSlinky.awsSdkClientLambdaNode.typesInvalidSubnetIDExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidSubnetIDExceptionDetails extends js.Object {
  /**
    * _String shape
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.native
}

object InvalidSubnetIDExceptionDetails {
  @scala.inline
  def apply(): InvalidSubnetIDExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvalidSubnetIDExceptionDetails]
  }
  @scala.inline
  implicit class InvalidSubnetIDExceptionDetailsOps[Self <: InvalidSubnetIDExceptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
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
  }
  
}

