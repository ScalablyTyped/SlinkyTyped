package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamClassSettings extends js.Object {
  var notifyGuardiansAboutAssignments: js.UndefOr[Boolean] = js.native
}

object TeamClassSettings {
  @scala.inline
  def apply(): TeamClassSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamClassSettings]
  }
  @scala.inline
  implicit class TeamClassSettingsOps[Self <: TeamClassSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotifyGuardiansAboutAssignments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyGuardiansAboutAssignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyGuardiansAboutAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyGuardiansAboutAssignments")(js.undefined)
        ret
    }
  }
  
}

