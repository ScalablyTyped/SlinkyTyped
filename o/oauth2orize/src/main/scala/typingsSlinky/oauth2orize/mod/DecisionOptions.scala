package typingsSlinky.oauth2orize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecisionOptions extends js.Object {
  var cancelField: String = js.native
  var sessionKey: String = js.native
  var userProperty: String = js.native
}

object DecisionOptions {
  @scala.inline
  def apply(cancelField: String, sessionKey: String, userProperty: String): DecisionOptions = {
    val __obj = js.Dynamic.literal(cancelField = cancelField.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any], userProperty = userProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecisionOptions]
  }
  @scala.inline
  implicit class DecisionOptionsOps[Self <: DecisionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProperty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

