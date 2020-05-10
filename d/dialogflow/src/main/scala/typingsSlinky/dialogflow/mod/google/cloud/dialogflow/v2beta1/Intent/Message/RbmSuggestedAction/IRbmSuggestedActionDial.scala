package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmSuggestedActionDial. */
@js.native
trait IRbmSuggestedActionDial extends js.Object {
  /** RbmSuggestedActionDial phoneNumber */
  var phoneNumber: js.UndefOr[String | Null] = js.native
}

object IRbmSuggestedActionDial {
  @scala.inline
  def apply(): IRbmSuggestedActionDial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRbmSuggestedActionDial]
  }
  @scala.inline
  implicit class IRbmSuggestedActionDialOps[Self <: IRbmSuggestedActionDial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(null)
        ret
    }
  }
  
}

