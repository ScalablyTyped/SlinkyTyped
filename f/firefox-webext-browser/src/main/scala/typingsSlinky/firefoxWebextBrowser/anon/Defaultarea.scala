package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.manifest.IconPath
import typingsSlinky.firefoxWebextBrowser.browser.manifest.ThemeIcons
import typingsSlinky.firefoxWebextBrowser.browser.manifest.WebExtensionManifestBrowserActionDefaultArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Defaultarea extends js.Object {
  var browser_style: js.UndefOr[Boolean] = js.native
  /** Defines the location the browserAction will appear by default. The default location is navbar. */
  var default_area: js.UndefOr[WebExtensionManifestBrowserActionDefaultArea] = js.native
  var default_icon: js.UndefOr[IconPath] = js.native
  var default_popup: js.UndefOr[String] = js.native
  var default_title: js.UndefOr[String] = js.native
  /** Specifies icons to use for dark and light themes */
  var theme_icons: js.UndefOr[js.Array[ThemeIcons]] = js.native
}

object Defaultarea {
  @scala.inline
  def apply(): Defaultarea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Defaultarea]
  }
  @scala.inline
  implicit class DefaultareaOps[Self <: Defaultarea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowser_style(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser_style: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_style")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_area(value: WebExtensionManifestBrowserActionDefaultArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_area: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_area")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_icon(value: IconPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_icon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_icon")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_popup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_popup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_popup")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_title")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme_icons(value: js.Array[ThemeIcons]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme_icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme_icons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme_icons")(js.undefined)
        ret
    }
  }
  
}

