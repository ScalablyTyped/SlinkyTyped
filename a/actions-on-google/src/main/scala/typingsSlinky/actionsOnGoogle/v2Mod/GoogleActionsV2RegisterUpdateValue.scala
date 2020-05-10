package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2RegisterUpdateValue extends js.Object {
  /**
    * The status of the registering the update requested by the app.
    */
  var status: js.UndefOr[GoogleActionsV2RegisterUpdateValueStatus] = js.native
}

object GoogleActionsV2RegisterUpdateValue {
  @scala.inline
  def apply(): GoogleActionsV2RegisterUpdateValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2RegisterUpdateValue]
  }
  @scala.inline
  implicit class GoogleActionsV2RegisterUpdateValueOps[Self <: GoogleActionsV2RegisterUpdateValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: GoogleActionsV2RegisterUpdateValueStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

