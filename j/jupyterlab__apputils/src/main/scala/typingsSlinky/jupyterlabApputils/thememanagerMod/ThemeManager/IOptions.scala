package typingsSlinky.jupyterlabApputils.thememanagerMod.ThemeManager

import typingsSlinky.jupyterlabApputils.splashMod.ISplashScreen
import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a theme manager.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The host widget for the theme manager.
    */
  var host: Widget = js.native
  /**
    * The setting registry key that holds theme setting data.
    */
  var key: String = js.native
  /**
    * The settings registry.
    */
  var settings: ISettingRegistry = js.native
  /**
    * The splash screen to show when loading themes.
    */
  var splash: js.UndefOr[ISplashScreen] = js.native
  /**
    * The url for local theme loading.
    */
  var url: String = js.native
}

object IOptions {
  @scala.inline
  def apply(host: Widget, key: String, settings: ISettingRegistry, url: String): IOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: Widget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: ISettingRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplash(value: ISplashScreen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splash")(js.undefined)
        ret
    }
  }
  
}

