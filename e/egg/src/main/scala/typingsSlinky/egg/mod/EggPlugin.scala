package typingsSlinky.egg.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EggPlugin
  extends /* key */ StringDictionary[js.UndefOr[EggPluginItem]] {
  var development: js.UndefOr[EggPluginItem] = js.native
  var i18n: js.UndefOr[EggPluginItem] = js.native
  var jsonp: js.UndefOr[EggPluginItem] = js.native
  var logrotator: js.UndefOr[EggPluginItem] = js.native
  var multipart: js.UndefOr[EggPluginItem] = js.native
  var onerror: js.UndefOr[EggPluginItem] = js.native
  var schedule: js.UndefOr[EggPluginItem] = js.native
  var security: js.UndefOr[EggPluginItem] = js.native
  var session: js.UndefOr[EggPluginItem] = js.native
  var static: js.UndefOr[EggPluginItem] = js.native
  var view: js.UndefOr[EggPluginItem] = js.native
  var watcher: js.UndefOr[EggPluginItem] = js.native
}

object EggPlugin {
  @scala.inline
  def apply(): EggPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EggPlugin]
  }
  @scala.inline
  implicit class EggPluginOps[Self <: EggPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevelopment(value: EggPluginItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("development")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevelopment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("development")(js.undefined)
        ret
    }
    @scala.inline
    def withI18n(value: EggPluginItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonp(value: EggPluginItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(js.undefined)
        ret
    }
    @scala.inline
    def withLogrotator(value: EggPluginItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logrotator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogrotator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logrotator")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipart(value: EggPluginItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(value: EggPluginItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: EggPluginItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurity(value: EggPluginItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: EggPluginItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
    @scala.inline
    def withStatic(value: EggPluginItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: EggPluginItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withWatcher(value: EggPluginItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watcher")(js.undefined)
        ret
    }
  }
  
}

