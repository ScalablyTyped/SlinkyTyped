package typingsSlinky.koaPassport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUserProperty extends js.Object {
  var userProperty: String = js.native
}

object AnonUserProperty {
  @scala.inline
  def apply(userProperty: String): AnonUserProperty = {
    val __obj = js.Dynamic.literal(userProperty = userProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUserProperty]
  }
  @scala.inline
  implicit class AnonUserPropertyOps[Self <: AnonUserProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProperty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

