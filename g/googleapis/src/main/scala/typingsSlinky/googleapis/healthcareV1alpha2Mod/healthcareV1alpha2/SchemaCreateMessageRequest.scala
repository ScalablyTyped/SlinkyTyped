package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new message.
  */
@js.native
trait SchemaCreateMessageRequest extends js.Object {
  /**
    * HL7v2 message.
    */
  var message: js.UndefOr[SchemaMessage] = js.native
}

object SchemaCreateMessageRequest {
  @scala.inline
  def apply(): SchemaCreateMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateMessageRequest]
  }
  @scala.inline
  implicit class SchemaCreateMessageRequestOps[Self <: SchemaCreateMessageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: SchemaMessage): Self = {
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

