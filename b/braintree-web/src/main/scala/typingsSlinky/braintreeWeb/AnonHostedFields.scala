package typingsSlinky.braintreeWeb

import typingsSlinky.braintreeWeb.mod.HostedFields_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHostedFields extends js.Object {
  var card: js.Any = js.native
  var hostedFields: HostedFields_ = js.native
  var mobile: js.Any = js.native
}

object AnonHostedFields {
  @scala.inline
  def apply(card: js.Any, hostedFields: HostedFields_, mobile: js.Any): AnonHostedFields = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], hostedFields = hostedFields.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHostedFields]
  }
  @scala.inline
  implicit class AnonHostedFieldsOps[Self <: AnonHostedFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCard(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostedFields(value: HostedFields_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobile(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

