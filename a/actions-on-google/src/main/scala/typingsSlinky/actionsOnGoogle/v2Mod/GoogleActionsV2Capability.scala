package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2Capability extends js.Object {
  /**
    * The name of the capability, e.g. `actions.capability.AUDIO_OUTPUT`
    */
  var name: js.UndefOr[String] = js.native
}

object GoogleActionsV2Capability {
  @scala.inline
  def apply(): GoogleActionsV2Capability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Capability]
  }
  @scala.inline
  implicit class GoogleActionsV2CapabilityOps[Self <: GoogleActionsV2Capability] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

