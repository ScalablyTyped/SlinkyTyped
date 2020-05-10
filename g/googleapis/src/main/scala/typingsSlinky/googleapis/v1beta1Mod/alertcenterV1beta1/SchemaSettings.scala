package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Customer-level settings.
  */
@js.native
trait SchemaSettings extends js.Object {
  /**
    * The list of notifications.
    */
  var notifications: js.UndefOr[js.Array[SchemaNotification]] = js.native
}

object SchemaSettings {
  @scala.inline
  def apply(): SchemaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSettings]
  }
  @scala.inline
  implicit class SchemaSettingsOps[Self <: SchemaSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotifications(value: js.Array[SchemaNotification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(js.undefined)
        ret
    }
  }
  
}

