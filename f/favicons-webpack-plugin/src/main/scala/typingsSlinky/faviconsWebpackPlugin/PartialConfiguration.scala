package typingsSlinky.faviconsWebpackPlugin

import typingsSlinky.favicons.PartialandroidbooleanIcon
import typingsSlinky.faviconsWebpackPlugin.faviconsWebpackPluginStrings.`black-translucent`
import typingsSlinky.faviconsWebpackPlugin.faviconsWebpackPluginStrings.`minimal-ui`
import typingsSlinky.faviconsWebpackPlugin.faviconsWebpackPluginStrings.any
import typingsSlinky.faviconsWebpackPlugin.faviconsWebpackPluginStrings.black
import typingsSlinky.faviconsWebpackPlugin.faviconsWebpackPluginStrings.browser
import typingsSlinky.faviconsWebpackPlugin.faviconsWebpackPluginStrings.default
import typingsSlinky.faviconsWebpackPlugin.faviconsWebpackPluginStrings.fullscreen
import typingsSlinky.faviconsWebpackPlugin.faviconsWebpackPluginStrings.landscape
import typingsSlinky.faviconsWebpackPlugin.faviconsWebpackPluginStrings.natural
import typingsSlinky.faviconsWebpackPlugin.faviconsWebpackPluginStrings.portrait
import typingsSlinky.faviconsWebpackPlugin.faviconsWebpackPluginStrings.standalone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<favicons.favicons.Configuration> */
@js.native
trait PartialConfiguration extends js.Object {
  var appDescription: js.UndefOr[String] = js.native
  var appName: js.UndefOr[String] = js.native
  var appShortName: js.UndefOr[String] = js.native
  var appleStatusBarStyle: js.UndefOr[`black-translucent` | default | black] = js.native
  var background: js.UndefOr[String] = js.native
  var developerName: js.UndefOr[String] = js.native
  var developerURL: js.UndefOr[String] = js.native
  var dir: js.UndefOr[String] = js.native
  var display: js.UndefOr[fullscreen | standalone | `minimal-ui` | browser] = js.native
  var icons: js.UndefOr[PartialandroidbooleanIcon] = js.native
  var lang: js.UndefOr[String] = js.native
  var loadManifestWithCredentials: js.UndefOr[Boolean] = js.native
  var logging: js.UndefOr[Boolean] = js.native
  var manifestRelativePaths: js.UndefOr[Boolean] = js.native
  var orientation: js.UndefOr[any | natural | portrait | landscape] = js.native
  var path: js.UndefOr[String] = js.native
  var pipeHTML: js.UndefOr[Boolean] = js.native
  var pixel_art: js.UndefOr[Boolean] = js.native
  var scope: js.UndefOr[String] = js.native
  var start_url: js.UndefOr[String] = js.native
  var theme_color: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object PartialConfiguration {
  @scala.inline
  def apply(): PartialConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfiguration]
  }
  @scala.inline
  implicit class PartialConfigurationOps[Self <: PartialConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(js.undefined)
        ret
    }
    @scala.inline
    def withAppShortName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appShortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppShortName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appShortName")(js.undefined)
        ret
    }
    @scala.inline
    def withAppleStatusBarStyle(value: `black-translucent` | default | black): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleStatusBarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppleStatusBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleStatusBarStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloperName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloperURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerURL")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: fullscreen | standalone | `minimal-ui` | browser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: PartialandroidbooleanIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadManifestWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadManifestWithCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadManifestWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadManifestWithCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withManifestRelativePaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestRelativePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestRelativePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestRelativePaths")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: any | natural | portrait | landscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPipeHTML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipeHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withPixel_art(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixel_art")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixel_art: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixel_art")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_url")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme_color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme_color")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

