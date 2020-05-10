package typingsSlinky.angularNotifications.mod.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISettings extends js.Object {
  var custom: IAnimation = js.native
  var details: Boolean = js.native
  var error: IAnimation = js.native
  var html5DefaultIcon: String = js.native
  var html5Mode: Boolean = js.native
  var info: IAnimation = js.native
  var localStorage: Boolean = js.native
  var progress: IAnimation = js.native
  var success: IAnimation = js.native
  var warning: IAnimation = js.native
}

object ISettings {
  @scala.inline
  def apply(
    custom: IAnimation,
    details: Boolean,
    error: IAnimation,
    html5DefaultIcon: String,
    html5Mode: Boolean,
    info: IAnimation,
    localStorage: Boolean,
    progress: IAnimation,
    success: IAnimation,
    warning: IAnimation
  ): ISettings = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], html5DefaultIcon = html5DefaultIcon.asInstanceOf[js.Any], html5Mode = html5Mode.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], localStorage = localStorage.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettings]
  }
  @scala.inline
  implicit class ISettingsOps[Self <: ISettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustom(value: IAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: IAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml5DefaultIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5DefaultIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml5Mode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5Mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: IAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: IAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: IAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarning(value: IAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

