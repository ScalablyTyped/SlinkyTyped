package typingsSlinky.awsSdkClientLambdaNode.typesEc2unexpectedexceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2UnexpectedExceptionDetails extends js.Object {
  /**
    * _String shape
    */
  var EC2ErrorCode: js.UndefOr[String] = js.native
  /**
    * _String shape
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.native
}

object EC2UnexpectedExceptionDetails {
  @scala.inline
  def apply(): EC2UnexpectedExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2UnexpectedExceptionDetails]
  }
  @scala.inline
  implicit class EC2UnexpectedExceptionDetailsOps[Self <: EC2UnexpectedExceptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEC2ErrorCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEC2ErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2ErrorCode")(js.undefined)
        ret
    }
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

