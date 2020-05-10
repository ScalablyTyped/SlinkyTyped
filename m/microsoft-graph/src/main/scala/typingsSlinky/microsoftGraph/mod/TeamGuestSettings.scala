package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamGuestSettings extends js.Object {
  // If set to true, guests can add and update channels.
  var allowCreateUpdateChannels: js.UndefOr[Boolean] = js.native
  // If set to true, guests can delete channels.
  var allowDeleteChannels: js.UndefOr[Boolean] = js.native
}

object TeamGuestSettings {
  @scala.inline
  def apply(): TeamGuestSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamGuestSettings]
  }
  @scala.inline
  implicit class TeamGuestSettingsOps[Self <: TeamGuestSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCreateUpdateChannels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCreateUpdateChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCreateUpdateChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCreateUpdateChannels")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDeleteChannels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleteChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeleteChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleteChannels")(js.undefined)
        ret
    }
  }
  
}

