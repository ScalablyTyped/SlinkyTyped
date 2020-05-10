package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedFieldsHostedFieldsCard extends js.Object {
  var code: HostedFieldsCardCode = js.native
  var niceType: String = js.native
  var `type`: String = js.native
}

object HostedFieldsHostedFieldsCard {
  @scala.inline
  def apply(code: HostedFieldsCardCode, niceType: String, `type`: String): HostedFieldsHostedFieldsCard = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], niceType = niceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsHostedFieldsCard]
  }
  @scala.inline
  implicit class HostedFieldsHostedFieldsCardOps[Self <: HostedFieldsHostedFieldsCard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: HostedFieldsCardCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNiceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("niceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

