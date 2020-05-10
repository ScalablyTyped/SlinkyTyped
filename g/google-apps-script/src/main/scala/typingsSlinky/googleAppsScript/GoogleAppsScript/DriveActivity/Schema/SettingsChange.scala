package typingsSlinky.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsChange extends js.Object {
  var restrictionChanges: js.UndefOr[js.Array[RestrictionChange]] = js.native
}

object SettingsChange {
  @scala.inline
  def apply(): SettingsChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsChange]
  }
  @scala.inline
  implicit class SettingsChangeOps[Self <: SettingsChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestrictionChanges(value: js.Array[RestrictionChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictionChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictionChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictionChanges")(js.undefined)
        ret
    }
  }
  
}

