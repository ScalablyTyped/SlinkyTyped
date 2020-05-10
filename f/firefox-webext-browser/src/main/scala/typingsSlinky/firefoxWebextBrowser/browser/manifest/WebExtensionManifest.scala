package typingsSlinky.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firefoxWebextBrowser.AnonApiscript
import typingsSlinky.firefoxWebextBrowser.AnonBookmarks
import typingsSlinky.firefoxWebextBrowser.AnonBrowserstyle
import typingsSlinky.firefoxWebextBrowser.AnonDefaultarea
import typingsSlinky.firefoxWebextBrowser.AnonDefaulticon
import typingsSlinky.firefoxWebextBrowser.AnonDefaultpanel
import typingsSlinky.firefoxWebextBrowser.AnonEdge
import typingsSlinky.firefoxWebextBrowser.AnonGecko
import typingsSlinky.firefoxWebextBrowser.AnonHomepage
import typingsSlinky.firefoxWebextBrowser.AnonKeyword
import typingsSlinky.firefoxWebextBrowser.AnonNameUrl
import typingsSlinky.firefoxWebextBrowser.AnonPage
import typingsSlinky.firefoxWebextBrowser.AnonPersistent
import typingsSlinky.firefoxWebextBrowser.AnonSuggestedkey
import typingsSlinky.firefoxWebextBrowser.browser.experiments.ExperimentAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a WebExtension manifest.json file */
@js.native
trait WebExtensionManifest extends js.Object {
  var applications: js.UndefOr[AnonGecko] = js.native
  var author: js.UndefOr[String] = js.native
  var background: js.UndefOr[AnonPage | AnonPersistent] = js.native
  var browser_action: js.UndefOr[AnonDefaultarea] = js.native
  var browser_specific_settings: js.UndefOr[AnonEdge] = js.native
  var chrome_settings_overrides: js.UndefOr[AnonHomepage] = js.native
  var chrome_url_overrides: js.UndefOr[AnonBookmarks] = js.native
  var commands: js.UndefOr[StringDictionary[AnonSuggestedkey]] = js.native
  var content_scripts: js.UndefOr[js.Array[ContentScript]] = js.native
  var content_security_policy: js.UndefOr[String] = js.native
  var default_locale: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var developer: js.UndefOr[AnonNameUrl] = js.native
  var devtools_page: js.UndefOr[ExtensionURL] = js.native
  var experiment_apis: js.UndefOr[StringDictionary[ExperimentAPI]] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var homepage_url: js.UndefOr[String] = js.native
  var icons: js.UndefOr[NumberDictionary[ExtensionFileUrl]] = js.native
  var incognito: js.UndefOr[WebExtensionManifestIncognito] = js.native
  var manifest_version: Double = js.native
  var minimum_chrome_version: js.UndefOr[String] = js.native
  var minimum_opera_version: js.UndefOr[String] = js.native
  var name: String = js.native
  var omnibox: js.UndefOr[AnonKeyword] = js.native
  var optional_permissions: js.UndefOr[js.Array[OptionalPermissionOrOrigin]] = js.native
  var options_ui: js.UndefOr[AnonBrowserstyle] = js.native
  var page_action: js.UndefOr[AnonDefaulticon] = js.native
  var permissions: js.UndefOr[js.Array[PermissionOrOrigin]] = js.native
  /** A list of protocol handler definitions. */
  var protocol_handlers: js.UndefOr[js.Array[ProtocolHandler]] = js.native
  var short_name: js.UndefOr[String] = js.native
  var sidebar_action: js.UndefOr[AnonDefaultpanel] = js.native
  var theme_experiment: js.UndefOr[ThemeExperiment] = js.native
  var user_scripts: js.UndefOr[AnonApiscript] = js.native
  var version: String = js.native
  var web_accessible_resources: js.UndefOr[js.Array[String]] = js.native
}

object WebExtensionManifest {
  @scala.inline
  def apply(manifest_version: Double, name: String, version: String): WebExtensionManifest = {
    val __obj = js.Dynamic.literal(manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifest]
  }
  @scala.inline
  implicit class WebExtensionManifestOps[Self <: WebExtensionManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManifest_version(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplications(value: AnonGecko): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applications")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: AnonPage | AnonPersistent): Self = {
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
    def withBrowser_action(value: AnonDefaultarea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser_action: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_action")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowser_specific_settings(value: AnonEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_specific_settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser_specific_settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_specific_settings")(js.undefined)
        ret
    }
    @scala.inline
    def withChrome_settings_overrides(value: AnonHomepage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_settings_overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChrome_settings_overrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_settings_overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withChrome_url_overrides(value: AnonBookmarks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_url_overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChrome_url_overrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_url_overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withCommands(value: StringDictionary[AnonSuggestedkey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_scripts(value: js.Array[ContentScript]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_scripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_scripts")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_security_policy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_security_policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_security_policy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_security_policy")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_locale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_locale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_locale")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloper(value: AnonNameUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developer")(js.undefined)
        ret
    }
    @scala.inline
    def withDevtools_page(value: ExtensionURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtools_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevtools_page: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtools_page")(js.undefined)
        ret
    }
    @scala.inline
    def withExperiment_apis(value: StringDictionary[ExperimentAPI]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experiment_apis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperiment_apis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experiment_apis")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withHomepage_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepage_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomepage_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepage_url")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: NumberDictionary[ExtensionFileUrl]): Self = {
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
    def withIncognito(value: WebExtensionManifestIncognito): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncognito: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum_chrome_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum_chrome_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum_chrome_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum_chrome_version")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum_opera_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum_opera_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum_opera_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum_opera_version")(js.undefined)
        ret
    }
    @scala.inline
    def withOmnibox(value: AnonKeyword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omnibox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmnibox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omnibox")(js.undefined)
        ret
    }
    @scala.inline
    def withOptional_permissions(value: js.Array[OptionalPermissionOrOrigin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional_permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional_permissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional_permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions_ui(value: AnonBrowserstyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options_ui")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions_ui: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options_ui")(js.undefined)
        ret
    }
    @scala.inline
    def withPage_action(value: AnonDefaulticon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage_action: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_action")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[PermissionOrOrigin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol_handlers(value: js.Array[ProtocolHandler]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol_handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol_handlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol_handlers")(js.undefined)
        ret
    }
    @scala.inline
    def withShort_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShort_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short_name")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebar_action(value: AnonDefaultpanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebar_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebar_action: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebar_action")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme_experiment(value: ThemeExperiment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme_experiment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme_experiment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme_experiment")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_scripts(value: AnonApiscript): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_scripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_scripts")(js.undefined)
        ret
    }
    @scala.inline
    def withWeb_accessible_resources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web_accessible_resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeb_accessible_resources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web_accessible_resources")(js.undefined)
        ret
    }
  }
  
}

