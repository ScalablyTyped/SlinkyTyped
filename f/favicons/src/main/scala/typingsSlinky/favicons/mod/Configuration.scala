package typingsSlinky.favicons.mod

import typingsSlinky.favicons.anon.PartialandroidbooleanIcon
import typingsSlinky.favicons.faviconsStrings.`black-translucent`
import typingsSlinky.favicons.faviconsStrings.`minimal-ui`
import typingsSlinky.favicons.faviconsStrings.any
import typingsSlinky.favicons.faviconsStrings.black
import typingsSlinky.favicons.faviconsStrings.browser
import typingsSlinky.favicons.faviconsStrings.default
import typingsSlinky.favicons.faviconsStrings.fullscreen
import typingsSlinky.favicons.faviconsStrings.landscape
import typingsSlinky.favicons.faviconsStrings.natural
import typingsSlinky.favicons.faviconsStrings.portrait
import typingsSlinky.favicons.faviconsStrings.standalone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  /** Your application's description @default null */
  var appDescription: String | Null = js.native
  /** Your application's name @default null */
  var appName: String | Null = js.native
  /** Your application's short_name. If not set, `appName` will be used @default null */
  var appShortName: String | Null = js.native
  /** Style for Apple status bar @default 'black-translucent' */
  var appleStatusBarStyle: `black-translucent` | default | black = js.native
  /** Background colour for flattened icons @default '#fff' */
  var background: String = js.native
  /** Your (or your developer's) name @default null */
  var developerName: String | Null = js.native
  /** Your (or your developer's) URL @default null */
  var developerURL: String | Null = js.native
  /** Primary text direction for name, short_name, and description @default 'auto' */
  var dir: String = js.native
  /** Preferred display mode: 'fullscreen', 'standalone', 'minimal-ui' or 'browser' @default 'standalone' */
  var display: fullscreen | standalone | `minimal-ui` | browser = js.native
  /**
    * Platform Options:
    * - offset - offset in percentage
    * - background:
    *   * false - use default
    *   * true - force use default, e.g. set background for Android icons
    *   * color - set background for the specified icons
    * - mask - apply mask in order to create circle icon (applied by default for firefox)
    * - overlayGlow - apply glow effect after mask has been applied (applied by default for firefox)
    * - overlayShadow - apply drop shadow after mask has been applied
    */
  var icons: PartialandroidbooleanIcon = js.native
  /** Primary language for name and short_name @default 'en-US' */
  var lang: String = js.native
  /** Browsers don't send cookies when fetching a manifest, enable this to fix that @default false */
  var loadManifestWithCredentials: Boolean = js.native
  /** Print logs to console? @default false */
  var logging: Boolean = js.native
  /** Determines whether to set relative paths in manifests @default false */
  var manifestRelativePaths: Boolean = js.native
  /** Default orientation: 'any', 'natural', 'portrait' or 'landscape' @default 'any' */
  var orientation: any | natural | portrait | landscape = js.native
  /** Path for overriding default icons path @default '/' */
  var path: String = js.native
  /** Determines whether to allow piping html as a file @default false */
  var pipeHTML: Boolean = js.native
  /** Use nearest neighbor resampling to preserve hard edges on pixel art @default false */
  var pixel_art: Boolean = js.native
  /** Set of URLs that the browser considers within your app @default null */
  var scope: String = js.native
  /** Start URL when launching the application from a device @default '/?homescreen=1' */
  var start_url: String = js.native
  /** Theme color user for example in Android's task switcher @default '#fff' */
  var theme_color: String = js.native
  /** Your application's version string @default '1.0' */
  var version: String = js.native
}

object Configuration {
  @scala.inline
  def apply(
    appleStatusBarStyle: `black-translucent` | default | black,
    background: String,
    dir: String,
    display: fullscreen | standalone | `minimal-ui` | browser,
    icons: PartialandroidbooleanIcon,
    lang: String,
    loadManifestWithCredentials: Boolean,
    logging: Boolean,
    manifestRelativePaths: Boolean,
    orientation: any | natural | portrait | landscape,
    path: String,
    pipeHTML: Boolean,
    pixel_art: Boolean,
    scope: String,
    start_url: String,
    theme_color: String,
    version: String
  ): Configuration = {
    val __obj = js.Dynamic.literal(appleStatusBarStyle = appleStatusBarStyle.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], loadManifestWithCredentials = loadManifestWithCredentials.asInstanceOf[js.Any], logging = logging.asInstanceOf[js.Any], manifestRelativePaths = manifestRelativePaths.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pipeHTML = pipeHTML.asInstanceOf[js.Any], pixel_art = pixel_art.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], start_url = start_url.asInstanceOf[js.Any], theme_color = theme_color.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppleStatusBarStyle(value: `black-translucent` | default | black): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleStatusBarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay(value: fullscreen | standalone | `minimal-ui` | browser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcons(value: PartialandroidbooleanIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadManifestWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadManifestWithCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifestRelativePaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestRelativePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: any | natural | portrait | landscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipeHTML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixel_art(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixel_art")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppDescriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appDescription")(null)
        ret
    }
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(null)
        ret
    }
    @scala.inline
    def withAppShortName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appShortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppShortNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appShortName")(null)
        ret
    }
    @scala.inline
    def withDeveloperName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeveloperNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerName")(null)
        ret
    }
    @scala.inline
    def withDeveloperURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeveloperURLNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerURL")(null)
        ret
    }
  }
  
}

