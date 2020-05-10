package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgLoaderSettings extends js.Object {
  var autoDetectLocale: js.UndefOr[Boolean] = js.native
  var cssPath: String = js.native
  var locale: js.UndefOr[String] = js.native
  var localePath: js.UndefOr[String] = js.native
  var preinit: js.UndefOr[js.Function] = js.native
  var ready: js.UndefOr[js.Function] = js.native
  var regional: js.UndefOr[String] = js.native
  var resources: js.UndefOr[String] = js.native
  var scriptPath: String = js.native
  var theme: js.UndefOr[String] = js.native
}

object IgLoaderSettings {
  @scala.inline
  def apply(cssPath: String, scriptPath: String): IgLoaderSettings = {
    val __obj = js.Dynamic.literal(cssPath = cssPath.asInstanceOf[js.Any], scriptPath = scriptPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgLoaderSettings]
  }
  @scala.inline
  implicit class IgLoaderSettingsOps[Self <: IgLoaderSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoDetectLocale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDetectLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDetectLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDetectLocale")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localePath")(js.undefined)
        ret
    }
    @scala.inline
    def withPreinit(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preinit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreinit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preinit")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

