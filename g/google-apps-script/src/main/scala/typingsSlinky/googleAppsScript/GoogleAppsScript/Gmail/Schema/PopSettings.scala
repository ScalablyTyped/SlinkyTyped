package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopSettings extends js.Object {
  var accessWindow: js.UndefOr[String] = js.native
  var disposition: js.UndefOr[String] = js.native
}

object PopSettings {
  @scala.inline
  def apply(): PopSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopSettings]
  }
  @scala.inline
  implicit class PopSettingsOps[Self <: PopSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withDisposition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposition")(js.undefined)
        ret
    }
  }
  
}

