package typingsSlinky.reactBootstrapTable.mod

import typingsSlinky.reactBootstrapTable.anon.Msg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditValidatorObject extends js.Object {
  /**
  	 * Boolean flag indicating whether the cell value is valid.
  	 */
  var isValid: Boolean = js.native
  /**
  	 * Notification object providing details on the validation result.
  	 */
  var notification: Msg = js.native
}

object EditValidatorObject {
  @scala.inline
  def apply(isValid: Boolean, notification: Msg): EditValidatorObject = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditValidatorObject]
  }
  @scala.inline
  implicit class EditValidatorObjectOps[Self <: EditValidatorObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotification(value: Msg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

