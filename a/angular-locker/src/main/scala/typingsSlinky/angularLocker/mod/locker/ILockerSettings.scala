package typingsSlinky.angularLocker.mod.locker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILockerSettings extends js.Object {
  var driver: js.UndefOr[String] = js.native
  var eventsEnabled: js.UndefOr[Boolean] = js.native
  var extend: js.UndefOr[js.Object] = js.native
  var namespace: js.UndefOr[String | Boolean] = js.native
  var separator: js.UndefOr[String] = js.native
}

object ILockerSettings {
  @scala.inline
  def apply(): ILockerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILockerSettings]
  }
  @scala.inline
  implicit class ILockerSettingsOps[Self <: ILockerSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driver")(js.undefined)
        ret
    }
    @scala.inline
    def withEventsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExtend(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
  }
  
}

